package Excepciones.GestorRecetaCocina.Controlador;

import Excepciones.GestorRecetaCocina.Modelo.CocinaException;
import Excepciones.GestorRecetaCocina.Modelo.Receta;
import Excepciones.GestorRecetaCocina.Modelo.Recetario;

public class GestorRecetario {
    public static void main(String[] args) {
        Recetario recetario = new Recetario();

        Receta tortilla = new Receta("Tortilla");
        tortilla.agregarIngrediente("Huevos", 2);
        tortilla.agregarIngrediente("Patatas", 150);
        tortilla.agregarIngrediente("Aceite", 10);

        Receta ensalada = new Receta("Ensalada");
        ensalada.agregarIngrediente("Lechuga", 50);
        ensalada.agregarIngrediente("Tomate", 30);
        ensalada.agregarIngrediente("Aceite", 5);

        recetario.agregarReceta(tortilla);
        recetario.agregarReceta(ensalada);

        try {
            Receta receta = recetario.buscar("Tortilla");
            receta.cocinar(3);
            receta.cocinar(0);
            receta.cocinar(2000);
        } catch (CocinaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Receta receta2 = recetario.buscar("Pizza");
            receta2.cocinar(2);
        } catch (CocinaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Receta receta3 = recetario.buscar("Ensalada");
            receta3.cocinar(4);
        } catch (CocinaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
