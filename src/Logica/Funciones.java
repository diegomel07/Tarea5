package Logica;

import Datos.*;
import java.util.*;

public class Funciones {

    // Instanciando ejemplos
    final static ArrayList<Vegetal> ejemplo_vegetal = Ejemplo.creandoVegetal();
    final static ArrayList<DeMar> ejemplo_mar = Ejemplo.creandoDemar();
    final static ArrayList<DeTierra> ejemplo_de_tierra = Ejemplo.creandoDeTierra();
    final static ArrayList<Artificial> ejemplo_artificial = Ejemplo.creandoArtificial();
    final static ArrayList<Hogar> ejemplo_hogar = Ejemplo.creandoHogar();
    final static ArrayList<Personal> ejemplo_personal = Ejemplo.creandoPersonal();
    final static ArrayList<Ropa> ejemplo_ropa = Ejemplo.creandoRopa();


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 

    public static Date generarFecha(){
        //Date d1 = new Date(650000000000L), d2 = new Date();

        //Random rand = new Random();

        return new Date();
    }


    public static ArrayList<String> listaVegetal(ArrayList<Vegetal> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (Vegetal obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());
        }

        return datos_basicos;
    }

    public static String datosVegetal(int id){
        for (Vegetal obj : ejemplo_vegetal){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";
    }

    
    public static ArrayList<String> listaDeMar (ArrayList<DeMar> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (DeMar obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());
        }

        return datos_basicos;
    }

    public static String datosDeMar(int id){
        for (DeMar obj : ejemplo_mar){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";
    }
    

    public static ArrayList<String> listaDeTierra (ArrayList<DeTierra> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (DeTierra obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());
        }

        return datos_basicos;
    }

    public static String datosDeTierra(int id){
        for (DeTierra obj : ejemplo_de_tierra){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";
    }


    public static ArrayList<String> listaArtificial( ArrayList<Artificial> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (Artificial obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());
        }

        return datos_basicos;

    }

    public static String datosArtificial(int id){

        for (Artificial obj : ejemplo_artificial){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";

    }


    public static ArrayList<String> listaPersonal(ArrayList<Personal> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (Personal obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());
        }

        return datos_basicos;
    }

    public static String datosPersonal(int id){
        for (Personal obj : ejemplo_personal){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";

    }


    public static ArrayList<String> listaHogar(ArrayList<Hogar> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (Hogar obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());    
        }

        return datos_basicos;
    }

    public static String datosHogar(int id){
        for (Hogar obj : ejemplo_hogar){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";
    }


    public static ArrayList<String> listaRopa(ArrayList<Ropa> arreglo){
        ArrayList<String> datos_basicos = new ArrayList<>();

        for (Ropa obj : arreglo){
            datos_basicos.add("Id: " + obj.getId() + " Nombre: " + obj.getNombre());
        }

        return datos_basicos;
    }

    public static String datosRopa(int id){
        for (Ropa obj : ejemplo_ropa){
            if (obj.getId() == id){
                return obj.toString() + "\n\n\n" +  obj.mensajeDeProtesta();
            }
        }

        return "";
    }


    static LinkedHashMap<String, ArrayList<String>> datosBasicos = new LinkedHashMap<String, ArrayList<String>>();
    // LinkedHashMap de todos los nombre + id de los objetos
    public static LinkedHashMap<String, ArrayList<String>> agruparDatosBasicos (){
    
        datosBasicos.put("Vegetal", listaVegetal(ejemplo_vegetal));
        datosBasicos.put("De Mar", listaDeMar(ejemplo_mar));
        datosBasicos.put("De Tierra", listaDeTierra(ejemplo_de_tierra));
        datosBasicos.put("Artificiales", listaArtificial(ejemplo_artificial));
        datosBasicos.put("Hogar", listaHogar(ejemplo_hogar));
        datosBasicos.put("Personal", listaPersonal(ejemplo_personal));
        datosBasicos.put("Ropa", listaRopa(ejemplo_ropa));

        return datosBasicos;
    }


    public static TreeMap<Integer, String> objetosIds(){
        TreeMap<Integer, String> datos = new TreeMap<>();

        for (Vegetal obj: ejemplo_vegetal){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }
        for (DeMar obj: ejemplo_mar){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }
        for (DeTierra obj: ejemplo_de_tierra){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }
        for (Artificial obj: ejemplo_artificial){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }
        for (Hogar obj: ejemplo_hogar){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }
        for (Personal obj: ejemplo_personal){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }
        for (Ropa obj: ejemplo_ropa){
            datos.put(obj.getId(), obj.toString() + "\n\n\n" + obj.mensajeDeProtesta() + "\n\n\n");
        }

        return datos;
    }

    public static String datosObjeto(int id){

        TreeMap<Integer, String> datos = objetosIds();

        return datos.get(id);

    }

    


}



