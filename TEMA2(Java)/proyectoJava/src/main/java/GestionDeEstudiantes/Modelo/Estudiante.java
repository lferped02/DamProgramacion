package unidad4.Colecciones.Listas.GestionDeEstudiantes.Modelo;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int id;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) return 0;

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.size();
    }

    public void mostrarNotas() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Notas: " + notas);
    }
}