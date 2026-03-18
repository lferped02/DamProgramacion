package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private int ejemplaresDisponibles;
    private int ejemplaresPrestados;

    public Libro(String titulo, String autor, String genero, int anio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.ejemplaresDisponibles = cantidad;
        this.ejemplaresPrestados = 0;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    public void prestar() throws BibliotecaException {
        if (ejemplaresDisponibles <= 0) {
            throw new BibliotecaException("No hay ejemplares disponibles para prestar.");
        }
        ejemplaresDisponibles--;
        ejemplaresPrestados++;
    }

    public void devolver() throws BibliotecaException {
        if (ejemplaresPrestados <= 0) {
            throw new BibliotecaException("No hay ejemplares prestados para devolver.");
        }
        ejemplaresDisponibles++;
        ejemplaresPrestados--;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + anio);
        System.out.println("Disponibles: " + ejemplaresDisponibles);
        System.out.println("Prestados: " + ejemplaresPrestados);
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}
