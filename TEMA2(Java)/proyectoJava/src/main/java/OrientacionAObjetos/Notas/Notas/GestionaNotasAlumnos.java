package OrientacionAObjetos.Notas;

public class GestionaNotasAlumnos {
    public static void main(String[] args) {
        // Lucía.
        Alumno lucia = new Alumno("Lucía", "lucia@email.com"
        );
        // Andrés.
        Alumno andres = new Alumno("Andrés", "andres@email.com"
        );
        // Vicente.
        Alumno vicente = new Alumno("Vicente", "vicente@email.com"
        );

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
