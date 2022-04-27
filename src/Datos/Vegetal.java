package Datos;

import java.util.*;

public class Vegetal extends Comestibles {
	private String tipo;
	private String color;
	private String clima;
	
	public String getTipo() {
		return this.tipo;
	}
	public String getColor() {
		return this.color;
	}
	public String getClima() {
		return this.clima;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public Vegetal(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
			int contenidoNeto, Date fechaVencimiento, boolean perecedero, String empaquetado, String tipo, String color,
			String clima) {
		super(precio, id, descripcion, nombre, fechaExpedicion, fabricante, contenidoNeto, fechaVencimiento, perecedero,
				empaquetado);
		this.tipo = tipo;
		this.color = color;
		this.clima = clima;
	}
	
	@Override
	public String toString() {
		return "Vegetal [Tipo = " + getTipo() + ", Color = " + getColor() + ", Clima = " + getClima() + "]";
	}
	
	

}
