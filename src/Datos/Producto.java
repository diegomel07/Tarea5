package Datos;

public abstract class Producto {
	
	private int precio;
	private int id;
	private String descripcion;
	private String nombre;
	
	
	public int getPrecio() {
		return this.precio;
	}
	public int getId() {
		return this.id;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Producto(int precio, int id, String descripcion, String nombre) {
		this.precio = precio;
		this.id = id;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Producto [Precio = " + getPrecio() + ", Id = " + getId() + ", Descripcion = "
				+ getDescripcion() + ", Nombre = " + getNombre() + "]";
	}

	// Poli - Mensaje de "Protesta"
	public abstract String mensajeDeProtesta();



}
