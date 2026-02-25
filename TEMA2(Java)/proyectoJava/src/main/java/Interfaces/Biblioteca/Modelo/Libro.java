package Interfaces.Biblioteca.Modelo;

public class Libro extends Recurso {
    private String autor;
    private String editorial;
    private String generoLiterario;

    public Libro(String id, String ubicacion, int unidades, String autor, String editorial, String genero) {
        super(id, ubicacion, unidades);
        this.autor = autor;
        this.editorial = editorial;
        this.generoLiterario = genero;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 21;
    }

    @Override
    public String toString() {
        return "Libro: " + autor + " - " + generoLiterario;
    }
}
