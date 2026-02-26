package EnumOrientacion.PartidaJuegoMesa.Controlador;

import EnumOrientacion.PartidaJuegoMesa.Modelo.Participante;
import EnumOrientacion.PartidaJuegoMesa.Modelo.Partida;

public class GestionaTorneo {
   public static void main(String[] args) {
      Partida partida = new Partida();

      Participante p1 = new Participante("Jugador1", "Ana", 23, 200);
      Participante p2 = new Participante("Jugador2", "Berto", 26, 250);
      Participante p3 = new Participante("Jugador3", "Carla", 20, 300);
      Participante p4 = new Participante("Jugador4", "Dani", 18, 400);

      Participante[] lista = {p1, p2, p3, p4};
      partida.setParticipantes(lista);

      Participante ganador = partida.calculaParticipanteMasPuntos();
      partida.setGanador(ganador);

      System.out.println("En la partida de " + partida.getNombreJuego());
      System.out.println("El ganador es: " + partida.getGanador().getNick() +
              " con " + partida.getGanador().getPuntuacion() + " puntos.");
   }
}