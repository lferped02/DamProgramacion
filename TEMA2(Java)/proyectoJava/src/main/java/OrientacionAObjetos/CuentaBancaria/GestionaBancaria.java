package OrientacionAObjetos.CuentaBancaria;

import java.time.LocalDate;

public class GestionaBancaria {
    public static void main(String[] args) {
        Persona titular = new Persona("12345678A", "Ana", "García", LocalDate.of(1990, 5, 15));
        Persona amigo = new Persona("87654321B", "Juan", "Pérez", LocalDate.of(2005, 10, 20));

        CuentaBancaria cuenta = new CuentaBancaria("ES2100010001", titular);

        System.out.println("--- Operaciones de Saldo ---");
        cuenta.ingresar(1000.0);
        cuenta.retirar(200.0);
        cuenta.ingresar(-50.0);

        System.out.println("\n--- Gestión de Autorizados ---");
        cuenta.definirAutorizado(amigo);

        cuenta.eliminarAutorizado("32165489A");
        cuenta.eliminarAutorizado("87654321B");

        if (titular.esMayorDeEdad()) {
            System.out.println("\nEl titular " + titular.getDni() + " es apto para contratos legales.");
        }
    }
}