package Datos;
import java.util.*;

public class Comestibles extends Producto {
	private Date fechaExpedicion;
	private String fabricante;
	private int contenidoNeto;
	private Date fechaVencimiento;
	private boolean perecedero;
	private String empaquetado;
	
	
	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}
	public String getFabricante() {
		return this.fabricante;
	}
	public int getContenidoNeto() {
		return this.contenidoNeto;
	}
	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}
	public boolean isPerecedero() {
		return this.perecedero;
	}
	public String getEmpaquetado() {
		return this.empaquetado;
	}
	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setContenidoNeto(int contenidoNeto) {
		this.contenidoNeto = contenidoNeto;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}
	public void setEmpaquetado(String empaquetado) {
		this.empaquetado = empaquetado;
	}

	public Comestibles(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
			int contenidoNeto, Date fechaVencimiento, boolean perecedero, String empaquetado) {
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
		return "Comestibles [Fecha Expedicion = " + getFechaExpedicion() + ", Fabricante = " + getFabricante()
				+ ", ContenidoNeto = " + getContenidoNeto() + ", Fecha Vencimiento = " + getFechaVencimiento()
				+ ", Perecedero = " + isPerecedero() + ", Empaquetado = " + getEmpaquetado() + "]";
	}
	
	
}
