package Interfaces.Biblioteca.Modelo;

public class Audio extends Multimedia {
    private int duracionMinutos;

    public Audio(String id, String ubicacion, int unidades, String nombre, String genero, int duracion) {
        super(id, ubicacion, unidades, nombre, genero);
        this.duracionMinutos = duracion;
    }

    public int getDuracion() {
        return duracionMinutos;
    }

    @Override
    public String toString() {
        return "Audio: " + getNombre() + " (" + duracionMinutos + " min)";
    }
}
