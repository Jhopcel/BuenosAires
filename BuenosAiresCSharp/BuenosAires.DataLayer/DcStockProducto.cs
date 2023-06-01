using System;
using System.Collections.Generic;
using System.Linq;
using BuenosAires.Model;
using System.Configuration;
using System.Data.SqlClient;
using System.Data;
using System.Data.Entity.Core.EntityClient;

namespace BuenosAires.DataLayer
{
    public class DcStockProducto
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public StockProducto StockProducto = null;
        public List<StockProducto> Lista = null;
        public List<StockProductoConEstado> ListaConEstados = null;

        public DcStockProducto()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.StockProducto = null;
            this.Lista = null;
            this.ListaConEstados = null;
        }

        public int ContarStockProductoPorProducto(int idprod)
        {
            this.Inicializar($"contar los productos en bodega asociados al producto con el ID '{idprod}'");
            try
            {
                var bd = new base_datosEntities();
                int cantidad = bd.StockProducto.Count(s => s.idprod == idprod);
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

        public int ContarStockProductoPorFactura(int nrofac)
        {
            this.Inicializar($"contar los productos en bodega asociados a la factura con el Número de Factura '{nrofac}'");
            try
            {
                var bd = new base_datosEntities();
                int cantidad = bd.StockProducto.Count(s => s.nrofac == nrofac);
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

        public int ObtenerSiguienteId()
        {
            this.Inicializar("obtener un nuevo ID");
            int siguienteId = -1;
            try
            {
                var bd = new base_datosEntities();
                siguienteId = 1;
                if (bd.StockProducto.Count() > 0) siguienteId = bd.StockProducto.Max(p => p.idstock) + 1;
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

        public void Crear(StockProducto stockProducto)
        {
            this.Inicializar($"crear un producto en bodega para el producto con el ID de Producto '{stockProducto.idprod}'");
            try
            {
                var bd = new base_datosEntities();
                int siguienteId = this.ObtenerSiguienteId();
                if (this.HayErrores) return;
                stockProducto.idstock = siguienteId;
                bd.StockProducto.Add(stockProducto);
                bd.SaveChanges();
                this.StockProducto = stockProducto;
                bd.Dispose();
                this.Mensaje = $"El producto con el nuevo ID '{stockProducto.idstock}' fue creado correctamente";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void LeerTodos()
        {
            this.Inicializar($"obtener la lista de productos en la bodega");
            try
            {
                var bd = new base_datosEntities();
                this.Lista = bd.StockProducto.ToList();
                if (this.Lista.Count == 0) this.Mensaje = "La lista de productos de la bodega se encuentra vacía";
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
            this.Inicializar($"obtener el producto de la bodega con el ID de Stock '{id}'");
            try
            {
                var bd = new base_datosEntities();
                this.StockProducto = bd.StockProducto.FirstOrDefault(p => p.idstock == id);
                bd.Dispose();
                if (this.StockProducto == null) Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
            }
            catch (Exception ex)
            {
                this.HayErrores = true;
                this.Mensaje = Util.MensajeError($"No fue posible {this.Accion}", ex);
            }
        }

        public void Actualizar(StockProducto stockProducto)
        {
            this.Inicializar($"actualizar el producto en la bodega con el ID de Stock '{stockProducto.idstock}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.StockProducto.FirstOrDefault(p => p.idstock == stockProducto.idstock);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    Util.CopiarPropiedades(stockProducto, encontrado);
                    bd.SaveChanges();
                    this.StockProducto = new StockProducto();
                    Util.CopiarPropiedades(stockProducto, this.StockProducto);
                    this.Mensaje = $"El producto en la bodega con el ID de Stock '{stockProducto.idstock}' fue actualizado correctamente";
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
            this.Inicializar($"eliminar el producto de la bodega con el ID de Stock '{id}'");
            try
            {
                var bd = new base_datosEntities();
                var encontrado = bd.StockProducto.FirstOrDefault(p => p.idstock == id);
                if (encontrado == null)
                {
                    this.Mensaje = $"No fue posible {this.Accion} pues no existe en la BD";
                }
                else
                {
                    bd.StockProducto.Remove(encontrado);
                    bd.SaveChanges();
                    this.Mensaje = $"El producto de la bodega con el ID de Stock '{encontrado.idstock}' fue eliminado correctamente";
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
