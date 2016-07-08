package vista;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controlador.DetalleChocolatesControlador;
import controlador.DetalleDulcesControlador;
import controlador.DetalleGalletasController;
import controlador.DetalleRefrescosController;
import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:16:24	
 * @project 05_MaquinaDispensadora
 * @file VentanaOpciones.java
 */
public class VentanaOpciones extends JFrame {

	private JLabel lbl1 = new JLabel("Menú de productos");
	private JButton btnDulces = new JButton("DULCES");
	private JButton btnChocolates = new JButton("CHOCOLATES");
	private JButton btnGalletas = new JButton("GALLETAS");
	private JButton btnRefrescos = new JButton("REFRESCOS");

	Container c = getContentPane();

	/**
	 * Constructor de la clase VentanaOpciones
	 */
	public VentanaOpciones() {
		this.setTitle("Menú");
		this.setBounds(100, 100, 320, 480);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		cargarControles();
	}

	/**
	 * Método para cargar los controles de la ventana
	 */
	private void cargarControles() {
		c.setLayout(null);

		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setBounds(10, 15, 294, 30);
		btnDulces.setBounds(40, 60, 240, 60);
		btnChocolates.setBounds(40, 140, 240, 60);
		btnGalletas.setBounds(40, 220, 240, 60);
		btnRefrescos.setBounds(40, 300, 240, 60);

		c.add(lbl1);
		c.add(btnDulces);
		c.add(btnChocolates);
		c.add(btnGalletas);
		c.add(btnRefrescos);
	}

	/**
	 * @return the btnDulces
	 */
	public JButton getBtnDulces() {
		return btnDulces;
	}

	/**
	 * @return the btnChocolates
	 */
	public JButton getBtnChocolates() {
		return btnChocolates;
	}

	/**
	 * @return the btnGalletas
	 */
	public JButton getBtnGalletas() {
		return btnGalletas;
	}

	/**
	 * @return the btnRefrescos
	 */
	public JButton getBtnRefrescos() {
		return btnRefrescos;
	}

	/**
	 * Método para asignar el evento click a los botones
	 * 
	 * @param al
	 *            evento click
	 */
	public void onClickBotones(ActionListener al) {
		btnDulces.addActionListener(al);
		btnChocolates.addActionListener(al);
		btnGalletas.addActionListener(al);
		btnRefrescos.addActionListener(al);
	}

	/**
	 * Método para abrir la ventana de detalle
	 */
	public void abrirDetalle(String producto, VentanaDetalleDulce ventanaDetalleDulce,
			VentanaDetalleChocolate vistaDetalleChocolates, VentanaDetalleGalleta vistaDetalleGalletas,
			VentanaDetalleRefresco vistaDetalleRefrescos) {

		if (producto.equals("Dulces")) {
			ventanaDetalleDulce.setVisible(true);
			vistaDetalleChocolates.setVisible(false);
			vistaDetalleGalletas.setVisible(false);
			vistaDetalleRefrescos.setVisible(false);
		} else if (producto.equals("Chocolates")) {
			ventanaDetalleDulce.setVisible(false);
			vistaDetalleChocolates.setVisible(true);
			vistaDetalleGalletas.setVisible(false);
			vistaDetalleRefrescos.setVisible(false);
		} else if (producto.equals("Galletas")) {
			ventanaDetalleDulce.setVisible(false);
			vistaDetalleChocolates.setVisible(false);
			vistaDetalleGalletas.setVisible(true);
			vistaDetalleRefrescos.setVisible(false);
		} else if (producto.equals("Refrescos")) {
			ventanaDetalleDulce.setVisible(false);
			vistaDetalleChocolates.setVisible(false);
			vistaDetalleGalletas.setVisible(false);
			vistaDetalleRefrescos.setVisible(true);
		}
	}
}