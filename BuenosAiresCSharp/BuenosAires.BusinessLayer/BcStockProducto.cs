using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BuenosAires.Model;
using BuenosAires.DataLayer;

namespace BuenosAires.BusinessLayer
{
    public class BcStockProducto
    {
        public string Accion = "";
        public string Mensaje = "";
        public bool HayErrores = false;
        public StockProducto StockProducto = null;
        public List<StockProducto> Lista = null;
        public List<StockProductoConEstado> ListaConEstados = null;

        public BcStockProducto()
        {
            Inicializar("");
        }

        private void Inicializar(string accion)
        {
            this.Accion = accion;
            this.Mensaje = "";
            this.HayErrores = false;
            this.StockProducto = new StockProducto();
            this.Lista = new List<StockProducto>();
            this.ListaConEstados = new List<StockProductoConEstado>();
        }

        public void CopiarPropiedades(DcStockProducto dc)
        {
            this.Accion = dc.Accion;
            this.Mensaje = dc.Mensaje;
            this.HayErrores = dc.HayErrores;
            this.StockProducto = dc.StockProducto;
            this.Lista = dc.Lista;
            this.ListaConEstados = dc.ListaConEstados;
        }

        public bool RetornarError(string mensaje)
        {
            this.HayErrores = true;
            this.Mensaje = mensaje;
            return false;
        }

        public bool ValidarStockProducto(StockProducto stockProducto)
        {
            if (stockProducto.idstock < 0) return RetornarError($"Cuando se va a agregar un nuevo producto a la bodega, su campo ID de Stock debe valer cero");
            if (stockProducto.idprod <= 0) return RetornarError($"El campo ID de Producto debe tener un valor");
            if (stockProducto.nrofac.HasValue)
            {
                var bcFac = new BcFactura();
                bool existe = bcFac.Existe(stockProducto.nrofac.Value);
                if (bcFac.Mensaje != "") return RetornarError(bcFac.Mensaje);
            }
            return true;
        }
        public void Crear(StockProducto stockProducto)
        {
            if (ValidarStockProducto(stockProducto) == false) return;
            var dc = new DcStockProducto();
            dc.Crear(stockProducto);
            this.CopiarPropiedades(dc);
        }

        public void LeerTodos()
        {
            var dc = new DcStockProducto();
            dc.LeerTodos();
            this.CopiarPropiedades(dc);
        }

        public void Leer(int id)
        {
            var dc = new DcStockProducto();
            dc.Leer(id);
            this.CopiarPropiedades(dc);
        }

        public void Actualizar(StockProducto stockProducto)
        {
            if (ValidarStockProducto(stockProducto) == false) return;
            var dc = new DcStockProducto();
            dc.Actualizar(stockProducto);
            this.CopiarPropiedades(dc);
        }

        public void Eliminar(int id)
        {
            var dc = new DcStockProducto();
            dc.Eliminar(id);
            this.CopiarPropiedades(dc);
        }
    }
}
