package Excepciones.ClaveMorse.Controlador;

import Excepciones.ClaveMorse.Modelo.CaracterNoTraducibleException;
import Excepciones.ClaveMorse.Modelo.TraductorMorse;

public class GestionaTraductor {
    public static void main(String[] args) {
        TraductorMorse traductor = new TraductorMorse();
        String[] textos = {
                "HOLA",
                "JAVA",
                "SOS",
                "HELLO WORLD",
                "HOLA@MUNDO"
        };

        for (String texto : textos) {
            try {
                String morse = traductor.traducir(texto);
                System.out.println("Texto: " + texto);
                System.out.println("Morse: " + morse);
                System.out.println();
            } catch (CaracterNoTraducibleException e) {
                System.out.println("Error al traducir: " + texto);
                System.out.println("Carácter no permitido: " + e.getCaracter());
                System.out.println("Posición: " + e.getPosicion());
                System.out.println();
            }
        }
    }
}
