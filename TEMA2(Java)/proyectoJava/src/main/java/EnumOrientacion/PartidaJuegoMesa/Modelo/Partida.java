package EnumOrientacion.PartidaJuegoMesa.Modelo;

import java.util.Arrays;

public class Partida {
    private String nombreJuego;
    private Participante[] participantes;
    private Participante ganador;

    public Partida() {
        this.participantes = new Participante[4];
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public Participante getGanador() {
        return ganador;
    }

    public void setGanador(Participante ganador) {
        this.ganador = ganador;
    }
    public Participante calculaParticipanteMasPuntos() {
        int puntuacion = 0;
        Participante p1 = participantes[0];
        for (int i =0; i< participantes.length; i++){
            Participante p = this.participantes[i];
            if(p.getPuntuacion()>puntuacion){
                puntuacion = p.getPuntuacion();
                p1 = p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "nombreJuego='" + nombreJuego + '\'' +
                ", participantes=" + Arrays.toString(participantes) +
                ", ganador=" + ganador +
                '}';
    }
}
