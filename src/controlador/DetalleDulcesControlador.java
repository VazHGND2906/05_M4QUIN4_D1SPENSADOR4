package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaDetalleDulce;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:03	
 * @project 05_MaquinaDispensadora
 * @file DetalleDulcesControlador.java
 */
public class DetalleDulcesControlador implements ItemListener, ActionListener {

	private VentanaOpciones ventanaOpciones;
	private VentanaDetalleDulce ventanaDetalleDulce;
	private DulcesModelo dulcesModelo;
	private ChocolatesModelo modeloChocolates;
	private GalletasModelo modeloGalletas;
	private RefrescosModelo modeloRefrescos;

	public DetalleDulcesControlador(VentanaOpciones ventanaOpciones, VentanaDetalleDulce ventanaDetalleDulces,
			DulcesModelo dulcesModelo, ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas,
			RefrescosModelo modeloRefrescos) {

		this.ventanaOpciones = ventanaOpciones;
		this.ventanaDetalleDulce = ventanaDetalleDulces;
		this.dulcesModelo = dulcesModelo;
		this.modeloChocolates = modeloChocolates;
		this.modeloGalletas = modeloGalletas;
		this.modeloRefrescos = modeloRefrescos;

		ventanaDetalleDulce.onChangeChecks(this);
		ventanaDetalleDulce.onClickComprar(this);

		for (int i = 0; i < dulcesModelo.getDulcesSelects().length; i++) {
			if (dulcesModelo.getDulcesSelects()[i]) {
				ventanaDetalleDulces.getChckbxs()[i].setSelected(true);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaDetalleDulce.getBtnComprar()) {
			ventanaDetalleDulce.abrirVentanaComprar(ventanaOpciones, dulcesModelo, modeloChocolates, modeloGalletas,
					modeloRefrescos);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		for (int i = 0; i < dulcesModelo.getDulcesSelects().length; i++) {
			if (e.getSource() == ventanaDetalleDulce.getChckbxs()[i]) {
				dulcesModelo.getDulcesSelects()[i] = ventanaDetalleDulce.getChckbxs()[i].isSelected();
			}
		}
	}
}
