package Herencia.Empresa;

public class GestionaIncidenciasEquipo {
    private static Incidencia[] listaIncidencias = new Incidencia[100];
    private static int contador = 0;

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("123", "Juan", "IT");
        Usuario usuario2 = new Usuario("456", "Maria", "Ventas");

        Dispositivo dispositivo1 = new Dispositivo("pcJuan", "AA:11", "Win", usuario1);
        Dispositivo dispositivo2 = new Dispositivo("pcMaria", "BB:22", "Linux", usuario2);
        Dispositivo dispositivo3 = new Dispositivo("pcAdmin", "CC:33", "Win", usuario1);
        Dispositivo dispositivo4 = new Dispositivo("pcVacio", "DD:44", "Win", usuario2);

        insertarIncidencia(new Incidencia(1, "Virus", "10/02", Criticidad.CRITICA, dispositivo1));
        insertarIncidencia(new Incidencia(2, "Lento", "11/02", Criticidad.MEDIA, dispositivo1));
        dispositivo1.setPendientes(2);

        insertarIncidencia(new Incidencia(3, "Disco", "01/01", Criticidad.GRAVE, dispositivo2));
        listaIncidencias[contador-1].setDiasTranscurridos(50);
        dispositivo2.setPendientes(1);

        insertarIncidencia(new Incidencia(4, "RAM", "12/02", Criticidad.LEVE, dispositivo3));
        dispositivo3.setPendientes(1);

        System.out.println("--- TODAS LAS INCIDENCIAS ---");
        imprimirTodas();

        System.out.println("--- SOLO URGENTES ---");
        imprimirUrgentes();
    }

    public static void insertarIncidencia(Incidencia i) {
        if (contador < listaIncidencias.length) {
            listaIncidencias[contador++] = i;
        }
    }

    public static void imprimirTodas() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaIncidencias[i]);
        }
    }

    public static void imprimirUrgentes() {
        for (int i = 0; i < contador; i++) {
            if (listaIncidencias[i].esUrgente()) {
                System.out.println(listaIncidencias[i]);
            }
        }
    }
}
