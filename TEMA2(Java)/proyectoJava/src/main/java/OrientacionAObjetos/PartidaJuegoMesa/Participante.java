package OrientacionAObjetos.PartidaJuegoMesa;

public class Participante {
    public String nick;
    public String nombre;
    public int edad;
    public int puntuacionTorneo;

    public Participante(String nick, String nombre, int edad, int puntuacionTorneo) {
        this.nick = nick;
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacionTorneo = puntuacionTorneo;
    }

    public int getPuntuacionTorneo() {
        return puntuacionTorneo;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return nick + " (" + nombre + ")";
    }
}