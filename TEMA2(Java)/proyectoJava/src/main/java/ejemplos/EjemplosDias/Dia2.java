package ejemplos.EjemplosDias;

import java.util.Scanner;

public class Dia2 {
    public static void main(String[] args) {
        int entero;
        float y = 4.0F;
        float z = 3.0F;
        float resultado = y / z - y * z;
        System.out.println(resultado);
        int numero = (int) 3.5;
        System.out.println(numero);

        float numero2 = 3.12123F;
        double decimalGrande = numero2; //Casting implícito porque NO pierdo información
        numero2 = (float) decimalGrande; //Casting explícito porque pierdo información
        entero = (int) numero2; //Casting explícito porque pierdo información
        System.out.println(numero2);
        System.out.println(entero);

        Scanner scanner = new Scanner(System.in);
        String cadena = scanner.next();//Lee espacio en blanco y guarda en variable llamada cadena
        String linea = scanner.nextLine(); //Lee la frase entera con espacio
        //int numeroEntero = scanner.nextInt(); //Lee la frase entera con espacio
        System.out.println(cadena);
        System.out.println(linea);

        System.out.println("Dime el nombre de tu pais: ");
        String pais = scanner.nextLine(); //Sirve para leer toda una línea de texto ingresada por el usuario desde la consola, incluyendo espacios en blanco
        System.out.println(pais);

    }
}
