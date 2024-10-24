package ClaseArma;

public class Revolver extends Arma {
    private int municion;
    private static final int CAPACIDAD = 6;

    public Revolver() {
        super();
    }

    public Revolver(boolean condicion, int municion) {
        super(condicion);
        this.municion = municion;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public void recargar() {
        this.municion = CAPACIDAD;
    }

    public void disparar() {
        if (municion > 0) {
            municion--;
        }
    }

    @Override
    public int calcularPeligrosidad() {
        return isCondicion() ? municion * 2 : 1;
    }
}