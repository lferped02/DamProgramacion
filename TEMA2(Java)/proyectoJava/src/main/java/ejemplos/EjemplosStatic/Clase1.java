package ejemplos.EjemplosStatic;

public class Clase1 {
    public static void estatico (){
        System.out.println("Es estático.");
    }
    public void noEstatico(){
        System.out.println("No es estático.");
    }
    static void main(String[] args) {
        Clase1 e = new Clase1();
        Clase1.estatico();
        e.noEstatico();
        //Clase1.noEstatico();
    }
}
