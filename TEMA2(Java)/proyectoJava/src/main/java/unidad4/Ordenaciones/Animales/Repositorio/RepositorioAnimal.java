package unidad4.Ordenaciones.Animales.Repositorio;

import unidad4.Ordenaciones.Animales.Modelo.Animal;

import java.util.*;

public class RepositorioAnimal {
    private String nombre;
    private String lugar;
    private double presupuestoAnual;
    private TreeSet<Animal> animales;

    public RepositorioAnimal(String nombre, String lugar, double presupuestoAnual) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuestoAnual = presupuestoAnual;
        this.animales = new TreeSet<>();
    }

    public boolean agregarAnimal(Animal animal) {
        return animales.add(animal);
    }

    public void modificarNombreAnimal(int id, String nuevoNombre) {
        Animal encontrado = null;
        for (Animal a : animales) {
            if (a.getId() == id) {
                encontrado = a;
                break;
            }
        }
        if (encontrado != null) {
            animales.remove(encontrado);
            encontrado.setNombre(nuevoNombre);
            animales.add(encontrado);
        }
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }

    public Set<Animal> getAnimales() {
        return new TreeSet<>(animales);
    }
}