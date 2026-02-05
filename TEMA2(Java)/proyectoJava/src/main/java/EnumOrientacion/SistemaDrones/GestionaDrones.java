package EnumOrientacion.SistemaDrones;

public class GestionaDrones {
     static void main(String[] args) {
        Ruta ruta = new Ruta("Almacén A", "Calle Falsa 123", 5.0);
        Ruta ruta2 = new Ruta("Almacén A", "Av. Siempre Viva 742", 12.0);
        Ruta ruta3 = new Ruta("Almacén B", "Centro Comercial", 2.5);

        Dron dron = new Dron("DRON-01", 10.0); // Carga máx 10kg
        Dron dron2 = new Dron("DRON-02", 15.0); // Carga máx 15kg

        dron.asignarRuta(ruta);
        dron2.asignarRuta(ruta2);

        dron.getRutaAsignada().setEstado(EstadoPaquete.RETRASADO);
        dron2.getRutaAsignada().setEstado(EstadoPaquete.CANCELADO);


        System.out.print("Intento de reasignación: ");
        dron.asignarRuta(ruta3);

        Ruta rutaPesada = new Ruta("Puerto", "Fábrica", 50.0);
        Dron d3 = new Dron("DRON-03", 20.0);
        System.out.print("Prueba de peso: ");
        d3.asignarRuta(rutaPesada);
    }
}