package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.Timer;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaOpciones;
import vista.VentanaBienvenida;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:14:49	
 * @project 05_MaquinaDispensadora
 * @file BienvenidaControlador.java
 */
public class BienvenidaControlador implements ActionListener, WindowListener {

	private VentanaBienvenida vistaScreen;
	private DulcesModelo modeloDulces;
	private ChocolatesModelo modeloChocolates;
	private GalletasModelo modeloGalletas;
	private RefrescosModelo modeloRefrescos;
	private Timer timer;
	private int cont;

	private VentanaOpciones vistaOperaciones = new VentanaOpciones();

	/**
	 * Contructor de la clase ScreenController
	 * 
	 * @param vistaScreen
	 *            vista
	 */
	public BienvenidaControlador(VentanaBienvenida vistaScreen, DulcesModelo modeloDulces, ChocolatesModelo modeloChocolates,
			GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {
		this.vistaScreen = vistaScreen;
		this.modeloDulces = modeloDulces;
		this.modeloChocolates = modeloChocolates;
		this.modeloGalletas = modeloGalletas;
		this.modeloRefrescos = modeloRefrescos;

		vistaScreen.openWindow(this);
	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowActivated(WindowEvent e) {
		vistaScreen.getProgressBar().setStringPainted(true);
		timer = new Timer(50, this);
		timer.start();
	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método implementado de WindowListener
	 * 
	 * @param e
	 *            WindowEvent
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método para llenar la barra de progreso
	 * 
	 * @param e
	 *            evento
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		cont++;

		vistaScreen.getProgressBar().setValue(cont);

		if (cont == 101) {
			timer.stop();
			vistaScreen.abrirOpciones(vistaOperaciones, modeloDulces, modeloChocolates, modeloGalletas,
					modeloRefrescos);
		}
	}
}
