package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaDetalleRefresco;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:12	
 * @project 05_MaquinaDispensadora
 * @file DetalleRefrescosController.java
 */
public class DetalleRefrescosController implements ItemListener, ActionListener {

	private VentanaOpciones vistaOperaciones;
	private VentanaDetalleRefresco ventanaDetalleRefrescos;
	private DulcesModelo modeloDulces;
	private ChocolatesModelo modeloChocolates;
	private GalletasModelo modeloGalletas;
	private RefrescosModelo modeloRefrescos;

	public DetalleRefrescosController(VentanaOpciones vistaOperaciones, VentanaDetalleRefresco ventanaDetalleRefrescos,
			DulcesModelo modeloDulces, ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas,
			RefrescosModelo modeloRefrescos) {

		this.vistaOperaciones = vistaOperaciones;
		this.ventanaDetalleRefrescos = ventanaDetalleRefrescos;
		this.modeloDulces = modeloDulces;
		this.modeloChocolates = modeloChocolates;
		this.modeloGalletas = modeloGalletas;
		this.modeloRefrescos = modeloRefrescos;

		ventanaDetalleRefrescos.onChangeChecks(this);
		ventanaDetalleRefrescos.onClickComprar(this);

		for (int i = 0; i < modeloRefrescos.getRefrescosSelects().length; i++) {
			if (modeloRefrescos.getRefrescosSelects()[i]) {
				ventanaDetalleRefrescos.getChckbxs()[i].setSelected(true);
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		for (int i = 0; i < modeloRefrescos.getRefrescosSelects().length; i++) {
			if (e.getSource() == ventanaDetalleRefrescos.getChckbxs()[i]) {
				modeloRefrescos.getRefrescosSelects()[i] = ventanaDetalleRefrescos.getChckbxs()[i].isSelected();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaDetalleRefrescos.getBtnComprar()) {
			ventanaDetalleRefrescos.abrirVentanaComprar(vistaOperaciones, modeloDulces, modeloChocolates,
					modeloGalletas, modeloRefrescos);
		}
	}
}
