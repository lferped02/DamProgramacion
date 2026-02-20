package Interfaces.EcosistemaDomotico.Modelo;

public class CafeteraInteligente extends Electrodomestico{
    private int nivelAgua;

    public CafeteraInteligente(String codigoSerie, String marca, float consumoEnergetico, int nivelAgua) {
        super(codigoSerie, marca, consumoEnergetico);
        this.nivelAgua = nivelAgua;
    }

    public void prepararCafe(){
        if (nivelAgua < 10){
            System.out.println("Alerta: Nivel de agua bajo. No se puede preparar café.");
        } else {
            System.out.println("Preparando café...");
        }
    }
}
