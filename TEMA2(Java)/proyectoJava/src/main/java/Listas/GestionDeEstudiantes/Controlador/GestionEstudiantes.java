package unidad4.Listas.GestionDeEstudiantes.Controlador;

import unidad4.Listas.GestionDeEstudiantes.Modelo.Estudiante;
import unidad4.Listas.GestionDeEstudiantes.Modelo.Grupo;
import unidad4.Listas.GestionDeEstudiantes.Modelo.Instituto;

import java.util.Scanner;

public class GestionEstudiantes {
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
                        System.out.print("Descripcion del grupo: ");
                        String grupo = scanner.nextLine();
                        Grupo g = instituto.buscarGrupo(grupo);

                        System.out.print("Nombre estudiante: ");
                        String nombre = scanner.nextLine();

                        System.out.print("ID estudiante: ");
                        int ide = scanner.nextInt();
                        Estudiante e = new Estudiante(nombre, ide);

                        System.out.print("Cuantas notas quieres introducir?: ");
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
                        System.out.print("Introduce grupo: ");
                        grupo = scanner.nextLine();
                        instituto.buscarGrupo(grupo).mostrarEstudiantes();
                        break;

                    case 4:
                        System.out.print("Introduce grupo: ");
                        grupo = scanner.nextLine();
                        instituto.buscarGrupo(grupo).mostrarInfo();
                        break;

                    case 5:
                        System.out.print("Introduce grupo: ");
                        grupo = scanner.nextLine();
                        g = instituto.buscarGrupo(grupo);
                        System.out.print("Introduce ID estudiante: ");
                        ide = scanner.nextInt();
                        System.out.println("Promedio: " + g.buscarEstudiante(ide).calcularPromedio());
                        scanner.nextLine();
                        break;

                    case 6:
                        System.out.print("Introduce grupo: ");
                        grupo = scanner.nextLine();

                        System.out.println("Promedio grupo: " + instituto.buscarGrupo(grupo).calcularPromedioGrupo());
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