package Interfaces.Biblioteca.Modelo;

public class Pelicula extends Multimedia {
    private int duracionMinutos;

    public Pelicula(String id, String ubicacion, int unidades, String nombre, String genero, int duracion) {
        super(id, ubicacion, unidades, nombre, genero);
        this.duracionMinutos = duracion;
    }

    public int getDuracion() {
        return duracionMinutos;
    }

    @Override
    public String toString() {
        return "Película: " + getNombre() + " (" + duracionMinutos + " min)";
    }
}
