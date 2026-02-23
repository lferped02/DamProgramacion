package Estatico.CuentaBancaria.Modelo;

import java.util.ArrayList;

public class GestionaCuentas {
    private ArrayList<CuentaBancaria> cuentas;

    public GestionaCuentas() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria c) {
        cuentas.add(c);
    }

    public void mostrarCuentas() {
        for (CuentaBancaria c : cuentas) {
            System.out.println(c.toString());
        }
    }

    public void informacionDetallada(String iban) {
        for (CuentaBancaria c : cuentas) {
            if (c.getIban().equals(iban)) {
                System.out.println("INFO: " + c.toString());
                return;
            }
        }
        System.out.println("Cuenta no encontrada.");
    }

    public void aplicarInteresesGeneral() {
        for (CuentaBancaria c : cuentas) {
            c.calcularIntereses();
        }
    }
}
