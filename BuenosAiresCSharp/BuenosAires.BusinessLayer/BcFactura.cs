using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;
using BuenosAires.DataLayer;

namespace BuenosAires.BusinessLayer
{
    public class BcFactura
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public Factura Factura = null;
        public List<Factura> Lista = null;

        public BcFactura()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.Factura = new Factura();
            this.Lista = new List<Factura>();
        }

        public void CopiarPropiedades(DcFactura dc)
        {
            this.Accion = dc.Accion;
            this.Mensaje = dc.Mensaje;
            this.HayErrores = dc.HayErrores;
            this.Factura = dc.Factura;
            this.Lista = dc.Lista;
        }

        public bool RetornarError(string mensaje)
        {
            this.HayErrores = true;
            this.Mensaje = mensaje;
            return false;
        }

        public bool ValidarFactura(Factura factura)
        {
            if (factura.nrofac < 0) return RetornarError($"El número de factura debe ser un número entero mayor que cero");
            if (factura.fechafac == null) return RetornarError($"La fecha de factura debe tener un valor");
            if (factura.descfac.Trim() == "") return RetornarError($"El campo descripción de factura debe tener un valor");
            if (factura.monto <= 0) return RetornarError($"El campo monto de factura debe ser un número entero mayor que cero");

            var dcProd = new DcProducto();
            dcProd.Leer(factura.idprod);
            if (dcProd.Producto == null) return RetornarError($"El producto con el ID de Producto {factura.idprod} no existe en la BD");

            var dcUsu = new DcPerfilUsuario();
            dcUsu.Leer(factura.rutcli);
            if (dcUsu.PerfilUsuario == null) return RetornarError($"El usuario con el Rut {factura.rutcli} no existe en la BD");

            return true;
        }
        public void Crear(Factura factura)
        {
            if (ValidarFactura(factura) == false) return;
            var dc = new DcFactura();
            dc.Crear(factura);
            this.CopiarPropiedades(dc);
        }

        public void LeerTodos()
        {
            var dc = new DcFactura();
            dc.LeerTodos();
            this.CopiarPropiedades(dc);
        }

        public void Leer(int id)
        {
            var dc = new DcFactura();
            dc.Leer(id);
            this.CopiarPropiedades(dc);
        }

        public void Actualizar(Factura factura)
        {
            if (ValidarFactura(factura) == false) return;
            var dc = new DcFactura();
            dc.Actualizar(factura);
            this.CopiarPropiedades(dc);
        }

        public bool Eliminar(int nrofac)
        {
            this.Inicializar($"eliminar la factura con el Número de Factura {nrofac}");

            var dcstock = new DcStockProducto();
            int cantidad = dcstock.ContarStockProductoPorFactura(nrofac);
            if (dcstock.HayErrores) return RetornarError(dcstock.Mensaje);
            if (cantidad > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantidad} facturas asociados en la bodega.");

            var dcguia = new DcGuiaDespacho();
            cantidad = dcguia.ContarGuiasDespachoPorFactura(nrofac);
            if (dcguia.HayErrores) return RetornarError(dcguia.Mensaje);
            if (cantidad > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantidad} guia(s) de despacho asociadas.");

            var dcsol = new DcSolicitudServicio();
            cantidad = dcsol.ContarSolicitudServiciosPorFactura(nrofac);
            if (dcsol.HayErrores) return RetornarError(dcsol.Mensaje);
            if (cantidad > 0) return RetornarError($"No fue posible {this.Accion} pues tiene {cantidad} solicitud(es) de servicio asociadas.");

            var dcprod = new DcFactura();
            dcprod.Eliminar(nrofac);
            if (dcprod.HayErrores) return RetornarError(dcprod.Mensaje);

            this.CopiarPropiedades(dcprod);
            return true;
        }

        public bool Existe(int nrofac)
        {
            this.Inicializar($"verificar si existe una factura con el Número de Factura {nrofac}");
            var dc = new DcFactura();
            dc.Leer(nrofac);
            bool existe = dc.Factura != null;
            if (!existe) dc.Mensaje = $"La factura con el Número de Factura {nrofac} no existe en la BD";
            this.CopiarPropiedades(dc);
            return existe;
        }
    }
}
