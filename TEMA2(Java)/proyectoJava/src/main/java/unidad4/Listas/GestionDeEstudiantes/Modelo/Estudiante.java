package unidad4.Listas.GestionDeEstudiantes.Modelo;

import org.jetbrains.annotations.NotNull;
import unidad4.Listas.Biblioteca.Modelo.Estado;

import java.util.ArrayList;

public class Estudiante implements Comparable{
    private String nombre;
    private int id;
    private ArrayList<Double> notas;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.notas = new ArrayList<>();//Cuidado con esto IMPORTANTE, que hay que iniciarlo..
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
        System.out.println("Estudiante: " + nombre + " ID: " + id);
        System.out.println("Notas: " + notas);
    }

    @Override
    public int compareTo( Object o) {
        Estudiante estudiante1 = (Estudiante) o;
        int resultado = 0;
        resultado = this.id - estudiante1.id;
        return resultado;
    }
}