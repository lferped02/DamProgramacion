package unidad2.ExpresionesRegulares;

public class Ejercicio6{
    public static void main(String[] args) {
        String frase = "Hola tengo 23 años";
        System.out.println("¿Tiene algún número?: " + frase.matches(".*[0-9].*"));
    }
}
