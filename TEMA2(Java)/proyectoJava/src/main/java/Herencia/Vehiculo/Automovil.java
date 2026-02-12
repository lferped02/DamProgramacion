package Herencia.Vehiculo;

public class Automovil extends Vehiculo {
    private String calificacionEcologica;

    public Automovil(String dueno, int puertas, int ruedas, String calificacion) {
        super(dueno, puertas, ruedas);
        this.calificacionEcologica = calificacion;
    }

    public boolean tieneLimitacionParaCircular(String ciudad) {
        String c = ciudad.toLowerCase();

        if ((c.equals("madrid") || c.equals("barcelona")) &&
                (calificacionEcologica.equals("B") || calificacionEcologica.equals("C"))) {
            return true;
        }

        if ((c.equals("valencia") || c.equals("sevilla")) && calificacionEcologica.equals("C")) {
            return true;
        }
        return false;
    }
}