package Datos;

import java.util.Date;

public class DeMar extends Animal {
    private int cant_aletas;
    private String tipo_agua;
    private int profundidad;

    public int getCant_aletas() {
        return cant_aletas;
    }
    public void setCant_aletas(int cant_aletas) {
        this.cant_aletas = cant_aletas;
    }
    public String getTipo_agua() {
        return tipo_agua;
    }
    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }
    public int getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    
    public DeMar(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
            int contenidoNeto, Date fechaVencimiento, boolean perecedero, Boolean empaquetado, String tipo, int edad,
            String clima, int cant_aletas, String tipo_agua, int profundidad) {
        super(precio, id, descripcion, nombre, fechaExpedicion, fabricante, contenidoNeto, fechaVencimiento, perecedero,
                empaquetado, tipo, edad, clima);
        this.cant_aletas = cant_aletas;
        this.tipo_agua = tipo_agua;
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return super.toString() + "DeMar [cant_aletas=" + cant_aletas + ", profundidad=" + profundidad + ", tipo_agua=" + tipo_agua
                + "]";
    }
    
    
}
