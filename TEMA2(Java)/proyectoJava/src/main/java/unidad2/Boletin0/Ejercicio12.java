package unidad2.Boletin0;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        int contrasena = scanner.nextInt();

        while(contrasena != 1234){
            System.out.println("Dime la nueva la contraseña: ");
            contrasena = scanner.nextInt();
        }
        System.out.println("Bienvenido");
    }
}
