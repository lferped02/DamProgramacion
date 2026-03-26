package unidad4.Mapas.ComicFestEspaña.Controlador;


import unidad4.Mapas.ComicFestEspaña.Enums.EstadoEntrada;
import unidad4.Mapas.ComicFestEspaña.Enums.TipoEntrada;
import unidad4.Mapas.ComicFestEspaña.Modelo.EntradaVip;
import unidad4.Mapas.ComicFestEspaña.Modelo.Influencers;
import unidad4.Mapas.ComicFestEspaña.Repositorio.RegistroEntradas;

public class GestionaComicFest {

    public static void main(String[] args) {
        RegistroEntradas registro = new RegistroEntradas();

        // Crear influencers
        Influencers influencer = new Influencers("Ana", "anaYT", 1000000, "YouTube");
        Influencers influencer2 = new Influencers("Luis", "luisTW", 500000, "Twitch");
        Influencers influencer3 = new Influencers("Marta", "martaIG", 300000, "Instagram");

        Influencers influencer4 = new Influencers("Carlos", "carlosYT", 900000, "YouTube");
        Influencers influencer5 = new Influencers("Laura", "lauraTW", 600000, "Twitch");
        Influencers influencer6 = new Influencers("Pedro", "pedroIG", 200000, "Instagram");

        Influencers influencer7 = new Influencers("Sara", "saraYT", 800000, "YouTube");
        Influencers influencer8 = new Influencers("David", "davidTW", 400000, "Twitch");
        Influencers influencer9 = new Influencers("Elena", "elenaIG", 150000, "Instagram");

        // Asignar entradas
        registro.anadirEntrada(influencer, new EntradaVip("E1", "01/06", TipoEntrada.PLATINIUM));
        registro.anadirEntrada(influencer2, new EntradaVip("E2", "01/06", TipoEntrada.PLATINIUM));
        registro.anadirEntrada(influencer3, new EntradaVip("E3", "01/06", TipoEntrada.PLATINIUM));

        registro.anadirEntrada(influencer4, new EntradaVip("E4", "01/06", TipoEntrada.GOLD));
        registro.anadirEntrada(influencer5, new EntradaVip("E5", "01/06", TipoEntrada.GOLD));
        registro.anadirEntrada(influencer6, new EntradaVip("E6", "01/06", TipoEntrada.GOLD));

        registro.anadirEntrada(influencer7, new EntradaVip("E7", "01/06", TipoEntrada.SILVER));
        registro.anadirEntrada(influencer8, new EntradaVip("E8", "01/06", TipoEntrada.SILVER));
        registro.anadirEntrada(influencer9, new EntradaVip("E9", "01/06", TipoEntrada.SILVER));

        // Buscar
        System.out.println("Buscar existente: " + registro.buscarEntrada("anaYT", "YouTube"));
        System.out.println("Buscar inexistente: " + registro.buscarEntrada("fake", "TikTok"));

        // Confirmaciones
        registro.confirmar("anaYT", "YouTube");
        registro.confirmar("carlosYT", "YouTube");
        registro.confirmar("saraYT", "YouTube");

        // Cancelación
        registro.cancelar("lauraTW", "Twitch");

        // Listados
        System.out.println("\nCONFIRMADOS:");
        registro.listarPorEstado(EstadoEntrada.CONFIRMADA);

        System.out.println("\nCANCELADOS:");
        registro.listarPorEstado(EstadoEntrada.CANCELADA);

        System.out.println("\nPENDIENTES:");
        registro.listarPendientes();

        // Top 3
        System.out.println("\nTOP 3 INFLUENCERS:");
        registro.top3Influencers();
    }
}