package OrientacionAObjetos.PartidaJuegoMesa.Modelo;

 class Partida {
     String nombreJuego;
     Participante[] participantes;
     String ganadorPartida;

     Partida(String nombreJuego, Participante[] participantes, String ganadorPartida) {
        this.nombreJuego = nombreJuego;
        this.participantes = participantes;
        this.ganadorPartida = ganadorPartida;
    }

     Participante obtenerLiderTorneo() {
        if (participantes == null || participantes.length == 0) return null;

        Participante lider = participantes[0];
        for (int i = 1; i < participantes.length; i++) {
            if (participantes[i].getPuntuacionTorneo() > lider.getPuntuacionTorneo()) {
                lider = participantes[i];
            }
        }
        return lider;
    }

     void mostrarInfoPartida() {
        System.out.println("Juego: " + nombreJuego);
        System.out.println("Ganador de esta partida: " + ganadorPartida);
        Participante lider = obtenerLiderTorneo();
        System.out.println("Líder del torneo entre estos jugadores: " + lider.getNick() +
                " con " + lider.getPuntuacionTorneo() + " puntos.");
    }
}