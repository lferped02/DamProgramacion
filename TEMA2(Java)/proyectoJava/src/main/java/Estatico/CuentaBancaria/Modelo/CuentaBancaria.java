package Estatico.CuentaBancaria.Modelo;

public abstract class CuentaBancaria {
    protected String iban;
    protected double saldo;
    protected static final double INTERES_ANUAL_BASICO = 0.02;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {

        return saldo; }

    private void añadir(double cantidad) {
        this.saldo += cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) añadir(cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            añadir(-cantidad);
        }
    }

    public void traspaso(CuentaBancaria destino, double cantidad) {
        if (this.saldo >= cantidad) {
            this.retirar(cantidad);
            destino.ingresar(cantidad);
        }
    }

    public abstract void calcularIntereses();

    @Override
    public String toString() {
        return "IBAN: " + iban + " | Saldo: " + saldo + "€";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CuentaBancaria otra = (CuentaBancaria) obj;
        return iban.equals(otra.iban);
    }
}