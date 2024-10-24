package ClaseArma;

public class RevolverOxidado extends Revolver {
    private int disparosRealizados = 0;

    public RevolverOxidado() {
        super.setCondicion(false);
    }

    @Override
    public void disparar() {
        disparosRealizados++;
        super.disparar();
    }

    @Override
    public int calcularPeligrosidad() {
        return (int) (super.calcularPeligrosidad() * 0.5);
    }
}
