package Estatico.CuentaBancaria.Controlador;

import Estatico.CuentaBancaria.Modelo.CuentaAhorro;
import Estatico.CuentaBancaria.Modelo.CuentaCorriente;
import Estatico.CuentaBancaria.Modelo.GestionaCuentas;

public class AplicacionBanco {
    public static void main(String[] args) {
        GestionaCuentas miBanco = new GestionaCuentas();

        CuentaCorriente cc = new CuentaCorriente("ES01", 500);
        CuentaAhorro ca = new CuentaAhorro("ES02", 2000);

        miBanco.agregarCuenta(cc);
        miBanco.agregarCuenta(ca);

        System.out.println("Saldos iniciales:");
        miBanco.mostrarCuentas();

        ca.traspaso(cc, 500);

        miBanco.aplicarInteresesGeneral();

        System.out.println("Saldos tras traspaso e intereses:");
        miBanco.mostrarCuentas();
    }
}
