public class AutoCarrera extends Vehiculo {
    public AutoCarrera(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularVelocidadPromedio() {
        return calcularTiempoPromedio() / 1.2;
    }
}
