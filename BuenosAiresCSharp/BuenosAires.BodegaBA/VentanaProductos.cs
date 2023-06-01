using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using BuenosAires.BusinessLayer;
using BuenosAires.Model;

namespace BuenosAires.BodegaBA
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
            var bc = new BcProducto();
            bc.LeerTodos();
            if (bc.Mensaje != "") Util.MostrarMensaje(bc.Mensaje, bc.HayErrores);
            DgvProducto.DataSource = bc.Lista;
            DgvProducto.Refresh();
            DgvProducto.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.AllCells;
        }

        private void BtnBuscar_Click(object sender, EventArgs e)
        {
            var ventanaBuscar = new VentanaBuscarID();
            int id = ventanaBuscar.MostrarVentanaModal();
            if (id == -1) return;

            var bc = new BcProducto();
            bc.Leer(id);

            if (bc.Mensaje != "")
            {
                Util.MostrarMensaje(bc.Mensaje, bc.HayErrores);
                return;
            }

            TxtIdProd.Text = bc.Producto.idprod.ToString();
            TxtNomProd.Text = bc.Producto.nomprod;
            TxtDescProd.Text = bc.Producto.descprod;
            TxtPrecio.Text = bc.Producto.precio.ToString();
            TxtImagen.Text = bc.Producto.imagen;

            RefrescarDataGridView();
            if (bc.Producto != null) SeleccionarFilaPorId(bc.Producto.idprod);
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

            var bc = new BcProducto();
            
            if (TxtIdProd.Text == "")
            {
                bc.Crear(producto);
                Util.MostrarMensaje(bc.Mensaje, bc.HayErrores);
                if (bc.HayErrores) return;
                if (!bc.HayErrores) TxtIdProd.Text = bc.Producto.idprod.ToString();
            }
            else
            {
                bc.Actualizar(producto);
                Util.MostrarMensaje(bc.Mensaje, bc.HayErrores);
                if (bc.HayErrores) return;
            }

            RefrescarDataGridView();
            if (bc.Producto != null) SeleccionarFilaPorId(bc.Producto.idprod);
        }

         private void BtnNuevo_Click(object sender, EventArgs e)
        {
            LimpiarControles();
        }

        private void BtnEliminar_Click(object sender, EventArgs e)
        {
            var bc = new BcProducto();

            if (TxtIdProd.Text == "")
            {
                Util.MostrarMensajeError("Antes de eliminar un producto debe buscarlo en la BD");
                return;
            }

            bc.Eliminar(int.Parse(TxtIdProd.Text));
            Util.MostrarMensaje(bc.Mensaje, bc.HayErrores);
            if (bc.HayErrores) return;
            LimpiarControles();
            RefrescarDataGridView();
        }

        private void BtnCargar_Click(object sender, EventArgs e)
        {
            RefrescarDataGridView();
        }

    }
}
