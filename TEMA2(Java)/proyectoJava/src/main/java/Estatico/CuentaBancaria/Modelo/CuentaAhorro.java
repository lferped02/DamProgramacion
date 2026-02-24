package Estatico.CuentaBancaria.Modelo;

public class CuentaAhorro extends CuentaBancaria {
    private static final double saldoMinimo = 3000.0;

    public CuentaAhorro(String iban, double saldoInicial) {
        super(iban, saldoInicial);
    }

    @Override
    public void calcularIntereses() {
        double interesAplicado;

        if (saldo < saldoMinimo) {
            interesAplicado = interesAnualBasico / 2;
        } else {
            interesAplicado = interesAnualBasico * 2;
        }

        saldo += saldo * interesAplicado;
    }
}