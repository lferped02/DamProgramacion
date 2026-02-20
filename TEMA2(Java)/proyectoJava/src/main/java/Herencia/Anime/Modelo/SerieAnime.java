package Herencia.Anime.Modelo;

import java.util.Objects;

public class SerieAnime {
    private String nombre;
    private int numeroTemporada;
    private  int numeroCapitulo;
    private String autor;

    public SerieAnime(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SerieAnime that = (SerieAnime) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(autor, that.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }

    @Override
    public String toString() {
        return "SerieAnime{" +
                "nombre='" + nombre + '\'' +
                ", numeroTemporada=" + numeroTemporada +
                ", numeroCapitulo=" + numeroCapitulo +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
