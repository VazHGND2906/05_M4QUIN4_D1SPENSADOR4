package modelo;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:15:42	
 * @project 05_MaquinaDispensadora
 * @file RefrescosModelo.java
 */
public class RefrescosModelo {

	/**
	 * Arreglo con los precios de los Refrescos
	 */
	private int[] refrescosPrecios = { 6, 4, 5, 8, 5, 5, 6, 9, 4, 2 };

	/**
	 * Arreglo con los Refrescos seleccionados
	 */
	private boolean[] RefrescosSelects = { false, false, false, false, false, false, false, false, false, false };

	/**
	 * Contructor vacío de la clase RefrescosModel
	 */
	public RefrescosModelo() {

	}

	/**
	 * @return the refrescosPrecios
	 */
	public int[] getRefrescosPrecios() {
		return refrescosPrecios;
	}

	/**
	 * @param refrescosPrecios
	 *            the refrescosPrecios to set
	 */
	public void setRefrescosPrecios(int[] refrescosPrecios) {
		this.refrescosPrecios = refrescosPrecios;
	}

	/**
	 * @return the refrescosSelects
	 */
	public boolean[] getRefrescosSelects() {
		return RefrescosSelects;
	}

	/**
	 * @param refrescosSelects
	 *            the refrescosSelects to set
	 */
	public void setRefrescosSelects(boolean[] refrescosSelects) {
		RefrescosSelects = refrescosSelects;
	}
}
