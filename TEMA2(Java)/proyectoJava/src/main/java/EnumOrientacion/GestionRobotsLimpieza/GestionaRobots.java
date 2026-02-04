package EnumOrientacion.GestionRobotsLimpieza;

public class GestionaRobots {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion("Sala de Juntas", 50.5, 80);
        Habitacion habitacion2 = new Habitacion("Laboratorio 1", 30.0, 40);
        Habitacion habitacion3 = new Habitacion("Oficina Principal", 20.0, 10);

        Robot robbie = new Robot("ROB-01", ModoRobot.AUTO);
        Robot dustin = new Robot("ROB-02", ModoRobot.MANUAL);

        System.out.println("--- Iniciando tareas de limpieza ---");
        robbie.asignarHabitacion(habitacion);

        habitacion2.setEstado(EstadoHabitacion.BLOQUEADA);
        System.out.println("Estado actual de " + habitacion2);

        System.out.println("\n--- Intento de asignación inválida ---");
        dustin.asignarHabitacion(habitacion3);

        robbie.vaciarDeposito();
        dustin.recargar();
    }
}
