package unidad4.Ordenaciones.Animales.Controlador;

import unidad4.Ordenaciones.Animales.Modelo.Animal;
import unidad4.Ordenaciones.Animales.Modelo.ClasificacionComida;
import unidad4.Ordenaciones.Animales.Modelo.ClasificacionGestacion;
import unidad4.Ordenaciones.Animales.Modelo.Medio;
import unidad4.Ordenaciones.Animales.Repositorio.RepositorioAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionaAnimales {
    public static void main(String[] args) {
        RepositorioAnimal repo = new RepositorioAnimal("Zoo Central", "Madrid", 100000);

        repo.agregarAnimal(new Animal(1, "León", "Felino", 5, ClasificacionComida.CANRIVOROS, LocalDate.of(2018, 5, 10), 190.5, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS));

        repo.agregarAnimal(new Animal(2, "Águila", "Ave", 3, ClasificacionComida.CANRIVOROS, LocalDate.of(2020, 3, 15), 6.2, Medio.AIRE, ClasificacionGestacion.OVIPAROS));

        repo.agregarAnimal(new Animal(3, "Vaca", "Mamífero", 6, ClasificacionComida.HERVIBOROS, LocalDate.of(2017, 8, 20), 500, Medio.TIERRA, ClasificacionGestacion.VIVIPAROS));

        System.out.println("\n--- Animales Orden Natural (nombre → id) ---");
        repo.mostrarAnimales();

        repo.modificarAnimal(2, "Águila Real");

        System.out.println("\n--- Animales Después de Modificación ---");
        repo.mostrarAnimales();

        List<Animal> lista1 = new ArrayList<>(repo.getAnimales());lista1.sort(Comparator.comparing(Animal::getNombre).thenComparing(Animal::getFechaNacimiento));

        System.out.println("\n--- Ordenados por Nombre y Fecha de Nacimiento ---");
        for (Animal a : lista1) {
            System.out.println(a);
        }

        List<Animal> lista2 = new ArrayList<>(repo.getAnimales());lista2.sort(Comparator.comparing(Animal::getMedio).thenComparing(Animal::getNombre));

        System.out.println("\n--- Ordenados por Medio y Nombre ---");
        for (Animal a : lista2) {
            System.out.println(a);
        }
    }
}
