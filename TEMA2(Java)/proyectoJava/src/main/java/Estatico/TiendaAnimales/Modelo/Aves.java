package Estatico.TiendaAnimales.Modelo;

public abstract class Aves extends Mascota {
    protected boolean pico, vuela;
    public Aves(String nombre, int edad, String estado, String fechaNacimiento, double peso, boolean pi, boolean vu) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.pico = pi; this.vuela = vu;
    }
    public abstract void volar();
}