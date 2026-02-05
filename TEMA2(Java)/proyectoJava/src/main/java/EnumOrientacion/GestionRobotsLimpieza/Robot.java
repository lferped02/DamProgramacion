package EnumOrientacion.GestionRobotsLimpieza;

class Robot {
     String id;
     int deposito;
     ModoRobot modo;
     int bateria;
     Habitacion habitacionAsignada;

     Robot(String id, ModoRobot modoInicial) {
        this.id = id;
        this.modo = modoInicial;
        this.deposito = 20;
        this.bateria = 100;
    }

     void asignarHabitacion(Habitacion h) {
        if (this.modo == ModoRobot.AUTO) {
            this.habitacionAsignada = h;
            this.habitacionAsignada.setEstado(EstadoHabitacion.LIMPIANDO);
            System.out.println("LOG: Robot " + id + " asignado a " + h.getEstado() + " en " + h);
        } else {
            System.out.println("ERROR: No se puede asignar habitación. El robot " + id + " está en modo " + modo);
        }
    }

     void vaciarDeposito() {
        this.deposito = 0;
        System.out.println("LOG: Depósito del robot " + id + " vaciado.");
    }

     void recargar() {
        this.bateria = 100;
        System.out.println("LOG: Robot " + id + " recargado al 100%.");
    }
}