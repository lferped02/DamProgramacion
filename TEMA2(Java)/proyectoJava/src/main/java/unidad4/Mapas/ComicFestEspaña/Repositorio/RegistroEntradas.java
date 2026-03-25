package unidad4.Mapas.ComicFestEspaña.Repositorio;

import unidad4.Mapas.ComicFestEspaña.Enums.EstadoEntrada;
import unidad4.Mapas.ComicFestEspaña.Enums.TipoEntrada;
import unidad4.Mapas.ComicFestEspaña.Modelo.EntradaVip;
import unidad4.Mapas.ComicFestEspaña.Modelo.Influencers;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class RegistroEntradas {
    private Map<Influencers, EntradaVip> entradas = new HashMap<>();

    public void agregarEntradas(Influencers i, String codigo, LocalDate fecha, TipoEntrada t) {
        if (!entradas.containsKey(i)) {
            EntradaVip nueva = new EntradaVip(codigo, fecha, t, EstadoEntrada.ENVIADA);
            entradas.put(i, nueva);
            System.out.println("Entrada asignada a " + i.getNick());

        } else {
            System.out.println("ERROR: el influencer ya tiene entrada.");
        }
    }

    public EntradaVip buscarEntradas(String nick, String plataforma) {
        Influencers i = new Influencers(nick, plataforma);
        return entradas.get(i);
    }
}