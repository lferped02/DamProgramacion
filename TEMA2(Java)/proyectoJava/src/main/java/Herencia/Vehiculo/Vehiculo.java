package Herencia.Vehiculo;

public class Vehiculo {
    private String dueno;
    private int numerosPuertas;
    private int numerosRuedas;

    public Vehiculo(String dueno, int numPuertas, int numRuedas) {
        this.dueno = dueno;
        this.numerosPuertas = numPuertas;
        this.numerosRuedas = numRuedas;
    }

    // Getters
    public String getDueno() {
        return dueno;
    }
}