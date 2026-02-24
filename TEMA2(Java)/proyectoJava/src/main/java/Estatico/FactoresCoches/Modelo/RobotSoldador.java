package Estatico.FactoresCoches.Modelo;

public class RobotSoldador extends Robot {
    private double temperaturaTrabajo;
    private String especificacionSeguridad;

    public RobotSoldador(String modelo, int bateria, EstadoRobot estado, String descripcion, double temperaturaTrabajo, String especificacionSeguridad) {
        super(modelo, bateria, estado, "Electricidad", descripcion);
        this.temperaturaTrabajo = temperaturaTrabajo;
        this.especificacionSeguridad = especificacionSeguridad;
    }

    @Override
    public String ejecutarTarea() {
        System.out.println("Realizando soldaduras precisas en la carrocería.");
        return "";
    }

    @Override
    public boolean recargar() {
        if (estado == EstadoRobot.APAGADO) {
            System.out.println("Recargando por electricidad");
            return true;
        } else {
            System.out.println("Estoy encendido y no puedo recargar");
            return false;
        }
    }
}