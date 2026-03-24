package unidad4.Listas.GestionDeEstudiantes.Controlador;

import unidad4.Listas.EquiposDeportivos.Modelo.Alumno;
import unidad4.Listas.GestionDeEstudiantes.Modelo.Estudiante;
import unidad4.Listas.GestionDeEstudiantes.Modelo.Grupo;
import unidad4.Listas.GestionDeEstudiantes.Modelo.Instituto;

import java.util.*;

public class GestionaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instituto instituto = new Instituto();
        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("--------------------------------");
            System.out.println("1 Agregar grupo");
            System.out.println("2 Agregar estudiante");
            System.out.println("3 Mostrar estudiantes por grupo");
            System.out.println("4 Mostrar info grupo");
            System.out.println("5 Promedio estudiante");
            System.out.println("6 Promedio grupo");
            System.out.println("7 Salir");
            System.out.println("--------------------------------");
            System.out.print("Introduce opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcion) {

                    case 1:
                        System.out.print("ID grupo: ");
                        String id = scanner.nextLine();

                        System.out.print("Descripcion: ");
                        String desc = scanner.nextLine();

                        System.out.print("Tutor: ");
                        String tutor = scanner.nextLine();

                        System.out.print("Aula: ");
                        String aula = scanner.nextLine();

                        instituto.agregarGrupo(new Grupo(id, desc, tutor, aula));
                        System.out.println("Grupo agregado correctamente");
                        break;

                    case 2:
                        System.out.print("ID del grupo: ");
                        String grupoId = scanner.nextLine();
                        Grupo g = instituto.buscarGrupo(grupoId);

                        if (g == null) {
                            System.out.println("Grupo no encontrado");
                            break;
                        }

                        System.out.print("Nombre estudiante: ");
                        String nombre = scanner.nextLine();

                        System.out.print("ID estudiante: ");
                        int ide = scanner.nextInt();

                        Estudiante e = new Estudiante(nombre, ide);

                        System.out.print("¿Cuántas notas quieres introducir?: ");
                        int n = scanner.nextInt();

                        for (int i = 0; i < n; i++) {
                            System.out.print("Introduce nota: ");
                            double nota = scanner.nextDouble();
                            e.agregarNota(nota);
                        }

                        g.agregarEstudiante(e);
                        System.out.println("Estudiante agregado correctamente");
                        scanner.nextLine();
                        break;

                    case 3:
                        System.out.print("Introduce ID del grupo: ");
                        grupoId = scanner.nextLine();

                        g = instituto.buscarGrupo(grupoId);
                        if (g != null) {
                            g.mostrarEstudiantes();
                        } else {
                            System.out.println("Grupo no encontrado");
                        }
                        break;

                    case 4:
                        System.out.print("Introduce ID del grupo: ");
                        grupoId = scanner.nextLine();

                        g = instituto.buscarGrupo(grupoId);
                        if (g != null) {
                            g.mostrarInfo();
                        } else {
                            System.out.println("Grupo no encontrado");
                        }
                        break;

                    case 5:
                        System.out.print("Introduce ID del grupo: ");
                        grupoId = scanner.nextLine();

                        g = instituto.buscarGrupo(grupoId);
                        if (g == null) {
                            System.out.println("Grupo no encontrado");
                            break;
                        }

                        System.out.print("Introduce ID estudiante: ");
                        ide = scanner.nextInt();

                        Estudiante est = g.buscarEstudiante(ide);
                        if (est != null) {
                            System.out.println("Promedio: " + est.calcularPromedio());
                        } else {
                            System.out.println("Estudiante no encontrado");
                        }

                        scanner.nextLine();
                        break;

                    case 6:
                        System.out.print("Introduce ID del grupo: ");
                        grupoId = scanner.nextLine();

                        g = instituto.buscarGrupo(grupoId);
                        if (g != null) {
                            System.out.println("Promedio grupo: " + g.calcularPromedioGrupo());
                        } else {
                            System.out.println("Grupo no encontrado");
                        }
                        break;

                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opcion invalida, intenta de nuevo");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }

        } while (opcion != 7);

        scanner.close();
    }
}