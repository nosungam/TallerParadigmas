package ClaseArma;

public class CuerdaPiano extends Arma {

    public CuerdaPiano() {
        super();
    }

    public CuerdaPiano(boolean condicion) {
        super(condicion);
    }

    @Override
    public int calcularPeligrosidad() {
        return isCondicion() ? 5 : 1;
    }
}