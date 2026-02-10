package EnumOrientacion.Anime;

public class Luffy extends PersonajeAnime{
    private String fruta;
    private boolean estaEnAgua;

    public Luffy(String nombre){
        super(nombre);
    }

     void reir(){
        System.out.println("Está riendo.");
    }

    public String getFruta() {

        return fruta;
    }

    public void setFruta(String fruta) {

        this.fruta = fruta;
    }

    public boolean isEstaEnAgua() {
        return estaEnAgua;
    }

    public void setEstaEnAgua(boolean estaEnAgua) {
        this.estaEnAgua = estaEnAgua;
    }

    @Override
    public String toString() {
        return "Luffy{" +
                "nombre='" + getNombre() + '\'' +
                ", transformacion=" + getTransformacion() +
                ", edad=" + getEdad() +
                ", serie=" + getSerie() +
                '}';
    }
}
