package Estatico.CuentaBancaria.Controlador;

import Estatico.CuentaBancaria.Modelo.Cliente;
import Estatico.CuentaBancaria.Modelo.CuentaBancaria;

public class GestionaCuentas {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana", "García", "12345678X");
        Cliente cliente2 = new Cliente("Luis", "Pérez", "87654321Y");
        Cliente cliente3 = new Cliente("Marta", "López", "55555555Z");

        CuentaBancaria cuenta1 = new CuentaBancaria(1500.0, "ES210001...", cliente1, cliente2);
        CuentaBancaria cuenta2 = new CuentaBancaria(3000.5, "ES210002...", cliente2, null);
        CuentaBancaria cuenta3 = new CuentaBancaria(50.0,   "ES210003...", cliente3, cliente1);

        System.out.println("Listado de Cuentas.");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

        System.out.println("Comprobación de autoincremento:");
        if (cuenta3.getId() > cuenta1.getId()) {
            System.out.println("Éxito: El identificador se ha incrementado correctamente.");
        }
    }
}