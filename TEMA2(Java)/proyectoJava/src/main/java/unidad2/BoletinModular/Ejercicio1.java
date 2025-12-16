package unidad2.BoletinModular;

public class Ejercicio1 {
    public int sumar(int x, int y){
        int resultado = x+y;
        return resultado;
    }
    public int restar (int x, int y){
        int resultado = x-y;
        return resultado;
    }
    public int multiplicar (int x, int y){
        int resultado = x*y;
        return resultado;
    }
    public float dividir (float x, float y){
        float resultado = x/y;
        return resultado;
    }
    public static void main(String[]args) {
        Ejercicio1 variableEntera = new Ejercicio1();/*Se crea un objeto de la clase Ejercicio1 y se guarda en la
                                                      variable variableEntera.*/
        int totalSuma = variableEntera.sumar(144, 999);
        System.out.println("La suma es: "+totalSuma);
        int totalResta = variableEntera.restar(144, 999);
        System.out.println("La resta es: "+totalResta);
        int totalMultiplicacion = variableEntera.multiplicar(144,999);
        System.out.println("La multiplicacion es: "+totalMultiplicacion);
        float totaldivision = variableEntera.dividir(144, 999);
        System.out.println("La division es: "+totaldivision);
    }
}
