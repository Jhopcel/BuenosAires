using System;
using System.Collections.Generic;
using System.Linq;
using BuenosAires.Model;

namespace BuenosAires.DataLayer
{
    public class DcProducto
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public Producto Producto = null;
        public List<Producto> Lista = null;

        public DcProducto()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.Producto = null;
            this.Lista = null;
        }

        public int ObtenerSiguienteId()
        {
            this.Inicializar("obtener un nuevo ID");
            int siguienteId = -1;
            try
            {
                var bd = new base_datosEntities();
                siguienteId = 1;
                if (bd.Producto.Count() > 0) siguienteId = bd.Producto.Max(p => p.idprod) + 1;
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

        public void Crear(Producto producto)
        {
            this.Inicializar($"crear el producto '{producto.nomprod}'");
            try
            {
                var bd = new base_datosEntities();
                int siguienteId = this.ObtenerSiguienteId();
                if (this.HayErrores) return;
                producto.idprod = siguienteId;
                bd.Producto.Add(producto);
                bd.SaveChanges();
                this.Producto = producto;
                bd.Dispose();
                this.Mensaje = $"El producto '{producto.nomprod}' fue creado correctamente";
            }
            catch(Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void LeerTodos()
        {
            this.Inicializar($"obtener la lista de productos");
            try
            {
                var bd = new base_datosEntities();
                this.Lista = bd.Producto.ToList();
                if (this.Lista.Count == 0) this.Mensaje = "La lista de productos se encuentra vacía";
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Leer(int id)
        {
            this.Inicializar($"obtener el producto con el ID '{id}'");
            try
            {
                var bd = new base_datosEntities();
                this.Producto = bd.Producto.FirstOrDefault(p => p.idprod == id);
                bd.Dispose();
                if (this.Producto == null) Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Actualizar(Producto producto)
        {
            this.Inicializar($"actualizar el producto '{producto.nomprod}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.Producto.FirstOrDefault(p => p.idprod == producto.idprod);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    Util.CopiarPropiedades(producto, encontrado);
                    bd.SaveChanges();
                    this.Producto = new Producto();
                    Util.CopiarPropiedades(producto, this.Producto);
                    this.Mensaje = $"El producto '{producto.nomprod}' fue actualizado correctamente";
                }
                bd.Dispose();
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Eliminar(int id)
        {
            this.Inicializar($"eliminar el producto con el ID '{id}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.Producto.FirstOrDefault(p => p.idprod == id);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    bd.Producto.Remove(encontrado);
                    bd.SaveChanges();
                    this.Mensaje = $"El producto '{encontrado.nomprod}' fue eliminado correctamente";
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
