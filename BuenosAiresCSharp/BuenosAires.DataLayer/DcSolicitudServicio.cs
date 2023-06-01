using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;

namespace BuenosAires.DataLayer
{
    public class DcSolicitudServicio
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public SolicitudServicio SolicitudServicio = null;
        public List<SolicitudServicio> Lista = null;

        public DcSolicitudServicio()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.SolicitudServicio = null;
            this.Lista = null;
        }
        public int ContarSolicitudServiciosPorFactura(int nrofac)
        {
            this.Inicializar($"contar las solicitudes de servicios asociadas a la factura con el número '{nrofac}'");
            try
            {
                var bd = new base_datosEntities();
                int cantidad = bd.SolicitudServicio.Count(s => s.nrofac == nrofac);
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
