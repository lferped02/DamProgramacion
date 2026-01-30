package OrientacionAObjetos.Notas;

public class Alumno {
    String nombre;
    String apellidos;
    String email;
    NotaAsignatura notasProgramacion;
    NotaAsignatura notasBaseDatos;

    public Alumno(String nombre, String apellidos, String email, NotaAsignatura notasProg, NotaAsignatura notasBD) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.notasProgramacion = notasProg;
        this.notasBaseDatos = notasBD;
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
