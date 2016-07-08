package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaDetalleChocolate;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:14:59	
 * @project 05_MaquinaDispensadora
 * @file DetalleChocolatesControlador.java
 */

public class DetalleChocolatesControlador implements ItemListener, ActionListener {

	private VentanaOpciones vistaOperaciones;
	private VentanaDetalleChocolate ventanaDetalleChocolates;
	private DulcesModelo modeloDulces;
	private ChocolatesModelo modeloChocolates;
	private GalletasModelo modeloGalletas;
	private RefrescosModelo modeloRefrescos;

	public DetalleChocolatesControlador(VentanaOpciones vistaOperaciones,
			VentanaDetalleChocolate ventanaDetalleChocolates, DulcesModelo modeloDulces,
			ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {

		this.vistaOperaciones = vistaOperaciones;
		this.ventanaDetalleChocolates = ventanaDetalleChocolates;
		this.modeloDulces = modeloDulces;
		this.modeloChocolates = modeloChocolates;
		this.modeloGalletas = modeloGalletas;
		this.modeloRefrescos = modeloRefrescos;

		ventanaDetalleChocolates.onChangeChecks(this);
		ventanaDetalleChocolates.onClickComprar(this);

		for (int i = 0; i < modeloChocolates.getChocolatesSelects().length; i++) {
			if (modeloChocolates.getChocolatesSelects()[i]) {
				ventanaDetalleChocolates.getChckbxs()[i].setSelected(true);
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		for (int i = 0; i < modeloChocolates.getChocolatesSelects().length; i++) {
			if (e.getSource() == ventanaDetalleChocolates.getChckbxs()[i]) {
				modeloChocolates.getChocolatesSelects()[i] = ventanaDetalleChocolates.getChckbxs()[i].isSelected();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaDetalleChocolates.getBtnComprar()) {
			ventanaDetalleChocolates.abrirVentanaComprar(vistaOperaciones, modeloDulces, modeloChocolates,
					modeloGalletas, modeloRefrescos);
		}
	}
}
