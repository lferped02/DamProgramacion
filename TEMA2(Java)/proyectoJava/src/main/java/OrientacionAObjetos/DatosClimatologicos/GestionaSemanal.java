package OrientacionAObjetos.DatosClimatologicos;

import java.time.LocalDate;

public class GestionaSemanal {
    public double calcularMediaSemanal(RegistroDiario[] semana) {
        double sumaMedias = 0;
        int contador = 0;

        for (RegistroDiario dia : semana) {
            if (dia != null) {
                sumaMedias += dia.datos.calcularMediaDiaria();
                contador++;
            }
        }
        if (contador == 0) return 0;
        return sumaMedias / contador;
    }

    public static void main(String[] args) {
        DatosClimatologicos d1 = new DatosClimatologicos(12.0, 0, 0);
        RegistroDiario lunes = new RegistroDiario("Galicia", LocalDate.now(), d1);
        lunes.datos.alertarPosibleErrorEnTomaDatos();
        System.out.println("Media del día: " + lunes.datos.calcularMediaDiaria());
    }
}