package unidad4.Mapas.TraficoYRematriculaciones.Controlador;

import unidad4.Mapas.TraficoYRematriculaciones.Modelo.Vehiculo;
import unidad4.Mapas.TraficoYRematriculaciones.Repositorio.RepositorioRematriculaciones;
import java.time.LocalDate;

public class GestionaRematriculaciones {
    public static void main(String[] args) {
        RepositorioRematriculaciones repo = new RepositorioRematriculaciones();

        // Crear vehículo
        Vehiculo v1 = new Vehiculo("VIN123", "1234ABC", "Toyota", "Corolla", "Rojo", 2015, LocalDate.of(2015,5,10), "Juan");

        // Registrar
        repo.registrarVehiculo(v1);

        // Rematricular
        repo.rematricular("VIN123", "5678DEF", LocalDate.of(2018, 3, 20));
        repo.rematricular("VIN123", "9999XYZ", LocalDate.of(2022, 7, 15));

        // Mostrar vehículo
        System.out.println("=== VEHICULO ===");
        System.out.println(repo.buscarVehiculo("VIN123"));

        // Mostrar historial
        System.out.println("\n=== HISTORIAL ===");
        repo.mostrarHistorial("VIN123");

        // Mostrar por propietario
        System.out.println("\n=== VEHICULOS DE JUAN ===");
        repo.mostrarPorPropietario("Juan");
    }
}