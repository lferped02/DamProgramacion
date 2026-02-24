package Estatico.CuentaBancaria.Modelo;

public abstract class CuentaBancaria {
    protected String iban;
    protected double saldo;
    protected static final double interesAnualBasico = 0.02; // 2%

    public CuentaBancaria(String iban, double saldoInicial) {
        this.iban = iban;
        this.saldo = saldoInicial;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    private void anadir(double cantidad) {
        this.saldo += cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            anadir(cantidad);
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            anadir(-cantidad);
            return true;
        }
        return false;
    }

    public boolean traspasar(CuentaBancaria destino, double cantidad) {
        if (this.retirar(cantidad)) {
            destino.ingresar(cantidad);
            return true;
        }
        return false;
    }

    public abstract void calcularIntereses();

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "IBAN='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CuentaBancaria cuenta = (CuentaBancaria) obj;
        return iban.equals(cuenta.iban);
    }
}