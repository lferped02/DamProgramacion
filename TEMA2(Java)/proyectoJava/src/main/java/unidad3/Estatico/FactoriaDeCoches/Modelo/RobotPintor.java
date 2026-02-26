package Estatico.FactoriaDeCoches.Modelo;

public class RobotPintor extends Robot {

    public RobotPintor(String modelo, int bateria, String estado, String combustible, String descripcion) {
        super(modelo, bateria, estado, combustible, descripcion);
    }

    @Override
    public String ejecutarTarea() {
        return "Aplicando pintura uniforme.";
    }

    @Override
    public boolean recargar() {
        if (estado.equals("ENCENDIDO") || estado.equals("APAGADO")) {
            System.out.println("Recargando por electricidad");
            return true;
        } else {
            System.out.println("Estoy encendido y no puedo recargar");
            return false;
        }
    }
}
