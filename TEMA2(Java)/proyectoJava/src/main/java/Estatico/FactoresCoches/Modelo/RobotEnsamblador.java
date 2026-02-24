package Estatico.FactoresCoches.Modelo;

public class RobotEnsamblador extends Robot {
    public RobotEnsamblador(String modelo, int bateria, EstadoRobot estado, String descripcion) {
        super(modelo, bateria, estado, "Gasolina", descripcion);
    }

    @Override
    public String ejecutarTarea() {
        System.out.println("Ensamblando piezas del automóvil.");
        return "";
    }

    @Override
    public boolean recargar() {
        if (estado == EstadoRobot.APAGADO) {
            System.out.println("Recargando por gasolina");
            return true;
        } else {
            System.out.println("Estoy encendido y no puedo recargar");
            return false;
        }
    }
}
