using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;
using BuenosAires.DataLayer;

namespace BuenosAires.BusinessLayer
{
    public class BcProducto
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public Producto Producto = null;
        public List<Producto> Lista = null;

        public BcProducto()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.Producto = new Producto();
            this.Lista = new List<Producto>();
        }

        public void CopiarPropiedades(DcProducto dc)
        {
            this.Accion = dc.Accion;
            this.Mensaje = dc.Mensaje;
            this.HayErrores = dc.HayErrores;
            this.Producto = dc.Producto;
            this.Lista = dc.Lista;
        }

        public bool RetornarError(string mensaje)
        {
            this.HayErrores = true;
            this.Mensaje = mensaje;
            return false;
        }

        public bool ValidarProducto(Producto producto)
        {
            if (producto.idprod < 0) return RetornarError($"Cuando el producto es nuevo, el campo ID debe valer cero");
            if (producto.nomprod.Trim() == "") return RetornarError($"El campo nombre de producto debe tener un valor");
            if (producto.descprod.Trim() == "") return RetornarError($"El campo descripción de producto debe tener un valor");
            if (producto.precio <= 0) return RetornarError($"El campo precio debe ser un entero mayor que cero");
            if (producto.imagen.Trim() == "") return RetornarError($"El campo imagen de producto debe tener un valor");
            return true;
        }
        public void Crear(Producto producto)
        {
            if (ValidarProducto(producto) == false) return;
            var dc = new DcProducto();
            dc.Crear(producto);
            this.CopiarPropiedades(dc);
        }

        public void LeerTodos()
        {
            var dc = new DcProducto();
            dc.LeerTodos();
            this.CopiarPropiedades(dc);
        }

        public void Leer(int id)
        {
            var dc = new DcProducto();
            dc.Leer(id);
            this.CopiarPropiedades(dc);
        }

        public void Actualizar(Producto producto)
        {
            if (ValidarProducto(producto) == false) return;
            var dc = new DcProducto();
            dc.Actualizar(producto);
            this.CopiarPropiedades(dc);
        }

        public bool Eliminar(int id)
        {
            this.Inicializar($"eliminar el producto con el ID {id}");

            var dcstock = new DcStockProducto();
            int cantidad = dcstock.ContarStockProductoPorProducto(id);
            if (dcstock.HayErrores) return RetornarError(dcstock.Mensaje);
            if (cantidad > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantidad} productos asociados en la bodega.");

            var dcguia = new DcGuiaDespacho();
            cantidad = dcguia.ContarGuiasDespachoPorProducto(id);
            if (dcguia.HayErrores) return RetornarError(dcguia.Mensaje);
            if (cantidad > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantidad} guia(s) de despacho asociadas.");

            var dcfac = new DcFactura();
            dcfac.LeerFacturasPorProducto(id);
            if (dcfac.HayErrores) return RetornarError(dcfac.Mensaje);
            int cantsol = 0;
            var dcsol = new DcSolicitudServicio();
            foreach (var factura in dcfac.Lista)
            {
                cantsol += dcsol.ContarSolicitudServiciosPorFactura(factura.nrofac);
                if (dcsol.HayErrores) return RetornarError(dcsol.Mensaje);
            }
            if (cantsol > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantsol} solicitud(es) de servico asociadas.");

            cantidad = dcfac.ContarFacturasPorProducto(id);
            if (dcfac.HayErrores) return RetornarError(dcfac.Mensaje);
            if (cantidad > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantidad} factura(s) asociadas.");

            var dcprod = new DcProducto();
            dcprod.Eliminar(id);
            if (dcprod.HayErrores) return RetornarError(dcprod.Mensaje);
            
            this.CopiarPropiedades(dcprod);
            return true;
        }
    }
}
