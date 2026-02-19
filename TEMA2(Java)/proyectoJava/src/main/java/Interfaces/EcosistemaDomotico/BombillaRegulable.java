package Interfaces.EcosistemaDomotico;

public class BombillaRegulable extends SistemaIluminacion{
    public BombillaRegulable(String codigoSerie, String marca, int intensidad) {
        super(codigoSerie, marca, intensidad);
    }

    public void cambiarAmbiente (String color){
        if (color.matches("[0-9A-Fa-f]{6}")){
            System.out.println("Cambiando color a..."+color);
        } else {
            System.out.println("Código de color inválido.");
        }
    }

    public void simularApagadoGradual(){
        System.out.println("Apagando gradualmente...");
        for (int i = intensidad; i >=0; i--) {
            System.out.println("Intensidad: " + i);
        }
    }
}
