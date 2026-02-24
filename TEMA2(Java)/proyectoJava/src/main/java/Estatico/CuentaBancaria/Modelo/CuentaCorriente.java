package Estatico.CuentaBancaria.Modelo;

public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(String iban, double saldoInicial) {
        super(iban, saldoInicial);
    }

    @Override
    public void calcularIntereses() {
        double intereses = saldo * interesAnualBasico;
        saldo += intereses;
    }
}