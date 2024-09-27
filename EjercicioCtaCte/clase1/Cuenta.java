package Clase1.EjercicioCtaCte;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private float saldo;

    public Cuenta() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta='" + this.numeroCuenta + '\'' +
                ", titular='" + this.titular + '\'' +
                ", saldo=" + this.saldo +
                '}';
    }

    public void ingresar(float cantidad) {
        if (cantidad > 0) {
            //this.setSaldo(this.getSaldo() + cantidad);
            this.saldo += cantidad;
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0) {
            //this.setSaldo(this.getSaldo() - cantidad);
            this.saldo -= cantidad;
        }
    }
}
