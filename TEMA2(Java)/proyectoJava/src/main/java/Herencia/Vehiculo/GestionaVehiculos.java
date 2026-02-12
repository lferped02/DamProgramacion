package Herencia.Vehiculo;

public class GestionaVehiculos {
    public static void main(String[] args) {
        Vehiculo cocheEco = new Automovil("Ana", 5, 4, "ECO");
        Vehiculo cocheC = new Automovil("Pedro", 3, 4, "C");

        System.out.println("¿Coche ECO limitado en Madrid?: " + ((Automovil)cocheEco).tieneLimitacionParaCircular("Madrid"));
        System.out.println("¿Coche C limitado en Sevilla?: " + ((Automovil)cocheC).tieneLimitacionParaCircular("Sevilla"));

        Vehiculo camion1 = new Camion("Paco", 2, 4, 500, 2);
        Vehiculo camion2 = new Camion("Marta", 2, 6, 5000, 7);

        System.out.println("\nCarnet para camión 500kg: " + ((Camion)camion1).calcularCarnet());
        System.out.println("Carnet para camión 5000kg: " + ((Camion)camion2).calcularCarnet());
    }
}