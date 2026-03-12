package unidad3.Excepciones.SimuladorDeRed.Modelo;

import unidad3.Excepciones.SimuladorDeRed.Excepcion.FalloCriticoException;

public class RedDeSensores {
    private Sensor[] sensores;
    private static int numeroSensores;

    public RedDeSensores() {
        sensores = new Sensor[50];
    }

    private int cuentaNumeroSensoresFallidos(Sensor sensor) {
        int anomalas = 0;
        for (Lectura l : sensor.getHistorial()) {
            if (l != null && l.isAnomala()) {
                anomalas++;
            }
        }
        return anomalas;
    }

    public void agregarSensor(Sensor s) {
        sensores[numeroSensores] = s;
        numeroSensores++;
    }

    public void validarSensores() throws FalloCriticoException {
        int sensoresFallidos = 0;
        int totalSensores = 0;

        for (Sensor sensor : sensores) {
            if (sensor != null) {
                int numeroAnomalas = cuentaNumeroSensoresFallidos(sensor);
                totalSensores++;

                if (sensor.getTotalLecturas() / 3 < numeroAnomalas) {
                    sensoresFallidos++;
                    throw new FalloCriticoException("Sensor con demasiadas anomalías: " + sensor.getId()
                    );
                }
            }
        }

        if (sensoresFallidos > totalSensores / 2) {
            throw new FalloCriticoException("FALLO CRÍTICO EN LA RED DE SENSORES");
        }
    }
}