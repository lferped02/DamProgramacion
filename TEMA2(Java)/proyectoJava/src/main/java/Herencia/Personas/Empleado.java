package Herencia.Personas;

public  class Empleado extends Persona{
    @Override
    protected void comer() {
        System.out.println("Está comiendo el empleado.");
    }

    public Empleado(String dni) {
        super(dni);
    }
}
