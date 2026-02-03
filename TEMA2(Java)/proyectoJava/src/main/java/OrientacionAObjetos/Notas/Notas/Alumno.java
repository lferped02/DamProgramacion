package OrientacionAObjetos.Notas;

public class Alumno {
    String nombre;
    String apellidos;
    String email;
    NotaAsignatura notasProgramacion;
    NotaAsignatura notasBaseDatos;

    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    public void imprimeSiHaAprobado(NotaAsignatura asignatura) {
        if (asignatura.calcularMedia() >= 5) {
            System.out.println("El alumno " + nombre + " ha aprobado la asignatura " + asignatura.nombreAsignatura);
        } else {
            System.out.println("El alumno " + nombre + " NO ha aprobado la asignatura " + asignatura.nombreAsignatura);
        }
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellidos + " (" + email + ") > " + notasProgramacion + " > " + notasBaseDatos;
    }
}
