package Estatico.CuentaBancaria.Modelo;

import java.time.LocalDate;

public class CuentaBancaria {
    private static int contadorId = 1;
    private int id;
    private double saldo;
    private LocalDate fechaApertura;
    private String iban;
    private Cliente titular;
    private Cliente autorizado;

    public CuentaBancaria(double saldo, String iban, Cliente titular, Cliente autorizado) {
        this.id = contadorId++;
        this.saldo = saldo;
        this.fechaApertura = LocalDate.now();
        this.iban = iban;
        this.titular = titular;
        this.autorizado = autorizado;
    }

    // Getters para comprobación
    public int getId() {
        return id;
    }

    public Cliente getTitular() {
        return titular;
    }

    public Cliente getAutorizado() {
        return autorizado;
    }

    @Override
    public String toString() {
        String aut = (autorizado != null) ? autorizado.toString() : "Ninguno";
        return "ID: " + id + " | IBAN: " + iban + " | Titular: " + titular + " | Autorizado: " + aut;
    }
}
