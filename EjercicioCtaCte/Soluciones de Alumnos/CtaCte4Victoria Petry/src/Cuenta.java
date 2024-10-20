import java.util.ArrayList;

public class Cuenta {
    public Titular titular;
    private double saldoDisponible;
    ArrayList<Movimiento> movimientos;

    public Cuenta(Titular titular, double saldoDisponible) {
        this.titular = titular;
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public void ingresosCuenta(double cant) {
        this.saldoDisponible += cant;

    }
    public void egresosCuenta(double cant) {
        this.saldoDisponible -= cant;
    }

    public String toString(){
        if (this.titular.verificarEdad() == 1) {
            return "cuenta{" +
                    "nombreCliente='" + this.titular.nombreCompleto() + '\'' +
                    ", saldoDisponible=" + this.saldoDisponible +
                    '}';
        } else{
            return "Es menor de edad";
        }
    }
}

