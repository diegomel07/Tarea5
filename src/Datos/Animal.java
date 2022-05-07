package Datos;

import java.util.Date;

public abstract class Animal extends Comestibles {
	private String tipo;
	private int edad;
	private String clima;
	
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
			int contenidoNeto, Date fechaVencimiento, boolean perecedero, Boolean empaquetado, String tipo, int edad,
			String clima) {
		super(precio, id, descripcion, nombre, fechaExpedicion, fabricante, contenidoNeto, fechaVencimiento, perecedero,
				empaquetado);
		this.tipo = tipo;
		this.edad = edad;
		this.clima = clima;
	}
	@Override
	public String toString() {
		return  super.toString() + "Animal [clima=" + clima + ", edad=" + edad + ", tipo=" + tipo + "]";
	}

	// Mensaje de protesta de los animales
	@Override
	public String mensajeDeProtesta(){
		return "Siempre que un hombre se tome el derecho de sacrificar un animal por un fin, no sólo comete una injusticia, sino un crimen (Karlheinz Deschner)";
	}
	

}
