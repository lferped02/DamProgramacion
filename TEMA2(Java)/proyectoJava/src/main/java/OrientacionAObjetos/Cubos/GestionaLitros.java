package OrientacionAObjetos.Cubos;

 class GestionaLitros {
     static void main(String[] args) {
        Cubo miCubo = new Cubo(4);
        System.out.println("--- Datos del Cubo ---");
        System.out.println("Área total: " + miCubo.calcularArea() + " dm2");
        System.out.println("Volumen: " + miCubo.calcularVolumenCm3() + " cm3");
        System.out.println("Capacidad máxima: " + miCubo.capacidadMaxima() + " litros");

        System.out.println("\n--- Operaciones de líquido ---");
        System.out.println("Rellenar 6L: " + miCubo.rellenar(6));
        System.out.println("Vaciar 4L: " + miCubo.vaciar(4));
        System.out.println("Vaciar 3L: " + miCubo.vaciar(3));
        System.out.println("Rellenar 16L: " + miCubo.rellenar(16));
        System.out.println("\nEstado final: " + miCubo);
    }
}