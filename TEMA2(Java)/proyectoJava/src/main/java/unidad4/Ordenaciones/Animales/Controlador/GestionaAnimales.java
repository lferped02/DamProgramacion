package unidad4.Ordenaciones.Animales.Controlador;

import unidad4.Ordenaciones.Animales.Modelo.Animal;
import unidad4.Ordenaciones.Animales.Repositorio.RepositorioAnimal;

import java.time.LocalDate;
import java.util.*;

public class GestionaAnimales {
    public static void main(String[] args) {
        RepositorioAnimal repo = new RepositorioAnimal("Zoo Central", "Ciudad", 50000);

        repo.agregarAnimal(new Animal(1, "Leon", "Panthera leo", 5, "Carnívoro", LocalDate.of(2018, 3, 5), 190, "tierra", "vivíparo"));
        repo.agregarAnimal(new Animal(2, "Aguila", "Aquila chrysaetos", 3, "Carnívoro", LocalDate.of(2020, 6, 12), 6, "aire", "vivíparo"));
        repo.agregarAnimal(new Animal(3, "Delfin", "Delphinus delphis", 8, "Carnívoro", LocalDate.of(2015, 8, 20), 150, "agua", "vivíparo"));


        System.out.println("=== Animales Ordenados por Nombre (1.1) ===");
        repo.mostrarAnimales();

        repo.modificarNombreAnimal(3, "Ballena");
        System.out.println("\n=== Animales después de modificar nombre (1.1) ===");
        repo.mostrarAnimales();


        List<Animal> listaPorNombreYFecha = new ArrayList<>(repo.getAnimales());
        listaPorNombreYFecha.sort(Comparator.comparing(Animal::getNombre)
                .thenComparing(Animal::getFechaNacimiento));

        System.out.println("\n=== Animales Ordenados por Nombre y Fecha de Nacimiento (1.2) ===");
        for (Animal a : listaPorNombreYFecha) {
            System.out.println(a);
        }

        List<Animal> listaPorMedioYNombre = new ArrayList<>(repo.getAnimales());
        listaPorMedioYNombre.sort(Comparator.comparing(Animal::getMedio)
                .thenComparing(Animal::getNombre));

        System.out.println("\n=== Animales Ordenados por Medio y Nombre (1.3) ===");
        for (Animal a : listaPorMedioYNombre) {
            System.out.println(a);
        }
    }
}