package Interfaces.EcosistemaDomotico;

public class CentralitaDomotica {
    private Dispositivo[] dispositivos = new Dispositivo[10];
    private int contador = 0;

    public void anadirDispositivo (Dispositivo dispositivo){
        if (contador < 10){
            dispositivos[contador] = dispositivo;
            contador++;
            System.out.println("Dispositivo añadido.");
        } else {
            System.out.println("La centraliza está llena.");
        }
    }
    public Dispositivo buscarDispositivo(String codigoSerie) {
        for (Dispositivo d : dispositivos) {
            if (d != null && d.getCodigoSerie().equals(codigoSerie)) {
                System.out.println("Dispositivo encontrado: " + d.getCodigoSerie());
                return d;
            }
        }
        System.out.println("Dispositivo no encontrado.");
        return null;
    }

    public void ejecutarRutinaDiaria() {
        for (Dispositivo d : dispositivos) {
            if (d != null) {
                d.conectar();
                if (d instanceof Inteligente) {
                    ((Inteligente) d).encender();
                }
            }
        }
    }
}
