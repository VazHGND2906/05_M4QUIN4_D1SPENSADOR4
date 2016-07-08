package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;
import vista.VentanaCambio;
import vista.VentanaOpciones;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:14:55	
 * @project 05_MaquinaDispensadora
 * @file CambioControlador.java
 */
public class CambioControlador implements ActionListener {
	private VentanaCambio vistaCambio;
	private int total;
	private int pago;
	private int cambio;

	public CambioControlador(VentanaCambio vistaCambio, int total, int pago) {
		this.vistaCambio = vistaCambio;
		this.total = total;
		this.pago = pago;

		vistaCambio.setVisible(true);
		vistaCambio.onClickAceptar(this);

		calcularCambio();
	}

	/**
	 * Método para calcular y mostrar el cambio
	 */
	private void calcularCambio() {
		cambio = pago - total;

		vistaCambio.setSubTotal(total, pago, cambio);
		
		

		while (cambio != 0) {
			if (cambio >= 50) {
				vistaCambio.setCambioCincuenta((vistaCambio.getCambioCincuenta() + 1));
				cambio -= 50;
			} else if (cambio >= 20) {
				vistaCambio.setCambioVeinte((vistaCambio.getCambioVeinte() + 1));
				cambio -= 20;
			} else if (cambio >= 10) {
				vistaCambio.setCambioDiez((vistaCambio.getCambioDiez() + 1));
				cambio -= 10;
			} else if (cambio >= 5) {
				vistaCambio.setCambioCinco((vistaCambio.getCambioCinco() + 1));
				cambio -= 5;
			} else if (cambio >= 2) {
				vistaCambio.setCambioDos((vistaCambio.getCambioDos() + 1));
				cambio -= 2;
			} else if (cambio >= 1) {
				vistaCambio.setCambioUno((vistaCambio.getCambioUno() + 1));
				cambio -= 1;
			}
		}

		vistaCambio.mostrarCambio();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vistaCambio.getBtnAceptar()) {
			VentanaOpciones vistaOperaciones = new VentanaOpciones();
			DulcesModelo modeloDulces = new DulcesModelo();
			ChocolatesModelo modeloChocolates = new ChocolatesModelo();
			GalletasModelo modeloGalletas = new GalletasModelo();
			RefrescosModelo modeloRefrescos = new RefrescosModelo();
			OperacionesControlador controladorOperaciones = new OperacionesControlador(vistaOperaciones, modeloDulces,
					modeloChocolates, modeloGalletas, modeloRefrescos);

			vistaCambio.setVisible(false);
			vistaOperaciones.setVisible(true);
		}
	}
}
