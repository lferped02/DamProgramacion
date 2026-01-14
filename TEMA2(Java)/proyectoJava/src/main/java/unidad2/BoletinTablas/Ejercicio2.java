package unidad2.BoletinTablas;
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        String dia = sc.nextLine().toLowerCase(); switch (dia) {
            case "lunes": case "martes": case "miércoles": case "miercoles": case "jueves": case "viernes": System.out.println("Es un día laborable.");
            break;
            case "sábado": case "sabado": case "domingo":
                System.out.println("Es un día festivo.");
                break;
                default:
                    System.out.println("El día introducido no es válido.");
        }
    }
}
