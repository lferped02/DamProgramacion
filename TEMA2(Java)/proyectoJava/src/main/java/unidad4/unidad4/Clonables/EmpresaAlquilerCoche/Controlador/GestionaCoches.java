package unidad4.Clonables.EmpresaAlquilerCoche.Controlador;

import unidad4.Clonables.EmpresaAlquilerCoche.Modelo.Coche;
import unidad4.Clonables.EmpresaAlquilerCoche.Modelo.Combustible;
import unidad4.Clonables.EmpresaAlquilerCoche.Modelo.Motor;

public class GestionaCoches {
    public static void main(String[] args) {
        //Motor:
        Motor motor1 = new Motor(Combustible.GASOLINA, 100, false);
        Motor motor2 = null;

        try {
            motor2 = (Motor) motor1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error al clonar.");
        }
        motor2.setTipo(Combustible.DIESEL);

        System.out.println("Motor 1: " + motor1);
        System.out.println("Motor 2: " + motor2);

        //Coche:
        Coche coche1 = new Coche("1234MYL", "Toyota", 300, motor1);

        try {
            Coche coche2 = coche1.clone();
            coche2.getMotor().setTipo(Combustible.DIESEL);
            coche2.getMotor().setCv(300);

            System.out.println("\nCoche original:");
            System.out.println(coche1);

            System.out.println("\nCoche copia:");
            System.out.println(coche2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Error al clonar coche.");
        }
    }
}