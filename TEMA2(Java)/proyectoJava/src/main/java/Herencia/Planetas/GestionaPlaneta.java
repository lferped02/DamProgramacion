package Herencia.Planetas;

import java.util.ArrayList;

public class GestionaPlaneta {
    public static void main(String[] args) {
        ArrayList<Astro> sistemaSolar = new ArrayList<>();

        Planeta marte = new Planeta("Marte", 6.39e23, 6779.0, 24.6, 16488.0, 227.9);

        Satelite fobos = new Satelite("Fobos", 1.06e16, 22.2, 7.66, 7.66, 9377.0, "Marte");
        Satelite deimos = new Satelite("Deimos", 1.47e15, 12.4, 30.3, 30.3, 23460.0, "Marte");
        marte.agregarSatelite(fobos);
        marte.agregarSatelite(deimos);

        sistemaSolar.add(marte);
        sistemaSolar.add(fobos);
        sistemaSolar.add(deimos);

        System.out.println("=== PRUEBA DE TOSTRING() ===");
        for (Astro a : sistemaSolar) {
            System.out.println(a.toString());
        }

        System.out.println("\n=== PRUEBA DE MUESTRAINFORMACION (POLIMORFISMO) ===");
        for (Astro a : sistemaSolar) {
            muestraInformacion(a);
            System.out.println("-----------------------");
        }

        System.out.println("\n=== PRUEBA DE EQUALS() ===");
        Satelite copiaFobos = new Satelite("Fobos", 1.06e16, 22.2, 7.66, 7.66, 9377.0, "Marte");
        System.out.println("¿Es copiaFobos igual a fobos?: " + fobos.equals(copiaFobos));
    }

    public static void muestraInformacion(Astro a) {
        a.muestra();
    }
}