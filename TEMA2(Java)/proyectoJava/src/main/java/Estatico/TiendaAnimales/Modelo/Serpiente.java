package Estatico.TiendaAnimales.Modelo;

public class Serpiente extends Mascota {
    private int numeroMudadoPiel;
    private int mesesGestacion;

    public Serpiente(String nombre, int edad, String estado, String fechaNacimiento, double peso, int mudas, int meses) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.numeroMudadoPiel = mudas;
        this.mesesGestacion = meses;
    }
    @Override public void muestra() {
        System.out.println(this + " Mudas: " + numeroMudadoPiel + " Gestación: " + mesesGestacion);
    }

    @Override public boolean habla() {
        return false;
    }
}