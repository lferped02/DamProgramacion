package unidad3.Excepciones.GestorRecetaCocina.Modelo;

import unidad3.Excepciones.GestorRecetaCocina.Excepcion.CocinaException;

public class Recetario {
    private Receta[] recetas;
    private int numeroRecetas;

    public Recetario() {
        this.recetas = new Receta[50];
        this.numeroRecetas = 0;
    }

    public boolean agregarReceta(Receta receta) {
        if (numeroRecetas >= recetas.length) {
            return false;
        } else {
            recetas[numeroRecetas] = receta;
            numeroRecetas++;
            return true;
        }
    }

    public Receta buscar(String nombre) throws CocinaException {
        boolean encontrado = false;
        int i = 0;
        Receta receta = null;

        while (!encontrado && i < numeroRecetas) {
            if (recetas[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                receta = recetas[i];
            } else {
                i++;
            }
        }
        if (!encontrado) {
            throw new CocinaException("\nLa receta " + nombre + " no existe en el recetario.");
        }
        return receta;
    }
}