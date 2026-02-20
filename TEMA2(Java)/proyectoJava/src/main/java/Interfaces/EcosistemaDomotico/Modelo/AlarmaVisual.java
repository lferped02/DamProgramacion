package Interfaces.EcosistemaDomotico.Modelo;

public class AlarmaVisual extends SistemaIluminacion {
    public AlarmaVisual(String codigoSerie, String marca, int intensidad) {
        super(codigoSerie, marca, intensidad);
    }
    public void activarModoPanico(){
        this.estado = Estado.ESCENDIDO;
        this.intensidad = 100;
        System.out.println("Modo pánico activado. Intensidad al 100% y color rojo.");
    }
}
