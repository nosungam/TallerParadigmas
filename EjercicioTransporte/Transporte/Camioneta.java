package POO2024.Transporte;

public class Camioneta extends VehiculoTerrestre {
    private double tarifaFija = 50;

    public Camioneta(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularCostoTransporte(Paquete paquete) {
        return (paquete.getPeso() * 1.8 * distancia) + tarifaFija;
    }
}

