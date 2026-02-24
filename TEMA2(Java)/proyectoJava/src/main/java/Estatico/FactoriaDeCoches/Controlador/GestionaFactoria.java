package Estatico.FactoriaDeCoches.Controlador;

import Estatico.FactoriaDeCoches.Modelo.*;

public class GestionaFactoria {
    private Robot[] inventarioRobots = new Robot[20];
    private DispositivoWifi[] inventarioDispositivos = new DispositivoWifi[40];

    private int indiceRobot = 0;
    private int indiceDispositivo = 0;

    public void agregarRobot(Robot robot) {
        if (indiceRobot < 20) {
            inventarioRobots[indiceRobot] = robot;
            indiceRobot++;
        }
    }

    public void agregarDispositivo(DispositivoWifi dispositivo) {
        if (indiceDispositivo < 40) {
            inventarioDispositivos[indiceDispositivo] = dispositivo;
            indiceDispositivo++;
        }
    }

    public void mostrarInventarioRobots() {
        for (int i = 0; i < indiceRobot; i++) {
            System.out.println(inventarioRobots[i]);
        }
    }

    public void mostrarInventarioDispositivos() {
        for (int i = 0; i < indiceDispositivo; i++) {
            System.out.println(inventarioDispositivos[i]);
        }
    }

    public static void main(String[] args) {
        GestionaFactoria factoria = new GestionaFactoria();

        Robot robotSoldador = new RobotSoldador("SoldadorX", 50, "ENCENDIDO", "electricidad", "Soldador de carros", 350, "Alta seguridad");
        Robot robotPintor = new RobotPintor("PintorX", 80, "APAGADO", "electricidad", "Pintor de vehículos");
        Robot robotEnsamblador = new RobotEnsamblador("EnsambladorX", 60, "ENCENDIDO", "gasolina", "Ensamblador de piezas");

        factoria.agregarRobot(robotSoldador);
        factoria.agregarRobot(robotPintor);
        factoria.agregarRobot(robotEnsamblador);

        DispositivoWifi sensor = new SensorTemperatura("S1", "MAC123", "ON_CONECTADO", "hace 3 meses", 25);
        DispositivoWifi camara = new CamaraSeguridad("C1", "MAC456", "ON_SINWIFI", "hace 2 semanas");
        DispositivoWifi puerta = new PuertaAutomatica("P1", "MAC789", "ALERTA", "hace 1 mes");

        factoria.agregarDispositivo(sensor);
        factoria.agregarDispositivo(camara);
        factoria.agregarDispositivo(puerta);

        factoria.mostrarInventarioRobots();
        factoria.mostrarInventarioDispositivos();
    }
}