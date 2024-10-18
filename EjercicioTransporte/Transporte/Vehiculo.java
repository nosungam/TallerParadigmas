package POO2024.Transporte;

public abstract class Vehiculo {
    protected double distancia;

    public Vehiculo(double distancia) {
        this.distancia = distancia;
    }

    // Método para sobrescribir en subclases
    public double calcularCostoTransporte(Paquete paquete) {
        return 0.0;
    }
}

