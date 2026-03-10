package unidad3.Excepciones.Ejercicio4;

import java.util.Random;

public class Division {
    public static void realizarDivisiones() {
        int[] tabla = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero1 = random.nextInt(11);
            int numero2 = random.nextInt(11);
            try {
                int resultado = numero1 / numero2;
                if (i == 9) {
                    tabla[10] = resultado;
                } else {
                    tabla[i] = resultado;
                }
                System.out.println(numero1 + " / " + numero2 + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Intentando guardar en la posición 10");
            }
        }
    }
}
