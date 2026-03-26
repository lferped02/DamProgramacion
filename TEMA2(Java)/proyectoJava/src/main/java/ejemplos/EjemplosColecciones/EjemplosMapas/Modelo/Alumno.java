package ejemplos.EjemplosColecciones.EjemplosMapas.Modelo;

import java.util.Objects;

public class Alumno {
    private String dni;

    public Alumno(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + getDni() + '\'' +
                '}';
    }
}