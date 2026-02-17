package Herencia.Planetas;

import java.util.Objects;

public abstract class Astro {
    protected String nombre;
    protected double masa;
    protected double diametroMedio;
    protected double periodoRotacion;
    protected double periodoTraslacion;
    protected double distanciaMedia;

    public Astro(String nombre, double masa, double diametroMedio, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Astro{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", diametroMedio=" + diametroMedio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Astro)) return false;
        Astro astro = (Astro) o;
        return Double.compare(astro.masa, masa) == 0 &&
                Double.compare(astro.distanciaMedia, distanciaMedia) == 0 &&
                Objects.equals(nombre, astro.nombre);
    }

    public abstract void muestra();
}