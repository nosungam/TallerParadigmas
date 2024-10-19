public class Motocicleta extends Vehiculo {
    public Motocicleta(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularVelocidadPromedio() {
        return calcularTiempoPromedio() / 1.1;
    }
}
