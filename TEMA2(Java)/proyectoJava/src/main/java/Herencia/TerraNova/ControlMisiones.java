package Herencia.TerraNova;

import java.time.LocalDate;
import java.util.ArrayList;

public class ControlMisiones {

    public static void main(String[] args) {
        Nave nave1 = new Nave("TN-01", "Explorer X", 5000);
        Nave nave2 = new Nave("TN-02", "Cargo Max", 2000);

        ArrayList<Mision> misiones = new ArrayList<>();
        misiones.add(new MisionExploracion(1, "Red Planet", LocalDate.now().plusDays(10), nave1, "Marte", 5));
        misiones.add(new MisionExploracion(2, "Luna Azul", LocalDate.now().plusDays(3), nave1, "Luna", 3));

        misiones.add(new MisionLogistica(3, "Supply Heavy", LocalDate.now().plusDays(5), nave2, 60));
        misiones.add(new MisionLogistica(4, "Supply Light", LocalDate.now().plusDays(15), nave2, 20));

        System.out.println("=== MISIONES DE RIESGO ===");
        for (Mision mision : misiones) {
            if (mision.esMisionRiesgo()) {
                System.out.println(mision);
            }
        }
    }
}
