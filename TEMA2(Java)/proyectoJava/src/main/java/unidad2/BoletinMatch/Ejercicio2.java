package unidad2.BoletinMatch;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dia: ");
        String dia = scanner.nextLine();
        switch (dia){
            case "Lunes":
                System.out.println("======================");
                System.out.println("========LUNES=========");
                System.out.println("====8:00-9:00  ENT====");
                System.out.println("====9:00-10:00  BD====");
                System.out.println("====10:00-11:00 BD====");
                System.out.println("========RECREO========");
                System.out.println("====11:30-12:30 LM====");
                System.out.println("====12:30-13:30 LM====");
                System.out.println("====13:30-14:30 DI====");
                break;
            case "Sabado y domingo":
                System.out.println("Dia de estudio y reflexion");
                break;
            default:
                System.out.println("El valor es incorrecto");
        }
    }
}
