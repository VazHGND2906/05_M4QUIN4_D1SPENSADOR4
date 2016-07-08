package modelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:38	
 * @project 05_MaquinaDispensadora
 * @file GalletasModelo.java
 */
public class GalletasModelo {

	/**
	 * Arreglo con los precios de los Galletas
	 */
	private int[] galletasPrecios = { 6, 4, 5, 8, 5, 5, 6, 9, 4, 2 };

	/**
	 * Arreglo con los Galletas seleccionados
	 */
	private boolean[] GalletasSelects = { false, false, false, false, false, false, false, false, false, false };

	/**
	 * Constructor vacío de la clase GalletasModel
	 */
	public GalletasModelo() {

	}

	/**
	 * @return the galletasPrecios
	 */
	public int[] getGalletasPrecios() {
		return galletasPrecios;
	}

	/**
	 * @param galletasPrecios
	 *            the galletasPrecios to set
	 */
	public void setGalletasPrecios(int[] galletasPrecios) {
		this.galletasPrecios = galletasPrecios;
	}

	/**
	 * @return the galletasSelects
	 */
	public boolean[] getGalletasSelects() {
		return GalletasSelects;
	}

	/**
	 * @param galletasSelects
	 *            the galletasSelects to set
	 */
	public void setGalletasSelects(boolean[] galletasSelects) {
		GalletasSelects = galletasSelects;
	}
}
