package OrientacionAObjetos.CuentaBancaria;

public class CuentaBancaria {
    public double saldo;
    public String numeroCuenta;
    public Persona titular;
    public Persona autorizado;

    public CuentaBancaria(String numeroCuenta, Persona titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
        this.autorizado = null;
    }

    public void ingresar(double importe) {
        if (esImportePositivo(importe)) {
            this.saldo += importe;
            System.out.println("Ingreso realizado. Nuevo saldo: " + this.saldo);
        } else {
            System.out.println("Error: El importe debe ser positivo.");
        }
    }

    public void retirar(double importe) {
        if (esImportePositivo(importe)) {
            if (this.saldo >= importe) {
                this.saldo -= importe;
                System.out.println("Retirada realizada. Nuevo saldo: " + this.saldo);
            } else {
                System.out.println("Error: Saldo insuficiente.");
            }
        } else {
            System.out.println("Error: El importe debe ser positivo.");
        }
    }

    public void definirAutorizado(Persona p) {
        this.autorizado = p;
    }

    public void eliminarAutorizado(String dni) {
        if (validarDniAutorizado(dni)) {
            this.autorizado = null;
            System.out.println("Autorizado eliminado correctamente.");
        } else {
            System.out.println("Error: El DNI no coincide con el autorizado registrado.");
        }
    }

    public boolean esImportePositivo(double importe) {
        return importe > 0;
    }

    public boolean validarDniAutorizado(String dni) {
        return this.autorizado != null && this.autorizado.getDni().equals(dni);
    }

    public double getSaldo() {
        return saldo;
    }
}
