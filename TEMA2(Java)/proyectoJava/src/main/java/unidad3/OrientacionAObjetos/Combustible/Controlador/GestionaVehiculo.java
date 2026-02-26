package unidad3.OrientacionAObjetos.Combustible.Controlador;


import unidad3.OrientacionAObjetos.Combustible.Modelo.Vehiculos;

class GestionaVehiculo {
     static void main(String[] args) {
        Vehiculos coche1 = new Vehiculos("Toyota", "Corolla", 2022, "Híbrido", 50.0, 4.5, 5.0);
        Vehiculos coche2 = new Vehiculos("Ford", "F-150", 2020, "Gasolina", 98.0, 12.0, 40.0);

        Vehiculos[] flota = {coche1, coche2};
        double distanciaPrueba = 250.0;

        System.out.println("--- Reporte de Vehículos ---");
        for (Vehiculos vehiculo : flota) {
            System.out.println("\nVehículo: " + vehiculo.getDetalles());
            System.out.printf("Consumo estimado para %.1f km: %.2f litros%n",
                    distanciaPrueba, vehiculo.calcularConsumo(distanciaPrueba));

            if (vehiculo.necesitaRepostar()) {
                System.out.println("Estado: ¡ALERTA! El vehículo necesita repostar (Tanque < 20%).");
            } else {
                System.out.println("Estado: Nivel de combustible suficiente.");
            }
        }
    }
}