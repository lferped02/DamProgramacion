package Herencia.Empresa;

public class Dispositivo {
    private String nombre;
    private String mac;
    private String so;
    private int incidentesPendientes;
    private Usuario usuario; // Relación con Usuario

    public Dispositivo(String nombre, String mac, String so, Usuario usuario) {
        this.nombre = nombre;
        this.mac = mac;
        this.so = so;
        this.usuario = usuario;
        this.incidentesPendientes = 0;
    }

    public String getNombre() { return nombre; }

    public void incrementarPendientes() {
        this.incidentesPendientes++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dispositivo) {
            Dispositivo otro = (Dispositivo) obj;
            return this.mac.equalsIgnoreCase(otro.mac);
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " (" + usuario.getNombre() + ") - " + mac + " : " + incidentesPendientes;
    }
}