package Iu;

import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz {

    static Scanner leer = new Scanner(System.in);
    
    public static void bienvenida() {
        System.out.println("Bienvenidos a su Cooperativa Ecomún!!! ");
    }

    public static void imprimirMenu(){

        System.out.println("\nQue desea comprar el dia de hoy?");
        System.out.println("\nElija una de las siguientes opciones:");
        System.out.println("1.- Comestibles");
        System.out.println("2.- Aseo");
        System.out.println("3.- Ropa");
        System.out.println("4.- Todos los Prodcutos");
        System.out.println("0.- Salir");

    }

    public static int elegirOpcion() {
        System.out.print("\nDigite una opción: ");
        return leer.nextInt();
    }

    // menu Comestibles
    public static void menuComestibles(){
        System.out.println("\nLos mejores productos a un solo click.");
        System.out.println("1.- Vegetal");
        System.out.println("2.- Animal");
        System.out.println("3.- Artificial");
        System.out.println("0.- Salir");
    }

    // menu animal
    public static void menuAnimal(){
        System.out.println("\nLos mejores productos a un solo click.");
        System.out.println("1.- De Mar");
        System.out.println("2.- De Tierra");
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
    }

    // Despedida
    public static void despedida(){
        System.out.println("Vuelva pronto a Cooperativa Ecomún!");
    }

    // default
    public static void opcionIncorrecta(){
        System.out.println("\nNo digito una opción valida");
    }

    // Opcion de producto
    public static int digiteId(){
        System.out.println("Digite el ID del producto que desea visualizar: ");
        return leer.nextInt();
    }

    // id equivocado
    public static void idInexistente(){
        System.out.println("El ID que digito no coincide con ninguno de los productos existentes.");
    }

    // imprimir datos del producto
    public static void imprimirDatos(String datos){
        System.out.println(datos);
    }

    // imprimir lista de un producto
    public static void imprimirListaProductos(ArrayList<String> lista){
        for (String pro : lista){
            System.out.println(pro);
        }
    }


}
