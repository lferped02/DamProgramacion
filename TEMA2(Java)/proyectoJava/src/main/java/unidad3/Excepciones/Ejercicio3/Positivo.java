package unidad3.Excepciones.Ejercicio3;

public class Positivo {
    public int numeroPositivo(){
        int numero = -10;
        if (numero > 0){
            throw new ArithmeticException("Los número están en positivos: "+numero);
        } else {
            System.out.println("Los números están en negativos.");
        }
        return numero;
    }
}
