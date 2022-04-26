package Datos; 

public class Ropa extends Producto {
	private  String material;
	private int talla;
	private String marca;
	private String genero;
	
	
	public String getMaterial() {
		return this.material;
	}
	public int getTalla() {
		return this.talla;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setTalla(int talla) {
		this.talla = talla;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Ropa(int precio, int id, String descripcion, String nombre, String material, int talla, String marca,
			String genero) {
		super(precio, id, descripcion, nombre);
		this.material = material;
		this.talla = talla;
		this.marca = marca;
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Ropa [Material = " + getMaterial() + ", Talla = " + getTalla() + ", Marca =" + getMarca()
				+ ", Genero = " + getGenero() + "]";
		
	}
	
	

}
