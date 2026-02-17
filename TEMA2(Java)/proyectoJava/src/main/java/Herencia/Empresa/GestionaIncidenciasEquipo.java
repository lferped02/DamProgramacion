package Herencia.Empresa;

public class GestionaIncidenciasEquipo {
    public static void main(String[] args) {
        Dispositivo pc1 = new Dispositivo("pcJuan", "3C:D9:2B:88:99:AA", "Win11");
        Dispositivo pc2 = new Dispositivo("pcMaria", "AA:BB:CC:11:22:33", "Linux");
        Dispositivo pc3 = new Dispositivo("pcAdmin", "FF:EE:DD:44:55:66", "WinServer");
        Dispositivo pc4 = new Dispositivo("pcVacio", "00:11:22:33:44:55", "MacOS");

        Incidencia i1 = new Incidencia(1, "Actualización JDK", "Error compilación", "10/02/2025", Criticidad.MEDIA, pc1);
        Incidencia i2 = new Incidencia(2, "Fallo RAM", "No arranca", "15/02/2025", Criticidad.CRITICA, pc1);
        pc1.setPendientes(2);

        Incidencia i3 = new Incidencia(3, "Disco Lleno", "Logs saturados", "01/02/2025", Criticidad.GRAVE, pc2);
        i3.setDiasTranscurridos(20);
        pc2.setPendientes(1);

        Incidencia i4 = new Incidencia(4, "Password", "Reseteo clave", "17/02/2025", Criticidad.LEVE, pc3);
        pc3.setPendientes(1);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);
        System.out.println(pc4);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}