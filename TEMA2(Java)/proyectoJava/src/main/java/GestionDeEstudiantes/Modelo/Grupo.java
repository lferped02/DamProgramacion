package unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo;

import unidad4.Colecciones.Listas.GestionDeEstudiantes.Excepciones.EstudianteNoEncontradoException;

import java.util.ArrayList;

public class Grupo {
    private String identificador;
    private String descripcion;
    private String tutor;
    private String aula;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(String identificador, String descripcion, String tutor, String aula) {
        this.identificador = identificador;
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

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            e.mostrarNotas();
        }

    }

    public int numeroEstudiantes() {
        return estudiantes.size();
    }

    public Estudiante buscarEstudiante(int id) throws EstudianteNoEncontradoException {
        for (Estudiante e : estudiantes) {
            if (e.getId() == id) {
                return e;
            }
        }

        throw new EstudianteNoEncontradoException("Estudiante no encontrado");

    }

    public double calcularPromedioGrupo() {
        if (estudiantes.isEmpty()) return 0;

        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.calcularPromedio();
        }
        return suma / estudiantes.size();

    }

    public void mostrarInfo() {
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Tutor: " + tutor);
        System.out.println("Numero estudiantes: " + estudiantes.size());

    }
}