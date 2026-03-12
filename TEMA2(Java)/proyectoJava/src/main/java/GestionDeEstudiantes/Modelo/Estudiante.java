package unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String id;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        notas = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double promedio() {
        double suma = 0;

        for (double n : notas) {
            suma += n;
        }

        if (notas.size() == 0) {
            return 0;
        }

        return suma / notas.size();
    }

    public String toString() {
        return nombre + " (" + id + ") Notas: " + notas;
    }
}
