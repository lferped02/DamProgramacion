package OrientacionAObjetos.DatosClimatologicos;

public class DatosClimatologicos {
    public double lluviaRecogida;
    public double temperaturaMaxima;
    public double temperaturaMinima;

    public DatosClimatologicos(double lluviaRecogida, double temperaturaMaxima, double tempMin) {
        this.lluviaRecogida = lluviaRecogida;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = tempMin;
    }

    public boolean hayRiesgoDeNieve() {
        return this.temperaturaMinima < -5 && this.lluviaRecogida > 0;
    }

    public boolean validar() {
        return this.temperaturaMaxima == 0 && this.temperaturaMinima == 0;
    }

    public void alertarPosibleErrorEnTomaDatos() {
        if (this.validar()) {
            System.out.println("Revisar el sistema de recogida de datos");
        }
    }

    public double calcularMediaDiaria() {
        return (this.temperaturaMaxima + this.temperaturaMinima) / 2;
    }
}