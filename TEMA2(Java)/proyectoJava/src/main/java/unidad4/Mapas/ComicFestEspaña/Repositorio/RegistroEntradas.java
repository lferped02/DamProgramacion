package unidad4.Mapas.ComicFestEspaña.Repositorio;

import unidad4.Mapas.ComicFestEspaña.Enums.EstadoEntrada;
import unidad4.Mapas.ComicFestEspaña.Modelo.EntradaVip;
import unidad4.Mapas.ComicFestEspaña.Modelo.Influencers;

import java.util.*;

public class RegistroEntradas {

    private Map<Influencers, EntradaVip> registro = new HashMap<>();

    // Añadir entrada
    public void anadirEntrada(Influencers i, EntradaVip entrada) {
        if (registro.containsKey(i)) {
            System.out.println("El influencer ya tiene entrada.");
        } else {
            registro.put(i, entrada);
        }
    }

    // Buscar entrada
    public EntradaVip buscarEntrada(String nick, String plataforma) {
        for (Influencers i : registro.keySet()) {
            if (i.getNick().equals(nick) && i.getPlataforma().equals(plataforma)) {
                return registro.get(i);
            }
        }
        return null;
    }

    // Confirmar
    public void confirmar(String nick, String plataforma) {
        EntradaVip e = buscarEntrada(nick, plataforma);
        if (e != null) e.confirmar();
    }

    // Cancelar
    public void cancelar(String nick, String plataforma) {
        EntradaVip e = buscarEntrada(nick, plataforma);
        if (e != null) e.cancelar();
    }

    // Listados
    public void listarPorEstado(EstadoEntrada estado) {
        for (Map.Entry<Influencers, EntradaVip> entry : registro.entrySet()) {
            if (entry.getValue().getEstado() == estado) {
                System.out.println(entry.getKey());
            }
        }
    }

    // Pendientes
    public void listarPendientes() {
        listarPorEstado(EstadoEntrada.ENVIADA);
    }

    // Top 3 influencers
    public void top3Influencers() {
        registro.entrySet().stream()
                .sorted((a, b) -> b.getKey().getNumeroSeguidores() - a.getKey().getNumeroSeguidores())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue().getTipo()));
    }
}