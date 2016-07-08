package vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import controlador.PagarControlador;
import modelo.ChocolatesModelo;
import modelo.DulcesModelo;
import modelo.GalletasModelo;
import modelo.RefrescosModelo;

import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

/**
 * @author Hugo Vázquez Andrés
 * @date 07/07/2016 - 00:16:10	
 * @project 05_MaquinaDispensadora
 * @file VentanaDetalleRefresco.java
 */
public class VentanaDetalleRefresco extends JFrame{
	
	private JPanel panel = new JPanel();
	private JScrollPane scrollPane = new JScrollPane();

	private JLabel lblProducto1 = new JLabel();
	private ImageIcon imgProducto1;

	private JLabel lblProducto2 = new JLabel();
	private ImageIcon imgProducto2;

	private JLabel lblProducto3 = new JLabel();
	private ImageIcon imgProducto3;

	private JLabel lblProducto4 = new JLabel();
	private ImageIcon imgProducto4;

	private JLabel lblProducto5 = new JLabel();
	private ImageIcon imgProducto5;

	private JLabel lblProducto6 = new JLabel();
	private ImageIcon imgProducto6;

	private JLabel lblProducto7 = new JLabel();
	private ImageIcon imgProducto7;

	private JLabel lblProducto8 = new JLabel();
	private ImageIcon imgProducto8;

	private JLabel lblProducto9 = new JLabel();
	private ImageIcon imgProducto9;

	private JLabel lblProducto10 = new JLabel();
	private ImageIcon imgProducto10;

	private JLabel lblInfo = new JLabel("¡DISFRUTA DE NUESTRA VARIEDAD Y CALIDAD!");
	private JLabel lblInfo2 = new JLabel("*IVA incluido");

	private JCheckBox chckbx1 = new JCheckBox(" $ 6");
	private JCheckBox chckbx2 = new JCheckBox(" $ 4");
	private JCheckBox chckbx3 = new JCheckBox(" $ 5");
	private JCheckBox chckbx4 = new JCheckBox(" $ 8");
	private JCheckBox chckbx5 = new JCheckBox(" $ 5");
	private JCheckBox chckbx6 = new JCheckBox(" $ 5");
	private JCheckBox chckbx7 = new JCheckBox(" $ 6");
	private JCheckBox chckbx8 = new JCheckBox(" $ 9");
	private JCheckBox chckbx9 = new JCheckBox(" $ 4");
	private JCheckBox chckbx10 = new JCheckBox(" $ 2");

	private JButton btnComprar = new JButton("AÑADIR");

	private JCheckBox[] chckbxs = { chckbx1, chckbx2, chckbx3, chckbx4, chckbx5, chckbx6, chckbx7, chckbx8, chckbx9,
			chckbx10 };

	private JLabel[] labels = { lblProducto1, lblProducto2, lblProducto3, lblProducto4, lblProducto5, lblProducto6,
			lblProducto7, lblProducto8, lblProducto9, lblProducto10 };

	private Container c = getContentPane();

	/**
	 * Constructor de la clase DetalleView
	 */
	public VentanaDetalleRefresco() {

		this.setTitle("ISLA REFRESCON");
		this.setBounds(100, 100, 320, 480);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		c.setLayout(null);

		scrollPane.setBounds(5, 50, 305, 300);
		scrollPane.setViewportView(panel);
		scrollPane.getVerticalScrollBar().setUnitIncrement(10);

		panel.setPreferredSize(new Dimension(250, 500));
		panel.setLayout(null);

		chckbx1.setOpaque(false);
		chckbx1.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx1.setBounds(32, 0, 250, 70);

		chckbx2.setOpaque(false);
		chckbx2.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx2.setBounds(32, 50, 250, 70);

		chckbx3.setOpaque(false);
		chckbx3.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx3.setBounds(32, 100, 250, 70);

		chckbx4.setOpaque(false);
		chckbx4.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx4.setBounds(32, 150, 250, 70);

		chckbx5.setOpaque(false);
		chckbx5.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx5.setBounds(32, 200, 250, 70);

		chckbx6.setOpaque(false);
		chckbx6.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx6.setBounds(32, 250, 250, 70);

		chckbx7.setOpaque(false);
		chckbx7.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx7.setBounds(32, 300, 250, 70);

		chckbx8.setOpaque(false);
		chckbx8.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx8.setBounds(32, 350, 250, 70);

		chckbx9.setOpaque(false);
		chckbx9.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx9.setBounds(32, 400, 250, 70);

		chckbx10.setOpaque(false);
		chckbx10.setHorizontalAlignment(SwingConstants.RIGHT);
		chckbx10.setBounds(32, 450, 250, 70);

		lblInfo.setBounds(25, 5, 270, 40);
		lblInfo2.setBounds(05, 335, 150, 40);

		btnComprar.setBounds(80, 380, 150, 40);

		panel.add(chckbx1);
		panel.add(chckbx2);
		panel.add(chckbx3);
		panel.add(chckbx4);
		panel.add(chckbx5);
		panel.add(chckbx6);
		panel.add(chckbx7);
		panel.add(chckbx8);
		panel.add(chckbx9);
		panel.add(chckbx10);

		c.add(scrollPane);
		c.add(lblInfo);
		c.add(lblInfo2);
		c.add(btnComprar);

		cargarControles();
	}

	/**
	 * Método para cargar los productos de Dulces
	 */
	private void cargarControles() {

		imgProducto1 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_1.png"));
		imgProducto2 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_2.jpg"));
		imgProducto3 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_3.jpg"));
		imgProducto4 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_4.jpg"));
		imgProducto5 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_5.png"));
		imgProducto6 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_6.png"));
		imgProducto7 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_7.png"));
		imgProducto8 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_8.png"));
		imgProducto9 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_9.png"));
		imgProducto10 = new ImageIcon(VentanaDetalleDulce.class.getResource("/img/dulce_10.png"));

		lblProducto1.setText("<html><body>REFRESCO<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto1.setBounds(5, 3, 250, 50);
		lblProducto1.setIcon(new ImageIcon(imgProducto1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto2.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto2.setBounds(5, 53, 250, 50);
		lblProducto2.setIcon(new ImageIcon(imgProducto2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto3.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto3.setBounds(5, 103, 250, 50);
		lblProducto3.setIcon(new ImageIcon(imgProducto3.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto4.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto4.setBounds(5, 153, 250, 50);
		lblProducto4.setIcon(new ImageIcon(imgProducto4.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto5.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto5.setBounds(5, 203, 250, 50);
		lblProducto5.setIcon(new ImageIcon(imgProducto5.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto6.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto6.setBounds(5, 253, 250, 50);
		lblProducto6.setIcon(new ImageIcon(imgProducto6.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto7.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto7.setBounds(5, 303, 250, 50);
		lblProducto7.setIcon(new ImageIcon(imgProducto7.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto8.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto8.setBounds(5, 353, 250, 50);
		lblProducto8.setIcon(new ImageIcon(imgProducto8.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto9.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto9.setBounds(5, 403, 250, 50);
		lblProducto9.setIcon(new ImageIcon(imgProducto9.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		lblProducto10.setText("<html><body>PALETÓN<br>Malvavisco cubierto de chocolate</body></html>");
		lblProducto10.setBounds(5, 453, 250, 50);
		lblProducto10.setIcon(new ImageIcon(imgProducto10.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));

		panel.add(lblProducto1);

		panel.add(lblProducto2);
		panel.add(lblProducto3);
		panel.add(lblProducto4);
		panel.add(lblProducto5);
		panel.add(lblProducto6);
		panel.add(lblProducto7);
		panel.add(lblProducto8);
		panel.add(lblProducto9);
		panel.add(lblProducto10);
	}

	/**
	 * @return the chckbx1
	 */
	public JCheckBox getChckbx1() {
		return chckbx1;
	}

	/**
	 * @return the chckbx2
	 */
	public JCheckBox getChckbx2() {
		return chckbx2;
	}

	/**
	 * @return the chckbx3
	 */
	public JCheckBox getChckbx3() {
		return chckbx3;
	}

	/**
	 * @return the chckbx4
	 */
	public JCheckBox getChckbx4() {
		return chckbx4;
	}

	/**
	 * @return the chckbx5
	 */
	public JCheckBox getChckbx5() {
		return chckbx5;
	}

	/**
	 * @return the chckbx6
	 */
	public JCheckBox getChckbx6() {
		return chckbx6;
	}

	/**
	 * @return the chckbx7
	 */
	public JCheckBox getChckbx7() {
		return chckbx7;
	}

	/**
	 * @return the chckbx8
	 */
	public JCheckBox getChckbx8() {
		return chckbx8;
	}

	/**
	 * @return the chckbx9
	 */
	public JCheckBox getChckbx9() {
		return chckbx9;
	}

	/**
	 * @return the chckbx10
	 */
	public JCheckBox getChckbx10() {
		return chckbx10;
	}

	/**
	 * @return the btnComprar
	 */
	public JButton getBtnComprar() {
		return btnComprar;
	}

	/**
	 * @return the chckbxs
	 */
	public JCheckBox[] getChckbxs() {
		return chckbxs;
	}

	/**
	 * @return the labels
	 */
	public JLabel[] getLabels() {
		return labels;
	}

	/**
	 * Método para agregar el evento change a los Checks Button
	 * 
	 * @param il
	 *            evento change
	 */
	public void onChangeChecks(ItemListener il) {

		chckbx1.addItemListener(il);
		chckbx2.addItemListener(il);
		chckbx3.addItemListener(il);
		chckbx4.addItemListener(il);
		chckbx5.addItemListener(il);
		chckbx6.addItemListener(il);
		chckbx7.addItemListener(il);
		chckbx8.addItemListener(il);
		chckbx9.addItemListener(il);
		chckbx10.addItemListener(il);
	}

	/**
	 * Método para agregar el evento click al boton comprar
	 * 
	 * @param al
	 *            evento click
	 */
	public void onClickComprar(ActionListener al) {
		btnComprar.addActionListener(al);
	}

	public void abrirVentanaComprar(VentanaOpciones vistaOperaciones, DulcesModelo modeloDulces,
			ChocolatesModelo modeloChocolates, GalletasModelo modeloGalletas, RefrescosModelo modeloRefrescos) {

		VentanaPagar vistaComprar = new VentanaPagar();

		PagarControlador controladorComprar = new PagarControlador(vistaComprar, vistaOperaciones, modeloDulces,
				modeloChocolates, modeloGalletas, modeloRefrescos);
		this.setVisible(false);

	}
}