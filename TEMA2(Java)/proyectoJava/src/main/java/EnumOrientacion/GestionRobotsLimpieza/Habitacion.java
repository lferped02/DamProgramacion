package EnumOrientacion.GestionRobotsLimpieza;

class Habitacion {
    public String nombre;
    public double tamanoM2;
    public int nivelSuciedad;
    public EstadoHabitacion estado;

    public Habitacion(String nombre, double tamanoM2, int nivelSuciedad) {
        this.nombre = nombre;
        this.tamanoM2 = tamanoM2;
        this.nivelSuciedad = nivelSuciedad;
        this.estado = EstadoHabitacion.LIBRE;
    }

    public void setEstado(EstadoHabitacion nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public EstadoHabitacion getEstado() {
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