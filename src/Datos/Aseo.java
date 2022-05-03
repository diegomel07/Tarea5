package Datos;

public abstract class Aseo extends Producto{
	private String productor;
	private boolean toxico; 
	private int cotenidoNeto;
	private String estado;
	
	
	public String getProductor() {
		return this.productor;
	}
	public boolean isToxico() {
		return this.toxico;
	}
	public int getCotenidoNeto() {
		return this.cotenidoNeto;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public void setToxico(boolean toxico) {
		this.toxico = toxico;
	}
	public void setCotenidoNeto(int cotenidoNeto) {
		this.cotenidoNeto = cotenidoNeto;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Aseo(int precio, int id, String descripcion, String nombre, String productor, boolean toxico,
			int cotenidoNeto, String estado) {
		super( precio, id, descripcion, nombre);
		this.productor = productor;
		this.toxico = toxico;
		this.cotenidoNeto = cotenidoNeto;
		this.estado = estado;
	}
	@Override
	public String toString() {
		return super.toString() + "Aseo [Productor = " + getProductor() + ", Toxico = " + isToxico() + ", Cotenido Neto = "
				+ getCotenidoNeto() + ", Estado = " + getEstado() + "]";
	}
	
	
	
	
	
	
	

}
