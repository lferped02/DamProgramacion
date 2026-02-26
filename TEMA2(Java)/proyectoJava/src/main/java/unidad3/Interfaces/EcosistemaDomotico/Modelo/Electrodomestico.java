package Interfaces.EcosistemaDomotico.Modelo;

public abstract class Electrodomestico extends Dispositivo implements Inteligente{
    protected float consumoEnergetico;

    public Electrodomestico(String codigoSerie, String marca, float consumoEnergetico) {
        super(codigoSerie, marca);
        if (consumoEnergetico < 0) {
            consumoEnergetico = 0;
        }
        this.consumoEnergetico = consumoEnergetico;
    }

    public void encender(){
        this.estado = Estado.ESCENDIDO;
        System.out.println("El electrodoméstico está encendido.");
    }
    public void apagar(){
        this.estado = Estado.APAGADO;
        System.out.println("El electrodoméstico está apagado.");
    }
}
