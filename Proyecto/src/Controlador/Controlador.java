package Controlador;

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
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import Modelo.Personal;
import Modelo.Producto;
import Vista.InicioSesion;

public class Controlador implements ActionListener, MouseListener{
	InicioSesion vista=new InicioSesion();
	Personal empleados;
	Producto inventario;
	ArrayList<ImageIcon>imagenes=new ArrayList();
	List<Personal>totalempleados=new ArrayList<>();	
	List<Producto>productostotales=new ArrayList<>();
	public Controlador(InicioSesion vista) {
		this.vista=vista;
		this.vista.btnIniciarSesion.addActionListener(this);
		this.vista.btnMesa1.addMouseListener(this);
		this.vista.btnMesa2.addMouseListener(this);
		this.vista.btnMesa3.addMouseListener(this);
		this.vista.btnMesa4.addMouseListener(this);
		this.vista.btnMesa5.addMouseListener(this);
		this.vista.btnMesa6.addMouseListener(this);
		this.vista.btnAtras.addActionListener(this);
		this.vista.btnVueltasMesa.addActionListener(this);
		this.vista.btnVolverMesaBebida.addActionListener(this);
		this.vista.btnComida.addActionListener(this);
		this.vista.btnBebida.addActionListener(this);
		ponerImagen();
		hora(this.vista.lblHora);
		hora(this.vista.lblHora1);
		totalempleados=rellenar(empleados);
		productostotales=rellenarproducto(inventario);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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
		}if(e.getSource()==this.vista.btnAtras){
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
	
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount()==2) {
			this.vista.panelMesa.setVisible(false);
			this.vista.panelComida.setVisible(true);
		}
	}
	
	public void ponerImagen() {
		vista.btnMesa1.setIcon(fotoEscalar2(this.vista.btnMesa1,"imagenes/1.jpg"));
		vista.btnMesa2.setIcon(fotoEscalar2(this.vista.btnMesa2,"imagenes/2.jpg"));
		vista.btnMesa3.setIcon(fotoEscalar2(this.vista.btnMesa3,"imagenes/3.jpg"));
		vista.btnMesa4.setIcon(fotoEscalar2(this.vista.btnMesa4,"imagenes/4.jpg"));
		vista.btnMesa5.setIcon(fotoEscalar2(this.vista.btnMesa5,"imagenes/5.jpg"));
		vista.btnMesa6.setIcon(fotoEscalar2(this.vista.btnMesa6,"imagenes/6.jpg"));
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
		vista.lblFondoPanelInicio.setIcon(fotoEscalar(this.vista.lblFondoPanelInicio,"imagenes/fondo.png"));
		vista.lblFondoMesa.setIcon(fotoEscalar(this.vista.lblFondoMesa,"imagenes/fondo.png"));
	}
	public List rellenar(Personal empleados) {
		List<Personal>empleados1=new ArrayList<>();
		empleados1.add(new Personal("Ruben","1"));
		empleados1.add(new Personal("Fran","12"));	
		empleados1.add(new Personal("Luis","hola"));
		return empleados1;
	}
	public List rellenarproducto(Producto inventario) {
		List<Producto>productos=new ArrayList<>();
		productos.add(new Producto("Tostas",100,"1,50€"));
		productos.add(new Producto("Avena",50,"2,50€"));
		productos.add(new Producto("Cookie",200,"0,50€"));
		productos.add(new Producto("Tortitas",150,"2,00€"));
		productos.add(new Producto("Tostadas de Jamon",150,"2,00€"));
		productos.add(new Producto("Croassan",2000,"1,20€"));
		productos.add(new Producto("Palmera",34,"1,00€"));
		productos.add(new Producto("Churros",150,"0,50€"));
		productos.add(new Producto("Cafe",50,"1,20€"));
		productos.add(new Producto("Cortado",20,"1,50€"));
		productos.add(new Producto("Caramel",200,"2,50€"));
		productos.add(new Producto("Frapuchino",75,"2,00€"));
		productos.add(new Producto("Cola Cao",123,"1,50€"));
		productos.add(new Producto("Cafe con leche",50,"1,20€"));
		productos.add(new Producto("Cafe Largo",84,"1,50€"));
		productos.add(new Producto("Zumo",53,"1,50€"));
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
