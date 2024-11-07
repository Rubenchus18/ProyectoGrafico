package Controlador;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import Modelo.Mesa;
import Modelo.Personal;
import Modelo.Producto;
import Vista.InicioSesion;

public class Controlador implements ActionListener{
	InicioSesion vista=new InicioSesion();
	Personal empleados;
	Producto inventario;
	ArrayList<ImageIcon>imagenes=new ArrayList();
	List<Personal>totalempleados=new ArrayList<>();	
	List<Producto>productostotales=new ArrayList<>();
	DefaultListModel modelo=new DefaultListModel();
	 DefaultListModel modeloMesa1 = new DefaultListModel<>();
	    DefaultListModel modeloMesa2 = new DefaultListModel<>();
	    DefaultListModel modeloMesa3 = new DefaultListModel<>();
	    DefaultListModel modeloMesa4 = new DefaultListModel<>();
	    DefaultListModel modeloMesa5 = new DefaultListModel<>();
	    DefaultListModel modeloMesa6 = new DefaultListModel<>();
		Mesa mesa1 = new Mesa("Mesa 1");
	    Mesa mesa2 = new Mesa("Mesa 2");
	    Mesa mesa3 = new Mesa("Mesa 3");
	    Mesa mesa4 = new Mesa("Mesa 4");
	   Mesa  mesa5 = new Mesa("Mesa 5");
	   Mesa  mesa6 = new Mesa("Mesa 6");
	   


	public Controlador(InicioSesion vista) {
		this.vista=vista;
		this.vista.btnIniciarSesion.addActionListener(this);
		this.vista.btnMesa1.addActionListener(this);;
		this.vista.btnMesa2.addActionListener(this);
		this.vista.btnMesa3.addActionListener(this);
		this.vista.btnMesa4.addActionListener(this);
		this.vista.btnMesa5.addActionListener(this);
		this.vista.btnMesa6.addActionListener(this);
		this.vista.btnAtras.addActionListener(this);
		this.vista.btnVueltasMesa.addActionListener(this);
		this.vista.btnVolverMesaBebida.addActionListener(this);
		this.vista.btnComida.addActionListener(this);
		this.vista.btnBebida.addActionListener(this);
		this.vista.btnañadirtostada.addActionListener(this);
		this.vista.btnañadircafesolo.addActionListener(this);
		this.vista.btnañadircaramel.addActionListener(this);
		this.vista.btnañadircolacao.addActionListener(this);
		this.vista.btnañadircortado.addActionListener(this);
		this.vista.btnañadirfrapuchino.addActionListener(this);
		this.vista.btnaladircafeconleche.addActionListener(this);
		this.vista.btnañadircafelargo.addActionListener(this);
		this.vista.btnañadirzumo.addActionListener(this);
		this.vista.btnañadirvolavena.addActionListener(this);
		this.vista.btnañadircooki.addActionListener(this);
		this.vista.btnañadirtortitas.addActionListener(this);
		this.vista.btnañadirtostadadejamon.addActionListener(this);
		this.vista.btnañadircroassan.addActionListener(this);
		this.vista.btnañadirpalmera.addActionListener(this);
		this.vista.btnañadirchurros.addActionListener(this);
		this.vista.btnNuevoEmpleado_1.addActionListener(this);
		this.vista.btnUsuario.addActionListener(this);
		this.vista.btnPagarComida.addActionListener(this);
		this.vista.btnPagarBebidas.addActionListener(this);
		this.vista.btneliminartostada.addActionListener(this);
		this.vista.btneliminarcafesolo.addActionListener(this);
		this.vista.btneliminarcaramel.addActionListener(this);
		this.vista.btneliminarcolacao.addActionListener(this);
		this.vista.btneliminarcortado.addActionListener(this);
		this.vista.btneliminarfrapuchino.addActionListener(this);
		this.vista.btneliminarcafeconleche.addActionListener(this);
		this.vista.btneliminarcafelargo.addActionListener(this);
		this.vista.btneliminarrzumo.addActionListener(this);
		this.vista.btneliminaravena.addActionListener(this);
		this.vista.btneliminarcooki.addActionListener(this);
		this.vista.btneliminartortitas.addActionListener(this);
		this.vista.btneliminartostadadejamon.addActionListener(this);
		this.vista.btneliminarcroassan.addActionListener(this);
		this.vista.btneliminarpalmera.addActionListener(this);
		this.vista.btneliminarchurros.addActionListener(this);
		this.vista.btnInventarioComida.addActionListener(this);
		this.vista.btnVolverMesaBebida.addActionListener(this);
		this.vista.btnAñadirInventario.addActionListener(this);
		this.vista.btnEliminarInventario.addActionListener(this);
		this.vista.btnVolverMesas.addActionListener(this);
		this.vista.comboBoxNombreProducto.addActionListener(this);
		this.vista.btnVolverMesaBebida.addActionListener(this);
		this.vista.btnVolver.addActionListener(this);
		ponerImagen();
		hora(this.vista.lblHora);
		hora(this.vista.lblHora1);
		hora(this.vista.lblHora_1);
		totalempleados = rellenar(empleados);

		productostotales=rellenarproducto(inventario, productostotales);
		int cantidad=0;
		Double precio=0.0;
		List<Producto>productos=new ArrayList<Producto>();
		ArrayList<String>mesas=new ArrayList<String>();
		HashMap<String,Integer>contador=new HashMap<String,Integer>();
		agregarcombobox(productos);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.vista.btnMesa1) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 1");
	        this.vista.lblnombremesacomida.setText("Mesa 1");
	        actualizarModeloDeLista(mesa1);
	    } else if (e.getSource() == this.vista.btnMesa2) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 2");
	        this.vista.lblnombremesacomida.setText("Mesa 2");
	        actualizarModeloDeLista(mesa2);
	    } else if (e.getSource() == this.vista.btnMesa3) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 3");
	        this.vista.lblnombremesacomida.setText("Mesa 3");
	        actualizarModeloDeLista(mesa3);
	    } else if (e.getSource() == this.vista.btnMesa4) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 4");
	        this.vista.lblnombremesacomida.setText("Mesa 4");
	        actualizarModeloDeLista(mesa4);
	    } else if (e.getSource() == this.vista.btnMesa5) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 5");
	        this.vista.lblnombremesacomida.setText("Mesa 5");
	        actualizarModeloDeLista(mesa5);
	    } else if (e.getSource() == this.vista.btnMesa6) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 6");
	        this.vista.lblnombremesacomida.setText("Mesa 6");
	        actualizarModeloDeLista(mesa6);
	    }
		
		
		if(e.getSource()==this.vista.btnIniciarSesion) {
			
			for(int i=0;i<totalempleados.size();i++) {
				if( totalempleados.get(i).getNombre().equals(this.vista.textFieldInicioSesion.getText())&& totalempleados.get(i).getContraseña().equals(this.vista.textFieldContraseña.getText())) {
					this.vista.panelnicio.setVisible(false);
					this.vista.panelMesa.setVisible(true);
					this.vista.textFieldInicioSesion.setText("");
					this.vista.textFieldContraseña.setText("");
				}else if(totalempleados.get(i).getNombre()!=this.vista.textFieldInicioSesion.getText() && totalempleados.get(i).getContraseña()!=this.vista.textFieldContraseña.getText()){
					this.vista.lblFallo.setText("El nombre de usuario y la contraseña es incorrecta");
					this.vista.textFieldInicioSesion.setText("");
					this.vista.textFieldContraseña.setText("");
				}else if( totalempleados.get(i).getNombre()!=this.vista.textFieldInicioSesion.getText()) {
					this.vista.lblFallo.setText("El nombre de usuario es incorrecto");
					this.vista.textFieldInicioSesion.setText("");
					this.vista.textFieldContraseña.setText("");
				}else if( totalempleados.get(i).getContraseña()!=this.vista.textFieldContraseña.getText()) {
					this.vista.lblFallo.setText("La contraseña es incorrecta es incorrecto");
					this.vista.textFieldInicioSesion.setText("");
					this.vista.textFieldContraseña.setText("");
				}
				
			}
			}
		if (e.getSource() == this.vista.btnañadirtostada) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Tostadas",1.50,vista.btnañadirtostada);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Tostadas",1.50,vista.btnañadirtostada);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Tostadas", 1.50,vista.btnañadirtostada);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Tostadas",1.50,vista.btnañadirtostada);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Tostadas",1.50,vista.btnañadirtostada);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Tostadas",1.50,vista.btnañadirtostada);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirvolavena) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Avena",2.50,vista.btnañadirvolavena);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Avena",2.50,vista.btnañadirvolavena);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Avena", 2.50,vista.btnañadirvolavena);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Avena",2.50,vista.btnañadirvolavena);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Avena",2.50,vista.btnañadirvolavena);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Avena",2.50,vista.btnañadirvolavena);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircooki) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Cookie",0.50,vista.btnañadircooki);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Cookie",0.50,vista.btnañadircooki);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Cookie", 0.50,vista.btnañadircooki);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Cookie",0.50,vista.btnañadircooki);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Cookie",0.50,vista.btnañadircooki);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Cookie",0.50,vista.btnañadircooki);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirtortitas) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Tortitas",2.00,vista.btnañadirtortitas);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Tortitas",2.00,vista.btnañadirtortitas);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Tortitas", 2.00,vista.btnañadirtortitas);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Tortitas",2.00,vista.btnañadirtortitas);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Tortitas",2.00,vista.btnañadirtortitas);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Tortitas",2.00,vista.btnañadirtortitas);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirtostadadejamon) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Tostadas de Jamon",2.00,vista.btnañadirtostadadejamon);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Tostadas de Jamon",2.00,vista.btnañadirtostadadejamon);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Tostadas de Jamon", 2.00,vista.btnañadirtostadadejamon);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Tostadas de Jamon",2.00,vista.btnañadirtostadadejamon);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Tostadas de Jamon",2.00,vista.btnañadirtostadadejamon);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Tostadas de Jamon",2.00,vista.btnañadirtostadadejamon);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircroassan) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Croassan",1.20,vista.btnañadircroassan);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Croassan",1.20,vista.btnañadircroassan);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Croassan", 1.20,vista.btnañadircroassan);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Croassan",1.20,vista.btnañadircroassan);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Croassan",1.20,vista.btnañadircroassan);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Croassan",1.20,vista.btnañadircroassan);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirpalmera) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Palmera",1.00,vista.btnañadirpalmera);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Palmera",1.00,vista.btnañadirpalmera);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Palmera", 1.00,vista.btnañadirpalmera);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Palmera",1.00,vista.btnañadirpalmera);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Palmera",1.00,vista.btnañadirpalmera);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Palmera",1.00,vista.btnañadirpalmera);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirchurros) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Churros",0.50,vista.btnañadirchurros);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Churros",0.50,vista.btnañadirchurros);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Churros",0.50,vista.btnañadirchurros);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Churros",0.50,vista.btnañadirchurros);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Churros",0.50,vista.btnañadirchurros);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Churros",0.50,vista.btnañadirchurros);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircafesolo) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Cafe",1.20,vista.btnañadircafesolo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Cafe",1.20,vista.btnañadircafesolo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Cafe",1.20,vista.btnañadircafesolo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Cafe",1.20,vista.btnañadircafesolo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Cafe",1.20,vista.btnañadircafesolo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Cafe",1.20,vista.btnañadircafesolo);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircortado) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Cortado",1.50,vista.btnañadircortado);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Cortado",1.50,vista.btnañadircortado);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Cortado",1.50,vista.btnañadircortado);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Cortado",1.50,vista.btnañadircortado);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Cortado",1.50,vista.btnañadircortado);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Cortado",1.50,vista.btnañadircortado);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircaramel) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Caramel",2.50,vista.btnañadircaramel);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Caramel",2.50,vista.btnañadircaramel);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Caramel",2.50,vista.btnañadircaramel);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Caramel",2.50,vista.btnañadircaramel);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Caramel",2.50,vista.btnañadircaramel);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Caramel",2.50,vista.btnañadircaramel);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirfrapuchino) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Frapuchino",2.00,vista.btnañadirfrapuchino);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Frapuchino",2.00,vista.btnañadirfrapuchino);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Frapuchino",2.00,vista.btnañadirfrapuchino);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Frapuchino",2.00,vista.btnañadirfrapuchino);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Frapuchino",2.00,vista.btnañadirfrapuchino);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Frapuchino",2.00,vista.btnañadirfrapuchino);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircolacao) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Cola Cao",1.50,vista.btnañadircolacao);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Cola Cao",1.50,vista.btnañadircolacao);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Cola Cao",1.50,vista.btnañadircolacao);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Cola Cao",1.50,vista.btnañadircolacao);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Cola Cao",1.50,vista.btnañadircolacao);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Cola Cao",1.50,vista.btnañadircolacao);
	        }
	    }
		if (e.getSource() == this.vista.btnaladircafeconleche) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Cafe con leche",1.20,vista.btnaladircafeconleche);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Cafe con leche",1.20,vista.btnaladircafeconleche);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Cafe con leche",1.20,vista.btnaladircafeconleche);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Cafe con leche",1.20,vista.btnaladircafeconleche);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Cafe con leche",1.20,vista.btnaladircafeconleche);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Cafe con leche",1.20,vista.btnaladircafeconleche);
	        }
	    }
		if (e.getSource() == this.vista.btnañadircafelargo) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Cafe Largo",1.50,vista.btnañadircafelargo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Cafe Largo",1.50,vista.btnañadircafelargo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Cafe Largo",1.50,vista.btnañadircafelargo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Cafe Largo",1.50,vista.btnañadircafelargo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Cafe Largo",1.50,vista.btnañadircafelargo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Cafe Largo",1.50,vista.btnañadircafelargo);
	        }
	    }
		if (e.getSource() == this.vista.btnañadirzumo) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
	            agregarProducto(mesa1, "Zumo",1,vista.btnañadirzumo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	            agregarProducto(mesa2, "Zumo",1,vista.btnañadirzumo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	            agregarProducto(mesa3, "Zumo",1,vista.btnañadirzumo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	            agregarProducto(mesa4, "Zumo",1,vista.btnañadirzumo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	            agregarProducto(mesa5, "Zumo",1,vista.btnañadirzumo);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	            agregarProducto(mesa6, "Zumo",1,vista.btnañadirzumo);
	        }
	    }
		
		 
			

		if(e.getSource()==this.vista.btnAtras){
			this.vista.panelnicio.setVisible(true);
			this.vista.panelMesa.setVisible(false);
		}
		if(e.getSource()==this.vista.btnVueltasMesa) {
			this.vista.panelComida.setVisible(false);
			this.vista.panelMesa.setVisible(true);
		}
		if(e.getSource()==this.vista.btnVolverMesaBebida) {
			this.vista.panelBebida.setVisible(false);
			this.vista.panelMesa.setVisible(true);
		}
		if(e.getSource()==this.vista.btnComida) {
			this.vista.panelBebida.setVisible(false);
			this.vista.panelComida.setVisible(true);
		}
		if(e.getSource()==this.vista.btnBebida) {
			this.vista.panelBebida.setVisible(true);
			this.vista.panelComida.setVisible(false);
		}
		
		 
		if (e.getSource() == this.vista.btneliminartostada) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Tostadas",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Tostadas",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Tostadas", 1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Tostadas",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Tostadas",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Tostadas",1.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminaravena) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Avena",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Avena",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Avena", 2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Avena",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Avena",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Avena",2.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcooki) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Cookie",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Cookie",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Cookie", 0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Cookie",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Cookie",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Cookie",0.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminartortitas) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Tortitas",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Tortitas",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Tortitas", 2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Tortitas",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Tortitas",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Tortitas",2.00);
	        }
	    }
		if (e.getSource() == this.vista.btneliminartostadadejamon) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Tostadas de Jamon",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Tostadas de Jamon",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Tostadas de Jamon", 2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Tostadas de Jamon",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Tostadas de Jamon",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Tostadas de Jamon",2.00);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcroassan) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Croassan",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Croassan",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Croassan", 1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Croassan",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Croassan",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Croassan",1.20);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarpalmera) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Palmera",1.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Palmera",1.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Palmera", 1.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Palmera",1.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Palmera",1.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Palmera",1.00);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarchurros) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Churros",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Churros",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Churros",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Churros",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Churros",0.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Churros",0.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcafesolo) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Cafe",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Cafe",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Cafe",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Cafe",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Cafe",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Cafe",1.20);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcortado) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Cortado",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Cortado",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Cortado",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Cortado",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Cortado",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Cortado",1.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcaramel) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Caramel",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Caramel",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Caramel",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Caramel",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Caramel",2.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Caramel",2.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarfrapuchino) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Frapuchino",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Frapuchino",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Frapuchino",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Frapuchino",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Frapuchino",2.00);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Frapuchino",2.00);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcolacao) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Cola Cao",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Cola Cao",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Cola Cao",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Cola Cao",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Cola Cao",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Cola Cao",1.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcafeconleche) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Cafe con leche",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Cafe con leche",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Cafe con leche",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Cafe con leche",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Cafe con leche",1.20);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Cafe con leche",1.20);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarcafelargo) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Cafe Largo",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Cafe Largo",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Cafe Largo",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Cafe Largo",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Cafe Largo",1.50);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Cafe Largo",1.50);
	        }
	    }
		if (e.getSource() == this.vista.btneliminarrzumo) {
			if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
				eliminarProducto(mesa1, "Zumo",1);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
	        	eliminarProducto(mesa2, "Zumo",1);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
	        	eliminarProducto(mesa3, "Zumo",1);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
	        	eliminarProducto(mesa4, "Zumo",1);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
	        	eliminarProducto(mesa5, "Zumo",1);
	        } else if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
	        	eliminarProducto(mesa6, "Zumo",1);
	        }
	    }
		    if(e.getSource()==this.vista.btnPagarComida) {
		    	Double cantidad=0.0;
		    	if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
		    		cantidad=pagar(mesa1,modeloMesa1,this.vista.list_1);
		    		pagar(mesa1,modeloMesa1,this.vista.list_2);
		    		this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
		    		cantidad=pagar(mesa2,modeloMesa1,this.vista.list_1);
		    		pagar(mesa2,modeloMesa1,this.vista.list_2);
		    		this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
		    		cantidad=pagar(mesa3,modeloMesa1,this.vista.list_1);
		    		pagar(mesa3,modeloMesa1,this.vista.list_2);
		    		this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
		    		cantidad=pagar(mesa4,modeloMesa1,this.vista.list_1);
		    		pagar(mesa4,modeloMesa1,this.vista.list_2);
		    		this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
		    		cantidad=pagar(mesa5,modeloMesa1,this.vista.list_1);
		    		pagar(mesa5,modeloMesa1,this.vista.list_2);
		    		this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
		    		cantidad=pagar(mesa6,modeloMesa1,this.vista.list_1);
		    		pagar(mesa6,modeloMesa1,this.vista.list_2);
		    		this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad)+"€");
		    	}	
		    }
		    if(e.getSource()==this.vista.btnPagarBebidas) {
		    	Double cantidad=0.0;
		    	if (this.vista.lblnombremesaBebida.getText().equals("Mesa 1")) {
		    		cantidad=pagar(mesa1,modeloMesa1,this.vista.list_1);
		    		pagar(mesa1,modeloMesa1,this.vista.list_2);
		    		this.vista.lblPagarBebida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 2")) {
		    		cantidad=pagar(mesa2,modeloMesa1,this.vista.list_1);
		    		pagar(mesa2,modeloMesa1,this.vista.list_2);
		    		this.vista.lblPagarBebida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 3")) {
		    		cantidad=pagar(mesa3,modeloMesa1,this.vista.list_1);
		    		pagar(mesa3,modeloMesa1,this.vista.list_2);
		    		this.vista.lblPagarBebida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 4")) {
		    		cantidad=pagar(mesa4,modeloMesa1,this.vista.list_1);
		    		pagar(mesa4,modeloMesa1,this.vista.list_2);
		    		this.vista.lblPagarBebida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 5")) {
		    		cantidad=pagar(mesa5,modeloMesa1,this.vista.list_1);
		    		pagar(mesa5,modeloMesa1,this.vista.list_2);
		    		this.vista.lblPagarBebida.setText(String.valueOf(cantidad)+"€");
		    	}if (this.vista.lblnombremesaBebida.getText().equals("Mesa 6")) {
		    		cantidad=pagar(mesa6,modeloMesa1,this.vista.list_1);
		    		pagar(mesa6,modeloMesa1,this.vista.list_2);
		    		this.vista.lblPagarBebida.setText(String.valueOf(cantidad)+"€");
		    	}	
		    }
		    if(e.getSource()==this.vista.btnNuevoEmpleado_1) {
		    	this.vista.panelnicio.setVisible(false);
		    	this.vista.panelCrearUsuario.setVisible(true);
		    	
		    }
		    if(e.getSource()==this.vista.btnUsuario) {
		    	for(int i=0;i<totalempleados.size();i++) {
					if( totalempleados.get(i).getNombre().equals(this.vista.textFieldInicioSesion.getText())&& totalempleados.get(i).getContraseña().equals(this.vista.textFieldContraseña.getText())) {
						this.vista.lblFalloPanelUsuario.setText("Este usuario y contraseña ya existen");
					}else if(totalempleados.get(i).getNombre().equals(this.vista.textFieldInicioSesion.getText())) {
						this.vista.lblFalloPanelUsuario.setText("Este usuario ya existe");
					}else if(totalempleados.get(i).getContraseña().equals(this.vista.textFieldInicioSesion.getText())) {
						this.vista.lblFalloPanelUsuario.setText("Esta contraseña ya existe");						
					}else if(this.vista.textFieldInicioSesion.getText().isEmpty() && this.vista.textFieldContraseña.getText().isEmpty()){
						this.vista.lblFalloPanelUsuario.setText("Campos vacios");
					}else {
						agregarNuevoUsuario(this.vista.textFieldPanelNombreUsuario.getText(),this.vista.textFieldPanelContraseña.getText());
						this.vista.panelCrearUsuario.setVisible(false);
						this.vista.panelnicio.setVisible(true);
						 this.vista.textFieldPanelNombreUsuario.setText("");
						 this.vista.textFieldPanelContraseña.setText("");
					}	
				}
		    }
		    if(e.getSource()==this.vista.btnVolver) {
		    	this.vista.panelnicio.setVisible(true);
		    	this.vista.panelCrearUsuario.setVisible(false);
		    }
		    if(e.getSource()==this.vista.btnInventarioComida) {
		    	this.vista.panelMesa.setVisible(false);
		    	this.vista.panelnvetarioComida.setVisible(true);
		    }
		    if(e.getSource()==this.vista.btnAñadirInventario) {
		    	añadirinventario();

		   }
		    if(e.getSource()==this.vista.btnEliminarInventario) {
		    	eliminarinventario();
		   }
		    if(e.getSource()==this.vista.btnVolverMesas) {
		    	this.vista.panelMesa.setVisible(true);
		    	this.vista.panelnvetarioComida.setVisible(false);
		    }
		    
		
	}
	
	

	

	public void ponerImagen() {
		vista.btnMesa1.setIcon(fotoEscalar2(this.vista.btnMesa1,"imagenes/1.jpg"));
		vista.btnMesa2.setIcon(fotoEscalar2(this.vista.btnMesa2,"imagenes/2.jpg"));
		vista.btnMesa3.setIcon(fotoEscalar2(this.vista.btnMesa3,"imagenes/3.jpg"));
		vista.btnMesa4.setIcon(fotoEscalar2(this.vista.btnMesa4,"imagenes/4.jpg"));
		vista.btnMesa5.setIcon(fotoEscalar2(this.vista.btnMesa5,"imagenes/5.jpg"));
		vista.btnMesa6.setIcon(fotoEscalar2(this.vista.btnMesa6,"imagenes/6.jpg"));
		vista.btnAtras.setIcon(fotoEscalar2(this.vista.btnAtras,"imagenes/cerrar-sesion.png"));
		vista.lblNewLabel_10.setIcon(fotoEscalar(this.vista.lblNewLabel_10,"imagenes/tostada.jpg"));
		vista.lblNewLabel_11.setIcon(fotoEscalar(this.vista.lblNewLabel_11,"imagenes/tosta-de-jamon.jpg"));
		vista.lblNewLabel_12.setIcon(fotoEscalar(this.vista.lblNewLabel_12,"imagenes/croasan.jpg"));
		vista.lblNewLabel_13.setIcon(fotoEscalar(this.vista.lblNewLabel_13,"imagenes/Palmera.jpg"));
		vista.lblNewLabel_14.setIcon(fotoEscalar(this.vista.lblNewLabel_14,"imagenes/churros.jpg"));
		vista.lblNewLabel_15.setIcon(fotoEscalar(this.vista.lblNewLabel_15,"imagenes/tortitas.jpg"));
		vista.lblNewLabel_16.setIcon(fotoEscalar(this.vista.lblNewLabel_16,"imagenes/cooki.jpg"));
		vista.lblNewLabel_17.setIcon(fotoEscalar(this.vista.lblNewLabel_17,"imagenes/avena.jpg"));
		vista.lblNewLabel_2.setIcon(fotoEscalar(this.vista.lblNewLabel_2,"imagenes/cafe.jpg"));
		vista.lblNewLabel_3.setIcon(fotoEscalar(this.vista.lblNewLabel_3,"imagenes/cafe-con-leche.jpg"));
		vista.lblNewLabel_4.setIcon(fotoEscalar(this.vista.lblNewLabel_4,"imagenes/colacao.jpg"));
		vista.lblNewLabel_5.setIcon(fotoEscalar(this.vista.lblNewLabel_5,"imagenes/esmorzaled_cafes_cortado.png"));
		vista.lblNewLabel_6.setIcon(fotoEscalar(this.vista.lblNewLabel_6,"imagenes/zumo.jpg"));
		vista.lblNewLabel_7.setIcon(fotoEscalar(this.vista.lblNewLabel_7,"imagenes/frappuccino-estilo-starbucks.jpg"));
		vista.lblNewLabel_8.setIcon(fotoEscalar(this.vista.lblNewLabel_8,"imagenes/caramel.jpg"));
		vista.lblNewLabel_9.setIcon(fotoEscalar(this.vista.lblNewLabel_9,"imagenes/cafe-expreso-casero.jpg"));
		vista.lblFondo.setIcon(fotoEscalar(this.vista.lblFondo,"imagenes/fondo.png"));
		vista.lblFondoComida.setIcon(fotoEscalar(this.vista.lblFondoComida,"imagenes/fondo.png"));
		vista.lblFondoInventario.setIcon(fotoEscalar(this.vista.lblFondoInventario,"imagenes/fondo.png"));
		vista.lblFondoPanelInicio.setIcon(fotoEscalar(this.vista.lblFondoPanelInicio,"imagenes/fondo.png"));
		vista.lblFondoMesa.setIcon(fotoEscalar(this.vista.lblFondoMesa,"imagenes/fondo.png"));
		vista.lblFondoPanelUsuario.setIcon(fotoEscalar(this.vista.lblFondoMesa,"imagenes/fondo.png"));
	}
	public List rellenar(Personal empleados) {
		List<Personal>empleados1=new ArrayList<>();
		empleados1.add(new Personal("Ruben","1"));
		empleados1.add(new Personal("Fran","12"));	
		empleados1.add(new Personal("Luis","hola"));
		
		return empleados1;
	}
	public void agregarNuevoUsuario(String nombre, String contraseña) {
		 Personal nuevoEmpleado = new Personal(nombre, contraseña);
		 totalempleados.add(nuevoEmpleado);
	}
	public List rellenarproducto(Producto inventario,List<Producto>productos) {
		productos.add(new Producto("Tostadas",1,1.50));
		productos.add(new Producto("Avena",50,2.50));
		productos.add(new Producto("Cookie",200,0.50));
		productos.add(new Producto("Tortitas",150,2.00));
		productos.add(new Producto("Tostadas de Jamon",150,2.00));
		productos.add(new Producto("Croassan",2000,1.20));
		productos.add(new Producto("Palmera",34,1.00));
		productos.add(new Producto("Churros",150,0.50));
		productos.add(new Producto("Cafe",50,1.20));
		productos.add(new Producto("Cortado",20,1.50));
		productos.add(new Producto("Caramel",200,2.50));
		productos.add(new Producto("Frapuchino",75,2.00));
		productos.add(new Producto("Cola Cao",123,1.50));
		productos.add(new Producto("Cafe con leche",50,1.20));
		productos.add(new Producto("Cafe Largo",84,1.50));
		productos.add(new Producto("Zumo",53,1));
		return productos;
	}
	public ImageIcon fotoEscalar(JLabel label, String url) {
		ImageIcon imagenDefecto = new ImageIcon(url);
	    ImageIcon icono = new ImageIcon(imagenDefecto.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
	    return icono;
	}
	public ImageIcon fotoEscalar2(JButton label, String url) {
		ImageIcon imagenDefecto = new ImageIcon(url);
	    ImageIcon icono = new ImageIcon(imagenDefecto.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
	    return icono;
	}

	public void hora(JLabel label) {
		 SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
	        String horaActual = formatoHora.format(new Date());
	        label.setText(horaActual);
	}
	
	public void agregarProducto(Mesa mesa, String producto, double precio,JButton boton) {
	    for (Producto prod : productostotales) {
	        if (prod.getNombre().equals(producto) && prod.getCantidad() > 0) { 
	        	boton.setEnabled(true);
	            mesa.agregarProducto(prod.getNombre(), 1); 
	            prod.setCantidad(prod.getCantidad() - 1); 
	            this.vista.lblnohaycomida.setText("");
	        	this.vista.lblnohaybebida.setText("");
	        	if(prod.getNombre().equals(producto) && prod.getCantidad() == 0) {
		        	boton.setEnabled(false);	        	
		        }
	        }
	    }

	    actualizarModeloDeLista(mesa);
	}
	public void agregarcombobox(List<Producto>productos) {
			this.vista.comboBoxNombreProducto.addItem("Tostadas");
			this.vista.comboBoxNombreProducto.addItem("Avena");
			this.vista.comboBoxNombreProducto.addItem("Cookie");
			this.vista.comboBoxNombreProducto.addItem("Tortitas");
			this.vista.comboBoxNombreProducto.addItem("Tostadas de Jamon");
			this.vista.comboBoxNombreProducto.addItem("Croassan");
			this.vista.comboBoxNombreProducto.addItem("Palmera");
			this.vista.comboBoxNombreProducto.addItem("Churros");
			this.vista.comboBoxNombreProducto.addItem("Cafe");
			this.vista.comboBoxNombreProducto.addItem("Cortado");
			this.vista.comboBoxNombreProducto.addItem("Caramel");
			this.vista.comboBoxNombreProducto.addItem("Frapuchino");
			this.vista.comboBoxNombreProducto.addItem("Cola Cao");
			this.vista.comboBoxNombreProducto.addItem("Cafe con leche");
			this.vista.comboBoxNombreProducto.addItem("Cafe Largo");
			this.vista.comboBoxNombreProducto.addItem("Zumo");
	}

	public void actualizarModeloDeLista(Mesa mesa) {
	  
		DefaultListModel<String> modelo = getModeloDeLista(mesa);
	    
	    if (modelo != null) {
	        modelo.clear(); 
	        HashMap<String, Integer> comanda = mesa.getComanda(); 

	       
	        for (Map.Entry<String, Integer> entry : comanda.entrySet()) {
	            String producto = entry.getKey();
	            Integer cantidad = entry.getValue();
	            if (cantidad > 0) {
	                modelo.addElement(cantidad + " || " + producto); 
	            }
	        }

	        vista.list_2.setModel(modelo);
	        vista.list_1.setModel(modelo);
	    } 
	}

	public DefaultListModel<String> getModeloDeLista(Mesa mesa) {
	    switch (mesa.getMesas()) {
	        case "Mesa 1":
	            return modeloMesa1;
	        case "Mesa 2":
	            return modeloMesa2;
	        case "Mesa 3":
	            return modeloMesa3;
	        case "Mesa 4":
	            return modeloMesa4;
	        case "Mesa 5":
	            return modeloMesa5;
	        case "Mesa 6":
	            return modeloMesa6;
	        default:
	            return null; 
	    }
	}
	public void eliminarProducto(Mesa mesa, String producto, double precio) {
		 for (Producto prod : productostotales) {
		        if (prod.getNombre().equals(producto)) {
		            mesa.eliminarProducto(prod.getNombre(), 1); 
		            prod.setCantidad(prod.getCantidad() + 1); 
		            this.vista.lblnohaycomida.setText("");
		            this.vista.lblnohaybebida.setText("");

		         
		            if (prod.getCantidad() <= 0) {
		                modelo.removeElement(prod.getNombre());
		            }
		            actualizarModeloDeLista(mesa);
		            
		        }
		    }
		    actualizarModeloDeLista(mesa);
	}
	public Double pagar(Mesa mesa,DefaultListModel<String> modelo, JList<String> list) {
	   
	    double total = 0.0;
	    HashMap<String, Integer> comanda = null;
	    if (modelo == modeloMesa1) {
	        comanda = mesa1.getComanda();
	    } else if (modelo == modeloMesa2) {
	        comanda = mesa2.getComanda();
	    } else if (modelo == modeloMesa3) {
	        comanda = mesa3.getComanda();
	    } else if (modelo == modeloMesa4) {
	        comanda = mesa4.getComanda();
	    } else if (modelo == modeloMesa5) {
	        comanda = mesa5.getComanda();
	    } else if (modelo == modeloMesa6) {
	        comanda = mesa6.getComanda();
	    }

	        for (Map.Entry<String, Integer> entry : comanda.entrySet()) {
	            String producto = entry.getKey();
	            Integer cantidad = entry.getValue();
	            for (Producto prod : productostotales) {
	                if (prod.getNombre().equals(producto)) {
	                    total = prod.getPrecio() * cantidad; 
	                    mesa.eliminarProducto(prod.getNombre(), cantidad);
	                }
	            }
	        }
	     
	    modelo.clear(); 
	    list.setModel(modelo); 
	    actualizarModeloDeLista(mesa);
	    return total; 
	}
	public void añadirinventario() {
		String productoSeleccionado = (String) this.vista.comboBoxNombreProducto.getSelectedItem();
	    int cantidadAAgregar=Integer.parseInt(this.vista.textFieldCantidad.getText());

	    if(cantidadAAgregar>=0) {
	    	 for (Producto producto : productostotales) {
	    	        if (producto.getNombre().equalsIgnoreCase(productoSeleccionado)) {
	    	            producto.setCantidad(producto.getCantidad() + cantidadAAgregar);	
	    	            if(productoSeleccionado.equalsIgnoreCase("Tostadas")) {
	    	            	this.vista.btnañadirtostada.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Avena")) {
	    	            	this.vista.btnañadirvolavena.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cookie")) {
	    	            	this.vista.btnañadircooki.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Tortitas")) {
	    	            	this.vista.btnañadirtortitas.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Tostadas de Jamon")) {
	    	            	this.vista.btnañadirtostadadejamon.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Croassan")) {
	    	            	this.vista.btnañadircroassan.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Palmera")) {
	    	            	this.vista.btnañadirpalmera.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Churros")) {
	    	            	this.vista.btnañadirchurros.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe")) {
	    	            	this.vista.btnañadircafesolo.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cortado")) {
	    	            	this.vista.btnañadircortado.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Caramel")) {
	    	            	this.vista.btnañadircaramel.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Frapuchino")) {
	    	            	this.vista.btnañadirfrapuchino.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cola Cao")) {
	    	            	this.vista.btnañadircolacao.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe con leche")) {
	    	            	this.vista.btnaladircafeconleche.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe Largo")) {
	    	            	this.vista.btnañadircafelargo.setEnabled(true);
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Zumo")) {
	    	            	this.vista.btnañadirzumo.setEnabled(true);
	    	            }
	    	        }
	    	    }
	    }else {
	    	this.vista.lblTextError.setText("Esa cantidad no se puede");
	    }
	    this.vista.textFieldCantidad.setText("");
	}
	public void eliminarinventario() {
		 String productoSeleccionado = (String) this.vista.comboBoxNombreProducto.getSelectedItem();
 	    int cantidadAAgregar=Integer.parseInt(this.vista.textFieldCantidad.getText());
 	    
 	    if(cantidadAAgregar>=0) {
 	    	 for (Producto producto : productostotales) {
		    	        if (producto.getNombre().equalsIgnoreCase(productoSeleccionado) && producto.getCantidad()>cantidadAAgregar || producto.getCantidad()==cantidadAAgregar) {
		    	            producto.setCantidad(producto.getCantidad() - cantidadAAgregar);
		    	            if(productoSeleccionado.equalsIgnoreCase("Tostadas")) {
		    	            	this.vista.btnañadirtostada.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Avena")) {
		    	            	this.vista.btnañadirvolavena.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cookie")) {
		    	            	this.vista.btnañadircooki.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Tortitas")) {
		    	            	this.vista.btnañadirtortitas.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Tostadas de Jamon")) {
		    	            	this.vista.btnañadirtostadadejamon.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Croassan")) {
		    	            	this.vista.btnañadircroassan.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Palmera")) {
		    	            	this.vista.btnañadirpalmera.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Churros")) {
		    	            	this.vista.btnañadirchurros.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe")) {
		    	            	this.vista.btnañadircafesolo.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cortado")) {
		    	            	this.vista.btnañadircortado.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Caramel")) {
		    	            	this.vista.btnañadircaramel.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Frapuchino")) {
		    	            	this.vista.btnañadirfrapuchino.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cola Cao")) {
		    	            	this.vista.btnañadircolacao.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe con leche")) {
		    	            	this.vista.btnaladircafeconleche.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe Largo")) {
		    	            	this.vista.btnañadircafelargo.setEnabled(false);
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Zumo")) {
		    	            	this.vista.btnañadirzumo.setEnabled(false);
		    	            }
		    	        }
		    	    }
 	    }else {
 	    	this.vista.lblTextError.setText("Esa cantidad no se puede");
 	    }
 	   
 	    this.vista.textFieldCantidad.setText("");
	}
	
}
