using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;

namespace BuenosAires.DataLayer
{
    public class DcFactura
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public Factura Factura = null;
        public List<Factura> Lista = null;

        public DcFactura()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.Factura = null;
            this.Lista = null;
        }

        public int ContarFacturasPorProducto(int idprod)
        {
            this.Inicializar($"contar las facturas asociadas al Factura con el ID '{idprod}'");
            try
            {
                var bd = new base_datosEntities();
                int cantidad = bd.Factura.Count(f => f.idprod == idprod);
                bd.Dispose();
                return cantidad;
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
                return -1;
            }
        }

        public void LeerFacturasPorProducto(int idprod)
        {
            this.Inicializar($"obtener la lista de facturas asociadas al producto con el ID de Producto '{idprod}'");
            try
            {
                var bd = new base_datosEntities();
                this.Lista = bd.Factura.Where(f => f.idprod == idprod).ToList();
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public int ObtenerSiguienteId()
        {
            this.Inicializar("obtener un nuevo ID");
            int siguienteId = -1;
            try
            {
                var bd = new base_datosEntities();
                siguienteId = 1;
                if (bd.Factura.Count() > 0) siguienteId = bd.Factura.Max(f => f.nrofac) + 1;
                bd.Dispose();
                return siguienteId;
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
                return -1;
            }
        }

        public void Crear(Factura factura)
        {
            this.Inicializar($"crear una nueva factura para el producto con el ID de Producto '{factura.idprod}'");
            try
            {
                var bd = new base_datosEntities();
                int siguienteId = this.ObtenerSiguienteId();
                if (this.HayErrores) return;
                factura.idprod = siguienteId;
                bd.Factura.Add(factura);
                bd.SaveChanges();
                this.Factura = factura;
                bd.Dispose();
                this.Mensaje = $"La factura con el número de factura '{factura.nrofac}' fue creada correctamente";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void LeerTodos()
        {
            this.Inicializar($"obtener la lista de Facturas");
            try
            {
                var bd = new base_datosEntities();
                this.Lista = bd.Factura.ToList();
                if (this.Lista.Count == 0) this.Mensaje = "La lista de facturas se encuentra vacía";
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Leer(int nrofac)
        {
            this.Inicializar($"obtener la factura con el número de factura '{nrofac}'");
            try
            {
                var bd = new base_datosEntities();
                this.Factura = bd.Factura.FirstOrDefault(p => p.nrofac == nrofac);
                bd.Dispose();
                if (this.Factura == null) Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Actualizar(Factura factura)
        {
            this.Inicializar($"actualizar la factura con el número de factura '{factura.nrofac}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.Factura.FirstOrDefault(f => f.nrofac== factura.nrofac);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    Util.CopiarPropiedades(factura, encontrado);
                    bd.SaveChanges();
                    this.Factura = new Factura();
                    Util.CopiarPropiedades(factura, this.Factura);
                    this.Mensaje = $"La factura con el número de factura '{factura.nrofac}' fue actualizada correctamente";
                }
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Eliminar(int nrofac)
        {
            this.Inicializar($"eliminar la factura con el Número de Factura '{nrofac}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.Factura.FirstOrDefault(f => f.nrofac == nrofac);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    bd.Factura.Remove(encontrado);
                    bd.SaveChanges();
                    this.Mensaje = $"La factura con el Número de Factura '{nrofac}' fue eliminada correctamente";
                }
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }
    }
}
