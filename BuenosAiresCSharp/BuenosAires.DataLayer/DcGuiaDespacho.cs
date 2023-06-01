using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;

namespace BuenosAires.DataLayer
{
    public class DcGuiaDespacho
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public GuiaDespacho GuiaDespacho = null;
        public List<GuiaDespacho> Lista = null;

        public DcGuiaDespacho()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.GuiaDespacho = null;
            this.Lista = null;
        }
        public int ContarGuiasDespachoPorProducto(int idprod)
        {
            this.Inicializar($"contar las guías de despacho asociadas al producto con el ID '{idprod}'");
            try
            {
                var bd = new base_datosEntities();
                int cantidad = bd.GuiaDespacho.Count(g => g.idprod == idprod);
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

        public int ContarGuiasDespachoPorFactura(int nrofac)
        {
            this.Inicializar($"contar las guías de despacho asociadas a la factura con el número de factura '{nrofac}'");
            try
            {
                var bd = new base_datosEntities();
                int cantidad = bd.GuiaDespacho.Count(g => g.nrofac == nrofac);
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
    }
}
