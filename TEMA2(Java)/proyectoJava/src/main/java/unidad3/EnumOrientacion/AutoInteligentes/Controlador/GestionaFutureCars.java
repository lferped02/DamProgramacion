package EnumOrientacion.AutoInteligentes.Controlador;

import EnumOrientacion.AutoInteligentes.Modelo.Coche;
import EnumOrientacion.AutoInteligentes.Modelo.Conductor;

public class GestionaFutureCars {
    public static void main(String[] args) {
        Conductor owner = new Conductor("Carlos Sainz", 15);
        Conductor intruso = new Conductor("Desconocido", 1);

        Coche futureCar = new Coche("Audi", "AI:CON", "2026-FUT", owner);

        System.out.println("--- Intento 1: Intruso ---");
        futureCar.arrancar(intruso);

        System.out.println("\n--- Intento 2: Dueño ---");
        futureCar.arrancar(owner);
        owner.conducir();

        System.out.println("\n--- Simulación de conducción ---");
        futureCar.getSensor().setVelocidad(130);
        if (futureCar.getSensor().alertaVelocidad()) {
            System.out.println("Sistema: Reduzca la velocidad (Superior a 120km/h)");
        }

        System.out.println("\n--- Emergencia ---");
        futureCar.getSensor().setDistanciaObstaculo(30);
        futureCar.verificarSiDebeParar();

        System.out.println("Estado final del coche: " + futureCar.getEstado());
    }
}
