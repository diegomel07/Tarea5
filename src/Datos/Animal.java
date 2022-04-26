package Datos;

import java.util.Date;

public class Animal extends Comestibles {
	public String tipo;
	public int edad;
	public String clima;
	public String getTipo() {
		return tipo;
	}
	public int getEdad() {
		return edad;
	}
	public String getClima() {
		return clima;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public Animal(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
			int contenidoNeto, Date fechaVencimiento, boolean perecedero, String empaquetado, String tipo, int edad,
			String clima) {
		super(precio, id, descripcion, nombre, fechaExpedicion, fabricante, contenidoNeto, fechaVencimiento, perecedero,
				empaquetado);
		this.tipo = tipo;
		this.edad = edad;
		this.clima = clima;
	}
	
	

}
