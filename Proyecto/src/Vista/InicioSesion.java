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
	public JList list;
	public JButton btnMesa6;
	public JButton btnMesa5,btnMesa3,btnMesa4,btnMesa2;
	public JButton btnAtras;
	public JButton btnPagar;
	public JButton btnNuevoCliente;
	public JLabel lblHora;
	public JLabel lblHora1;
	public JPanel panelBebida;
	public JButton btnañadircafesolo;
	public JButton btneliminarcafesolo;
	public JButton btnañadircortado;
	public JButton btneliminarcortado;
	public JButton btnañadircaramel;
	public JButton btneliminarcaramel;
	public JButton btnañadirfrapuchino;
	public JButton btneliminarfrapuchino;
	public JButton btnañadircolacao;
	public JButton btneliminarcolacao;
	public JButton btnaladircafeconleche;
	public JButton btneliminarcafeconleche;
	public JButton btnañadircafelargo;
	public JButton btneliminarcafelargo;
	public JButton btnañadirzumo;
	public JButton btneliminarzumo;
	public JList list_1;
	public JButton btnvercomandabebidas;
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
	public JButton btneliminartostada;
	public JButton btnañadirvolavena;
	public JButton btneliminarvoldeavena;
	public JButton btnañadircooki;
	public JButton btneliminarcooki;
	public JButton btnañadirtortitas;
	public JButton btneliminartortitas;
	public JButton btnañadirtostadadejamon;
	public JButton btneliminartostadadejamon;
	public JButton btnañadircroassan;
	public JButton btneliminarcroassan;
	public JButton btnañadirpalmera;
	public JButton btneliminarpalmera;
	public JButton btnañadirchurros;
	public JButton btneliminarchurros;
	public JList list_2;
	public JButton btnvercomandacomida;
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
		
		panelBebida = new JPanel();
		panelBebida.setBackground(new Color(255, 255, 128));
		panelBebida.setBounds(0, 0, 834, 553);
		contentPane.add(panelBebida);
		panelBebida.setLayout(null);
		panelBebida.setVisible(false);
		btnañadircafesolo = new JButton("Añadir");
		btnañadircafesolo.setBounds(123, 229, 85, 21);
		panelBebida.add(btnañadircafesolo);
		
		btneliminarcafesolo = new JButton("Eliminar");
		btneliminarcafesolo.setBounds(123, 260, 85, 21);
		panelBebida.add(btneliminarcafesolo);
		
		btnañadircortado = new JButton("Añadir");
		btnañadircortado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnañadircortado.setBounds(240, 229, 85, 21);
		panelBebida.add(btnañadircortado);
		
		btneliminarcortado = new JButton("Eliminar");
		btneliminarcortado.setBounds(240, 260, 85, 21);
		panelBebida.add(btneliminarcortado);
		
		btnañadircaramel = new JButton("Añadir");
		btnañadircaramel.setBounds(356, 229, 85, 21);
		panelBebida.add(btnañadircaramel);
		
		btneliminarcaramel = new JButton("Eliminar");
		btneliminarcaramel.setBounds(356, 260, 85, 21);
		panelBebida.add(btneliminarcaramel);
		
		btnañadirfrapuchino = new JButton("Añadir");
		btnañadirfrapuchino.setBounds(474, 229, 85, 21);
		panelBebida.add(btnañadirfrapuchino);
		
		btneliminarfrapuchino = new JButton("Eliminar");
		btneliminarfrapuchino.setBounds(474, 260, 85, 21);
		panelBebida.add(btneliminarfrapuchino);
		
		btnañadircolacao = new JButton("Añadir");
		btnañadircolacao.setBounds(123, 449, 85, 21);
		panelBebida.add(btnañadircolacao);
		
		btneliminarcolacao = new JButton("Eliminar");
		btneliminarcolacao.setBounds(123, 480, 85, 21);
		panelBebida.add(btneliminarcolacao);
		
		btnaladircafeconleche = new JButton("Añadir");
		btnaladircafeconleche.setBounds(240, 449, 85, 21);
		panelBebida.add(btnaladircafeconleche);
		
		btneliminarcafeconleche = new JButton("Eliminar");
		btneliminarcafeconleche.setBounds(240, 480, 85, 21);
		panelBebida.add(btneliminarcafeconleche);
		
		btnañadircafelargo = new JButton("Añadir");
		btnañadircafelargo.setBounds(356, 449, 85, 21);
		panelBebida.add(btnañadircafelargo);
		
		btneliminarcafelargo = new JButton("Eliminar");
		btneliminarcafelargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btneliminarcafelargo.setBounds(356, 480, 85, 21);
		panelBebida.add(btneliminarcafelargo);
		
		btnañadirzumo = new JButton("Añadir");
		btnañadirzumo.setBounds(474, 449, 85, 21);
		panelBebida.add(btnañadirzumo);
		
		btneliminarzumo = new JButton("Eliminar");
		btneliminarzumo.setBounds(474, 480, 85, 21);
		panelBebida.add(btneliminarzumo);
		
		list_1 = new JList();
		list_1.setBounds(658, 121, 145, 302);
		panelBebida.add(list_1);
		
		btnvercomandabebidas = new JButton("Comanda");
		btnvercomandabebidas.setBounds(658, 433, 145, 21);
		panelBebida.add(btnvercomandabebidas);
		
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
		btnVolverMesaBebida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVolverMesaBebida.setBounds(691, 96, 89, 23);
		panelBebida.add(btnVolverMesaBebida);
		
		btnComida = new JButton("Comida");
		btnComida.setBounds(658, 479, 145, 23);
		panelBebida.add(btnComida);
		
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 834, 568);
		panelBebida.add(lblFondo);
		
		panelnicio = new JPanel();
		panelnicio.setBackground(new Color(255, 255, 128));
		panelnicio.setBounds(0, -11, 834, 564);
		contentPane.add(panelnicio);
		panelnicio.setLayout(null);
		
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
		btnIniciarSesion.setBounds(363, 340, 119, 21);
		panelnicio.add(btnIniciarSesion);
		
		lblName = new JLabel("CoffeSwtich");
		lblName.setFont(new Font("Rage Italic", Font.PLAIN, 60));
		lblName.setBounds(139, 32, 425, 76);
		panelnicio.add(lblName);
		
		lblHora = new JLabel("");
		lblHora.setFont(new Font("Rage Italic", Font.PLAIN, 60));
		lblHora.setBounds(416, 32, 290, 76);
		panelnicio.add(lblHora);
		
		lblFallo = new JLabel("");
		lblFallo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFallo.setFont(new Font("Rage Italic", Font.PLAIN, 25));
		lblFallo.setBounds(0, 425, 824, 76);
		panelnicio.add(lblFallo);
		
		lblFondoPanelInicio = new JLabel("");
		lblFondoPanelInicio.setBounds(0, 0, 834, 609);
		panelnicio.add(lblFondoPanelInicio);
		
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
		    btnMesa5.setBounds(246, 317, 89, 79);
		    panelMesa.add(btnMesa5);
		    panelMesa.setVisible(false);
		    
		     btnMesa6 = new JButton("");
		     btnMesa6.setBounds(404, 317, 89, 79);
		     panelMesa.add(btnMesa6);
		     panelMesa.setVisible(false);
		     
		     lblName_1 = new JLabel("CoffeSwtich");
		     lblName_1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
		     lblName_1.setBounds(117, 11, 425, 76);
		     panelMesa.add(lblName_1);
		     panelMesa.setVisible(false);
		      panelMesa.setVisible(false);
		      
		       list = new JList();
		       list.setBounds(615, 73, 196, 344);
		       panelMesa.add(list);
		       
		       btnAtras = new JButton("Atras");
		       btnAtras.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       	}
		       });
		       btnAtras.setBounds(722, 10, 89, 32);
		       panelMesa.add(btnAtras);
		       
		       btnPagar = new JButton("Pagar");
		       btnPagar.setBounds(726, 440, 85, 21);
		       panelMesa.add(btnPagar);
		       
		       btnNuevoCliente = new JButton("Nuevo Cliente");
		       btnNuevoCliente.setBounds(615, 440, 101, 21);
		       panelMesa.add(btnNuevoCliente);
		       
		       lblHora1 = new JLabel("");
		       lblHora1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
		       lblHora1.setBounds(462, 23, 234, 50);
		       panelMesa.add(lblHora1);
		       
		       lblFondoMesa = new JLabel("");
		       lblFondoMesa.setBounds(0, 0, 845, 581);
		       panelMesa.add(lblFondoMesa);
		       panelMesa.setVisible(false);
		
		panelComida = new JPanel();
		panelComida.setLayout(null);
		panelComida.setBackground(new Color(255, 255, 128));
		panelComida.setBounds(0, 0, 834, 553);
		contentPane.add(panelComida);
		panelComida.setVisible(false);
		
		btnañadirtostada = new JButton("Añadir");
		btnañadirtostada.setBounds(123, 229, 85, 21);
		panelComida.add(btnañadirtostada);
		
		btneliminartostada = new JButton("Eliminar");
		btneliminartostada.setBounds(123, 260, 85, 21);
		panelComida.add(btneliminartostada);
		
		btnañadirvolavena = new JButton("Añadir");
		btnañadirvolavena.setBounds(240, 229, 85, 21);
		panelComida.add(btnañadirvolavena);
		
		btneliminarvoldeavena = new JButton("Eliminar");
		btneliminarvoldeavena.setBounds(240, 260, 85, 21);
		panelComida.add(btneliminarvoldeavena);
		
		btnañadircooki = new JButton("Añadir");
		btnañadircooki.setBounds(356, 229, 85, 21);
		panelComida.add(btnañadircooki);
		
		btneliminarcooki = new JButton("Eliminar");
		btneliminarcooki.setBounds(356, 260, 85, 21);
		panelComida.add(btneliminarcooki);
		
		btnañadirtortitas = new JButton("Añadir");
		btnañadirtortitas.setBounds(474, 229, 85, 21);
		panelComida.add(btnañadirtortitas);
		
		btneliminartortitas = new JButton("Eliminar");
		btneliminartortitas.setBounds(474, 260, 85, 21);
		panelComida.add(btneliminartortitas);
		
		btnañadirtostadadejamon = new JButton("Añadir");
		btnañadirtostadadejamon.setBounds(123, 449, 85, 21);
		panelComida.add(btnañadirtostadadejamon);
		
		btneliminartostadadejamon = new JButton("Eliminar");
		btneliminartostadadejamon.setBounds(123, 480, 85, 21);
		panelComida.add(btneliminartostadadejamon);
		
		btnañadircroassan = new JButton("Añadir");
		btnañadircroassan.setBounds(240, 449, 85, 21);
		panelComida.add(btnañadircroassan);
		
		btneliminarcroassan = new JButton("Eliminar");
		btneliminarcroassan.setBounds(240, 480, 85, 21);
		panelComida.add(btneliminarcroassan);
		
		btnañadirpalmera = new JButton("Añadir");
		btnañadirpalmera.setBounds(356, 449, 85, 21);
		panelComida.add(btnañadirpalmera);
		
		btneliminarpalmera = new JButton("Eliminar");
		btneliminarpalmera.setBounds(356, 480, 85, 21);
		panelComida.add(btneliminarpalmera);
		
		btnañadirchurros = new JButton("Añadir");
		btnañadirchurros.setBounds(474, 449, 85, 21);
		panelComida.add(btnañadirchurros);
		
		btneliminarchurros = new JButton("Eliminar");
		btneliminarchurros.setBounds(474, 480, 85, 21);
		panelComida.add(btneliminarchurros);
		
		list_2 = new JList();
		list_2.setBounds(658, 121, 145, 302);
		panelComida.add(list_2);
		
		btnvercomandacomida = new JButton("Comanda");
		btnvercomandacomida.setBounds(658, 431, 145, 21);
		panelComida.add(btnvercomandacomida);
		
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
		btnVueltasMesa.setBounds(687, 100, 85, 21);
		panelComida.add(btnVueltasMesa);
		
		btnBebida = new JButton("Bebida");
		btnBebida.setBounds(658, 479, 145, 23);
		panelComida.add(btnBebida);
		
		lblFondoComida = new JLabel("");
		lblFondoComida.setBounds(0, 0, 834, 587);
		panelComida.add(lblFondoComida);
	}

	public void lblTextError() {
		// TODO Auto-generated method stub
		
	}
}
