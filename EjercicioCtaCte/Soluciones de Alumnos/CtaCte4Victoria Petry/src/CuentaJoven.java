public class CuentaJoven extends Cuenta{
    private double bonificación;

    public CuentaJoven(Titular titular, double saldoDisponible, double bonificación) {
        super(titular, saldoDisponible);
        this.bonificación = bonificación;
    }

    public double getBonificación() {
        return bonificación;
    }

    public void setBonificación(double bonificación) {
        this.bonificación = bonificación;
    }

    @Override
    public String toString() {
        return "CuentaJoven{" +
                "bonificación=" + bonificación +
                '}';
    }
}
