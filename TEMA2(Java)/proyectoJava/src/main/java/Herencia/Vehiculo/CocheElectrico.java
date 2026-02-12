package Herencia.Vehiculo;

public class CocheElectrico extends Automovil {
    private TipoDeBateria tipoBateria;

    public CocheElectrico(String dueno, int numPuertas, int numRuedas, TipoDeBateria tipoBateria) {
        super(dueno, numPuertas, numRuedas, "0");
        this.tipoBateria = tipoBateria;
    }

    // Getter específico
    public TipoDeBateria getTipoBateria() {
        return tipoBateria;
    }
}