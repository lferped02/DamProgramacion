package unidad4.Colecciones.Listas.GestionDeEstudiantes.Colecciones;

import unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo.Estudiante;
import unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo.Grupo;
import unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo.Instituto;
import java.util.Scanner;

public class GestionaEstudiantes { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instituto instituto = new Instituto();
        int opcion = 0;

        do {
            System.out.println("\nMENU");
            System.out.println("---------------------------------");
            System.out.println("1. Agregar grupo");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Mostrar estudiantes por grupo");
            System.out.println("4. Mostrar informacion de grupo");
            System.out.println("5. Promedio de estudiante");
            System.out.println("6. Promedio de grupo");
            System.out.println("7. Salir");
            System.out.println("---------------------------------");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {

                    case 1:
                        System.out.println("ID grupo:");
                        String id = scanner.nextLine();

                        System.out.println("Descripcion:");
                        String desc = scanner.nextLine();

                        System.out.println("Tutor:");
                        String tutor = scanner.nextLine();

                        Grupo g = new Grupo(id, desc, tutor);
                        instituto.agregarGrupo(g);
                        break;

                        case 2:
                            System.out.println("Descripcion grupo:");
                            Grupo grupo = instituto.buscarGrupo(scanner.nextLine());

                            if (grupo == null) {
                                System.out.println("Grupo no encontrado");
                                break;
                            }

                            System.out.println("Nombre estudiante:");
                            String nombre = scanner.nextLine();

                            System.out.println("ID estudiante:");
                            String ide = scanner.nextLine();

                            Estudiante e = new Estudiante(nombre, ide);

                            System.out.println("Cuantas notas?");
                            int n = Integer.parseInt(scanner.nextLine());

                            for (int i = 0; i < n; i++) {
                                System.out.println("Nota:");
                                double nota = Double.parseDouble(scanner.nextLine());
                                e.agregarNota(nota);
                            }
                            grupo.agregarEstudiante(e);
                            break;

                        case 3:
                            for (Grupo gr : instituto.getGrupos()) {
                                System.out.println("Grupo: " + gr.getDescripcion());

                                for (Estudiante es : gr.getEstudiantes()) {
                                    System.out.println(es);
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Descripcion grupo:");
                            Grupo gr = instituto.buscarGrupo(scanner.nextLine());

                            if (gr == null) {
                                System.out.println("Grupo no encontrado");
                            } else {
                                System.out.println("Tutor: " + gr.getTutor());
                                System.out.println("Numero estudiantes: " + gr.getEstudiantes().size());
                            }
                            break;

                        case 5:
                            System.out.println("ID estudiante:");
                            Estudiante es = instituto.buscarEstudiante(scanner.nextLine());

                            if (es == null) {
                                System.out.println("Estudiante no encontrado");
                            } else {
                                System.out.println("Promedio: " + es.promedio());
                            }
                            break;

                        case 6:
                            System.out.println("Descripcion grupo:");
                            Grupo grupoProm = instituto.buscarGrupo(scanner.nextLine());

                            if (grupoProm == null) {
                                System.out.println("Grupo no encontrado");
                            } else {
                                System.out.println("Promedio grupo: " + grupoProm.promedioGrupo());
                            }
                            break;

                        case 7:
                            System.out.println("Saliendo...");
                            break;

                        default:
                            System.out.println("Opcion invalida");
                    }
                } catch (Exception e) {
                    System.out.println("Error en la entrada de datos");
                }
            } while (opcion != 7);
        }
    }