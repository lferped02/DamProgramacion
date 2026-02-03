package OrientacionAObjetos.Notas;

public class GestionaNotasAlumnos {
    public static void main(String[] args) {
        Alumno lucia = new Alumno("Lucía", "lucia@email.com");
        Alumno andres = new Alumno("Andrés", "andres@email.com");
        Alumno vicente = new Alumno("Vicente", "vicente@email.com");

        lucia.notasProgramacion = new NotaAsignatura("Programación", 5, 7, 7);
        lucia.notasBaseDatos = new NotaAsignatura("Bases de Datos", 6, 6, 7);
        andres.notasProgramacion = new NotaAsignatura("Programación", 4, 4, 6);
        andres.notasBaseDatos = new NotaAsignatura("Bases de Datos", 9, 8, 8);
        vicente.notasProgramacion = new NotaAsignatura("Programación", 2, 2, 3);
        vicente.notasBaseDatos = new NotaAsignatura("Bases de Datos", 6, 6, 7);

        System.out.println("Nota media de Vicente en Programación: " + String.format("%.2f", vicente.notasProgramacion.calcularMedia()));
        System.out.println("Nota media de Vicente en Bases de Datos: " + String.format("%.2f", vicente.notasBaseDatos.calcularMedia()));

        System.out.println("--- Resultados finales ---");

        vicente.imprimeSiHaAprobado(vicente.notasProgramacion);
        vicente.imprimeSiHaAprobado(vicente.notasBaseDatos);
        lucia.imprimeSiHaAprobado(lucia.notasProgramacion);
        lucia.imprimeSiHaAprobado(lucia.notasBaseDatos);
    }
}
