package OrientacionAObjetos.Notas;

public class GestionaNotasAlumnos {
    public static void main(String[] args) {
        // Lucía.
        Alumno lucia = new Alumno("Lucía", "García", "lucia@email.com",
                new NotaAsignatura("Programación", 5, 7, 7),
                new NotaAsignatura("Bases de Datos", 6, 6, 7));
        // Andrés.
        Alumno andres = new Alumno("Andrés", "López", "andres@email.com",
                new NotaAsignatura("Programación", 4, 4, 6),
                new NotaAsignatura("Bases de Datos", 9, 8, 8));
        // Vicente.
        Alumno vicente = new Alumno("Vicente", "Sánchez", "vicente@email.com",
                new NotaAsignatura("Programación", 2, 2, 3),
                new NotaAsignatura("Bases de Datos", 6, 6, 7));

        // Nota media de Vicente.
        System.out.println("Nota media de Vicente en Programación: " + String.format("%.2f", vicente.notasProgramacion.calcularMedia()));
        System.out.println("Nota media de Vicente en Bases de Datos: " + String.format("%.2f", vicente.notasBaseDatos.calcularMedia()));

        System.out.println("--- Resultados finales ---");

        // Notas de Vicente.
        vicente.imprimeSiHaAprobado(vicente.notasProgramacion);
        vicente.imprimeSiHaAprobado(vicente.notasBaseDatos);
        // Notas de Lucía.
        lucia.imprimeSiHaAprobado(lucia.notasProgramacion);
        lucia.imprimeSiHaAprobado(lucia.notasBaseDatos);
    }
}
