package Estatico.TiendaAnimales.Modelo;

public class Perro extends Mascota {
    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String estado, String fechaNacimiento, double peso, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento, peso);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    @Override public void muestra() {
        System.out.println(this + " Raza: " + raza + " Pulgas: " + pulgas);
    }

    @Override public boolean habla() {
        return false;
    }
}
