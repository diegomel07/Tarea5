package Iu;

import java.util.Scanner;

public class Interfaz {
    
    public static void bienvenida() {
        System.out.println("Bienvenidos a su Cooperativa Ecomún!!! ");
    }

    public static void imprimirMenu(){

        System.out.println("\nQue desea comprar el dia de hoy?");
        System.out.println("\nElija una de las siguientes opciones:");
        System.out.println("1.- Comestibles");
        System.out.println("2.- Aseo");
        System.out.println("3.- Ropa");
        System.out.println("0.- Salir");

    }

    public static int elegirOpcion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("\nDigite una opción: ");
        return leer.nextInt();
    }

    // menu Comestibles
    public static void menuComestibles(){
        System.out.println("\nLos mejores productos a un solo click.");
        System.out.println("1.- Vegetal");
        System.out.println("2.- Animal");
        System.out.println("0.- Salir");
    }

    // menu Aseo
    public static void menuAseo(){
        System.out.println("\nLos mejores productos al mejor precio.");
        System.out.println("1.- Aseo Hogar");
        System.out.println("2.- Aseo Personal");
        System.out.println("0.- Salir");
    }

    // menu Ropa
    public static void menuRopa(){
        System.out.println("\nLa mejor calidad en ropa para toda la familia.");
        System.out.println("1.- Crear nuevo Materia");
        System.out.println("2.- Ver Materia");
        System.out.println("0.- Salir");
    }

    // default
    public static void opcionIncorrecta(){
        System.out.println("\nNo digito una opción valida");
    }

}
