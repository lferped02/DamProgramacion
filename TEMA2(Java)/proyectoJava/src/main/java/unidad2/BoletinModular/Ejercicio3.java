package unidad2.BoletinModular;

import java.util.Scanner;

public class Ejercicio3 {
    public int area (int alto, int ancho){
        return alto*ancho;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio3 areaRectangular = new Ejercicio3();
        System.out.println("Dame el alto del rectangulo: ");
        int alto = scanner.nextInt();
        System.out.println("Dame el ancho del rectangulo: ");
        int ancho = scanner.nextInt();
        int resultado = areaRectangular.area(alto, ancho);
        System.out.println("Calcula el area de un rectangulo: "+resultado);
    }
}
