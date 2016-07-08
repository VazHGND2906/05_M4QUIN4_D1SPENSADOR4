package modelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:34	
 * @project 05_MaquinaDispensadora
 * @file DulcesModelo.java
 */
public class DulcesModelo {

	/**
	 * Arreglo con los precios de los dulces
	 */
	private int[] dulcesPrecios = { 6, 4, 5, 8, 5, 5, 6, 9, 4, 2 };

	
	/**
	 * Arreglo con los dulces seleccionados
	 */
	private boolean[] dulcesSelects = { false, false, false, false, false, false, false, false, false, false };

	/**
	 * Constructor vacío de la clase DulcesModel
	 */
	public DulcesModelo() {

	}

	/**
	 * @return the dulcesPrecios
	 */
	public int[] getDulcesPrecios() {
		return dulcesPrecios;
	}

	/**
	 * @param dulcesPrecios
	 *            the dulcesPrecios to set
	 */
	public void setDulcesPrecios(int[] dulcesPrecios) {
		this.dulcesPrecios = dulcesPrecios;
	}

	/**
	 * @return the dulcesSelects
	 */
	public boolean[] getDulcesSelects() {
		return dulcesSelects;
	}

	/**
	 * @param dulcesSelects
	 *            the dulcesSelects to set
	 */
	public void setDulcesSelects(boolean[] dulcesSelects) {
		this.dulcesSelects = dulcesSelects;
	}
}