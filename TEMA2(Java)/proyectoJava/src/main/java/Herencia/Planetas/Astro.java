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

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
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
        if (o == null || getClass() != o.getClass()) return false;
        Astro astro = (Astro) o;
        return Double.compare(masa, astro.masa) == 0 && Double.compare(distanciaMedia, astro.distanciaMedia) == 0 && Objects.equals(nombre, astro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, masa, distanciaMedia);
    }

    public abstract void muestra();
}