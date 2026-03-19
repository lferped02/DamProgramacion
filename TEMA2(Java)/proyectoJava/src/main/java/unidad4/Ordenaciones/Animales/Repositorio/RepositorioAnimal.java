package unidad4.Ordenaciones.Animales.Repositorio;

import unidad4.Ordenaciones.Animales.Modelo.Animal;

import java.util.HashSet;
import java.util.Set;

public class RepositorioAnimal {
    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private Set<Animal> animales;

    public RepositorioAnimal(String nombre, String lugar, double presupuestoAnual, Set<Animal> animales) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.animales = new HashSet<Animal>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getPresupuestoAnual() {
        return presupuestoAnual;
    }

    public void setPresupuestoAnual(double presupuestoAnual) {
        this.presupuestoAnual = presupuestoAnual;
    }

    public Set<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(Set<Animal> animales) {
        this.animales = animales;
    }

}
