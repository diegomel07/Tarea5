package Datos;
import java.util.*;

public abstract class Comestibles extends Producto {
	private Date fechaExpedicion;
	private String fabricante;
	private int contenidoNeto;
	private Date fechaVencimiento;
	private boolean perecedero;
	private Boolean empaquetado;

	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getContenidoNeto() {
		return contenidoNeto;
	}

	public void setContenidoNeto(int contenidoNeto) {
		this.contenidoNeto = contenidoNeto;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}

	public Boolean getEmpaquetado() {
		return empaquetado;
	}

	public void setEmpaquetado(Boolean empaquetado) {
		this.empaquetado = empaquetado;
	}

	public Comestibles(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
			int contenidoNeto, Date fechaVencimiento, boolean perecedero, Boolean empaquetado) {
		super(precio, id, descripcion, nombre);
		this.fechaExpedicion = fechaExpedicion;
		this.fabricante = fabricante;
		this.contenidoNeto = contenidoNeto;
		this.fechaVencimiento = fechaVencimiento;
		this.perecedero = perecedero;
		this.empaquetado = empaquetado;
	}

	@Override
	public String toString() {
		return super.toString() + "Comestibles [contenidoNeto=" + contenidoNeto + ", empaquetado=" + empaquetado + ", fabricante="
				+ fabricante + ", fechaExpedicion=" + fechaExpedicion + ", fechaVencimiento=" + fechaVencimiento
				+ ", perecedero=" + perecedero + "]";
	}

	
	
	
}
