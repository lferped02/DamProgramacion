package unidad4.Colecciones.Listas.GestionDeEstudiantes.Colecciones;

import unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo.Estudiante;
import unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo.Grupo;
import unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo.Instituto;

import java.util.Scanner;

public class GestionaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instituto instituto = new Instituto();
        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("----------------------------------");
            System.out.println("1 Agregar grupo");
            System.out.println("2 Agregar estudiante");
            System.out.println("3 Mostrar estudiantes por grupo");
            System.out.println("4 Mostrar info grupo");
            System.out.println("5 Promedio estudiante");
            System.out.println("6 Promedio grupo");
            System.out.println("7 Salir");
            System.out.println("----------------------------------");

            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Identificador:");
                        String id = scanner.nextLine();

                        System.out.println("Descripcion:");
                        String desc = scanner.nextLine();

                        System.out.println("Tutor:");
                        String tutor = scanner.nextLine();

                        System.out.println("Aula:");
                        String aula = scanner.nextLine();
                        instituto.agregarGrupo(new Grupo(id, desc, tutor, aula));
                        break;

                    case 2:
                        System.out.println("Descripcion grupo:");
                        String grupo = scanner.nextLine();
                        Grupo g = instituto.buscarGrupo(grupo);

                        System.out.println("Nombre estudiante:");
                        String nombre = scanner.nextLine();

                        System.out.println("ID estudiante:");
                        int ide = scanner.nextInt();

                        Estudiante e = new Estudiante(nombre, ide);
                        g.agregarEstudiante(e);
                        break;

                    case 3:
                        System.out.println("Grupo:");
                        grupo = scanner.nextLine();
                        instituto.buscarGrupo(grupo).mostrarEstudiantes();
                        break;

                    case 4:
                        System.out.println("Grupo:");
                        grupo = scanner.nextLine();
                        instituto.buscarGrupo(grupo).mostrarInfo();
                        break;

                    case 5:
                        System.out.println("Grupo:");
                        grupo = scanner.nextLine();

                        g = instituto.buscarGrupo(grupo);
                        System.out.println("ID estudiante:");
                        ide = scanner.nextInt();

                        Estudiante est = g.buscarEstudiante(ide);
                        System.out.println("Promedio: " + est.calcularPromedio());
                        break;

                    case 6:
                        System.out.println("Grupo:");
                        grupo = scanner.nextLine();

                        g = instituto.buscarGrupo(grupo);
                        System.out.println("Promedio grupo: " + g.calcularPromedioGrupo());
                        break;

                    case 7:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion invalida");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

            }
        } while (opcion != 7);
    }
}