package POO2024.Transporte;

public class Helicoptero extends VehiculoAereo {
    private double costoDespegueAterrizaje = 100;

    public Helicoptero(double distancia, double impuestoAereo) {
        super(distancia, impuestoAereo);
    }

    @Override
    public double calcularCostoTransporte(Paquete paquete) {
        return (paquete.getPeso() * 4.0 * distancia) + impuestoAereo + costoDespegueAterrizaje;
    }
}

