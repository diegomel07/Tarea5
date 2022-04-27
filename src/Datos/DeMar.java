package Datos;

import java.util.Date;

public class DeMar extends Animal {
    private int cant_patas;
    private String habitat;
    private boolean vuela;

    public int getCant_patas() {
        return cant_patas;
    }
    public void setCant_patas(int cant_patas) {
        this.cant_patas = cant_patas;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public boolean isSiVuela() {
        return vuela;
    }
    public void setSiVuela(boolean siVuela) {
        this.vuela = siVuela;
    }

    public DeMar(int precio, int id, String descripcion, String nombre, Date fechaExpedicion, String fabricante,
            int contenidoNeto, Date fechaVencimiento, boolean perecedero, String empaquetado, String tipo, int edad,
            String clima, int cant_patas, String habitat, boolean vuela) {
        super(precio, id, descripcion, nombre, fechaExpedicion, fabricante, contenidoNeto, fechaVencimiento, perecedero,
                empaquetado, tipo, edad, clima);
        this.cant_patas = cant_patas;
        this.habitat = habitat;
        this.vuela = vuela;
    }


    @Override
    public String toString() {
        return "DeMar [cant_patas=" + cant_patas + ", habitat=" + habitat + ", vuela=" + vuela + "]";
    }
    
    
}
