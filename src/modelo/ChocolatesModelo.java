package modelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:30	
 * @project 05_MaquinaDispensadora
 * @file ChocolatesModelo.java
 */
public class ChocolatesModelo {

	/**
	 * Arreglo con los precios de los chocolates
	 */
	private int[] chocolatesPrecios = { 6, 4, 5, 8, 5, 5, 6, 9, 4, 2 };

	/**
	 * Arreglo con los chocolates seleccionados
	 */
	private boolean[] chocolatesSelects = { false, false, false, false, false, false, false, false, false, false };

	/**
	 * Constructor vacío ce la clase ChocolatesModel
	 */
	public ChocolatesModelo() {

	}

	/**
	 * @return the chocolatesPrecios
	 */
	public int[] getChocolatesPrecios() {
		return chocolatesPrecios;
	}

	/**
	 * @param chocolatesPrecios
	 *            the chocolatesPrecios to set
	 */
	public void setChocolatesPrecios(int[] chocolatesPrecios) {
		this.chocolatesPrecios = chocolatesPrecios;
	}

	/**
	 * @return the chocolatesSelects
	 */
	public boolean[] getChocolatesSelects() {
		return chocolatesSelects;
	}

	/**
	 * @param chocolatesSelects
	 *            the chocolatesSelects to set
	 */
	public void setChocolatesSelects(boolean[] chocolatesSelects) {
		this.chocolatesSelects = chocolatesSelects;
	}

}