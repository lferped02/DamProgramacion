package Herencia.Vehiculo.Modelo;

public class Camion extends Vehiculo {
    private int mma;
    private int numerosPasajeros;

    public Camion(String dueno, int puertas, int ruedas, int mma, int pasajeros) {
        super(dueno, puertas, ruedas);
        this.mma = mma;
        this.numerosPasajeros = pasajeros;
    }

    public String calcularCarnet() {
        if (numerosPasajeros <= 9) {
            if (mma > 7500) return "C";
            if (mma >= 3500) return "C1";
        }
        return "B (No llega a categoría de camión pesado)";
    }
}