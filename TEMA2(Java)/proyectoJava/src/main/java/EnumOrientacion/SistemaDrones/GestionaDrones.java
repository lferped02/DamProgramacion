package EnumOrientacion.SistemaDrones;

public class GestionaDrones {
    public static void main(String[] args) {
        Ruta ruta1 = new Ruta("Madrid", "Toledo", 2.5);
        Ruta ruta2 = new Ruta("Barcelona", "Sitges", 1.0);
        Ruta ruta3 = new Ruta("Valencia", "Alicante", 3.2);

        Dron dronA = new Dron("DRON-01", 5.0);
        Dron dronB = new Dron("DRON-02", 10.0);

        System.out.println("--- Asignando rutas iniciales ---");
        dronA.asignarRuta(ruta1);
        dronB.asignarRuta(ruta2);

        ruta1.setEstadoPaquete(EstadoPaquete.RETRASADO);
        ruta2.setEstadoPaquete(EstadoPaquete.CANCELADO);

        System.out.println("Estado Ruta 1: " + ruta1.getEstadoPaquete());
        System.out.println("Estado Ruta 2: " + ruta2.getEstadoPaquete());

        System.out.println("\n--- Intento de asignación a dron ocupado ---");
        dronA.asignarRuta(ruta3);
    }
}