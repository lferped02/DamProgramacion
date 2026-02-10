package Herencia.Vehiculo;

public class Automovil extends Vehiculo {
    private int numerosPuertas;

    public Automovil(String dueno, int numerosRuedas, String calificacion, int numPuertas) {
        super(dueno, numerosRuedas, calificacion);
        this.numerosPuertas = numerosPuertas;
    }
}

