package OrientacionAObjetos.Cubos;

public class GestionaLitros {
        public static void main(String[] args) {
            Cubo miCubo = new Cubo(4);

            System.out.println("Área: " + miCubo.calcularArea() + " dm2");
            System.out.println("Volumen: " + miCubo.calcularVolumen() + " litros");
            System.out.println("---------------------------------");

            System.out.println("Rellenar 6L: " + miCubo.rellenar(6));
            System.out.println("Vaciar 4L: " + miCubo.vaciar(4));
            System.out.println("Vaciar 3L: " + miCubo.vaciar(3));
            System.out.println("Rellenar 16L: " + miCubo.rellenar(16));

            System.out.println("Contenido final: " + miCubo.getContenidoActual() + " litros.");
        }
}
