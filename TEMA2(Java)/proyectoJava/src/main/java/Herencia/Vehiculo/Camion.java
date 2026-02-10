package Herencia.Vehiculo;

public class Camion extends Vehiculo {
    private int tonelajeKilos; 
    private int numerosPasajeros;
    private int numerosEjes;

    public Camion(String dueno, int numerosRuedas, String calificacion, int mma, int pasajeros, int ejes) {
        super(dueno, numerosRuedas, calificacion);
        this.tonelajeKilos = mma;
        this.numerosPasajeros = pasajeros;
        this.numerosEjes = ejes;
    }

    public String getLicencias() {
        if (numerosPasajeros > 9) return "No permitido (excede pasajeros)";
        if (tonelajeKilos > 7500) return "C";
        if (tonelajeKilos >= 3500) return "C1";
        return "B";
    }
}
