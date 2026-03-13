package unidad4.GestionDeEstudiantes.Modelo;

import unidad4.GestionDeEstudiantes.Excepciones.EstudianteNoEncontradoException;
import java.util.ArrayList;

public class Grupo {
    private String id;
    private String descripcion;
    private String tutor;
    private String aula;
    private String[][] horario = new String[5][6];
    private ArrayList<Estudiante> estudiantes;

    public Grupo(String id, String descripcion, String tutor, String aula) {
        this.id = id;
        this.descripcion = descripcion;
        this.tutor = tutor;
        this.aula = aula;
        estudiantes = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public Estudiante buscarEstudiante(int id) throws EstudianteNoEncontradoException {
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new EstudianteNoEncontradoException("No existe un estudiante con ID: " + id);
    }

    public double calcularPromedioEstudiante(int id) throws EstudianteNoEncontradoException {
        Estudiante e = buscarEstudiante(id);
        return e.calcularPromedio();
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            e.mostrarNotas();
        }
    }

    public void mostrarInfo() {
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Tutor: " + tutor);
        System.out.println("Aula: " + aula);
        System.out.println("Numero de estudiantes: " + estudiantes.size());
    }

    public double calcularPromedioGrupo() {
        if (estudiantes.isEmpty()) return 0;
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.calcularPromedio();
        }
        return suma / estudiantes.size();
    }
}