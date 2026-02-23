package Estatico.TiendaAnimales.Controlador;

import Estatico.TiendaAnimales.Modelo.*;

public class MainTienda {
    public static void main(String[] args) {
        GestionaTiendaDeAnimales miTienda = new GestionaTiendaDeAnimales();

        Perro perro = new Perro("Bobby", 5, "Sano", "12/05/2021", 8.5, "Pequinés", true);

        Loro loro = new Loro("Arturito", 2, "Activo", "01/01/2024", 1.2, "Marruecos", true);

        Serpiente serpiente = new Serpiente("Kaa", 3, "Mudando", "10/10/2022", 15.0, 2, 4);

        miTienda.insertarMascota(perro);
        miTienda.insertarMascota(loro);
        miTienda.insertarMascota(serpiente);

        System.out.println("LISTADO BÁSICO DE ANIMALES.");
        miTienda.mostrarLista();

        System.out.println("BUSCANDO POR PARÁMETROS (Nombre, Peso, Especie).");
        miTienda.obtenerInfo("Arturito", 1.2, "Loro");

        System.out.println("ANIMAL CON MÁS PESO GLOBAL.");
        Mascota elMasGordo = miTienda.masPesadoGlobal();
        if (elMasGordo != null) {
            System.out.println("El animal más pesado es " + elMasGordo.getNombre() + " con " + elMasGordo.getPeso() + "kg.");
        }

        System.out.println("ELIMINANDO A BOBBY (Sobrecarga).");
        miTienda.eliminar("Bobby", "Perro", 8.5);

        System.out.println("DATOS COMPLETOS DE LA TIENDA.");
        miTienda.mostrarTodo();
    }
}
