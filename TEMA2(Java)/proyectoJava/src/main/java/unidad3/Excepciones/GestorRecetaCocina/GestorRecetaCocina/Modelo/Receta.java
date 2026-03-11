package unidad3.Excepciones.GestorRecetaCocina.Modelo;

import unidad3.Excepciones.GestorRecetaCocina.Excepcion.CocinaException;

public class Receta {
    private static int contador = 1;
    private int id;
    private String nombre;
    private String[] ingredientes;
    private double[] cantidades;
    private int numIngredientes;

    public Receta(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
        ingredientes = new String[30];
        cantidades = new double[30];
        numIngredientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarIngrediente(String ingrediente, double cantidad) {
        if (numIngredientes < 30) {
            ingredientes[numIngredientes] = ingrediente;
            cantidades[numIngredientes] = cantidad;
            numIngredientes++;
        }
    }

    public void cocinar(int comensales) throws CocinaException {
        if (comensales <= 0) {
            System.out.println("Número de comensales incorrecto: " + comensales);
            return;
        }
        if (comensales > 1000) {
            throw new CocinaException("El número de comensales es demasiado alto");
        }
        System.out.println("\nReceta: " + nombre);
        System.out.println("Para " + comensales + " comensales:");

        for (int i = 0; i < numIngredientes; i++) {
            double cantidadTotal = cantidades[i] * comensales;
            System.out.println(ingredientes[i] + " : " + cantidadTotal);
        }
    }
}