package Datos;

public class Personal extends Aseo{
    private String zona_del_cuerpo;
    private String tipo_de_empaque;
    private String color_de_empaque;

    public String getZona_del_cuerpo() {
        return zona_del_cuerpo;
    }



    public void setZona_del_cuerpo(String zona_del_cuerpo) {
        this.zona_del_cuerpo = zona_del_cuerpo;
    }



    public String getTipo_de_empaque() {
        return tipo_de_empaque;
    }



    public void setTipo_de_empaque(String tipo_de_empaque) {
        this.tipo_de_empaque = tipo_de_empaque;
    }



    public String getColor_de_empaque() {
        return color_de_empaque;
    }



    public void setColor_de_empaque(String color_de_empaque) {
        this.color_de_empaque = color_de_empaque;
    }



    public Personal(int precio, int id, String descripcion, String nombre, String productor, boolean toxico,
            int cotenidoNeto, String estado, String zona_del_cuerpo, String tipo_de_empaque, String color_de_empaque) {
        super(precio, id, descripcion, nombre, productor, toxico, cotenidoNeto, estado);
        this.zona_del_cuerpo = zona_del_cuerpo;
        this.tipo_de_empaque = tipo_de_empaque;
        this.color_de_empaque = color_de_empaque;
    }

    @Override
    public String toString() {
        return super.toString() + "Personal [color_de_empaque=" + color_de_empaque + ", tipo_de_empaque=" + tipo_de_empaque
                + ", zona_del_cuerpo=" + zona_del_cuerpo + "]";
    }    

}
