package EnumOrientacion.Persona.Controlador;

import EnumOrientacion.Persona.Modelo.Persona;

public class GestionaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Lorena", "Lopez", "12345678A", 1998);
        Persona persona2 = new Persona("Lorena", "Lopez", "12345678A", 1998);

        System.out.println(persona==persona2);
        System.out.println(persona.equals(persona2));
    }
}

