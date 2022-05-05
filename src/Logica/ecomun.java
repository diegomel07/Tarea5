package Logica;

import Iu.*;

import java.util.*;



// preguntar si creamos una clase empaque :v
public class ecomun {

    public static void main(String[] args) {

        // Ejemplos
        LinkedHashMap<String, ArrayList<String>> datos_basicos_productos = Funciones.agruparDatosBasicos();
        
        // Crear la opcion de comprar o vender
        int opcion;
        Interfaz.bienvenida();
        
        do{
            Interfaz.imprimirMenu();
        
            opcion = Interfaz.elegirOpcion();
        
        
            switch (opcion){
                case 1:
                    Funciones.clearScreen();
                    int opcion_comestibles;
                    do {
                        Interfaz.menuComestibles();
                        opcion_comestibles = Interfaz.elegirOpcion();
                        switch (opcion_comestibles){
                            case 1:
                                Funciones.clearScreen();
                                // vegetal
                                Interfaz.imprimirListaProductos(datos_basicos_productos.get("Vegetal"));
                                String datos_vegetal;
                                do {
                                    final int opciones_vegetal = Interfaz.digiteId();
                                    datos_vegetal = Funciones.datosVegetal(opciones_vegetal);
                                    if (datos_vegetal.equals("")){
                                        Interfaz.idInexistente();
                                    } else {
                                        Interfaz.imprimirDatos(datos_vegetal);
                                    }
                                } while (datos_vegetal.equals(""));
                                
                                break;

                            case 2:
                                Funciones.clearScreen();
                                // animal
                                int opcion_animal;
                                do {
                                    Interfaz.menuAnimal();
                                    opcion_animal = Interfaz.elegirOpcion();
                                    switch (opcion_animal){
                                        case 1:
                                            Funciones.clearScreen();
                                            //De mar                                            
                                            Interfaz.imprimirListaProductos(datos_basicos_productos.get("De Mar"));
                                            String datos_mar;
                                            do {
                                                final int opcion_Mar = Interfaz.digiteId();
                                                datos_mar = Funciones.datosDeMar(opcion_Mar);
                                                if (datos_mar.equals("")){
                                                    Interfaz.idInexistente();
                                                } else {
                                                    Interfaz.imprimirDatos(datos_mar);
                                                }
                                            } while (datos_mar.equals(""));
          
                                            break;

                                        case 2:
                                            Funciones.clearScreen();
                                            // de Tierra                                            
                                            Interfaz.imprimirListaProductos(datos_basicos_productos.get("De Tierra"));                                           
                                            String datos_tierra;
                                            do {
                                                final int opcion_deTierra = Interfaz.digiteId();
                                                datos_tierra = Funciones.datosDeTierra(opcion_deTierra);                                                
                                                if (datos_tierra.equals("")){
                                                    Interfaz.idInexistente();
                                                } else {
                                                    Interfaz.imprimirDatos(datos_tierra);
                                                }
                                            } while (datos_tierra.equals(""));

                                            break;        

                                        case 0:
                                            Funciones.clearScreen();
                                            break;
                                        default:
                                            Funciones.clearScreen();
                                            Interfaz.opcionIncorrecta();
                                            break;
                                    }
                                } while(opcion_animal != 0);
                                break;

                            case 3:
                                Funciones.clearScreen();
                                // artificial                                
                                Interfaz.imprimirListaProductos(datos_basicos_productos.get("Artificiales"));
                                String datos_artificial;
                                do {
                                    final int opcion_artificial = Interfaz.digiteId();
                                    datos_artificial = Funciones.datosArtificial(opcion_artificial);
                                    if (datos_artificial.equals("")){
                                        Interfaz.idInexistente();
                                    } else {
                                        Interfaz.imprimirDatos(datos_artificial);
                                    }
                                } while (datos_artificial.equals(""));
                                break;

                            case 0:
                                Funciones.clearScreen();
                                break;

                            default:
                                Funciones.clearScreen();
                                Interfaz.opcionIncorrecta();
                                break;
                        }

                    } while (opcion_comestibles != 0);
                    
                    break;
                case 2:
                    Funciones.clearScreen();
                    int opcion_aseo;
                    do {
                        Interfaz.menuAseo();
                        opcion_aseo = Interfaz.elegirOpcion();

                        switch (opcion_aseo){                            
                            case 1:
                                Funciones.clearScreen();                            
                                Interfaz.imprimirListaProductos(datos_basicos_productos.get("Hogar"));
                                String datos_hogar;
                                do {
                                    final int opcion_hogar = Interfaz.digiteId();
                                    datos_hogar = Funciones.datosHogar(opcion_hogar);
                                    if (datos_hogar.equals("")){
                                        Interfaz.idInexistente();
                                    } else {
                                        Interfaz.imprimirDatos(datos_hogar);
                                    }
                                } while (datos_hogar.equals(""));
                                break;
                            case 2:
                                Funciones.clearScreen();                                
                                Interfaz.imprimirListaProductos(datos_basicos_productos.get("Personal"));                                
                                String datos_personal;
                                do {
                                    final int opcion_personal = Interfaz.digiteId();
                                    datos_personal = Funciones.datosPersonal(opcion_personal);
                                    if (datos_personal.equals("")){
                                        Interfaz.idInexistente();
                                    } else {
                                        Interfaz.imprimirDatos(datos_personal);
                                    }
                                } while (datos_personal.equals(""));
                                break;

                            case 0:
                                Funciones.clearScreen();
                                break;
                            default:
                                Funciones.clearScreen();
                                Interfaz.opcionIncorrecta();
                                break;
                        }
                    } while (opcion_aseo != 0);
                        
                    break;
                case 3:
                    Funciones.clearScreen();
                    Interfaz.menuRopa();                    
                    Interfaz.imprimirListaProductos(datos_basicos_productos.get("Ropa"));                   
                    String datos_ropa;
                    do {
                        final int opcion_ropa = Interfaz.digiteId();
                        datos_ropa = Funciones.datosRopa(opcion_ropa);
                        if (datos_ropa.equals("")){
                            Interfaz.idInexistente();
                        } else {
                            Interfaz.imprimirDatos(datos_ropa);
                        }
                    } while (datos_ropa.equals(""));
                    break;
                
                case 4:
                    Funciones.clearScreen();
                    for (ArrayList<String> datos : datos_basicos_productos.values()){
                        Interfaz.imprimirListaProductos(datos);
                    }
                    
                    break;

                case 0:
                    Interfaz.despedida();
                    break;
                default:
                    Interfaz.opcionIncorrecta();
                    break;
                    
            }

        } while (opcion != 0);
        
    }
    
}
