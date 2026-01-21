package unidad2.BoletinMatrices;

import java.util.Scanner;

public class ControlAforoCine {
    public static void main(String[] args) {
        boolean[][] sala = new boolean[3][4];
        ControlAforoCine referencia = new ControlAforoCine();
        int numeroTotal = referencia.registrarEspectadores(sala);
        System.out.println("Proceso terminado. Total espectadores: " + numeroTotal);
    }
    public int registrarEspectadores(boolean[][] mapaSala) {
        Scanner scanner = new Scanner(System.in);
        int numeroEspectadores = 0;
        System.out.print("Introduce fila: ");
        int fila = scanner.nextInt();
        while (fila >= 0) {
            System.out.print("Introduce columna: ");
            int columna = scanner.nextInt();
            mapaSala[fila][columna] = true;
            numeroEspectadores++;
            System.out.println("Asiento ocupado con éxito.");
            System.out.print("Introduce otra fila: ");
            fila = scanner.nextInt();
        }
        return numeroEspectadores;
    }
    public int calculaTotalPersonasPorFilas(boolean[][]sala, int numeroFila){
        boolean[] fila = sala [numeroFila];
        int contador = 0;
        for(int i=0; i<fila.length;i++){
            if (fila[i]){
                contador = contador+1;
            }
        }
        return numeroFila;
    }
}