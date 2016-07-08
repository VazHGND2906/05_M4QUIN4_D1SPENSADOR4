package vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 11/06/2016 - 19:31:29
 * @project 05_MaquinaDispensadora
 * @file VentanaPagar.java
 */
public class VentanaPagar extends JFrame {

	private JPanel panel = new JPanel();

	private JScrollPane scrollPane = new JScrollPane();

	private JLabel lblTotal = new JLabel("Total:");

	private JTextField txtPago = new JTextField();

	private JButton btnRegresarMenu = new JButton("<Menú");
	private JButton btnPagar = new JButton("Pagar");

	private VentanaDetalleDulce vistaDetalleDulces = new VentanaDetalleDulce();
	private VentanaDetalleChocolate vistaDetalleChocolates = new VentanaDetalleChocolate();
	private VentanaDetalleGalleta vistaDetalleGalletas = new VentanaDetalleGalleta();
	private VentanaDetalleRefresco vistaDetalleRefrescos = new VentanaDetalleRefresco();

	private Container c = getContentPane();

	/**
	 * Constructor de la clase VentanaPagar
	 */
	public VentanaPagar() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setTitle("PAGUE POR FAVOR");
		this.setBounds(100, 100, 320, 480);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		c.setLayout(null);

		scrollPane.setBounds(5, 40, 305, 300);
		scrollPane.setViewportView(panel);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);

		panel.setPreferredSize(new Dimension(250, 500));
		panel.setLayout(null);

		btnRegresarMenu.setBounds(5, 5, 80, 30);

		lblTotal.setBounds(5, 335, 294, 40);

		txtPago.setBounds(5, 370, 120, 30);

		btnPagar.setBounds(140, 370, 120, 30);

		c.add(scrollPane);
		c.add(btnPagar);
		c.add(btnRegresarMenu);
		c.add(lblTotal);
		c.add(txtPago);
	}

	public void cargarProductos(DulcesModelo modeloDulces, ChocolatesModelo modeloChocolates,
			GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {

		int y = 0;
		int h = 80;

		for (int i = 0; i < modeloDulces.getDulcesSelects().length; i++) {

			if (modeloDulces.getDulcesSelects()[i]) {

				vistaDetalleDulces.getLabels()[i].setBounds(5, y, 250, 70);
				vistaDetalleDulces.getChckbxs()[i].setBounds(35, y, 250, 80);

				vistaDetalleDulces.getChckbxs()[i].setSelected(true);
				vistaDetalleDulces.getChckbxs()[i].setEnabled(false);

				panel.setPreferredSize(new Dimension(250, h));

				panel.add(vistaDetalleDulces.getLabels()[i]);
				panel.add(vistaDetalleDulces.getChckbxs()[i]);

				y += 50;
				h += 50;

			}
		}

		for (int i = 0; i < modeloChocolates.getChocolatesSelects().length; i++) {

			if (modeloChocolates.getChocolatesSelects()[i]) {

				vistaDetalleChocolates.getLabels()[i].setBounds(5, y, 250, 70);
				vistaDetalleChocolates.getChckbxs()[i].setBounds(35, y, 250, 80);

				vistaDetalleChocolates.getChckbxs()[i].setSelected(true);
				vistaDetalleChocolates.getChckbxs()[i].setEnabled(false);

				panel.setPreferredSize(new Dimension(250, h));

				panel.add(vistaDetalleChocolates.getLabels()[i]);
				panel.add(vistaDetalleChocolates.getChckbxs()[i]);

				y += 50;
				h += 50;

			}
		}

		for (int i = 0; i < modeloGalletas.getGalletasSelects().length; i++) {

			if (modeloGalletas.getGalletasSelects()[i]) {

				vistaDetalleGalletas.getLabels()[i].setBounds(5, y, 250, 70);
				vistaDetalleGalletas.getChckbxs()[i].setBounds(35, y, 250, 80);

				vistaDetalleGalletas.getChckbxs()[i].setSelected(true);
				vistaDetalleGalletas.getChckbxs()[i].setEnabled(false);

				panel.setPreferredSize(new Dimension(250, h));

				panel.add(vistaDetalleGalletas.getLabels()[i]);
				panel.add(vistaDetalleGalletas.getChckbxs()[i]);

				y += 50;
				h += 50;
			}
		}

		for (int i = 0; i < modeloRefrescos.getRefrescosSelects().length; i++) {

			if (modeloRefrescos.getRefrescosSelects()[i]) {

				vistaDetalleRefrescos.getLabels()[i].setBounds(5, y, 250, 70);
				vistaDetalleRefrescos.getChckbxs()[i].setBounds(35, y, 250, 80);

				vistaDetalleRefrescos.getChckbxs()[i].setSelected(true);
				vistaDetalleRefrescos.getChckbxs()[i].setEnabled(false);

				panel.setPreferredSize(new Dimension(250, h));

				panel.add(vistaDetalleRefrescos.getLabels()[i]);
				panel.add(vistaDetalleRefrescos.getChckbxs()[i]);

				y += 50;
				h += 50;
			}
		}
	}

	/**
	 * @return the lblTotal
	 */
	public JLabel getLblTotal() {
		return lblTotal;
	}

	/**
	 * @return the btnRegresar
	 */
	public JButton getBtnRegresar() {
		return btnRegresarMenu;
	}

	/**
	 * @return the btnPagar
	 */
	public JButton getBtnPagar() {
		return btnPagar;
	}

	/**
	 * Método que devuelve el valor del pago ingresado
	 * 
	 * @return pago ingresado
	 */
	public int getPago() {
		return Integer.parseInt(txtPago.getText());
	}

	/**
	 * Método para asignar el evento click a los botones
	 * 
	 * @param al
	 *            evento click
	 */
	public void onClickBotones(ActionListener al) {
		btnPagar.addActionListener(al);
		btnRegresarMenu.addActionListener(al);
	}

	/**
	 * Método para mostrar mensaje de error
	 * 
	 * @param error
	 *            generado
	 */
	public void setError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error", JOptionPane.ERROR_MESSAGE);
	}
}
