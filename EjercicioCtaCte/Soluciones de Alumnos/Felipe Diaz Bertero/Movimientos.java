public class Movimientos {
    private String movimiento;
    private double monto;

    public Movimientos() {
    }

    public Movimientos(String movimiento, double monto) {
        this.movimiento = movimiento;
        this.monto = monto;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Movimiento = " + movimiento + "-----------------" +
                "Monto = " + monto + "\n";
    }
}
