package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaDetalleChocolate;
import vista.VentanaDetalleDulce;
import vista.VentanaDetalleGalleta;
import vista.VentanaDetalleRefresco;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:22:02
 * @project 05_MaquinaDispensadora
 * @file OperacionesControlador.java
 */
public class OperacionesControlador implements ActionListener {

	private ChocolatesModelo modeloChocolates;
	private RefrescosModelo modeloRefrescos;
	private VentanaOpciones vistaOperaciones;
	private DulcesModelo modeloDulces;
	private GalletasModelo modeloGalletas;

	private VentanaDetalleRefresco vistaDetalleRefrescos = new VentanaDetalleRefresco();
	private VentanaDetalleChocolate vistaDetalleChocolates = new VentanaDetalleChocolate();
	private VentanaDetalleDulce vistaDetalleDulces = new VentanaDetalleDulce();
	private VentanaDetalleGalleta vistaDetalleGalletas = new VentanaDetalleGalleta();

	private DetalleGalletasController controladorDetalleGalletas;
	private DetalleChocolatesControlador controladorDetalleChocolates;
	private DetalleRefrescosController controladorDetalleRefrescos;
	private DetalleDulcesControlador controladorDetalleDulces;

	/**
	 * Contructor de la clase OperacionesController
	 * 
	 * @param vistaOperaciones
	 *            vista
	 */
	public OperacionesControlador(VentanaOpciones vistaOperaciones, DulcesModelo modeloDulces,
			ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {
		this.modeloDulces = modeloDulces;
		this.vistaOperaciones = vistaOperaciones;
		this.modeloRefrescos = modeloRefrescos;
		this.modeloGalletas = modeloGalletas;
		this.modeloChocolates = modeloChocolates;

		vistaOperaciones.onClickBotones(this);

		controladorDetalleChocolates = new DetalleChocolatesControlador(vistaOperaciones, vistaDetalleChocolates,
				modeloDulces, modeloChocolates, modeloGalletas, modeloRefrescos);
		controladorDetalleGalletas = new DetalleGalletasController(vistaOperaciones, vistaDetalleGalletas, modeloDulces,
				modeloChocolates, modeloGalletas, modeloRefrescos);
		controladorDetalleDulces = new DetalleDulcesControlador(vistaOperaciones, vistaDetalleDulces, modeloDulces,
				modeloChocolates, modeloGalletas, modeloRefrescos);
		controladorDetalleRefrescos = new DetalleRefrescosController(vistaOperaciones, vistaDetalleRefrescos,
				modeloDulces, modeloChocolates, modeloGalletas, modeloRefrescos);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vistaOperaciones.getBtnChocolates()) {
			vistaOperaciones.abrirDetalle("Chocolates", vistaDetalleDulces, vistaDetalleChocolates,
					vistaDetalleGalletas, vistaDetalleRefrescos);
		} else if (e.getSource() == vistaOperaciones.getBtnDulces()) {
			vistaOperaciones.abrirDetalle("Dulces", vistaDetalleDulces, vistaDetalleChocolates, vistaDetalleGalletas,
					vistaDetalleRefrescos);
		} else if (e.getSource() == vistaOperaciones.getBtnGalletas()) {
			vistaOperaciones.abrirDetalle("Galletas", vistaDetalleDulces, vistaDetalleChocolates, vistaDetalleGalletas,
					vistaDetalleRefrescos);
		} else if (e.getSource() == vistaOperaciones.getBtnRefrescos()) {
			vistaOperaciones.abrirDetalle("Refrescos", vistaDetalleDulces, vistaDetalleChocolates, vistaDetalleGalletas,
					vistaDetalleRefrescos);
		}
	}
}
