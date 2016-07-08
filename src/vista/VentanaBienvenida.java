package vista;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.WindowListener;
import java.sql.Ref;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;

import controlador.OperacionesControlador;
import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:46	
 * @project 05_MaquinaDispensadora
 * @file VentanaBienvenida.java
 */
public class VentanaBienvenida extends JFrame {

	private JLabel img = new JLabel("");
	private ImageIcon imagen = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/logo.png"));
	private JProgressBar progressBar = new JProgressBar();
	private Timer tiempo;

	Container c = getContentPane();

	/**
	 * Constructor de la clase ScreenView
	 */
	public VentanaBienvenida() {
		this.setTitle("Tienda 'Don Hugo'");
		this.setBounds(100, 100, 320, 480);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		cargarControles();
	}

	/**
	 * Método para cargar los controles a la ventana
	 */
	private void cargarControles() {
		c.setLayout(null);

		img.setBounds(40, 60, 230, 180);
		progressBar.setBounds(45, 250, 228, 22);

		img.setIcon(new ImageIcon(
				imagen.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH)));

		c.add(img);
		c.add(progressBar);
	}

	/**
	 * @return the progressBar
	 */
	public JProgressBar getProgressBar() {
		return progressBar;
	}

	/**
	 * Método para asignar el evento open a la ventana
	 * 
	 * @param wl
	 *            evento open
	 */
	public void openWindow(WindowListener wl) {
		this.addWindowListener(wl);
	}

	/**
	 * Método para abrir la ventanaOpciones
	 */
	public void abrirOpciones(VentanaOpciones ventanaOpciones, DulcesModelo modeloDulces,
			ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {
		OperacionesControlador controladorOperaciones = new OperacionesControlador(ventanaOpciones, modeloDulces,
				modeloChocolates, modeloGalletas, modeloRefrescos);

		this.setVisible(false);
		ventanaOpciones.setVisible(true);
	}
}