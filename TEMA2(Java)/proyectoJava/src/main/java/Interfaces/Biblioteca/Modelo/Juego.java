package Interfaces.Biblioteca.Modelo;

public class Juego extends Multimedia {
    private int numeroFases;

    public Juego(String id, String ubicacion, int unidades, String nombre, String genero, int fases) {
        super(id, ubicacion, unidades, nombre, genero);
        this.numeroFases = fases;
    }

    public int getNumeroFases() {
        return numeroFases;
    }

    @Override
    public String toString() {
        return "Juego: " + getNombre() + " (" + numeroFases + " fases)";
    }
}