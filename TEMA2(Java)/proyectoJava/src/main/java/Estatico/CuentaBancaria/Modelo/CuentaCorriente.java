package Estatico.CuentaBancaria.Modelo;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        double interes = this.saldo * INTERES_ANUAL_BASICO;
        this.ingresar(interes);
    }
}
