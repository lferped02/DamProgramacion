package Herencia.Personas.Controlador;

import Herencia.Personas.Modelo.Empleado;
import Herencia.Personas.Modelo.Persona;

public class GestionaPersonas {
    public static void main(String[] args) {
        Persona persona = new Empleado("12345678L");
        persona.comer();
    }
}
