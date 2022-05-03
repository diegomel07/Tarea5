package Datos;

import java.util.*;
import Logica.Funciones;

public class Ejemplo {

    // Creando los objetos
    public static ArrayList<Vegetal> creandoVegetal(){
        ArrayList<Vegetal> lista_vegetal = new ArrayList<>();
        
        Vegetal ejeVegetal = new Vegetal(800, 1, "Cilantro fresco del campo", "Cilantro", Funciones.generarFecha(), "Cilantros El Buen Arbol", 100, Funciones.generarFecha(), true, false, "Vegetal", "Verde", "Frio");
        Vegetal ejeVegetal2 = new Vegetal(3000, 2, "Exquisita Papaya del Alto de Sinú", "Papaya", Funciones.generarFecha(), "Asociación de Campesione del Alto de Sinú", 4500, Funciones.generarFecha(), true, false, "Fruta", "Naranja", "Tropical");
        Vegetal ejeVegetal3 = new Vegetal(2000, 3, "Papa campesina", "Papa", Funciones.generarFecha(), "Union Campesina Viva la Papa", 500, Funciones.generarFecha(), true, true, "Tubérculo", "Café", "Frio");

        Collections.addAll(lista_vegetal, ejeVegetal, ejeVegetal2, ejeVegetal3);

        return lista_vegetal;
    }

    public static ArrayList<DeMar> creandoDemar(){
        ArrayList<DeMar> listaDeMar= new ArrayList<>();

        DeMar ejeDeMar = new DeMar(100000, 4, "Delicioso Calamar", "Calamar", Funciones.generarFecha(), "Pesquera Jaramillo", 500, Funciones.generarFecha(), true, false, " Calamar de Humboldt", 15, "Cualquier Clima", 0, "dulce y salada", 10000);
        DeMar eje2DeMar = new DeMar(20000, 5, "Delicioso Salmon", "Salmon", Funciones.generarFecha(), "San Jacinto", 500, Funciones.generarFecha(), true, false, "Salmón Salar", 6, "Calido", 8, "Salado", 100);
        DeMar eje3DeMar = new DeMar(10000, 6, "Bagre Repulsivo", "Bagre", Funciones.generarFecha(), "Pesquera Jaramillo", 500, Funciones.generarFecha(), true, false, "Bagre de canal", 12, "Tropical", 4, "Dulce", 100);

        Collections.addAll(listaDeMar, ejeDeMar, eje2DeMar,eje3DeMar);

        return listaDeMar;
    }

    public static ArrayList<DeTierra> creandoDeTierra(){
        ArrayList<DeTierra> listaDeTierra = new ArrayList<>();

        DeTierra ejeDeTierra = new DeTierra(10000, 7, "Exquisitivo lomo de la mejor calidad", "Lomo de Res", Funciones.generarFecha(), "ColBeef", 500, Funciones.generarFecha(), true, false, "Vaca", 8, "Normal", 4, "Campo", false);
        DeTierra ejeDeTierra2 = new DeTierra(5000, 8, "Exquisitas alitas de pollo", "Alas de Pollo", Funciones.generarFecha(), "Mac Pollo", 500, Funciones.generarFecha(), true, false, "Gallina", 3, "Normal", 2, "Campo", false);
        DeTierra ejeDeTierra3 = new DeTierra(100000, 9, "Chuleta de carne de ternera que mantiene el hueso de la costilla", "Tomahawk", Funciones.generarFecha(), "ColBeef", 1000, Funciones.generarFecha(), true, false, "Ternera", 6, "Normal", 4, "Campo", false);

        Collections.addAll(listaDeTierra, ejeDeTierra, ejeDeTierra2, ejeDeTierra3);

        return listaDeTierra;
    }

    public static ArrayList<Artificial> creandoArtificial(){
        ArrayList<Artificial> listaDeArtificial = new ArrayList<>();
        Artificial ejeArtificial = new Artificial(1500, 10, "Paquete de papas con sabor a pollo", "Papas Margarita Sabor a Pollo", Funciones.generarFecha(), "Frito Lay", 50, Funciones.generarFecha(), true, true, 100, "Bolsa Plastica", "Solido");
        Artificial ejeArtificial2 = new Artificial(5000, 11, "Empaque de Bombombum con sabor a cereza", "BomBomBum", Funciones.generarFecha(), "Colombina", 500, null, false, true, 20, "Bolsa Plastica", "Solido");
        Artificial ejeArtificial3 = new Artificial(3000, 12, "Gaseosa Coca-Cola sin azucar", "Coca-Cola sin azucar", Funciones.generarFecha(), "Coca-Cola Company", 1500, Funciones.generarFecha(), true, true, 1, "Botella Plastica", "Liquido");
        
        Collections.addAll(listaDeArtificial, ejeArtificial, ejeArtificial2, ejeArtificial3);
        
        return listaDeArtificial;
    }

    public static ArrayList<Personal> creandoPersonal(){
        ArrayList<Personal> listaPersonal = new ArrayList<>();

        Personal ejePersonal = new Personal(15000, 13, "Desodorante medicado super efectivo", "Desodorante", "Secret", false, 50, "Solido", "Axilas", "Caja de carton // Botella de plastico", "Blanco");
        Personal ejePersonal2 = new Personal(120000, 14, "RECORTADOR TODO EN UNO 6 EN 1", "Recortador", "Philips", false, 300, "Solido", "Cara", "Caja de carton", "Gris");
        Personal ejePersonal3 = new Personal(13000, 15, "Shampo Herbal Essences aloe y mango", "Shampoo", "HERBAL ESSENCES", false, 400, "Liquido", "Pelo", "Botella de plastico", "Verde translucido");

        Collections.addAll(listaPersonal, ejePersonal, ejePersonal2, ejePersonal3);

        return listaPersonal;
    }

    public static ArrayList<Hogar> creandoHogar(){
        ArrayList<Hogar> listaHogar = new ArrayList<>();

        Hogar ejeHogar = new Hogar(8000, 16, "El Blanqueador Clorox ofrece su poder de desinfección, cuidado y limpieza para tu hogar. ", "Blanqueador Clorox", "CLOROX", true, 1800, "Liquido", false, true, "Pisos, cocina, sala, cuartos, baño, inodoros y otros más");
        Hogar ejeHogar2 = new Hogar(9000, 17, "Limpiador de pisos Eterna madera laminados", "Limpiador de Pisos", "ETERNA", true, 500, "Liquido", true, true, "Pisos");
        Hogar ejeHogar3 = new Hogar(20000, 18, "Trapero Rozenbal Microfibra de Hilo Blanco", "Trapero", "ROZENBAL", false, 1, "Solido", true, false, "Pisos");

        Collections.addAll(listaHogar, ejeHogar, ejeHogar2, ejeHogar3);

        return listaHogar;
    }

    public static ArrayList<Ropa> creandoRopa(){
        ArrayList<Ropa> listadeRopa = new ArrayList<>();

        Ropa ejeRopa = new Ropa(180000, 19, "Jeans de tiro medio con cinco bolsillos. Efecto lavado.", "JEANS ZW", "Algodón", 34, "Zara", "Femenino");
        Ropa ejeRopa2 = new Ropa(400000, 20, "Blazer slim fit de cuello con solapas de pico.", "BLAZER CRUZADA SLIM", "Poliéster", 50, "Zara", "Masculino");
        Ropa ejeRopa3 = new Ropa(360000, 21, "Zapato de vestir. Corte en piel antic. Horma redonda.", "ZAPATO FORMAL PIEL", "Piel Vacuno", 40, "Zara", "Masculino");

        Collections.addAll(listadeRopa, ejeRopa, ejeRopa2, ejeRopa3);

        return listadeRopa;
    }

}
