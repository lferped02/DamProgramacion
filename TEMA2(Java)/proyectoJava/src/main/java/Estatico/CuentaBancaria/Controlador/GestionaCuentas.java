package Estatico.CuentaBancaria.Controlador;

import Estatico.CuentaBancaria.Modelo.CuentaAhorro;
import Estatico.CuentaBancaria.Modelo.CuentaBancaria;
import Estatico.CuentaBancaria.Modelo.CuentaCorriente;

public class GestionaCuentas {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaCorriente("ES123", 1000);
        CuentaBancaria c2 = new CuentaAhorro("ES456", 5000);

        c1.ingresar(500);
        c1.traspasar(c2, 300);

        c1.calcularIntereses();
        c2.calcularIntereses();

        System.out.println(c1);
        System.out.println(c2);
    }
}