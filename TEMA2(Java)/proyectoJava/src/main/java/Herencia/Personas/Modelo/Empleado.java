package Herencia.Personas.Modelo;

public  class Empleado extends Persona{
    @Override
    public void comer() {
        System.out.println("Está comiendo el empleado.");
    }

    public Empleado(String dni) {
        super(dni);
    }
}
