package Interfaces.EcosistemaDomotico;

public class LavadoraInteligente extends Electrodomestico{
    public LavadoraInteligente(String codigoSerie, String marca, float consumoEnergetico) {
        super(codigoSerie, marca, consumoEnergetico);
    }

    public void iniciarCicloLavado(){
        if (estado == Estado.ESCENDIDO){
            System.out.println("Iniciando ciclo de lavado...");
        } else {
            System.out.println("La lavadora no está encendida.");
        }
    }
}
