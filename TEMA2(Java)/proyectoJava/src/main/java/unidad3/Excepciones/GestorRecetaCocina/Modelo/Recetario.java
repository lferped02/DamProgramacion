package unidad3.Excepciones.GestorRecetaCocina.Modelo;

import unidad3.Excepciones.GestorRecetaCocina.Excepcion.CocinaException;

public class Recetario {
    private Receta[] recetas;
    private int total;

    public Recetario() {
        recetas = new Receta[50];
        total = 0;
    }

    public void agregarReceta(Receta receta) {
        recetas[total] = receta;
        total++;
    }

    public Receta buscar(String nombre) throws CocinaException {
        for (int i = 0; i < total; i++) {
            if (recetas[i].getNombre().equalsIgnoreCase(nombre)) {
                return recetas[i];
            }
        }
        throw new CocinaException("La receta '" + nombre + "' no existe en el recetario");
    }
}
