package unidad4.Listas.EquiposDeportivos.Controlador;

import unidad4.Listas.EquiposDeportivos.Excepciones.DeportivosException;
import unidad4.Listas.EquiposDeportivos.Modelo.Alumno;
import unidad4.Listas.EquiposDeportivos.Modelo.Equipo;

public class GestionaEquiposDeportivos {
    public static void main(String[] args) {

        try {
            Equipo futbol = new Equipo("Futbol");
            Equipo baloncesto = new Equipo("Baloncesto");

            Alumno alumno1 = new Alumno("Lorena", "13246579A");
            Alumno alumno2 = new Alumno("Julio", "89765432B");
            Alumno alumno3 = new Alumno("Samuel", "45632178C");

            futbol.anadirAlumno(alumno1);
            futbol.anadirAlumno(alumno2);

            baloncesto.anadirAlumno(alumno2);
            baloncesto.anadirAlumno(alumno3);

            System.out.println("Equipo Futbol:");
            futbol.mostrarEquipo();

            System.out.println("\nEquipo Baloncesto:");
            baloncesto.mostrarEquipo();

            System.out.println("\nUnion de equipos:");
            Equipo union = futbol.union(baloncesto);
            union.mostrarEquipo();

            System.out.println("\nInterseccion de equipos:");
            Equipo inter = futbol.interseccion(baloncesto);
            inter.mostrarEquipo();

            System.out.println("\nBuscar alumno:");
            Alumno encontrado = futbol.buscarAlumno(alumno1);

            if (encontrado != null) {
                System.out.println("Encontrado: " + encontrado);
            } else {
                System.out.println("No encontrado");
            }
        } catch (DeportivosException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
