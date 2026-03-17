package ejemplos.EjemplosColecciones.EjemplosSort.Controlador;

import unidad4.Listas.EquiposDeportivos.Modelo.Alumno;
import unidad4.Listas.GestionDeEstudiantes.Modelo.Estudiante;

import java.util.*;

public class GestionaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // LISTA DE ESTUDIANTES PARA ORDENAR
        //List<Estudiante> estudiantes = new ArrayList<>();

        Set<Estudiante> estudiantes = new LinkedHashSet<>();
        estudiantes.add(new Estudiante("Ana", 1));
        estudiantes.add(new Estudiante("Luis", 2));
        estudiantes.add(new Estudiante("Carlos", 3));

        // ORDENAR
        //Collections.sort(estudiantes);

        System.out.println("\n=== Estudiantes ordenados ===");
        for (Estudiante est : estudiantes) {
            System.out.println(est);
        }

        // COLECCIÓN DE ALUMNOS
        List<Alumno> pruebaColeccion = new ArrayList<>();

        pruebaColeccion.add(new Alumno("Natalia", "123456789A"));
        pruebaColeccion.add(new Alumno("Kevin", "987654321B"));
        pruebaColeccion.add(new Alumno("Rocío", "234567890C"));
        pruebaColeccion.add(new Alumno("Manuel", "098765432D"));

        System.out.println("\n=== Colección de alumnos ===");
        for (Alumno a : pruebaColeccion) {
            System.out.println(a);
        }
    }
}
