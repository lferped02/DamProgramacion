package Herencia.Empresa;

public class Dispositivo {
    private String nombre;
    private String mac;
    private String sistemaOperativo;
    private int pendientes;

    public Dispositivo(String nombre, String mac, String sistemaOperativo) {
        this.nombre = nombre;
        this.mac = mac;
        this.sistemaOperativo = sistemaOperativo;
        this.pendientes = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPendientes(int pendientes) {
        this.pendientes = pendientes;
    }

    @Override
    public boolean equals(Object obj) {
        Dispositivo otro = (Dispositivo) obj;
        return this.mac.equalsIgnoreCase(otro.mac);
    }

    @Override
    public String toString() {
        return nombre + " - " + mac + " : " + pendientes;
    }
}