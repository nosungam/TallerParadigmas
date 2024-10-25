package ClaseArma;

public abstract class Arma {
    private boolean condicion;

    public Arma() {}

    public Arma(boolean condicion) {
        this.condicion = condicion;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public abstract int calcularPeligrosidad(); // Método abstracto para calcular la peligrosidad
}