package EnumOrientacion.SistemaDrones;

class Dron {
    public String id;
    public int bateria;
    public EstadoDron estado;
    public double cargaMaxima;
    public Ruta rutaAsignada;

    public Dron(String id, double cargaMaxima) {
        this.id = id;
        this.estado = EstadoDron.ENREPOSO;
        this.cargaMaxima = cargaMaxima;
    }

    public void asignarRuta(Ruta ruta) {
        if (this.estado == EstadoDron.ENREPOSO) {
            this.rutaAsignada = ruta;
            this.estado = EstadoDron.ENRUTA;
            this.rutaAsignada.setEstadoPaquete(EstadoPaquete.ENREPARTO);
            System.out.println("LOG: Ruta asignada correctamente al dron " + id);
        } else {
            System.out.println("MENSAJE: No es posible asignar. El dron " + id + " no está en reposo.");
        }
    }

    public void cargarBateria() {
        this.bateria = 100;
        this.estado = EstadoDron.CARGANDO;
        System.out.println("LOG: El dron " + id + " está cargando. Batería al 100%.");
    }
}