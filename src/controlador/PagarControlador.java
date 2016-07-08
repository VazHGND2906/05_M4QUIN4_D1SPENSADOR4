package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaCambio;
import vista.VentanaPagar;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:24	
 * @project 05_MaquinaDispensadora
 * @file PagarControlador.java
 */

public class PagarControlador implements ActionListener {
	private VentanaPagar ventanaPagar;
	private VentanaOpciones ventanaOpciones;
	private DulcesModelo modeloDulces;
	private ChocolatesModelo modeloChocolates;
	private GalletasModelo modeloGalletas;
	private RefrescosModelo modeloRefrescos;

	private int total;

	public PagarControlador(VentanaPagar ventanaPagar, VentanaOpciones vistaOperaciones, DulcesModelo modeloDulces,
			ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {

		this.ventanaOpciones = vistaOperaciones;
		this.modeloDulces = modeloDulces;
		this.ventanaPagar = ventanaPagar;
		this.modeloChocolates = modeloChocolates;
		this.modeloGalletas = modeloGalletas;
		this.modeloRefrescos = modeloRefrescos;

		vistaOperaciones.setVisible(false);

		ventanaPagar.setVisible(true);

		ventanaPagar.onClickBotones(this);

		ventanaPagar.cargarProductos(modeloDulces, modeloChocolates, modeloGalletas, modeloRefrescos);

		calcularTotal();
	}

	private void calcularTotal() {
		total = 0;

		for (int i = 0; i < 10; i++) {
			if (modeloDulces.getDulcesSelects()[i]) {
				total += modeloDulces.getDulcesPrecios()[i];
			}
		}

		for (int i = 0; i < 6; i++) {
			if (modeloChocolates.getChocolatesSelects()[i]) {
				total += modeloChocolates.getChocolatesPrecios()[i];
			}
		}

		for (int i = 0; i < 6; i++) {
			if (modeloGalletas.getGalletasSelects()[i]) {
				total += modeloGalletas.getGalletasPrecios()[i];
			}
		}

		for (int i = 0; i < 6; i++) {
			if (modeloRefrescos.getRefrescosSelects()[i]) {
				total += modeloRefrescos.getRefrescosPrecios()[i];
			}
		}
		if (total == 0) {
			ventanaPagar.setVisible(false);
			ventanaOpciones.setVisible(true);
			ventanaPagar.setError("Ningún producto seleccionado");
		} else if (total > 100) {
			ventanaPagar.getLblTotal().setForeground(Color.RED);
			ventanaPagar.getLblTotal().setText("<html><body>" + String.format("Total: $%d", total)
					+ "<br>No se permiten compras mayores a $100</body></html>");
		} else {
			ventanaPagar.getLblTotal().setText(String.format("Total: $%d.00 MXN", total));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventanaPagar.getBtnRegresar()) {
			ventanaPagar.setVisible(false);
			ventanaOpciones.setVisible(true);
		} else if (e.getSource() == ventanaPagar.getBtnPagar()) {

			try {
				int pago = ventanaPagar.getPago();
				if (pago % 1 == 0) {
					if (pago >= total) {
						if (pago <= 100) {
							VentanaCambio vistaCambio = new VentanaCambio();
							CambioControlador controladorCambio = new CambioControlador(vistaCambio, total, pago);
							ventanaPagar.setVisible(false);
						} else {
							ventanaPagar.setError("No se permiten pagos mayores a $100");
						}
					} else {
						ventanaPagar.setError("El pago ingresado es menor que el total");
					}
				} else {
					ventanaPagar.setError("Solo números enteros");
				}
			} catch (NumberFormatException e2) {
				ventanaPagar.setError("Solo números enteros");
			}
		}
	}
}
