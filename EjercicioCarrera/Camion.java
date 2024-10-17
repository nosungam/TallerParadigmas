public class Camion extends Vehiculo {
    public Camion(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularVelocidadPromedio() {
        return calcularTiempoPromedio() / 1.5;
    }
}
