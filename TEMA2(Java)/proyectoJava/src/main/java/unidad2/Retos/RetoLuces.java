package unidad2.Retos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RetoLuces {
    static void main(String[] args) {
        RetoLuces ref = new RetoLuces();
        boolean resultado = ref.hayDevolucion();
        if(resultado)
        {
            System.out.println("Devolución");
        }
        else {
            System.out.println("No hay devolucion");
        }

        System.out.println(resultado);

    }
    boolean hayDevolucion(){
        boolean hay = false;
        int numeroLuces =0;

       for(int i =0; i <10; i++){
           Scanner escaner = new Scanner(System.in);
          System.out.println(" Dime si las luces estan estan apagadas: ");
           String luces = escaner.nextLine();
           if(luces.equals( "S")){
           //    System.out.println("La luz esta apagada");
               numeroLuces = numeroLuces +1;

           }
           if(numeroLuces > 5){
               hay = true;
           }
       }
        return hay;
    }
}
