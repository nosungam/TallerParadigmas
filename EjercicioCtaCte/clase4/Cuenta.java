package Clase4.EjercicioCtaCte;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String numeroCuenta;
    private Clase4.EjercicioCtaCte.Persona titular;
    private float saldo;
    private List<DetalleCuenta> detalleCuenta = new ArrayList<>();

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, Persona titular, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
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
                ", titular='" + this.titular.getNombre() + ' ' + this.titular.getApellido() + '\'' +
                ", saldo=" + this.saldo +
                '}';
    }

    public void ingresar(float cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            detalleCuenta.add(new DetalleCuenta("Ingreso", cantidad));
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0) {
            this.saldo -= cantidad;
            detalleCuenta.add(new DetalleCuenta("Retiro", cantidad));
        }
    }

    public void mostrarDetalleCuenta() {
        for (DetalleCuenta detalle : detalleCuenta) {
            System.out.println(detalle.toString());
        }
    }

    // Método a sobreescribir en las subclases si es necesario
    public boolean esTitularValido() {
        return titular.getEdad() > 18;
    }
}