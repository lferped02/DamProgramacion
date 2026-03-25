package unidad4.Mapas.ComicFestEspaña.Controlador;

import unidad4.Mapas.ComicFestEspaña.Enums.TipoEntrada;
import unidad4.Mapas.ComicFestEspaña.Modelo.Influencers;
import unidad4.Mapas.ComicFestEspaña.Repositorio.RegistroEntradas;

import java.time.LocalDate;

public class GestionaComicFest {
    public static void main(String[] args) {
        RegistroEntradas registro = new RegistroEntradas();
        //Crear 9 influencers.
        Influencers p1 = new Influencers("Juan", "juanPL", 100000, "YouTube");
        Influencers p2 = new Influencers("Ana", "anaPL", 90000, "Instagram");
        Influencers p3 = new Influencers("Luis", "luisPL", 120000, "TikTok");

        Influencers g1 = new Influencers("Marta", "martaG", 80000, "YouTube");
        Influencers g2 = new Influencers("Pedro", "pedroG", 70000, "Instagram");
        Influencers g3 = new Influencers("Sofia", "sofiaG", 75000, "TikTok");

        Influencers s1 = new Influencers("Carlos", "carlosS", 50000, "YouTube");
        Influencers s2 = new Influencers("Laura", "lauraS", 45000, "Instagram");
        Influencers s3 = new Influencers("Diego", "diegoS", 60000, "TikTok");

        //Asignar entradas.
        registro.agregarEntradas(p1, "PL001", LocalDate.now(), TipoEntrada.PLATINIUM);
        registro.agregarEntradas(p2, "PL002", LocalDate.now(), TipoEntrada.PLATINIUM);
        registro.agregarEntradas(p3, "PL003", LocalDate.now(), TipoEntrada.PLATINIUM);

        registro.agregarEntradas(g1, "G001", LocalDate.now(), TipoEntrada.GOLD);
        registro.agregarEntradas(g2, "G002", LocalDate.now(), TipoEntrada.GOLD);
        registro.agregarEntradas(g3, "G003", LocalDate.now(), TipoEntrada.GOLD);

        registro.agregarEntradas(s1, "S001", LocalDate.now(), TipoEntrada.SILVER);
        registro.agregarEntradas(s2, "S002", LocalDate.now(), TipoEntrada.SILVER);
        registro.agregarEntradas(s3, "S003", LocalDate.now(), TipoEntrada.SILVER);

        //Buscar influencers.
        System.out.println("\nBuscando influencers.");
        System.out.println(registro.buscarEntradas("juanPL", "YouTube"));
        System.out.println(registro.buscarEntradas("noExiste", "Instagram"));

        //Confirmar asistencia para una entrada de cada tipo.
        System.out.println("\nConfirmando asistencia...");
        registro.confirmarAsistencia("juanPL", "YouTube");
        registro.confirmarAsistencia("martaG", "YouTube");
        registro.confirmarAsistencia("carlosS", "YouTube");

        //Cancelar asistencia para una entrada GOLD.
        System.out.println("\nCancelando asistencia...");
        registro.cancelarAsistencia("pedroG", "Instagram");

        //Mostrar estado final de todas las entradas.
        System.out.println("\nEstado final de entradas.");
        System.out.println(registro.buscarEntradas("juanPL", "YouTube"));
        System.out.println(registro.buscarEntradas("anaPL", "Instagram"));
        System.out.println(registro.buscarEntradas("luisPL", "TikTok"));
        System.out.println(registro.buscarEntradas("martaG", "YouTube"));
        System.out.println(registro.buscarEntradas("pedroG", "Instagram"));
        System.out.println(registro.buscarEntradas("sofiaG", "TikTok"));
        System.out.println(registro.buscarEntradas("carlosS", "YouTube"));
        System.out.println(registro.buscarEntradas("lauraS", "Instagram"));
        System.out.println(registro.buscarEntradas("diegoS", "TikTok"));
    }
}
