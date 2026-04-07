package unidad4.Mapas.TraficoYRematriculaciones.Repositorio;

import unidad4.Mapas.TraficoYRematriculaciones.Modelo.Rematriculacion;
import unidad4.Mapas.TraficoYRematriculaciones.Modelo.Vehiculo;

import java.time.LocalDate;
import java.util.ArrayList;

public class RepositorioRematriculaciones {
    private ArrayList<Vehiculo> listaVehiculos;

    public RepositorioRematriculaciones() {
        listaVehiculos = new ArrayList<>();
    }

    // 1. Registrar vehículo
    public void registrarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    // 2. Buscar por VIN
    public Vehiculo buscarVehiculo(String vin) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getVin().equals(vin)) {
                return v;
            }
        }
        return null;
    }

    // 3. Rematricular
    public void rematricular(String vin, String nuevaMatricula, LocalDate fecha) {
        Vehiculo v = buscarVehiculo(vin);

        if (v != null) {
            v.rematricular(nuevaMatricula, fecha);
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }

    // 4. Mostrar vehículos por propietario
    public void mostrarPorPropietario(String propietario) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getPropietario().equalsIgnoreCase(propietario)) {
                System.out.println(v);
            }
        }
    }

    // 5. Mostrar historial
    public void mostrarHistorial(String vin) {
        Vehiculo v = buscarVehiculo(vin);

        if (v != null) {
            for (Rematriculacion r : v.getHistorial()) {
                System.out.println(r);
            }
        } else {
            System.out.println("Vehiculo no encontrado");
        }
    }
}
