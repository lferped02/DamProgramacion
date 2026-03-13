package unidad4.Listas.EquiposDeportivos.Modelo;

import unidad4.Listas.EquiposDeportivos.Excepciones.DeportivosException;
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
            throw new DeportivosException("El alumno ya existe en este equipo.");
        }
        alumnos.add(a);
    }

    public void borrarAlumno(Alumno a) throws DeportivosException {
        if (!alumnos.contains(a)) {
            throw new DeportivosException("El alumno no existe en este equipo.");
        }
        alumnos.remove(a);
    }

    public Alumno buscarAlumno(Alumno a) {
        int i = 0;
        while (i < alumnos.size()) {
            if (alumnos.get(i).equals(a)) {
                return alumnos.get(i);
            }
            i++;
        }
        return null;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        int i = 0;
        while (i < alumnos.size()) {
            System.out.println(alumnos.get(i));
            i++;
        }
    }

    public Equipo union(Equipo e) {
        Equipo equipo = new Equipo(this.nombre + " + " + e.nombre);
        int i = 0;
        while (i < this.alumnos.size()) {
            equipo.alumnos.add(this.alumnos.get(i));
            i++;
        }
        i = 0;

        while (i < e.alumnos.size()) {
            if (!equipo.alumnos.contains(e.alumnos.get(i))) {
                equipo.alumnos.add(e.alumnos.get(i));
            }
            i++;
        }
        return equipo;
    }

    public Equipo interseccion(Equipo e) {
        Equipo equipo = new Equipo("Interseccion");
        int i = 0;
        while (i < this.alumnos.size()) {
            if (e.alumnos.contains(this.alumnos.get(i))) {
                equipo.alumnos.add(this.alumnos.get(i));
            }
            i++;
        }
        return equipo;
    }
}