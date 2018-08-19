package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import ventanas.FondoPanel;

public class AgentStateInicio {

	public static void main(String[] args) throws Exception {

		final JFrame ventana = new JFrame();
		ventana.setBounds(100, 100, 1000, 600);

		JPanel contenedorPrincipal = panelPrincipal(); // panel principal
		JPanel contenedorSuperior = panelSuperior(); // panel Superior
		JPanel contenedorBotonesInicio = panelBotonesInicio(); // panel Botones de Inicio (inicio sesion - registrarse -
																// salir)
		JLabel bttnInicio = botonInicio("Inicio Sesion"); // boton o etiqueta Inicio Sesion
		JLabel bttnRegistro = botonInicio("Registrarse"); // boton o etiqueta Registrarse

		JLabel bttnSalir = botonInicio("Salir"); // boton o etiqueta Salir
		configuraBttnSalir(bttnSalir); // configura boton Salir

		JPanel contenedorCentral = panelCentral();
		JPanel contenedorInferior = panelInferior();

		contenedorSuperior.add(contenedorBotonesInicio, BorderLayout.EAST); // colocá panel Botones Inicio dentro del
																			// panel superior a la derecha "east"

		contenedorBotonesInicio.add(bttnInicio); // colocá boton inicio sesion en el panel de Botones Inicio
		contenedorBotonesInicio.add(bttnRegistro); // colocá boton inicio sesion en el panel de Botones Inicio
		contenedorBotonesInicio.add(bttnSalir); // colocá boton inicio sesion en el panel de Botones Inicio

		contenedorPrincipal.add(contenedorSuperior, BorderLayout.NORTH); // colocá panel superior en el pricipal
		contenedorPrincipal.add(contenedorCentral, BorderLayout.CENTER); // colocá panel central en el principal
		contenedorPrincipal.add(contenedorInferior, BorderLayout.SOUTH); // colocá panel infeior en el principal

		ventana.setContentPane(contenedorPrincipal); // colocá panel Pricipal dentro de la ventana

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

	// crea el panel central con Imagen de Fondo
	private static JPanel createMainContainersFondo() {
		final FondoPanel ventConFondo = new FondoPanel("/img/fondoBsAs.jpg");
		ventConFondo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		return ventConFondo;
	}

	// crea panel principal
	private static JPanel panelPrincipal() {
		final JPanel contenedorPrincipal = new JPanel();
		contenedorPrincipal.setLayout(new BorderLayout());// set LayoutManager
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedorPrincipal.setLayout(new BorderLayout(0, 0));
		return contenedorPrincipal;
	}

	// crea panel superior
	private static JPanel panelSuperior() {
		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new BorderLayout(0, 0));
		return panelSuperior;
	}

	// crea panel botones inicio
	private static JPanel panelBotonesInicio() {
		JPanel contenedorBotonesInicio = new JPanel();
		return contenedorBotonesInicio;
	}

	// crea boton Inicio Sesion
	private static JLabel botonInicio(String leyenda) {
		JLabel bttnInicio = new JLabel(leyenda);
		bttnInicio.setFont(new Font("Arial", Font.BOLD, 14));
		return bttnInicio;
	}

	// configura boton Salir
	private static JLabel configuraBttnSalir(JLabel bttnSalir) {
		bttnSalir.setBackground(Color.RED);
		bttnSalir.setForeground(Color.WHITE);
		bttnSalir.setOpaque(true);
		return bttnSalir;
	}

	// panel CENTRAL completo
	private static JPanel panelCentral() {
		final JPanel panelCtral = createMainContainersFondo();
		panelCtral.setLayout(new BorderLayout(0, 0));

		JPanel panelCentralCentral = new JPanel();
		panelCtral.add(panelCentralCentral, BorderLayout.CENTER);
		GridBagLayout gbl_panelCentralCentral = new GridBagLayout();
		gbl_panelCentralCentral.columnWidths = new int[] { 78, 413, 80, 0 };
		gbl_panelCentralCentral.rowHeights = new int[] { 29, 23, 0 };
		gbl_panelCentralCentral.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelCentralCentral.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelCentralCentral.setOpaque(false);
		panelCentralCentral.setLayout(gbl_panelCentralCentral);

		JLabel lblTitBusqueda = new JLabel("PROPIEDADES EN VENTA Y ALQUILER");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.SOUTH;
		gbc_lblNewLabel_2.weighty = 1.0;
		gbc_lblNewLabel_2.weightx = 1.0;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		lblTitBusqueda.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitBusqueda.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTitBusqueda.setForeground(Color.white);
		lblTitBusqueda.setFont(new Font("Agency FB", Font.PLAIN, 40));
		lblTitBusqueda.setForeground(Color.white);
		panelCentralCentral.add(lblTitBusqueda, gbc_lblNewLabel_2);

		JTextField textBusca = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.weighty = 1.0;
		gbc_textField.weightx = 1.0;
		gbc_textField.anchor = GridBagConstraints.NORTHEAST;
		gbc_textField.fill = GridBagConstraints.NONE;
		gbc_textField.insets = new Insets(5, 0, 0, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		textBusca.setColumns(50);
		textBusca.setSize(200, 200);
		panelCentralCentral.add(textBusca, gbc_textField);

		JButton btnBuscar = new JButton("BUSCAR");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.weighty = 1.0;
		gbc_btnNewButton_1.weightx = 1.0;
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		panelCentralCentral.add(btnBuscar, gbc_btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\Pablo Sergio Petito\\Documents\\Inmobiliaria\\petito\\Papeleria\\logoPetito150x75png.png"));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panelCentralCentral.add(lblNewLabel_1, gbc_lblNewLabel_1);

		panelCtral.add(panelCentralCentral);

		return panelCtral;
	}

	// panel inferior completo
	private static JPanel panelInferior() {
		JPanel panelSur = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelSur.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);

		JLabel lblNewLabel = new JLabel("by Petito Sistemas ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panelSur.add(lblNewLabel);
		return panelSur;
	}

}
