package unidad4.Ordenaciones.Animales.Repositorio;

import unidad4.Ordenaciones.Animales.Modelo.Animal;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RepositorioAnimal {
    private String nombre;
    private String lugar;
    private double presupuesto;
    private Set<Animal> animales;

    public RepositorioAnimal(String nombre, String lugar, double presupuesto) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.presupuesto = presupuesto;
        this.animales = new TreeSet<>();
    }

    public boolean agregarAnimal(Animal a) {
        return this.animales.add(a);
    }

    public boolean modificarAnimal(Animal a) {
        boolean modificado = false;
        Iterator<Animal> it = animales.iterator();

        while (it.hasNext() && !modificado) {
            Animal actual = it.next();

            if (actual.equals(a)) {
                actual.setNombre(a.getNombre());
                modificado = true;
            }
        }
        return modificado;
    }

    public void modificarAnimal(int id, String nuevoNombre) {
        for (Animal a : animales) {
            if (a.getId() == id) {
                a.setNombre(nuevoNombre);
                System.out.println("Animal modificado: " + nuevoNombre);
                return;
            }
        }
        System.out.println("Animal no encontrado.");
    }

    public Set<Animal> getAnimales() {
        return animales;
    }

    public void mostrarAnimales() {
        for (Animal a : animales) {
            System.out.println(a);
        }
    }
}