package POO2024.Transporte;

import java.util.List;

public class AvionCarga extends VehiculoAereo {

    public AvionCarga(double distancia, double impuestoAereo) {
        super(distancia, impuestoAereo);
    }

    @Override
    public double calcularCostoTransporte(Paquete paquete) {
        return (paquete.getPeso() * 3.5 * distancia) + impuestoAereo;
    }

    public double calcularCostoTransporte(List<Paquete> paquetes) {
        double costoTotal = 0;
        for (Paquete p : paquetes) {
            costoTotal += calcularCostoTransporte(p);
        }
        return costoTotal;
    }
}

