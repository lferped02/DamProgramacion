package Interfaces.Biblioteca.Modelo;

public abstract class Multimedia extends Recurso {
    private String nombre;
    private String genero;

    public Multimedia(String id, String ubicacion, int unidades, String nombre, String genero) {
        super(id, ubicacion, unidades);
        this.nombre = nombre;
        this.genero = genero;
    }

    @Override
    public int getDevuelveDiasPrestamo() {
        return 10;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}