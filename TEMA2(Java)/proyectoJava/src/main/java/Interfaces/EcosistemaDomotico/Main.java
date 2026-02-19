package Interfaces.EcosistemaDomotico;

public class Main {
    public static void main(String[] args) {
        LavadoraInteligente lavadora = new LavadoraInteligente("LAV123", "LG", 500);
        CafeteraInteligente cafetera = new CafeteraInteligente("CAF456", "Philips", 150, 20);
        BombillaRegulable bombilla = new BombillaRegulable("BOM789", "Samsung", 75);
        AlarmaVisual alarma = new AlarmaVisual("ALM101", "Xiaomi", 50);

        CentralitaDomotica centralita = new CentralitaDomotica();

        centralita.anadirDispositivo(lavadora);
        centralita.anadirDispositivo(cafetera);
        centralita.anadirDispositivo(bombilla);
        centralita.anadirDispositivo(alarma);

        centralita.buscarDispositivo("LAV123");
        centralita.buscarDispositivo(("INEXISTENTE"));

        centralita.ejecutarRutinaDiaria();

        lavadora.iniciarCicloLavado();
        cafetera.prepararCafe();
        bombilla.cambiarAmbiente("#FF5733");
        alarma.activarModoPanico();
    }
}
