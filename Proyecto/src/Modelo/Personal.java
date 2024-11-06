package Modelo;

public class Personal {
	private String nombre;
	private String contraseña;
	public Personal(String nombre, String contraseña) {
		
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		return "Personal [nombre=" + nombre + ", contraseña=" + contraseña + "]";
	}
	
}
