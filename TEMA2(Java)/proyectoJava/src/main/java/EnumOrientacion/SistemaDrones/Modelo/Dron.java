package EnumOrientacion.SistemaDrones.Modelo;

public class Dron {
    private String id;
    private EstadoDron estado;
    private double bateria;
    private double cargaMaxima;
    private Ruta rutaAsignada;

    public Dron(String id, double cargaMaxima) {
        this.id = id;
        this.estado = EstadoDron.ENREPOSO;
        this.bateria = 100.0;
        this.cargaMaxima = cargaMaxima;
    }

    public void asignarRuta(Ruta ruta) {
        if (this.estado != EstadoDron.ENREPOSO) {
            System.out.println("Error: El dron " + id + " no está disponible.");
        } else if (ruta.getPesoPaquete() > this.cargaMaxima) {
            System.out.println("Error: El paquete excede la carga máxima del dron " + id);
        } else {
            this.rutaAsignada = ruta;
            this.estado = EstadoDron.ENRUTA;
            this.rutaAsignada.setEstado(EstadoPaquete.ENREPARTO);
            System.out.println("Ruta asignada con éxito al dron " + id);
        }
    }

    public void cargarBateria() {
        this.bateria = 100.0;
        this.estado = EstadoDron.CARGANDO;
        System.out.println("Dron " + id + " puesto a cargar.");
    }

    public Ruta getRutaAsignada() {
        return rutaAsignada;
    }

    @Override
    public String toString() {
        return "Dron{" +
                "id='" + id + '\'' +
                ", estado=" + estado +
                ", bateria=" + bateria + "%" +
                ", cargaMaxima=" + cargaMaxima + "kg" +
                ", rutaAsignada=" + (rutaAsignada != null ? "Asignada" : "Ninguna") +
                '}';
    }
}