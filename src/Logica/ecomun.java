package Logica;

import Datos.*;
import Iu.*;
/**
 *
 * @author dmellizo
 */
public class ecomun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz.bienvenida();
        
        Interfaz.imprimirMenu();
        
        int opcion = Interfaz.elegirOpcion();
        
        switch (opcion){
            case 1:
                Interfaz.menuComestibles();
                int opcion_comestibles = Interfaz.elegirOpcion();
                switch (opcion_comestibles){
                    case 1:
                        // vegetal
                        // lista
                        // pro1 - 1
                        // pro2 - 2
                        // DIigire el id
                        // datos del producto
                        break;
                    case 2:
                        // animal
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
