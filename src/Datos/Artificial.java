package Datos;

import java.util.Date;

public class Artificial extends Comestibles{
    private int cant_por_paquete;
    private String tipo_de_paquete;
    private String estado;
    public int getCant_por_paquete() {
        return cant_por_paquete;
    }
    public void setCant_por_paquete(int cant_por_paquete) {
        this.cant_por_paquete = cant_por_paquete;
    }
    public String getTipo_de_paquete() {
        return tipo_de_paquete;
    }
    public void setTipo_de_paquete(String tipo_de_paquete) {
        this.tipo_de_paquete = tipo_de_paquete;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Artificial(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
            int contenidoNeto, Date fechaVencimiento, boolean perecedero, Boolean empaquetado, int cant_por_paquete,
            String tipo_de_paquete, String estado) {
        super(precio, id, descripcion, nombre, fechaExpedicion, fabricante, contenidoNeto, fechaVencimiento, perecedero,
                empaquetado);
        this.cant_por_paquete = cant_por_paquete;
        this.tipo_de_paquete = tipo_de_paquete;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Artificial [cant_por_paquete=" + cant_por_paquete + ", estado=" + estado + ", tipo_de_paquete="
                + tipo_de_paquete + "]";
    }
 
}
