package Herencia.Vehiculo;

public class CocheElectrico extends Automovil {
    private String tipoBateria;

    public CocheElectrico(String dueno, int ruedas, String calificacion, int puertas, String bateria) {
        super(dueno, ruedas, calificacion, puertas);
        if (bateria.equals("LFP") || bateria.equals("NCM")) {
            this.tipoBateria = bateria;
        } else {
            this.tipoBateria = "LFP";
        }
    }
}
