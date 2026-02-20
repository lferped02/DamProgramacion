package OrientacionAObjetos.PartidaJuegoMesa.Modelo;

public class Participante {
     String nick;
     String nombre;
     int edad;
     int puntuacionTorneo;

     public Participante(String nick, String nombre, int edad, int puntuacionTorneo) {
        this.nick = nick;
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacionTorneo = puntuacionTorneo;
    }

     int getPuntuacionTorneo() {
        return puntuacionTorneo;
    }

     String getNick() {

         return nick;
    }

    @Override
    public String toString() {

         return nick + " (" + nombre + ")";
    }
}