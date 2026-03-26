package unidad4.Mapas.ComicFestEspaña.Modelo;

import java.util.Objects;

public class Influencers {
    private String nombre;
    private String nick;
    private int numeroSeguidores;
    private String plataforma;

    public Influencers(String nombre, String nick, int numeroSeguidores, String plataforma) {
        this.nombre = nombre;
        this.nick = nick;
        this.numeroSeguidores = numeroSeguidores;
        this.plataforma = plataforma;
    }

    public Influencers(String nick, String plataforma) {
        this.nick = nick;
        this.plataforma = plataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Influencers)) return false;
        Influencers that = (Influencers) o;
        return nick.equals(that.nick) && plataforma.equals(that.plataforma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, plataforma);
    }
}