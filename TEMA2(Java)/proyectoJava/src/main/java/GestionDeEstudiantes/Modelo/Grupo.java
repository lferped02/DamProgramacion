package unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo;

import java.util.ArrayList;

public class Grupo {
    private String id;
    private String descripcion;
    private String tutor;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(String id, String descripcion, String tutor) {
        this.id = id;
        this.descripcion = descripcion;
        this.tutor = tutor;
        estudiantes = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTutor() {
        return tutor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public double promedioGrupo() {
        double suma = 0;
        int contador = 0;

        for (Estudiante e : estudiantes) {
            for (double nota : e.getNotas()) {
                suma += nota;
                contador++;
            }
        }

        if (contador == 0) {
            return 0;
        }
        return suma / contador;
    }
}