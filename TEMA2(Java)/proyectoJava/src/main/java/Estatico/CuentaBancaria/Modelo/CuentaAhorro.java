package Estatico.CuentaBancaria.Modelo;

public class CuentaAhorro extends CuentaBancaria {
    private static final double SALDO_MINIMO = 1000.0;

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        double interesAplicado;
        if (this.saldo < SALDO_MINIMO) {
            interesAplicado = INTERES_ANUAL_BASICO / 2;
        } else {
            interesAplicado = INTERES_ANUAL_BASICO * 2;
        }
        this.ingresar(this.saldo * interesAplicado);
    }
}