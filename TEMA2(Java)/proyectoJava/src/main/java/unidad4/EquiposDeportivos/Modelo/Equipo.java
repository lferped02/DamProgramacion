package unidad4.EquiposDeportivos.Modelo;

import unidad4.EquiposDeportivos.Excepciones.DeportivosException;
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public void anadirAlumno(Alumno a) throws DeportivosException {
        if (alumnos.contains(a)) {
            throw new DeportivosException("El alumno ya existe en este el equipo.");
        }
        alumnos.add(a);
    }

    public void borrarAlumno(Alumno a) throws DeportivosException {
        if (!alumnos.contains(a)) {
            throw new DeportivosException("El alumno no existe en este el equipo.");
        }
        alumnos.remove(a);
    }

    public Alumno buscarAlumno(Alumno a) {
        for (Alumno alumno : alumnos) {
            if (alumno.equals(a)) {
                return alumno;
            }
        }
        return null;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }

    public Equipo union(Equipo e) {
        Equipo equipo = new Equipo(this.nombre + " + " + e.nombre);
        for (Alumno a : this.alumnos) {
            equipo.alumnos.add(a);
        }

        for (Alumno a : e.alumnos) {
            if (!equipo.alumnos.contains(a)) {
                equipo.alumnos.add(a);
            }
        }
        return equipo;
    }

    public Equipo interseccion(Equipo e) {
        Equipo equpo = new Equipo("Interseccion");
        for (Alumno a : this.alumnos) {
            if (e.alumnos.contains(a)) {
                equpo.alumnos.add(a);
            }
        }
        return equpo;
    }
}