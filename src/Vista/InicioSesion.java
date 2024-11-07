package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panelnicio;
	public JTextField textFieldInicioSesion;
	public JLabel lblNewLabel;
	public JLabel lblTextError;
	public JTextField textFieldContraseña;
	public JLabel lblNewLabel_1;
	public JButton btnIniciarSesion;
	public JLabel lblName;
	public JPanel panelMesa;
	public JButton btnMesa1;
	public JLabel lblName_1;
	public JButton btnMesa6;
	public JButton btnMesa5,btnMesa3,btnMesa4,btnMesa2;
	public JButton btnAtras;
	public JLabel lblHora;
	public JLabel lblHora1;
	public JPanel panelBebida;
	public JButton btnañadircafesolo;
	public JButton btnañadircortado;
	public JButton btnañadircaramel;
	public JButton btnañadirfrapuchino;
	public JButton btnañadircolacao;
	public JButton btnaladircafeconleche;
	public JButton btnañadircafelargo;
	public JButton btnañadirzumo;
	public JList list_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_6;
	public JLabel lblNewLabel_7;
	public JLabel lblNewLabel_8;
	public JLabel lblNewLabel_9;
	public JPanel panelComida;
	public JButton btnañadirtostada;
	public JButton btnañadirvolavena;
	public JButton btnañadircooki;
	public JButton btnañadirtortitas;
	public JButton btnañadirtostadadejamon;
	public JButton btnañadircroassan;
	public JButton btnañadirpalmera;
	public JButton btnañadirchurros;
	public JList list_2;
	public JLabel lblNewLabel_10;
	public JLabel lblNewLabel_11;
	public JLabel lblNewLabel_12;
	public JLabel lblNewLabel_13;
	public JLabel lblNewLabel_14;
	public JLabel lblNewLabel_15;
	public JLabel lblNewLabel_16;
	public JLabel lblNewLabel_17;
	public JLabel lblName_2;
	public JLabel lblName_3;
	public JButton btnVueltasMesa;
	public JButton btnComida;
	public JButton btnBebida;
	public JButton btnVolverMesaBebida;
	public JLabel lblFondo;
	public JLabel lblFondoComida;
	public JLabel lblFondoPanelInicio;
	public JLabel lblFondoMesa;
	public JLabel lblFallo;
	private JScrollPane scrollPane;
	public JLabel lblnombremesaBebida;
	public JLabel lblnombremesacomida;
	public JLabel lblnohaybebida;
	public JLabel lblnohaycomida;
	public JFrame ventana ;
	public JPanel panelCrearUsuario;
	public JTextField textFieldPanelNombreUsuario;
	public JLabel lblNombreUsuario;
	public JTextField textFieldPanelContraseña;
	public JLabel lblNewLabel_19;
	public JButton btnUsuario;
	public JLabel lblName_4;
	public JLabel lblHora_1;
	public JLabel lblFalloPanelUsuario;
	public JLabel lblFondoPanelUsuario;
	public Object btnNuevoEmpleado;
	public JButton btnNuevoEmpleado_1;
	public  JButton btnPagarBebidas;
	public JButton btnPagarComida;
	public JLabel lblCantidadDineroComida;
	public JLabel lblPagarBebida;
	public JButton btneliminartostada;
	public JButton btneliminaravena;
	public JButton btneliminarcooki;
	public JButton btneliminartortitas;
	public JButton btneliminartostadadejamon;
	public JButton btneliminarcroassan;
	public JButton btneliminarpalmera;
	public JButton btneliminarchurros;
	public JButton btneliminarcafesolo;
	public JButton btneliminarcortado;
	public JButton btneliminarcaramel;
	public JButton btneliminarfrapuchino;
	public JButton btneliminarcolacao;
	public JButton btneliminarcafeconleche;
	public JButton btneliminarcafelargo;
	public JButton btneliminarrzumo;
	public JButton btnInventarioComida;
	public JPanel panelnvetarioComida;
	public JLabel lblNewLabel_18;
	public JComboBox comboBoxNombreProducto;
	public JLabel lblNewLabel_20;
	public JTextField textFieldCantidad;
	public JButton btnAñadirInventario;
	public JButton btnEliminarInventario;
	public JButton btnVolverMesas;
	public JLabel lblFondoInventario;
	public JButton btnVolver;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					Controlador controlador=new Controlador(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(187, 179, 117));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
															
															panelCrearUsuario = new JPanel();
															panelCrearUsuario.setLayout(null);
															panelCrearUsuario.setBackground(new Color(255, 255, 128));
															panelCrearUsuario.setBounds(0, 0, 834, 564);
															contentPane.add(panelCrearUsuario);
															panelCrearUsuario.setVisible(false);
															
															btnVolver = new JButton("Volver");
															btnVolver.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																}
															});
															btnVolver.setBackground(new Color(128, 255, 128));
															btnVolver.setBounds(717, 0, 117, 57);
															panelCrearUsuario.add(btnVolver);
															textFieldPanelNombreUsuario = new JTextField();
															textFieldPanelNombreUsuario.setColumns(10);
															textFieldPanelNombreUsuario.setBounds(268, 190, 308, 19);
															panelCrearUsuario.add(textFieldPanelNombreUsuario);
															
															lblNombreUsuario = new JLabel("Nombre Usuario");
															lblNombreUsuario.setFont(new Font("Tahoma", Font.ITALIC, 15));
															lblNombreUsuario.setBounds(268, 167, 308, 13);
															panelCrearUsuario.add(lblNombreUsuario);
															
															textFieldPanelContraseña = new JTextField();
															textFieldPanelContraseña.setColumns(10);
															textFieldPanelContraseña.setBounds(268, 275, 308, 19);
															panelCrearUsuario.add(textFieldPanelContraseña);
															
															lblNewLabel_19 = new JLabel("Contraseña");
															lblNewLabel_19.setFont(new Font("Tahoma", Font.ITALIC, 15));
															lblNewLabel_19.setBounds(268, 252, 308, 13);
															panelCrearUsuario.add(lblNewLabel_19);
															
															btnUsuario = new JButton("Añadir  Usuario");
															btnUsuario.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																}
															});
															btnUsuario.setBackground(new Color(128, 255, 128));
															btnUsuario.setBounds(351, 333, 145, 21);
															panelCrearUsuario.add(btnUsuario);
															
															lblName_4 = new JLabel("CoffeSwtich");
															lblName_4.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															lblName_4.setBounds(139, 32, 425, 76);
															panelCrearUsuario.add(lblName_4);
															
															lblHora_1 = new JLabel("");
															lblHora_1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															lblHora_1.setBounds(452, 32, 290, 76);
															panelCrearUsuario.add(lblHora_1);
															
															lblFalloPanelUsuario = new JLabel("");
															lblFalloPanelUsuario.setHorizontalAlignment(SwingConstants.CENTER);
															lblFalloPanelUsuario.setFont(new Font("Rage Italic", Font.PLAIN, 25));
															lblFalloPanelUsuario.setBounds(10, 426, 824, 76);
															panelCrearUsuario.add(lblFalloPanelUsuario);
															
															lblFondoPanelUsuario = new JLabel("");
															lblFondoPanelUsuario.setBounds(0, -44, 834, 653);
															panelCrearUsuario.add(lblFondoPanelUsuario);
															
															panelnvetarioComida = new JPanel();
															panelnvetarioComida.setBounds(0, 0, 834, 553);
															contentPane.add(panelnvetarioComida);
															panelnvetarioComida.setLayout(null);
															panelnvetarioComida.setVisible(false);
															lblNewLabel_18 = new JLabel("Nombre Prodcuto");
															lblNewLabel_18.setFont(new Font("Rage Italic", Font.PLAIN, 54));
															lblNewLabel_18.setBounds(151, 120, 580, 76);
															panelnvetarioComida.add(lblNewLabel_18);
															
															comboBoxNombreProducto = new JComboBox();
															comboBoxNombreProducto.setBounds(161, 195, 523, 29);
															panelnvetarioComida.add(comboBoxNombreProducto);
															
															lblNewLabel_20 = new JLabel("Cantidad");
															lblNewLabel_20.setFont(new Font("Rage Italic", Font.PLAIN, 54));
															lblNewLabel_20.setBounds(151, 255, 580, 76);
															panelnvetarioComida.add(lblNewLabel_20);
															
															textFieldCantidad = new JTextField();
															textFieldCantidad.setBounds(161, 341, 523, 19);
															panelnvetarioComida.add(textFieldCantidad);
															textFieldCantidad.setColumns(10);
															
															btnAñadirInventario = new JButton("Añadir");
															btnAñadirInventario.setBackground(new Color(128, 255, 128));
															btnAñadirInventario.setBounds(162, 408, 249, 21);
															panelnvetarioComida.add(btnAñadirInventario);
															
															btnEliminarInventario = new JButton("Eliminar");
															btnEliminarInventario.setBackground(new Color(128, 255, 128));
															btnEliminarInventario.setBounds(459, 408, 225, 21);
															panelnvetarioComida.add(btnEliminarInventario);
															
															 btnVolverMesas = new JButton("Mesas");
															 btnVolverMesas.addActionListener(new ActionListener() {
															 	public void actionPerformed(ActionEvent e) {
															 	}
															 });
															 btnVolverMesas.setBackground(new Color(128, 255, 128));
															 btnVolverMesas.setBounds(682, 0, 152, 67);
															 panelnvetarioComida.add(btnVolverMesas);
															 
															 JLabel lblError = new JLabel("");
															 lblError.setFont(new Font("Rage Italic", Font.PLAIN, 46));
															 lblError.setHorizontalAlignment(SwingConstants.CENTER);
															 lblError.setBounds(161, 469, 523, 73);
															 panelnvetarioComida.add(lblError);
															 
															  lblFondoInventario = new JLabel("");
															  lblFondoInventario.setBounds(0, 0, 834, 542);
															  panelnvetarioComida.add(lblFondoInventario);
															
															
															
															
															panelBebida = new JPanel();
															panelBebida.setBackground(new Color(255, 255, 128));
															panelBebida.setBounds(0, 0, 834, 553);
															contentPane.add(panelBebida);
															panelBebida.setLayout(null);
															panelBebida.setVisible(false);
															
															btnComida = new JButton("Comida");
															btnComida.setBackground(new Color(128, 255, 128));
															btnComida.setBounds(658, 512, 145, 23);
															panelBebida.add(btnComida);
															
															lblPagarBebida = new JLabel("\r\n");
															lblPagarBebida.setFont(new Font("Rage Italic", Font.PLAIN, 30));
															lblPagarBebida.setHorizontalAlignment(SwingConstants.CENTER);
															lblPagarBebida.setBounds(585, 466, 249, 36);
															panelBebida.add(lblPagarBebida);
															
															btnPagarBebidas = new JButton("Pagar");
															btnPagarBebidas.setBackground(new Color(128, 255, 128));
															btnPagarBebidas.setBounds(689, 433, 89, 23);
															panelBebida.add(btnPagarBebidas);
															
															lblnohaybebida = new JLabel("");
															lblnohaybebida.setFont(new Font("Rage Italic", Font.PLAIN, 40));
															lblnohaybebida.setBounds(134, 279, 425, 76);
															panelBebida.add(lblnohaybebida);
															
															lblnombremesaBebida = new JLabel("");
															lblnombremesaBebida.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															lblnombremesaBebida.setBounds(400, 10, 324, 76);
															panelBebida.add(lblnombremesaBebida);
															btnañadircafesolo = new JButton("Añadir");
															btnañadircafesolo.setBackground(new Color(128, 255, 128));
															btnañadircafesolo.setBounds(123, 229, 85, 21);
															panelBebida.add(btnañadircafesolo);
															
															btnañadircortado = new JButton("Añadir");
															btnañadircortado.setBackground(new Color(128, 255, 128));
															btnañadircortado.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																}
															});
															btnañadircortado.setBounds(240, 229, 85, 21);
															panelBebida.add(btnañadircortado);
															
															btnañadircaramel = new JButton("Añadir");
															btnañadircaramel.setBackground(new Color(128, 255, 128));
															btnañadircaramel.setBounds(356, 229, 85, 21);
															panelBebida.add(btnañadircaramel);
															
															btnañadirfrapuchino = new JButton("Añadir");
															btnañadirfrapuchino.setBackground(new Color(128, 255, 128));
															btnañadirfrapuchino.setBounds(474, 229, 85, 21);
															panelBebida.add(btnañadirfrapuchino);
															
															btnañadircolacao = new JButton("Añadir");
															btnañadircolacao.setBackground(new Color(128, 255, 128));
															btnañadircolacao.setBounds(123, 449, 85, 21);
															panelBebida.add(btnañadircolacao);
															
															btnaladircafeconleche = new JButton("Añadir");
															btnaladircafeconleche.setBackground(new Color(128, 255, 128));
															btnaladircafeconleche.setBounds(240, 449, 85, 21);
															panelBebida.add(btnaladircafeconleche);
															
															btnañadircafelargo = new JButton("Añadir");
															btnañadircafelargo.setBackground(new Color(128, 255, 128));
															btnañadircafelargo.setBounds(356, 449, 85, 21);
															panelBebida.add(btnañadircafelargo);
															
															btnañadirzumo = new JButton("Añadir");
															btnañadirzumo.setBackground(new Color(128, 255, 128));
															btnañadirzumo.setBounds(474, 449, 85, 21);
															panelBebida.add(btnañadirzumo);
															
															list_1 = new JList();
															list_1.setBounds(658, 121, 145, 302);
															panelBebida.add(list_1);
															
															lblNewLabel_2 = new JLabel("");
															lblNewLabel_2.setBounds(123, 122, 85, 97);
															panelBebida.add(lblNewLabel_2);
															
															lblNewLabel_4 = new JLabel("");
															lblNewLabel_4.setBounds(123, 341, 85, 97);
															panelBebida.add(lblNewLabel_4);
															
															lblNewLabel_3 = new JLabel("");
															lblNewLabel_3.setBounds(240, 337, 85, 97);
															panelBebida.add(lblNewLabel_3);
															
															lblNewLabel_5 = new JLabel("");
															lblNewLabel_5.setBounds(356, 337, 85, 97);
															panelBebida.add(lblNewLabel_5);
															
															lblNewLabel_6 = new JLabel("");
															lblNewLabel_6.setBounds(474, 337, 85, 97);
															panelBebida.add(lblNewLabel_6);
															
															lblNewLabel_7 = new JLabel("");
															lblNewLabel_7.setBounds(474, 122, 85, 97);
															panelBebida.add(lblNewLabel_7);
															
															lblNewLabel_8 = new JLabel("");
															lblNewLabel_8.setBounds(356, 122, 85, 97);
															panelBebida.add(lblNewLabel_8);
															
															lblNewLabel_9 = new JLabel("");
															lblNewLabel_9.setBounds(240, 122, 85, 97);
															panelBebida.add(lblNewLabel_9);
															
															lblName_2 = new JLabel("CoffeSwtich");
															lblName_2.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															lblName_2.setBounds(134, 10, 425, 76);
															panelBebida.add(lblName_2);
															
															btnVolverMesaBebida = new JButton("Mesas");
															btnVolverMesaBebida.setBackground(new Color(128, 255, 128));
															btnVolverMesaBebida.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																}
															});
															btnVolverMesaBebida.setBounds(689, 50, 89, 42);
															panelBebida.add(btnVolverMesaBebida);
															
															btneliminarcafesolo = new JButton("Eliminar");
															btneliminarcafesolo.setBackground(new Color(128, 255, 128));
															btneliminarcafesolo.setBounds(123, 260, 85, 21);
															panelBebida.add(btneliminarcafesolo);
															
															btneliminarcortado = new JButton("Eliminar");
															btneliminarcortado.setBackground(new Color(128, 255, 128));
															btneliminarcortado.setBounds(240, 259, 85, 21);
															panelBebida.add(btneliminarcortado);
															
															btneliminarcaramel = new JButton("Eliminar");
															btneliminarcaramel.setBackground(new Color(128, 255, 128));
															btneliminarcaramel.setBounds(356, 260, 85, 21);
															panelBebida.add(btneliminarcaramel);
															
															btneliminarfrapuchino = new JButton("Eliminar");
															btneliminarfrapuchino.setBackground(new Color(128, 255, 128));
															btneliminarfrapuchino.setBounds(474, 260, 85, 21);
															panelBebida.add(btneliminarfrapuchino);
															
															btneliminarcolacao = new JButton("Eliminar");
															btneliminarcolacao.setBackground(new Color(128, 255, 128));
															btneliminarcolacao.setBounds(123, 481, 85, 21);
															panelBebida.add(btneliminarcolacao);
															
															btneliminarcafeconleche = new JButton("Eliminar");
															btneliminarcafeconleche.setBackground(new Color(128, 255, 128));
															btneliminarcafeconleche.setBounds(240, 480, 85, 21);
															panelBebida.add(btneliminarcafeconleche);
															
															btneliminarcafelargo = new JButton("Eliminar");
															btneliminarcafelargo.setBackground(new Color(128, 255, 128));
															btneliminarcafelargo.setBounds(356, 481, 85, 21);
															panelBebida.add(btneliminarcafelargo);
															
															btneliminarrzumo = new JButton("Eliminar");
															btneliminarrzumo.setBackground(new Color(128, 255, 128));
															btneliminarrzumo.setBounds(473, 481, 85, 21);
															panelBebida.add(btneliminarrzumo);
															
															lblFondo = new JLabel("");
															lblFondo.setBounds(0, 0, 834, 568);
															panelBebida.add(lblFondo);
															
															panelMesa = new JPanel();
															panelMesa.setBackground(new Color(255, 255, 128));
															panelMesa.setBounds(0, 0, 834, 553);
															contentPane.add(panelMesa);
															panelMesa.setLayout(null);
															
															btnMesa1 = new JButton("");
															btnMesa1.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																}
															});
															
															btnInventarioComida = new JButton("Inventario Comida");
															btnInventarioComida.setBackground(new Color(128, 255, 128));
															btnInventarioComida.setBounds(577, 261, 234, 121);
															panelMesa.add(btnInventarioComida);
															btnMesa1.setBounds(246, 124, 89, 79);
															panelMesa.add(btnMesa1);
															panelMesa.setVisible(false);
															
															
					        
															 btnMesa2 = new JButton("");
															 btnMesa2.addActionListener(new ActionListener() {
															 	public void actionPerformed(ActionEvent e) {
															 	}
															 });
															 btnMesa2.setBounds(404, 124, 89, 79);
															 panelMesa.add(btnMesa2);
															 
															  btnMesa3 = new JButton("");
															  btnMesa3.setBounds(246, 214, 89, 79);
															  panelMesa.add(btnMesa3);
															  panelMesa.setVisible(false);
															  
															   btnMesa4 = new JButton("");
															   btnMesa4.setBounds(404, 214, 89, 79);
															   panelMesa.add(btnMesa4);
															   panelMesa.setVisible(false);
															   
															    btnMesa5 = new JButton("");
															    btnMesa5.addActionListener(new ActionListener() {
															    	public void actionPerformed(ActionEvent e) {
															    	}
															    });
															    btnMesa5.setBounds(246, 303, 89, 79);
															    panelMesa.add(btnMesa5);
															    panelMesa.setVisible(false);
															    
															     btnMesa6 = new JButton("");
															     btnMesa6.setBounds(404, 303, 89, 79);
															     panelMesa.add(btnMesa6);
															     panelMesa.setVisible(false);
															     
															     lblName_1 = new JLabel("CoffeSwtich");
															     lblName_1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															     lblName_1.setBounds(117, 11, 425, 76);
															     panelMesa.add(lblName_1);
															     panelMesa.setVisible(false);
															     
															     btnAtras = new JButton("");
															     btnAtras.setBackground(new Color(255, 0, 0));
															     btnAtras.addActionListener(new ActionListener() {
															     	public void actionPerformed(ActionEvent e) {
															     	}
															     });
															     btnAtras.setBounds(757, 0, 77, 77);
															     panelMesa.add(btnAtras);
															     
															     lblHora1 = new JLabel("");
															     lblHora1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															     lblHora1.setBounds(577, 153, 234, 50);
															     panelMesa.add(lblHora1);
															     
															     lblFondoMesa = new JLabel("");
															     lblFondoMesa.setBounds(0, 0, 855, 581);
															     panelMesa.add(lblFondoMesa);
															     panelMesa.setVisible(false);
														
															
															panelComida = new JPanel();
															panelComida.setLayout(null);
															panelComida.setBackground(new Color(255, 255, 128));
															panelComida.setBounds(0, 0, 834, 553);
															contentPane.add(panelComida);
															panelComida.setVisible(false);
															
															btnPagarComida = new JButton("Pagar");
															btnPagarComida.addActionListener(new ActionListener() {
																public void actionPerformed(ActionEvent e) {
																}
															});
															
															lblCantidadDineroComida = new JLabel("");
															lblCantidadDineroComida.setHorizontalAlignment(SwingConstants.CENTER);
															lblCantidadDineroComida.setFont(new Font("Rage Italic", Font.PLAIN, 30));
															lblCantidadDineroComida.setBounds(599, 467, 235, 31);
															panelComida.add(lblCantidadDineroComida);
															btnPagarComida.setBackground(new Color(128, 255, 128));
															btnPagarComida.setBounds(688, 434, 89, 23);
															panelComida.add(btnPagarComida);
															
															lblnohaycomida = new JLabel("");
															lblnohaycomida.setHorizontalAlignment(SwingConstants.CENTER);
															lblnohaycomida.setFont(new Font("Rage Italic", Font.PLAIN, 40));
															lblnohaycomida.setBounds(134, 272, 425, 76);
															panelComida.add(lblnohaycomida);
															
															lblnombremesacomida = new JLabel("");
															lblnombremesacomida.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															lblnombremesacomida.setBounds(392, 10, 352, 76);
															panelComida.add(lblnombremesacomida);
															
															btnañadirtostada = new JButton("Añadir");
															btnañadirtostada.setBackground(new Color(128, 255, 128));
															btnañadirtostada.setBounds(123, 229, 85, 21);
															panelComida.add(btnañadirtostada);
															
															btnañadirvolavena = new JButton("Añadir");
															btnañadirvolavena.setBackground(new Color(128, 255, 128));
															btnañadirvolavena.setBounds(240, 229, 85, 21);
															panelComida.add(btnañadirvolavena);
															
															btnañadircooki = new JButton("Añadir");
															btnañadircooki.setBackground(new Color(128, 255, 128));
															btnañadircooki.setBounds(356, 229, 85, 21);
															panelComida.add(btnañadircooki);
															
															btnañadirtortitas = new JButton("Añadir");
															btnañadirtortitas.setBackground(new Color(128, 255, 128));
															btnañadirtortitas.setBounds(474, 229, 85, 21);
															panelComida.add(btnañadirtortitas);
															
															btnañadirtostadadejamon = new JButton("Añadir");
															btnañadirtostadadejamon.setBackground(new Color(128, 255, 128));
															btnañadirtostadadejamon.setBounds(123, 449, 85, 21);
															panelComida.add(btnañadirtostadadejamon);
															
															btnañadircroassan = new JButton("Añadir");
															btnañadircroassan.setBackground(new Color(128, 255, 128));
															btnañadircroassan.setBounds(240, 449, 85, 21);
															panelComida.add(btnañadircroassan);
															
															btnañadirpalmera = new JButton("Añadir");
															btnañadirpalmera.setBackground(new Color(128, 255, 128));
															btnañadirpalmera.setBounds(356, 449, 85, 21);
															panelComida.add(btnañadirpalmera);
															
															btnañadirchurros = new JButton("Añadir");
															btnañadirchurros.setBackground(new Color(128, 255, 128));
															btnañadirchurros.setBounds(474, 449, 85, 21);
															panelComida.add(btnañadirchurros);
															
															scrollPane = new JScrollPane();
															scrollPane.setBounds(658, 121, 145, 302);
															panelComida.add(scrollPane);
															
															
															list_2 = new JList();
															scrollPane.setViewportView(list_2);
															
															lblNewLabel_10 = new JLabel("");
															lblNewLabel_10.setBounds(123, 122, 85, 97);
															panelComida.add(lblNewLabel_10);
															
															lblNewLabel_11 = new JLabel("");
															lblNewLabel_11.setBounds(123, 341, 85, 97);
															panelComida.add(lblNewLabel_11);
															
															lblNewLabel_12 = new JLabel("");
															lblNewLabel_12.setBounds(240, 337, 85, 97);
															panelComida.add(lblNewLabel_12);
															
															lblNewLabel_13 = new JLabel("");
															lblNewLabel_13.setBounds(356, 337, 85, 97);
															panelComida.add(lblNewLabel_13);
															
															lblNewLabel_14 = new JLabel("");
															lblNewLabel_14.setBounds(474, 337, 85, 97);
															panelComida.add(lblNewLabel_14);
															
															lblNewLabel_15 = new JLabel("");
															lblNewLabel_15.setBounds(474, 122, 85, 97);
															panelComida.add(lblNewLabel_15);
															
															lblNewLabel_16 = new JLabel("");
															lblNewLabel_16.setBounds(356, 122, 85, 97);
															panelComida.add(lblNewLabel_16);
															
															lblNewLabel_17 = new JLabel("");
															lblNewLabel_17.setBounds(240, 122, 85, 97);
															panelComida.add(lblNewLabel_17);
															
															lblName_3 = new JLabel("CoffeSwtich");
															lblName_3.setFont(new Font("Rage Italic", Font.PLAIN, 60));
															lblName_3.setBounds(134, 10, 425, 76);
															panelComida.add(lblName_3);
															
															btnVueltasMesa = new JButton("Mesas");
															btnVueltasMesa.setBackground(new Color(128, 255, 128));
															btnVueltasMesa.setBounds(677, 28, 89, 58);
															panelComida.add(btnVueltasMesa);
															
															btnBebida = new JButton("Bebida");
															btnBebida.setBackground(new Color(128, 255, 128));
															btnBebida.setBounds(658, 506, 145, 23);
															panelComida.add(btnBebida);
															
															btneliminartostada = new JButton("Eliminar");
															btneliminartostada.setBackground(new Color(128, 255, 128));
															btneliminartostada.setBounds(123, 261, 85, 21);
															panelComida.add(btneliminartostada);
															
															btneliminaravena = new JButton("Eliminar");
															btneliminaravena.setBackground(new Color(128, 255, 128));
															btneliminaravena.setBounds(240, 260, 85, 21);
															panelComida.add(btneliminaravena);
															
															btneliminarcooki = new JButton("Eliminar");
															btneliminarcooki.setBackground(new Color(128, 255, 128));
															btneliminarcooki.setBounds(356, 260, 85, 21);
															panelComida.add(btneliminarcooki);
															
															btneliminartortitas = new JButton("Eliminar");
															btneliminartortitas.setBackground(new Color(128, 255, 128));
															btneliminartortitas.setBounds(473, 260, 85, 21);
															panelComida.add(btneliminartortitas);
															
															btneliminartostadadejamon = new JButton("Eliminar");
															btneliminartostadadejamon.setBackground(new Color(128, 255, 128));
															btneliminartostadadejamon.setBounds(123, 481, 85, 21);
															panelComida.add(btneliminartostadadejamon);
															
															btneliminarcroassan = new JButton("Eliminar");
															btneliminarcroassan.setBackground(new Color(128, 255, 128));
															btneliminarcroassan.setBounds(240, 481, 85, 21);
															panelComida.add(btneliminarcroassan);
															
															btneliminarpalmera = new JButton("Eliminar");
															btneliminarpalmera.setBackground(new Color(128, 255, 128));
															btneliminarpalmera.setBounds(356, 481, 85, 21);
															panelComida.add(btneliminarpalmera);
															
															btneliminarchurros = new JButton("Eliminar");
															btneliminarchurros.setBackground(new Color(128, 255, 128));
															btneliminarchurros.setBounds(474, 481, 85, 21);
															panelComida.add(btneliminarchurros);
															
															lblFondoComida = new JLabel("");
															lblFondoComida.setBounds(0, 0, 834, 587);
															panelComida.add(lblFondoComida);
												panelnicio = new JPanel();
												panelnicio.setBackground(new Color(255, 255, 128));
												panelnicio.setBounds(0, -11, 834, 564);
												contentPane.add(panelnicio);
												panelnicio.setLayout(null);
												
												btnNuevoEmpleado_1 = new JButton("Nuevo Empleado");
												btnNuevoEmpleado_1.setBackground(new Color(128, 255, 128));
												btnNuevoEmpleado_1.setBounds(431, 332, 145, 21);
												panelnicio.add(btnNuevoEmpleado_1);
												
												textFieldInicioSesion = new JTextField();
												textFieldInicioSesion.setBounds(268, 190, 308, 19);
												panelnicio.add(textFieldInicioSesion);
												textFieldInicioSesion.setColumns(10);
												
												lblNewLabel = new JLabel("Inicio Sesion");
												lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
												lblNewLabel.setBounds(268, 167, 308, 13);
												panelnicio.add(lblNewLabel);
												
												textFieldContraseña = new JTextField();
												textFieldContraseña.setBounds(268, 275, 308, 19);
												panelnicio.add(textFieldContraseña);
												textFieldContraseña.setColumns(10);
												
												lblNewLabel_1 = new JLabel("Contraseña");
												lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
												lblNewLabel_1.setBounds(268, 252, 308, 13);
												panelnicio.add(lblNewLabel_1);
												
												btnIniciarSesion = new JButton("Inciar Sesion");
												btnIniciarSesion.setBackground(new Color(128, 255, 128));
												btnIniciarSesion.setBounds(268, 333, 153, 21);
												panelnicio.add(btnIniciarSesion);
												
												lblName = new JLabel("CoffeSwtich");
												lblName.setFont(new Font("Rage Italic", Font.PLAIN, 60));
												lblName.setBounds(139, 32, 425, 76);
												panelnicio.add(lblName);
												
												lblHora = new JLabel("");
												lblHora.setFont(new Font("Rage Italic", Font.PLAIN, 60));
												lblHora.setBounds(431, 32, 290, 76);
												panelnicio.add(lblHora);
												
												lblFallo = new JLabel("");
												lblFallo.setHorizontalAlignment(SwingConstants.CENTER);
												lblFallo.setFont(new Font("Rage Italic", Font.PLAIN, 25));
												lblFallo.setBounds(0, 425, 824, 76);
												panelnicio.add(lblFallo);
												
												lblFondoPanelInicio = new JLabel("");
												lblFondoPanelInicio.setBounds(0, 0, 834, 609);
												panelnicio.add(lblFondoPanelInicio);
	}

	public void lblTextError() {
		// TODO Auto-generated method stub
		
	}

	public void lblnohaycomida(String string) {
		// TODO Auto-generated method stub
		
	}

	public void lblnohaybebida(String string) {
		// TODO Auto-generated method stub
		
	}
}
