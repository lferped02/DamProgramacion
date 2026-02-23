package Estatico.TiendaAnimales.Modelo;

public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNaciemiento, double peso, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNaciemiento, peso, true, true);
        this.origen = origen;
        this.habla = habla;
    }
    @Override public void muestra() {
        System.out.println(this + " Origen: " + origen + " Habla: " + habla);
    }

    @Override public boolean habla() {
        return true;
    }

    @Override public void volar() {
        System.out.println(nombre + " está volando.");
    }
}