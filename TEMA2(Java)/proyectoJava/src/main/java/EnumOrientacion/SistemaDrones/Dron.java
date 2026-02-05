package EnumOrientacion.SistemaDrones;


class Dron {
     String id;
     EstadoDron estado;
     int bateria;
     double cargaMaxima;
     Ruta rutaAsignada;

     Dron(String id, double cargaMaxima) {
        this.id = id;
        this.estado = EstadoDron.ENREPOSO;
        this.bateria = 100;
        this.cargaMaxima = cargaMaxima;
    }

     void asignarRuta(Ruta ruta) {
        // Validación de estado y peso (Apartado 2)
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

     void cargarBateria() {
        this.bateria = 100;
        this.estado = EstadoDron.CARGANDO;
    }

     Ruta getRutaAsignada() {
         return rutaAsignada;
     }
}