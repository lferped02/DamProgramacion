package Estatico.FactoresCoches.Modelo;

public class RobotPintor extends Robot {
    public RobotPintor(String modelo, int bateria, EstadoRobot estado, String descripcion) {
        super(modelo, bateria, estado, "Electricidad", descripcion);
    }
    @Override
    public String ejecutarTarea() {
        System.out.println("Aplicando pintura uniformemente al vehículo.");
        return "";
    }
    @Override
    public boolean recargar() {
        System.out.println("Recargando por electricidad");
        return true;
    }
}
