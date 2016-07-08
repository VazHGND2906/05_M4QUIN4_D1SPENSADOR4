package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaDetalleGalleta;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:08	
 * @project 05_MaquinaDispensadora
 * @file DetalleGalletasController.java
 */
public class DetalleGalletasController implements ItemListener, ActionListener {

	private VentanaOpciones vistaOperaciones;
	private VentanaDetalleGalleta ventanaDetalleGalletas;
	private DulcesModelo modeloDulces;
	private ChocolatesModelo modeloChocolates;
	private GalletasModelo modeloGalletas;
	private RefrescosModelo modeloRefrescos;

	public DetalleGalletasController(VentanaOpciones vistaOperaciones, VentanaDetalleGalleta ventanaDetalleGalletas,
			DulcesModelo modeloDulces, ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas,
			RefrescosModelo modeloRefrescos) {

		this.vistaOperaciones = vistaOperaciones;
		this.ventanaDetalleGalletas = ventanaDetalleGalletas;
		this.modeloDulces = modeloDulces;
		this.modeloChocolates = modeloChocolates;
		this.modeloGalletas = modeloGalletas;
		this.modeloRefrescos = modeloRefrescos;

		ventanaDetalleGalletas.onChangeChecks(this);
		ventanaDetalleGalletas.onClickComprar(this);

		for (int i = 0; i < modeloGalletas.getGalletasSelects().length; i++) {
			if (modeloGalletas.getGalletasSelects()[i]) {
				ventanaDetalleGalletas.getChckbxs()[i].setSelected(true);
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		for (int i = 0; i < modeloGalletas.getGalletasSelects().length; i++) {
			if (e.getSource() == ventanaDetalleGalletas.getChckbxs()[i]) {
				modeloGalletas.getGalletasSelects()[i] = ventanaDetalleGalletas.getChckbxs()[i].isSelected();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaDetalleGalletas.getBtnComprar()) {
			ventanaDetalleGalletas.abrirVentanaComprar(vistaOperaciones, modeloDulces, modeloChocolates, modeloGalletas,
					modeloRefrescos);
		}
	}
}
