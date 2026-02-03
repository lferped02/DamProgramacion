package OrientacionAObjetos.Notas;

public class Alumno {
    String nombre;
    String email;
    NotaAsignatura notasProgramacion;
    NotaAsignatura notasBaseDatos;

    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void imprimeSiHaAprobado(NotaAsignatura asignatura) {
        if (asignatura.calcularMedia() >= 5) {
            System.out.println("El alumno " + nombre + " ha aprobado " + asignatura.nombreAsignatura);
        } else {
            System.out.println("El alumno " + nombre + " NO ha aprobado " + asignatura.nombreAsignatura);
        }
    }
}