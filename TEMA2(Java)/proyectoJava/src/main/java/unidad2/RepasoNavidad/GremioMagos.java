package RepasoNavidad;

import java.util.Scanner;

public class GremioMagos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Mago, identifícate (Usuario): ");
        String usuarioLeido = teclado.nextLine();

        System.out.print("Introduce tu clave rúnica: ");
        String claveLeida = teclado.nextLine();

        if (validarAcceso(usuarioLeido, claveLeida)) {
            System.out.println("Acceso concedido, " + usuarioLeido.trim().toUpperCase() + ".");
            System.out.println("Introduce el conjuro con ruido:");
            String mensajeSucio = teclado.nextLine();

            String mensajeLimpio = limpiarConjuro(mensajeSucio);
            cifradoDelConjuro(mensajeLimpio);
        } else {
            System.out.println("Acceso denegado. La magia no reconoce tus credenciales.");
        }
    }
    public static boolean validarAcceso(String user, String pass) {
        boolean largoCorrecto = pass.length() >= 8;
        boolean tieneSimbolo = pass.contains("#") || pass.contains("*");
        return largoCorrecto && tieneSimbolo;
    }
    public static String limpiarConjuro(String texto) {
        String censurado = texto.replace("maldición", "bendición");
        return censurado.toUpperCase();
    }
    public static void cifradoDelConjuro(String texto) {
        System.out.println("\n--- Análisis del Conjuro ---");
        System.out.println("Mensaje sin cifrar: " + texto);
        System.out.println("Longitud: " + texto.length() + " caracteres.");
        String mensajeInvertido = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            mensajeInvertido = mensajeInvertido + texto.charAt(i);
        }
        System.out.println("Mensaje Cifrado: " + mensajeInvertido);
        }
    }