package EnumOrientacion.AutosInteligentes;

public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private Conductor dueno;
    private Estado estado;
    private Sensor sensor;

    public Coche(String marca, String modelo, String matricula, Conductor dueño) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.dueno = dueño;
        this.estado = Estado.APAGADO;
        this.sensor = new Sensor(100, 0);
    }

    public void arrancar(Conductor quienIntenta) {
        if (quienIntenta.equals(this.dueno)) {
            this.estado = Estado.ARRANCADO;
            System.out.println("Vehículo ARRANCADO correctamente.");
        } else {
            System.out.println("AVISO: Solo el dueño (" + dueno.getNombre() + ") puede arrancar este coche.");
        }
    }

    public void verificarSiDebeParar() {
        while (this.estado == Estado.ARRANCADO) {
            if (sensor.alertaObstaculo()) {
                System.out.println("¡PELIGRO! Obstáculo detectado. Apagando sistema...");
                this.estado = Estado.APAGADO;
            } else {
                break;
            }
        }
    }

    public Sensor getSensor() {
        return sensor;
    }
    public Estado getEstado() {
        return estado;
    }
}
