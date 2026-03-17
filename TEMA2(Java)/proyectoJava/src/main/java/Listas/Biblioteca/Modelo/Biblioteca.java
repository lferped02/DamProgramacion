package unidad4.Listas.Biblioteca.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Libro> inventario = new ArrayList<Libro>();

    public Biblioteca (List<Libro> inventario){
        this.inventario = inventario;
    }

    public List<Libro> getInventario() {
        return inventario;
    }

    public void setInventario(List<Libro> inventario) {
        this.inventario = inventario;
    }

    public void agregarNuevoLibro (Libro libro){
        System.out.println("Agregando nuevo libro en el inventario.");
        if (!inventario.contains(libro)){
            inventario.add(libro);
            System.out.println("Este libro está agregado correctamente.");
        } else {
            System.out.println("El libro está registrado en el inventario.");
        }
    }

    public void prestarEjemplar (Libro libro){
        if(libro.getEstadoLibro() == Estado.LIBRE){
            System.out.println("Este libro está siendo prestado.");
        } else {
            System.out.println("EL libro está prestado.");
        }
    }

    public void devolverEjemplar (Libro libro){
        if (libro.getEstadoLibro() == Estado.LIBRE){
            System.out.println("Este libro esta siendo devuelto.");
        }
    }
    public void mostrarInventario(){
        for (Libro libro: inventario){
            System.out.println(libro);
        }
    }
}
