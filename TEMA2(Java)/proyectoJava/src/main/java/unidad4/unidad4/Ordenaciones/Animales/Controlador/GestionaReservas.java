package unidad4.Ordenaciones.Animales.Controlador;

import unidad4.Ordenaciones.Animales.Modelo.Animal;
import unidad4.Ordenaciones.Animales.Repositorio.RepositorioAnimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestionaReservas {
    public static void main(String[] args) {
        RepositorioAnimal repositorio = new RepositorioAnimal("Zoo", "Madrid", 10000);
        repositorio.agregarAnimal(new Animal(1, "León", "Felino", 5, null, LocalDate.of(2018,5,10), 200, null, null));
        repositorio.agregarAnimal(new Animal(2, "Águila", "Ave", 3, null, LocalDate.of(2020,3,15), 6, null, null));
        repositorio.agregarAnimal(new Animal(3, "Vaca", "Mamífero", 6, null, LocalDate.of(2017, 8, 20), 180, null, null));

        List<Animal> lista = new ArrayList<>(repositorio.getAnimales());

        lista.sort(Comparator.comparing(Animal::getNombre).thenComparing(Animal::getFechaNacimiento));

        System.out.println("--- LISTADO ORDENADO POR NOMBRE Y FECHA. ---");
        for (Animal a : lista) {
            System.out.println(a);
        }
    }
}