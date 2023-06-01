using System;
using System.Windows.Forms;
using BuenosAires.VentaBA.ServicioProducto;

namespace BuenosAires.VentaBA
{
    public partial class VentanaCatalogoProductos : Form
    {
        public VentanaCatalogoProductos()
        {
            InitializeComponent();
            DgvProducto.AutoGenerateColumns = false;
            DgvProducto.Columns.AddRange(new DataGridViewColumn[] {
                new DataGridViewTextBoxColumn() { Name = "idprod", DataPropertyName = "idprod", HeaderText = "ID" },
                new DataGridViewTextBoxColumn() { Name = "nomprod", DataPropertyName = "nomprod", HeaderText = "Nombre" },
                new DataGridViewTextBoxColumn() { Name = "descprod", DataPropertyName = "descprod", HeaderText = "Descripción" },
                new DataGridViewTextBoxColumn() { Name = "precio", DataPropertyName = "precio", HeaderText = "Precio" },
                new DataGridViewTextBoxColumn() { Name = "imagen", DataPropertyName = "imagen", HeaderText = "Imagen" },
            });
            DgvProducto.ReadOnly = true;
            DgvProducto.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
            DgvProducto.MultiSelect = false;
            StartPosition = FormStartPosition.CenterScreen;
        }

        private void VentanaProductos_Load(object sender, EventArgs e)
        {
            RefrescarDataGridView();
        }

        private void LimpiarControles()
        {
            TxtIdProd.Text = "";
            TxtNomProd.Text = "";
            TxtDescProd.Text = "";
            TxtPrecio.Text = "";
            TxtImagen.Text = "";
        }

        public void RefrescarDataGridView()
        {
            var ws = new ServicioProductoClient();
            Respuesta respuesta = ws.LeerTodos();
            if (respuesta.Mensaje != "") Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
            DgvProducto.DataSource = Util.DeserializarXML<Producto>(respuesta.XmlListaProducto);
            DgvProducto.Refresh();
            DgvProducto.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.AllCells;
        }

        private void BtnBuscar_Click(object sender, EventArgs e)
        {
            var ventanaBuscar = new VentanaBuscarID();
            int id = ventanaBuscar.MostrarVentanaModal();
            if (id == -1) return;

            var ws = new ServicioProductoClient();
            Respuesta respuesta = ws.Leer(id);

            if (respuesta.Mensaje != "")
            {
                Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
                return;
            }

            Producto producto = Util.DeserializarXML<Producto>(respuesta.XmlProducto);
            TxtIdProd.Text = producto.idprod.ToString();
            TxtNomProd.Text = producto.nomprod;
            TxtDescProd.Text = producto.descprod;
            TxtPrecio.Text = producto.precio.ToString();
            TxtImagen.Text = producto.imagen;

            RefrescarDataGridView();
            if (producto != null) SeleccionarFilaPorId(producto.idprod);
        }

        public void SeleccionarFilaPorId(int id)
        {
            int indiceFilaSeleccionada = -1;
            foreach (DataGridViewRow fila in DgvProducto.Rows)
            {
                if (fila.Cells["idprod"].Value.ToString() == id.ToString())
                {
                    indiceFilaSeleccionada = fila.Index;
                    break;
                }
            }
            if (indiceFilaSeleccionada != -1)
            {
                DgvProducto.Rows[indiceFilaSeleccionada].Selected = true;
            }
        }

        private void DgvProducto_SelectionChanged(object sender, EventArgs e)
        {
            if (DgvProducto.SelectedRows.Count > 0)
            {
                DataGridViewRow row = DgvProducto.SelectedRows[0];
                TxtIdProd.Text = row.Cells["idprod"].Value.ToString();
                TxtNomProd.Text = row.Cells["nomprod"].Value.ToString();
                TxtDescProd.Text = row.Cells["descprod"].Value.ToString();
                TxtPrecio.Text = row.Cells["precio"].Value.ToString();
                TxtImagen.Text = row.Cells["imagen"].Value.ToString();
            }
        }

        private void BtnGuardar_Click(object sender, EventArgs e)
        {
            if (!int.TryParse(TxtPrecio.Text, out int precioNumerico))
            {
                Util.MostrarMensajeError("El precio del producto debe ser un número entero.");
                return;
            }

            var producto = new Producto
            {
                idprod = TxtIdProd.Text == "" ? 0 : int.Parse(TxtIdProd.Text),
                nomprod = TxtNomProd.Text,
                descprod = TxtDescProd.Text,
                precio = precioNumerico,
                imagen = TxtImagen.Text
            };

            var ws = new ServicioProductoClient();
            Respuesta respuesta = null;

            if (TxtIdProd.Text == "")
            {
                respuesta = ws.Crear(producto);
                Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
                if (respuesta.HayErrores) return;
                if (!respuesta.HayErrores) TxtIdProd.Text = Util.DeserializarXML<Producto>(respuesta.XmlProducto).idprod.ToString();
            }
            else
            {
                respuesta = ws.Actualizar(producto);
                Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
                if (respuesta.HayErrores) return;
            }

            RefrescarDataGridView();
            producto = Util.DeserializarXML<Producto>(respuesta.XmlProducto);
            if (producto != null) SeleccionarFilaPorId(producto.idprod);
        }

        private void BtnNuevo_Click(object sender, EventArgs e)
        {
            LimpiarControles();
        }

        private void BtnEliminar_Click(object sender, EventArgs e)
        {
            if (TxtIdProd.Text == "")
            {
                Util.MostrarMensajeError("Antes de eliminar un producto debe buscarlo en la BD");
                return;
            }
            var ws = new ServicioProductoClient();
            Respuesta respuesta = ws.Eliminar(int.Parse(TxtIdProd.Text));
            Util.MostrarMensaje(respuesta.Mensaje, respuesta.HayErrores);
            if (respuesta.HayErrores) return;
            LimpiarControles();
            RefrescarDataGridView();
        }

        private void BtnCargar_Click(object sender, EventArgs e)
        {
            RefrescarDataGridView();
        }

    }
}
