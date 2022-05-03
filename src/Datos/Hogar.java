package Datos;

public class Hogar extends Aseo{
    private boolean herramienta;
    private boolean producto_quimico;
    private String zona;

    public boolean isHerramienta() {
        return herramienta;
    }
    public void setHerramienta(boolean herramienta) {
        this.herramienta = herramienta;
    }
    public boolean isProducto_quimico() {
        return producto_quimico;
    }
    public void setProducto_quimico(boolean producto_quimico) {
        this.producto_quimico = producto_quimico;
    }
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    public Hogar(int precio, int id, String descripcion, String nombre, String productor, boolean toxico,
            int cotenidoNeto, String estado, boolean herramienta, boolean producto_quimico, String zona) {
        super(precio, id, descripcion, nombre, productor, toxico, cotenidoNeto, estado);
        this.herramienta = herramienta;
        this.producto_quimico = producto_quimico;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "Hogar [herramienta=" + herramienta + ", producto_quimico=" + producto_quimico + ", zona=" + zona + "]";
    }

    

    
}
