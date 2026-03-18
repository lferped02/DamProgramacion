package unidad4.Listas.Biblioteca.Modelo;

import unidad4.Listas.Biblioteca.Excepciones.BibliotecaException;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anio;
    private Estado estado;

    public Libro(String titulo, String autor, String genero, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.estado = Estado.LIBRE;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Estado getEstado() {
        return estado;
    }

    public void prestar() throws BibliotecaException {
        if (estado == Estado.PRESTADO) {
            throw new BibliotecaException("El libro ya está prestado.");
        }
        estado = Estado.PRESTADO;
    }

    public void devolver() throws BibliotecaException {
        if (estado == Estado.LIBRE) {
            throw new BibliotecaException("El libro ya está disponible.");
        }
        estado = Estado.LIBRE;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Género: " + genero);
        System.out.println("Año: " + anio);
        System.out.println("Estado: " + estado);
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + estado + ")";
    }
}