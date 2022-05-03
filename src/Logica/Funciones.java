package Logica;

import Datos.*;
import java.util.*;

public class Funciones {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

    public static Date generarFecha(){
        Date d1 = new Date(650000000000L), d2 = new Date();

        Random rand = new Random();

        return (new Date(rand.nextLong(d1.getTime(), d2.getTime())));
    }

    public static void imprimirListaVegetal(ArrayList<Vegetal> arreglo){
        for (Vegetal obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());
        }
    }

    public static String datosVegetal(int id, ArrayList<Vegetal> arreglo){
        for (Vegetal obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";
    }

    
    public static void imprimirListaDeMar (ArrayList<DeMar> arreglo){
        for (DeMar obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());
        }
    }

    public static String datosDeMar(int id, ArrayList<DeMar> arreglo){
        for (DeMar obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";
    }
    

    public static void imprimirListaDeTierra (ArrayList<DeTierra> arreglo){
        for (DeTierra obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());
        }
    }

    public static String datosDeTierra(int id, ArrayList<DeTierra> arreglo){
        for (DeTierra obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";
    }


    public static void imprimirListaArtificial( ArrayList<Artificial> arreglo){

        for (Artificial obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());
        }

    }

    public static String datosArtificial(int id, ArrayList<Artificial> arreglo){

        for (Artificial obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";

    }


    public static void imprimirListaPersonal(ArrayList<Personal> arreglo){
        for (Personal obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());        
        }
    }

    public static String datosPersonal(int id, ArrayList<Personal> arreglo){
        for (Personal obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";

    }

    public static void imprimirListaHogar(ArrayList<Hogar> arreglo){
        for (Hogar obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId());        
        }
    }
    public static String datosHogar(int id, ArrayList<Hogar> arreglo){
        for (Hogar obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";
    }


    public static void imprimirListaRopa(ArrayList<Ropa> arreglo){
        for (Ropa obj : arreglo){
            System.out.println("Nombre: " + obj.getNombre() + " Id: " + obj.getId()); 
        }
    }

    public static String datosRopa(int id, ArrayList<Ropa> arreglo){
        for (Ropa obj : arreglo){
            if (obj.getId() == id){
                return obj.toString();
            }
        }

        return "";
    }
}


