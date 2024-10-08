public class Cuenta {
    private Titular titular;
    private double saldoDisponible;

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

    public double decrementarSaldo(double cant) {
        saldoDisponible -= cant;
        return saldoDisponible;
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

