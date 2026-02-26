package Interfaces.EcosistemaDomotico.Modelo;

public abstract class SistemaIluminacion extends Dispositivo implements Inteligente {
    protected int intensidad;

    public SistemaIluminacion(String codigoSerie, String marca, int intensidad) {
        super(codigoSerie, marca);
        this.intensidad = intensidad;
    }

    public void encender(){
        this.estado = Estado.ESCENDIDO;
        System.out.println("El sistema de iluminación está encendido.");
    }

    public void apagar(){
        this.estado = Estado.APAGADO;
        System.out.println("El sistema de iluminación está apagado.");
    }
}
