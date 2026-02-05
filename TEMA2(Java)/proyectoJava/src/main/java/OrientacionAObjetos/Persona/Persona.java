package OrientacionAObjetos.Persona;

 class Persona {
    //Atributos.
    String nombre;
    int edad;
    String lugarNacimiento;
    String deporteFavorito;
    String peliculaFavorita;

    //Contructores (parámetro).
     Persona(String nombre, int edad, String lugarNacimiento, String deporteFavorito, String peliculaFavorita) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarNacimiento = lugarNacimiento;
        this.deporteFavorito = deporteFavorito;
        this.peliculaFavorita = peliculaFavorita;
    }
    //Contructor por defecto.
     Persona() {
        this.nombre = "";
        this.edad = 0;
        this.lugarNacimiento = "";
        this.deporteFavorito = "";
        this.peliculaFavorita = "";
    }

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
