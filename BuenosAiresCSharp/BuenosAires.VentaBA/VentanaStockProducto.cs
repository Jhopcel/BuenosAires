using System;
using System.Collections.Generic;
using System.Windows.Forms;
using BuenosAires.VentaBA.ServicioStockProducto;
using Newtonsoft.Json;


namespace BuenosAires.VentaBA
{
    public partial class VentanaStockProducto : Form
    {
        public VentanaStockProducto()
        {
            InitializeComponent();

            DgvStockProducto.AutoGenerateColumns = false;
            DgvStockProducto.Columns.AddRange(new DataGridViewColumn[] {
                new DataGridViewTextBoxColumn() { Name = "idstock", DataPropertyName = "idstock", HeaderText = "ID de stock" },
                new DataGridViewTextBoxColumn() { Name = "idprod", DataPropertyName = "idprod", HeaderText = "ID de producto" },
                new DataGridViewTextBoxColumn() { Name = "nrofac", DataPropertyName = "nrofac", HeaderText = "N° de factura" },
            });
            DgvStockProducto.ReadOnly = true;
            DgvStockProducto.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
            DgvStockProducto.MultiSelect = false;

            DgvProducto.AutoGenerateColumns = false;
            DgvProducto.Columns.AddRange(new DataGridViewColumn[] {
                new DataGridViewTextBoxColumn() { Name = "idstock", DataPropertyName = "idstock", HeaderText = "ID de stock" },
                new DataGridViewTextBoxColumn() { Name = "idprod", DataPropertyName = "idprod", HeaderText = "ID de producto" },
                new DataGridViewTextBoxColumn() { Name = "nomprod", DataPropertyName = "nomprod", HeaderText = "Nombre de producto" },
                new DataGridViewTextBoxColumn() { Name = "nrofac", DataPropertyName = "nrofac", HeaderText = "N° de factura" },
                new DataGridViewTextBoxColumn() { Name = "estado", DataPropertyName = "estado", HeaderText = "Estado" },
            });
            DgvProducto.ReadOnly = true;
            DgvProducto.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
            DgvProducto.MultiSelect = false;

            StartPosition = FormStartPosition.CenterScreen;
        }

        private void VentanaStockProducto_Load(object sender, EventArgs e)
        {
            RefrescarDataGridView();
        }

        private void LimpiarControles()
        {
            TxtIdStock.Text = "";
            TxtIdProd.Text = "";
            TxtNroFac.Text = "";
        }

        public void RefrescarDataGridView()
        {
            var ws = new ServicioStockProductoClient();
            ws.InnerChannel.OperationTimeout = new TimeSpan(1, 0, 0);
            Respuesta respuesta = ws.LeerTodos();
            
            
            if (respuesta.Mensaje != "") Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
            var lista = Util.DeserializarXML<List<StockProducto>>(respuesta.XmlListaStockProducto);


            DgvStockProducto.DataSource = lista;
            DgvStockProducto.Refresh();
            DgvStockProducto.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.AllCells;
        }

        private void BtnBuscar_Click(object sender, EventArgs e)
        {
            var ventanaBuscar = new VentanaBuscarID();
            int id = ventanaBuscar.MostrarVentanaModal();
            if (id == -1) return;

            var ws = new ServicioStockProductoClient();
            Respuesta respuesta = ws.Leer(id);

            if (respuesta.Mensaje != "")
            {
                Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
                return;
            }

            StockProducto stockProducto = Util.DeserializarXML<StockProducto>(respuesta.XmlStockProducto);
            TxtIdStock.Text = stockProducto.idstock.ToString();
            TxtIdProd.Text = stockProducto.idprod.ToString();
            TxtNroFac.Text = stockProducto.nrofac == null? "": stockProducto.nrofac.ToString();

            RefrescarDataGridView();
            if (stockProducto != null) SeleccionarFilaPorId(stockProducto.idstock);
        }

        public void SeleccionarFilaPorId(int id)
        {
            int indiceFilaSeleccionada = -1;
            foreach (DataGridViewRow fila in DgvStockProducto.Rows)
            {
                if (fila.Cells["idstock"].Value.ToString() == id.ToString())
                {
                    indiceFilaSeleccionada = fila.Index;
                    break;
                }
            }
            if (indiceFilaSeleccionada != -1)
            {
                DgvStockProducto.Rows[indiceFilaSeleccionada].Selected = true;
            }
        }

        private void DgvStockProducto_SelectionChanged(object sender, EventArgs e)
        {
            if (DgvStockProducto.SelectedRows.Count > 0)
            {
                DataGridViewRow row = DgvStockProducto.SelectedRows[0];
                TxtIdStock.Text = row.Cells["idstock"].Value.ToString();
                TxtIdProd.Text = row.Cells["idprod"].Value.ToString();
                TxtNroFac.Text = row.Cells["nrofac"].Value == null? "" : row.Cells["nrofac"].Value.ToString();
            }
        }

        private int? ObtenerNumero(string texto)
        {
            bool esNumero = int.TryParse(texto, out int numero);

            if (esNumero)
            {
                return numero;
            }
            else
            {
                return null;
            }
        }

        private void BtnGuardar_Click(object sender, EventArgs e)
        {
            TxtIdStock.Text = TxtIdStock.Text.Trim();
            TxtIdProd.Text = TxtIdProd.Text.Trim();
            TxtNroFac.Text = TxtNroFac.Text.Trim();

            int idstock = TxtIdStock.Text == ""? 0 : int.Parse(TxtIdStock.Text);

            int idprod = -1;
            if (TxtIdProd.Text == "")
            {
                Util.MostrarMensajeError("El campo ID de Producto debe ser un número entero mayor que cero.");
                return;
            }
            else
            {
                if (!int.TryParse(TxtIdProd.Text, out idprod))
                {
                    Util.MostrarMensajeError("El campo ID de Producto debe ser un número entero mayor que cero.");
                    return;
                }
                if (idprod <= 0)
                {
                    Util.MostrarMensajeError("El campo ID de Producto debe ser un número entero mayor que cero.");
                    return;
                }
            }

            int? nrofac = ObtenerNumero(TxtNroFac.Text);
            if (nrofac <= 0)
            {
                Util.MostrarMensajeError("El campo N° de Factura debe ser un número entero "
                    + "mayor que cero si el producto de la bodega ya ha sido facturado, o "
                    + "vacío si se trata de un producto que aún está almacenado en la bodega, "
                    + "pero no ha sido vendido.");
                return;
            }

            var stockProducto = new StockProducto
            {
                idstock = idstock,
                idprod = idprod,
                nrofac = nrofac
            };

            var ws = new ServicioStockProductoClient();
            Respuesta respuesta = null;

            if (TxtIdStock.Text == "")
            {
                respuesta = ws.Crear(stockProducto);
                Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
                if (respuesta.HayErrores) return;
                if (!respuesta.HayErrores)
                {
                    stockProducto = Util.DeserializarXML<StockProducto>(respuesta.XmlStockProducto);
                    TxtIdStock.Text = stockProducto.idstock.ToString();
                }
            }
            else
            {
                respuesta = ws.Actualizar(stockProducto);
                Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
                if (respuesta.HayErrores) return;
            }

            RefrescarDataGridView();
            stockProducto = Util.DeserializarXML<StockProducto>(respuesta.XmlStockProducto);
            if (stockProducto != null) SeleccionarFilaPorId(stockProducto.idstock);
        }

        private void BtnNuevo_Click(object sender, EventArgs e)
        {
            LimpiarControles();
        }

        private void BtnEliminar_Click(object sender, EventArgs e)
        {
            if (TxtIdStock.Text == "")
            {
                Util.MostrarMensajeError("Antes de eliminar un producto de la bodega debe buscarlo en la BD");
                return;
            }
            var ws = new ServicioStockProductoClient();
            Respuesta respuesta = ws.Eliminar(int.Parse(TxtIdStock.Text));
            Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
            if (respuesta.HayErrores) return;
            LimpiarControles();
            RefrescarDataGridView();
        }

        private void BtnCargar_Click(object sender, EventArgs e)
        {
            RefrescarDataGridView();
        }

        private void BtnCargarProductosDesdeApiRest_Click(object sender, EventArgs e)
        {
            var ws = new ServicioStockProductoClient();
            ws.InnerChannel.OperationTimeout = new TimeSpan(1, 0, 0);
            Respuesta respuesta = ws.LeerTodosEnJson();
            if (respuesta.Mensaje != "") Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
            var lista = JsonConvert.DeserializeObject<List<StockProductoConEstado>>(respuesta.JsonListaProducto);
            DgvProducto.DataSource = lista;
            DgvProducto.Refresh();
            DgvProducto.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.AllCells;
        }
    }
}
