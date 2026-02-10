package EnumOrientacion.GestionRobotsLimpieza;

class Habitacion {
     String nombre;
     double tamanoM2;
     int nivelSuciedad;
     EstadoHabitacion estado;

     Habitacion(String nombre, double tamanoM2, int nivelSuciedad) {
        this.nombre = nombre;
        this.tamanoM2 = tamanoM2;
        this.nivelSuciedad = nivelSuciedad;
        this.estado = EstadoHabitacion.LIBRE;
    }

     void setEstado(EstadoHabitacion nuevoEstado) {
        this.estado = nuevoEstado;
    }

     EstadoHabitacion getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", tamanoM2=" + tamanoM2 +
                ", estado=" + estado +
                '}';
    }
}