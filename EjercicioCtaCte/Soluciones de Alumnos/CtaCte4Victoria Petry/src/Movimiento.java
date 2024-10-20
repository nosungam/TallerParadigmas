public class Movimiento {
    private double cant;

    public Movimiento() {
    }

    public Movimiento(double cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return " " +
                + cant;
    }
}
