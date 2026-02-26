package Estatico.FactoriaDeCoches.Modelo;

public class RobotSoldador extends Robot {
    private int temperaturaTrabajo;
    private String especificacionSeguridad;

    public RobotSoldador(String modelo, int bateria, String estado, String combustible, String descripcion, int temperaturaTrabajo, String especificacionSeguridad) {
        super(modelo, bateria, estado, combustible, descripcion);
        this.temperaturaTrabajo = temperaturaTrabajo;
        this.especificacionSeguridad = especificacionSeguridad;
    }

    @Override
    public String ejecutarTarea() {
        return "Realizando soldadura precisa a " + temperaturaTrabajo + " grados.";
    }

    @Override
    public boolean recargar() {
        if (estado.equals("APAGADO") && combustible.equals("electricidad")) {
            System.out.println("Recargando por electricidad");
            return true;
        } else {
            System.out.println("Estoy encendido y no puedo recargar");
            return false;
        }
    }
}