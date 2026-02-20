package EnumOrientacion.CuentaBancaria.Modelo;

public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;
    private Persona titular;
    private Persona autorizado;

    public CuentaBancaria(String numeroCuenta, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
        this.autorizado = null;
    }

    public double ingresarDinero(double importe) {
        if (validarImportePositivo(importe)) {
            this.saldo += importe;
        }
        return importe;
    }

    public double retirarDinero(double importe) {
        if (validarImportePositivo(importe)) {
            if (this.saldo >= importe) {
                this.saldo -= importe;
            }
        }
        return importe;
    }

    private boolean validarImportePositivo(double importe) {
        return importe > 0;
    }

    public void eliminarAutorizado(String dniRecibido) {
        if (validarTieneAutorizado(dniRecibido)) {
            this.autorizado = null;
        }
    }

    private boolean validarTieneAutorizado(String dniRecibido) {
        return this.autorizado != null && this.autorizado.getDni().equals(dniRecibido);
    }

    public void setAutorizado(Persona persona) {

        this.autorizado = persona;
    }

    public double getSaldo() {

        return saldo;
    }
}
