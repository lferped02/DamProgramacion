package Estatico.FactoriaDeCoches.Modelo;

public class RobotEnsamblador extends Robot {

    public RobotEnsamblador(String modelo, int bateria, String estado, String combustible, String descripcion) {
        super(modelo, bateria, estado, combustible, descripcion);
    }

    @Override
    public String ejecutarTarea() {
        return "Ensamblando piezas de automóvil.";
    }

    @Override
    public boolean recargar() {
        if (estado.equals("APAGADO") && combustible.equals("gasolina")) {
            System.out.println("Recargando por gasolina");
            return true;
        } else {
            System.out.println("Estoy encendido y no puedo recargar");
            return false;
        }
    }
}
