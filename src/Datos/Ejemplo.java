package Datos;

import java.util.*;
import Logica.*;

public class Ejemplo {

    // Creando los objetos
    public static ArrayList<DeMar> creandoDemar(){
        ArrayList<DeMar> listaDemMar= new ArrayList<>();

        DeMar ejeDeMar = new DeMar(1000, 1, "Delicioso Calamar", "Calamar", Funciones.generarFecha(), "Pesquera Jaramillo", 2, Funciones.generarFecha(), true, false, " Calamar de Humboldt", 15, "Cualquier Clima", 0, "dulce y salada", 10000);
        DeMar eje2DeMar = new DeMar(500, 2, "Delicioso Salmon", "Salmon", Funciones.generarFecha(), "San Jacinto", 1, Funciones.generarFecha(), true, false, "Salmón Salar", 6, "Calido", 8, "Salado", 100);
        DeMar eje3DeMar = new DeMar(200, 3, "Bagre Repulsivo", "Bagre", Funciones.generarFecha(), "Pesquera Jaramillo", 1, Funciones.generarFecha(), true, false, "Bagre de canal", 12, "Tropical", 4, "Dulce", 100);

        Collections.addAll(listaDemMar, ejeDeMar, eje2DeMar,eje3DeMar);

        return listaDemMar;
    }

}
