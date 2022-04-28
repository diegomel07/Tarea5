package Logica;

import Datos.*;
import java.util.*;

public class Funciones {

    public static Date generarFecha(){
        Date d1 = new Date(650000000000L), d2 = new Date();

        Random rand = new Random();

        return (new Date(rand.nextLong(d1.getTime(), d2.getTime())));
    }

    public static void imprimirListaDeMar (ArrayList<DeMar> arreglo){
        for (DeMar obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());
        }
    }

    public static void imprimiDeMar(int id, ArrayList<DeMar> arreglo){

        for (DeMar obj : arreglo){
            if (obj.getId() == id){
                System.out.println(obj.toString());
            }
        }

    }
    
}
