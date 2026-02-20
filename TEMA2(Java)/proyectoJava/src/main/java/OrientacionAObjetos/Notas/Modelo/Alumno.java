package OrientacionAObjetos.Notas.Modelo;

public class Alumno {
    String nombre;
    String email;
    public NotaAsignatura notasProgramacion;
    public NotaAsignatura notasBaseDatos;

    public Alumno(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", notasProgramacion=" + notasProgramacion +
                ", notasBaseDatos=" + notasBaseDatos +
                '}';
    }

    public void imprimeSiHaAprobado(NombreAsignatura n) {
        NotaAsignatura nota = null;
        if (this.notasProgramacion.nombreAsignatura.equals(n)) {
            nota = this.notasProgramacion;
        } else {
            nota = this.notasBaseDatos;
        }
        if (nota.calcularMedia() >= 5) {
            System.out.println("El alumno " + nombre + " ha aprobado " + nota.nombreAsignatura);
        } else {
            System.out.println("El alumno " + nombre + " NO ha aprobado " + nota.nombreAsignatura);
        }

    }
}
