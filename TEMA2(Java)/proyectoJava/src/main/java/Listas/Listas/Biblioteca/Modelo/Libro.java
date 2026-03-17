package unidad4.Listas.Biblioteca.Modelo;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private LocalDate anioPublicacion;
    private Estado estadoLibro;

    public Libro(String titulo, String autor, String genero, LocalDate anioPublicacion, Estado estadoLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
    }
}
