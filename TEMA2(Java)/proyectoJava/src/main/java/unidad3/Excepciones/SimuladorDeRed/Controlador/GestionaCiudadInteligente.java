package unidad3.Excepciones.SimuladorDeRed.Controlador;

import unidad3.Excepciones.SimuladorDeRed.Excepcion.FalloCriticoException;
import unidad3.Excepciones.SimuladorDeRed.Excepcion.SensorException;
import unidad3.Excepciones.SimuladorDeRed.Modelo.RedDeSensores;
import unidad3.Excepciones.SimuladorDeRed.Modelo.Sensor;
import unidad3.Excepciones.SimuladorDeRed.Modelo.TipoParametro;
import java.time.LocalDateTime;

public class GestionaCiudadInteligente {
    public static void main(String[] args) {

        RedDeSensores red = new RedDeSensores();
        Sensor sensor1 = new Sensor(TipoParametro.TEMPERATURA, 15, 30);
        Sensor sensor2 = new Sensor(TipoParametro.CO2, 300, 1000);
        Sensor sensor3 = new Sensor(TipoParametro.HUMEDAD_RELATIVA, 30, 70);

        red.agregarSensor(sensor1);
        red.agregarSensor(sensor2);
        red.agregarSensor(sensor3);

        try {
            sensor1.registrarLectura(20, LocalDateTime.now().minusMinutes(10));
            sensor2.registrarLectura(400, LocalDateTime.now().minusMinutes(5));
            sensor3.registrarLectura(50, LocalDateTime.now().minusMinutes(2));
            sensor1.registrarLectura(100, LocalDateTime.now());
            sensor2.registrarLectura(500, LocalDateTime.now().minusHours(1));

        } catch (SensorException e) {
            System.out.println("Error capturado en main: " + e.getMessage());
        }

        try {
            red.validarSensores();
        } catch (FalloCriticoException e) {
            System.out.println("Error crítico: " + e.getMessage());
        }

        System.out.println(sensor1);
        System.out.println(sensor2);
        System.out.println(sensor3);
    }
}