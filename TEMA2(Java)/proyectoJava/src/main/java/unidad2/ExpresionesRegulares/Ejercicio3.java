package unidad2.ExpresionesRegulares;

public class Ejercicio3 {
    public static void main(String[] args) {
        String contrasenia = "01234567";
        System.out.println("La contraseña es: " + contrasenia.matches(".{8,}"));
    }
}
