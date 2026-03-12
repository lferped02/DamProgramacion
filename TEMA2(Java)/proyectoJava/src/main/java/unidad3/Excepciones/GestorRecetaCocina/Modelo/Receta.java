package unidad3.Excepciones.GestorRecetaCocina.Modelo;

import unidad3.Excepciones.GestorRecetaCocina.Excepcion.CocinaException;

public class Receta {
    private static int contador = 1;
    private int id;
    private String nombre;
    private String[] ingredientes;
    private double[] cantidades;
    private int numeroIngredientes;

    public Receta(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
        ingredientes = new String[30];
        cantidades = new double[30];
        numeroIngredientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarIngrediente(String ingrediente, double cantidad) {
        if (numeroIngredientes < ingredientes.length) {
            return false;
        } else {
            ingredientes[numeroIngredientes] = ingrediente;
            cantidades[numeroIngredientes] = cantidad;
            numeroIngredientes++;
            return true;
        }
    }

    public double[] cocinar(int comensales) throws CocinaException {
        double[] tabla = new double[30];
        if (comensales <= 0) {
            throw new CocinaException("Número de comensales incorrecto: " + comensales);
        } else if (comensales > 1000) {
            throw new CocinaException("El número de comensales es demasiado alto");
        } else {
            System.out.println("\nReceta: " + nombre + " para " + comensales + " comensales:");

            for (int i = 0; i < numeroIngredientes; i++) {
                double cantidadTotal = cantidades[i] * comensales;
                System.out.println(ingredientes[i] + " : " + cantidadTotal);
            }
        }
        return tabla;
    }
}