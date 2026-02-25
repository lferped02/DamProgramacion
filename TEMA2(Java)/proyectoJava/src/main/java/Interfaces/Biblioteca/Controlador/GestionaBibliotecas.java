package Interfaces.Biblioteca.Controlador;

import Interfaces.Biblioteca.Modelo.*;

public class GestionaBibliotecas {
    private Recurso[] recursos = new Recurso[20];
    private int contador = 0;

    public void agregarRecurso(Recurso r) {
        if (contador < recursos.length) {
            recursos[contador++] = r;
        }
    }

    public void mostrarDisponibles() {
        for (Recurso r : recursos) {
            if (r != null && r.estaDisponible()) {
                System.out.println(r +
                        " | Días préstamo: " + r.getDevuelveDiasPrestamo());
            }
        }
    }

    public static void main(String[] args) {
        GestionaBibliotecas biblioteca = new GestionaBibliotecas();
        Libro libro1 = new Libro("Libro", "Estante A", 3, "Gabriel García Márquez", "Sudamericana", "Novela");
        Pelicula peli1 = new Pelicula("Pelicula", "Zona Multimedia", 2, "Inception", "Ciencia ficción", 148);

        Audio audio1 = new Audio("Audio", "Zona Multimedia", 4, "Thriller", "Pop", 42);

        Juego juego1 = new Juego("Juego", "Zona Juegos", 5, "Zelda", "Aventura", 12);

        biblioteca.agregarRecurso(libro1);
        biblioteca.agregarRecurso(peli1);
        biblioteca.agregarRecurso(audio1);
        biblioteca.agregarRecurso(juego1);

        biblioteca.mostrarDisponibles();
    }
}
