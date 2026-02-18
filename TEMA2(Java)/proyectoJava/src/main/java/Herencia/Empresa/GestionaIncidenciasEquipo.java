package Herencia.Empresa;

public class GestionaIncidenciasEquipo {
    private Incidencia[] misIncidencias = new Incidencia[10];
    private int total = 0;

    public void agregarIncidencia(Incidencia inc) {
        if (total < misIncidencias.length) {
            misIncidencias[total] = inc;
            total++;
        }
    }

    public void imprimirTodas() {
        System.out.println("--- TODAS LAS INCIDENCIAS ---");
        for (int i = 0; i < total; i++) {
            System.out.println(misIncidencias[i]);
        }
    }

    public void imprimirUrgentes() {
        System.out.println("--- INCIDENCIAS URGENTES ---");
        for (int i = 0; i < total; i++) {
            if (misIncidencias[i].esUrgente()) {
                System.out.println(misIncidencias[i]);
            }
        }
    }

    public static void main(String[] args) {
        GestionaIncidenciasEquipo app = new GestionaIncidenciasEquipo();

        Usuario u1 = new Usuario("12345678A", "Juan", "IT");
        Usuario u2 = new Usuario("87654321B", "Ana", "Ventas");

        Dispositivo d1 = new Dispositivo("pcJuan", "3C:D9:2B:88:99:AA", "Win11", u1);
        Dispositivo d2 = new Dispositivo("pcAna", "AA:BB:CC:DD:EE:01", "Ubuntu", u2);
        Dispositivo d3 = new Dispositivo("pcLuis", "11:22:33:44:55:66", "macOS", u1);
        Dispositivo d4 = new Dispositivo("pcMarta", "FF:EE:DD:CC:BB:AA", "Win10", u2);

        app.agregarIncidencia(new Incidencia(1, "RAM", "Falla", Criticidad.CRITICA, d1));
        app.agregarIncidencia(new Incidencia(2, "JDK", "Update", Criticidad.LEVE, d1));
        app.agregarIncidencia(new Incidencia(3, "Virus", "Malware", Criticidad.GRAVE, d2));
        app.agregarIncidencia(new Incidencia(4, "Lento", "Limpieza", Criticidad.MEDIA, d3));

        System.out.println("LISTADO TOTAL:");
        app.imprimirTodas();

        System.out.println("\nINCIDENCIAS URGENTES:");
        app.imprimirUrgentes();

        System.out.println("\nESTADO DE EQUIPOS:");
        System.out.println(d1);
        System.out.println(d4);
    }
}