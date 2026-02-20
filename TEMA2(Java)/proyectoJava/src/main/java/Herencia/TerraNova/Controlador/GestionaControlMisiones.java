package Herencia.TerraNova.Controlador;

import Herencia.TerraNova.Modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionaControlMisiones {
    public static void main(String[] args) {
        Comandante comandante1 = new Comandante("111A", "Juan Pérez", Rango.CAPITAN);
        Comandante comandante2 = new Comandante("222B", "Laura Gómez", Rango.COMANDANTE);

        Nave nave1 = new Nave("NCC-1701", "Explorador X", 1200, comandante1);
        Nave nave2 = new Nave("ZX-99", "Cargo Heavy", 800, comandante2);

        ArrayList<Mision> misiones = new ArrayList<>();

        misiones.add(new MisionExploracion(101, "Red Mars", LocalDate.now().plusDays(3), nave1, "Marte", 5));

        misiones.add(new MisionExploracion(102, "Luna Azul", LocalDate.now().plusDays(20), nave1, "Luna", 3));

        misiones.add(new MisionLogistica(201, "Carga Alpha", LocalDate.now().plusDays(2), nave2, 60));

        misiones.add(new MisionLogistica(202, "Carga Beta", LocalDate.now().plusDays(15), nave2, 30));

        System.out.println("MISIONES DE RIESGO:");
        for (Mision mision : misiones) {
            if (mision.esMisionRiesgo()) {
                System.out.println(mision);
            }
        }
    }
}

