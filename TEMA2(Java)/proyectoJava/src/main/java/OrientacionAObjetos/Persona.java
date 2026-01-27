package OrientacionAObjetos;

public class Persona {
    //Atributos.
    String nombre;
    int edad;
    String lugarNacimiento;
    String deporteFavorito;
    String peliculaFavorita;

    //Contructores.


    //Métodos.
    void hablar(){
        System.out.println(nombre+ " está hablando.");
    }

    boolean haRobado(){
    return false;
    }

    void comer(){
        System.out.println(nombre+ " está comiendo.");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", deporteFavorito='" + deporteFavorito + '\'' +
                ", peliculaFavorita='" + peliculaFavorita + '\'' +
                '}';
    }

}
