package unidad4.Listas.Biblioteca.Modelo;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anioPublicacion;
    private Estado estadoLibro;

    public Libro(String titulo, String autor, String genero, int anioPublicacion, Estado estadoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.estadoLibro = estadoLibro.LIBRE;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Estado getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(Estado estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", anioPublicacion=" + getAnioPublicacion() +
                ", estadoLibro=" + getEstadoLibro() +
                '}';
    }
}