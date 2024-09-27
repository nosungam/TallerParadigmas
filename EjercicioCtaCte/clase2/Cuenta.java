package Clase2.EjercicioCtaCte;

public class Cuenta {
    private String numeroCuenta;
    private Persona titular;
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, Persona titular, float saldo) {
        this.numeroCuenta = numeroCuenta;
        if (titular.esTitularValido()){ this.titular = titular;}
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        if (titular.esTitularValido()){ this.titular = titular;}
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
                ", titular='" + this.titular.getNombre() + ' '+ this.titular.getApellido() + '\'' +
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
