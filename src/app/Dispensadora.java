package app;

import controlador.OperacionesControlador;
import controlador.BienvenidaControlador;
import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaDetalleDulce;
import vista.VentanaOpciones;
import vista.VentanaPagar;
import vista.VentanaBienvenida;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:14:45	
 * @project 05_MaquinaDispensadora
 * @file Dispensadora.java
 */
public class Dispensadora {

	/**
	 * Método main para inicíar la aplicación
	 * 
	 * @param args
	 *            metodo main
	 */
	public static void main(String[] args) {
		VentanaBienvenida vista = new VentanaBienvenida();
		DulcesModelo modeloDulces = new DulcesModelo();
		ChocolatesModelo modeloChocolates = new ChocolatesModelo();
		GalletasModelo modeloGalletas = new GalletasModelo();
		RefrescosModelo modeloRefrescos = new RefrescosModelo();
		BienvenidaControlador Bienvenidacontrolador = new BienvenidaControlador(vista, modeloDulces, modeloChocolates,
				modeloGalletas, modeloRefrescos);
		vista.setVisible(true);
	}
}
