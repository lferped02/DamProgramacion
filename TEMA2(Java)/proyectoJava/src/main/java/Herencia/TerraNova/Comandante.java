package Herencia.TerraNova;

public class Comandante {
    private String dni;
    private String nombre;
    private Rango rango;

    public Comandante(String dni, String nombre, Rango rango) {
        this.dni = dni;
        this.nombre = nombre;
        this.rango = rango;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comandante)) return false;
        Comandante c = (Comandante) o;
        return this.dni.equals(c.dni);
    }

    @Override
    public String toString() {
        return nombre + " (" + rango + ")";
    }
}

