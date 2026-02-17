package Herencia.Planetas;

public class GestionaPlaneta {
    public static void main(String[] args) {
        Astro[] sistema = new Astro[5];
        int contador = 0;

        Planeta marte = new Planeta("Marte", 6.39e23, 6779.0, 24.6, 16488.0, 227.9);
        Satelite fobos = new Satelite("Fobos", 1.06e16, 22.2, 7.66, 7.66, 9377.0, "Marte");
        Satelite deimos = new Satelite("Deimos", 1.47e15, 12.4, 30.3, 30.3, 23460.0, "Marte");

        marte.agregarSatelite(fobos);
        marte.agregarSatelite(deimos);

        sistema[contador++] = marte;
        sistema[contador++] = fobos;
        sistema[contador++] = deimos;

        System.out.println("--- LISTADO RAPIDO ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(sistema[i].toString());
        }

        System.out.println("\n--- DETALLES COMPLETOS ---");
        for (int i = 0; i < contador; i++) {
            verDatos(sistema[i]);
        }
    }

    public static void verDatos(Astro astro) {
        astro.muestraInformacion();
    }
}