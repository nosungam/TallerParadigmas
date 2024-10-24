package ClaseArma;

public class Daga extends Arma {
    private int peligrosidad;

    public Daga() {
        super(true);
        this.peligrosidad = 3;
    }

    public Daga(int peligrosidad) {
        super(true);
        this.peligrosidad = peligrosidad;
    }

    @Override
    public int calcularPeligrosidad() {
        return peligrosidad;
    }
}