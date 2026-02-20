package OrientacionAObjetos.PartidaJuegoMesa.Controlador;

import OrientacionAObjetos.PartidaJuegoMesa.Modelo.Participante;
import OrientacionAObjetos.PartidaJuegoMesa.Partida;

class GestionaTorneo {
     static void main(String[] args) {
        Participante p1 = new Participante("GamerX", "Juan", 25, 150);
        Participante p2 = new Participante("MeeplesKing", "Ana", 30, 200);
        Participante p3 = new Participante("DiceMaster", "Luis", 22, 120);
        Participante p4 = new Participante("LuckyLady", "Elena", 28, 180);

        Participante[] listaParticipantes = {p1, p2, p3, p4};

        Partida partida1 = new Partida("Catán - Ronda 1", listaParticipantes, "GamerX");
        Partida partida2 = new Partida("Catán - Ronda 2", listaParticipantes, "MeeplesKing");
        Partida partida3 = new Partida("Catán - Final", listaParticipantes, "LuckyLady");

        System.out.println("=== ESTADO DEL TORNEO ===");
        partida1.mostrarInfoPartida();
        System.out.println("-------------------------");
        partida2.mostrarInfoPartida();
        System.out.println("-------------------------");
        partida3.mostrarInfoPartida();
    }
}