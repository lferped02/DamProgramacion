package Herencia.Vehiculo;

public class GestionaVehiculos {
    public static void main(String[] args) {
        Vehiculo cocheEco = new Automovil("Ana", 4, "ECO", 5);
        Vehiculo cocheC = new Automovil("Pedro", 4, "C", 3);

        System.out.println("--- PRUEBAS AUTOMÓVILES ---");
        System.out.println("ECO en Madrid tiene limitación: " + cocheEco.tieneLimitacionParaCircular("Madrid")); // false
        System.out.println("Tipo C en Sevilla tiene limitación: " + cocheC.tieneLimitacionParaCircular("Sevilla")); // true

        Camion camion1 = new Camion("Logística A", 4, "B", 500, 2, 2);
        Camion camion2 = new Camion("Logística B", 6, "B", 5000, 7, 3);

        System.out.println("\n--- PRUEBAS CAMIONES ---");
        System.out.println("Camión 1 (500kg) requiere licencia: " + camion1.getLicencias());
        System.out.println("Camión 2 (5000kg, 7 pax) requiere licencia: " + camion2.getLicencias());
    }
}