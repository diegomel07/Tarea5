package Logica;

import Datos.*;
import Iu.*;

import java.util.*;

public class ecomun {

    public static void main(String[] args) {
        
        Interfaz.bienvenida();
        
        Interfaz.imprimirMenu();
        
        final int opcion = Interfaz.elegirOpcion();
        
        switch (opcion){
            case 1:
                Interfaz.menuComestibles();
                final int opcion_comestibles = Interfaz.elegirOpcion();
                switch (opcion_comestibles){
                    case 1:
                        // vegetal
                        break;
                    case 2:
                        // animal
                        System.out.println("1-De mar\n2-De tierra");
                        final int opcion_animal = Interfaz.elegirOpcion();
                        switch (opcion_animal){
                            case 1:
                                //De mar
                                final ArrayList<DeMar> ejemplo_de_mar = Ejemplo.creandoDemar();
                                Funciones.imprimirListaDeMar(ejemplo_de_mar);
                                System.out.println("\nDigite el Id del producto que desea visualizar: ");
                                final int opcion_deMar = Interfaz.elegirOpcion();
                                Funciones.imprimiDeMar(opcion_deMar, ejemplo_de_mar);
                                break;
                            case 2:
                                // de Tierra
                                break;
                        }
                        break;
                    case 3:
                        // artificial
                        break;
                }
                break;
            case 2:
                Interfaz.menuAseo();
                break;
            case 3:
                Interfaz.menuRopa();
                break;
            case 4:
                Interfaz.opcionIncorrecta();
                
        }
    }
    
}
