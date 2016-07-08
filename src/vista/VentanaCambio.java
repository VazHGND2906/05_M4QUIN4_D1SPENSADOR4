package vista;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.event.ActionListener;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:50	
 * @project 05_MaquinaDispensadora
 * @file VentanaCambio.java
 */
public class VentanaCambio extends JFrame {

	private int subTotal = 0;
	private int pago = 0;
	private int cambio = 0;

	private int cambioCincuenta = 0;
	private int cambioVeinte = 0;
	private int cambioDiez = 0;
	private int cambioCinco = 0;
	private int cambioDos = 0;
	private int cambioUno = 0;

	private JLabel lblCincuenta = new JLabel();
	private JLabel lblVeinte = new JLabel();
	private JLabel lblDiez = new JLabel();
	private JLabel lblCinco = new JLabel();
	private JLabel lblDos = new JLabel();
	private JLabel lblUno = new JLabel();

	private JTextArea txaCambio = new JTextArea();

	private JButton btnAceptar = new JButton("Aceptar");

	private Container c = getContentPane();

	/**
	 * Contructor de la clase CambioView
	 */
	public VentanaCambio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("A CAMBIO...");
		this.setBounds(100, 100, 320, 480);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		c.setLayout(null);

		lblCincuenta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCincuenta.setBounds(10, 32, 294, 31);

		lblVeinte.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVeinte.setBounds(10, 92, 294, 31);

		lblDiez.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDiez.setBounds(10, 152, 294, 31);

		lblCinco.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCinco.setBounds(10, 212, 294, 31);

		lblDos.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDos.setBounds(10, 272, 294, 31);

		lblUno.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUno.setBounds(10, 332, 294, 31);

		btnAceptar.setBounds(95, 372, 120, 40);

		txaCambio.setFont(new Font("Tahoma", Font.BOLD, 12));
		txaCambio.setBounds(10, 10, 295, 350);

		// c.add(lblCincuenta);
		// c.add(lblVeinte);
		// c.add(lblDiez);
		// c.add(lblCinco);
		// c.add(lblDos);
		// c.add(lblUno);
		c.add(txaCambio);
		c.add(btnAceptar);
	}

	/**
	 * @return the subTotal
	 */
	public JLabel getLbl() {
		return lblCincuenta;
	}

	/**
	 * @return the lblCincuenta
	 */
	public JLabel getLblCincuenta() {
		return lblCincuenta;
	}

	/**
	 * @return the lblVeinte
	 */
	public JLabel getLblVeinte() {
		return lblVeinte;
	}

	/**
	 * @return the lblDiez
	 */
	public JLabel getLblDiez() {
		return lblDiez;
	}

	/**
	 * @return the lblCinco
	 */
	public JLabel getLblCinco() {
		return lblCinco;
	}

	/**
	 * @return the lblDos
	 */
	public JLabel getLblDos() {
		return lblDos;
	}

	/**
	 * @return the lblUno
	 */
	public JLabel getLblUno() {
		return lblUno;
	}

	/**
	 * @return the btnAceptar
	 */
	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	/**
	 * @return the subTotal
	 */
	public int getSubTotal() {
		return subTotal;
	}

	/**
	 * @param subTotal
	 *            the subtotal to set
	 */
	public void setSubTotal(int subTotal, int pago, int cambio) {
		this.subTotal = subTotal;
		this.pago = pago;
		this.cambio = cambio;
	}

	/**
	 * @return the cambioCincuenta
	 */
	public int getCambioCincuenta() {
		return cambioCincuenta;
	}

	/**
	 * @param cambioCincuenta
	 *            the cambioCincuenta to set
	 */
	public void setCambioCincuenta(int cambioCincuenta) {
		this.cambioCincuenta = cambioCincuenta;
	}

	/**
	 * @return the cambioVeinte
	 */
	public int getCambioVeinte() {
		return cambioVeinte;
	}

	/**
	 * @param cambioVeinte
	 *            the cambioVeinte to set
	 */
	public void setCambioVeinte(int cambioVeinte) {
		this.cambioVeinte = cambioVeinte;
	}

	/**
	 * @return the cambioDiez
	 */
	public int getCambioDiez() {
		return cambioDiez;
	}

	/**
	 * @param cambioDiez
	 *            the cambioDiez to set
	 */
	public void setCambioDiez(int cambioDiez) {
		this.cambioDiez = cambioDiez;
	}

	/**
	 * @return the cambioCinco
	 */
	public int getCambioCinco() {
		return cambioCinco;
	}

	/**
	 * @param cambioCinco
	 *            the cambioCinco to set
	 */
	public void setCambioCinco(int cambioCinco) {
		this.cambioCinco = cambioCinco;
	}

	/**
	 * @return the cambioDos
	 */
	public int getCambioDos() {
		return cambioDos;
	}

	/**
	 * @param cambioUno
	 *            the cambioUno to set
	 */
	public void setCambioDos(int cambioDos) {
		this.cambioDos = cambioDos;
	}

	/**
	 * @return the cambioUno
	 */
	public int getCambioUno() {
		return cambioUno;
	}

	/**
	 * @param cambioUno
	 *            the cambioUno to set
	 */
	public void setCambioUno(int cambioUno) {
		this.cambioUno = cambioUno;
	}

	/**
	 * Método para asignar el evento click al boton Aceptar
	 * 
	 * @param al
	 *            evento click
	 */
	public void onClickAceptar(ActionListener al) {
		btnAceptar.addActionListener(al);
	}

	/**
	 * Método para mostrar el cambio en la ventana
	 */
	public void mostrarCambio() {

		txaCambio.setText("---- Cadena Comercial Don Hugo S.A. de C.V ----\n");
		txaCambio.setText(txaCambio.getText() + "--------------- TEOTIHUACÁN MÉXICO ---------------\n");
		txaCambio.setText(txaCambio.getText() + "Edison Nte. Numero 129 Col. Talleres Monterrey\n");
		txaCambio.setText(txaCambio.getText() + "==============================\n");
		txaCambio.setText(txaCambio.getText() + "                DETALLES DE LA COMPRA\n\n");

		txaCambio.setText(
				txaCambio.getText() + "SubTotal:...............................................$" + subTotal + ".00\n");
		txaCambio.setText(
				txaCambio.getText() + "IVA:.......................................................$" + 0.00 + "\n");
		txaCambio.setText(txaCambio.getText() + "Total:.....................................................$"
				+ subTotal + ".00\n");
		txaCambio.setText(
				txaCambio.getText() + "Su pago:................................................$" + pago + ".00\n\n");
		txaCambio.setText(
				txaCambio.getText() + "Su cambio:.............................................$" + cambio + ".00\n");
		txaCambio.setText(txaCambio.getText() + "==============================\n");
		txaCambio.setText(txaCambio.getText() + "                   DETALLE DEL EFECTIVO\n\n");
		if (cambioCincuenta > 0) {
			txaCambio.setText(txaCambio.getText() + "BILLETES DE 50:............................................."
					+ cambioCincuenta + "\n");

		}
		if (cambioVeinte > 0) {
			txaCambio.setText(txaCambio.getText() + "BILLETES DE 20:............................................."
					+ cambioVeinte + "\n");

		}
		if (cambioDiez > 0) {

			txaCambio.setText(txaCambio.getText() + "MONEDAS DE 10:............................................"
					+ cambioDiez + "\n");
		}
		if (cambioCinco > 0) {

			txaCambio.setText(txaCambio.getText() + "MODEDAS DE 5:.............................................."
					+ cambioCinco + "\n");
		}
		if (cambioDos > 0) {

			txaCambio.setText(txaCambio.getText() + "MODEDAS DE 2:.............................................."
					+ cambioDos + "\n");
		}
		if (cambioUno > 0) {

			txaCambio.setText(txaCambio.getText() + "MODEDAS DE 1:.............................................."
					+ cambioUno + "\n");
		}
		txaCambio.setText(txaCambio.getText() + "\n******GRACIAS POR SU PREFERENCIA******\n");
		txaCambio.setText(txaCambio.getText() + "-----------------------------------------------------------\n");
		txaCambio.setText(txaCambio.getText() + "-----------------------------------------------------------\n");
		txaCambio.setText(txaCambio.getText() + "-----------------------------------------------------------\n");
		txaCambio.setText(txaCambio.getText() + "-----------------------------------------------------------\n");
		txaCambio.setText(txaCambio.getText() + "-----------------------------------------------------------\n");
		txaCambio.setText(txaCambio.getText() + "-----------------------------------------------------------\n");
	}
}
