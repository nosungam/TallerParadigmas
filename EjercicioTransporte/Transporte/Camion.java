package POO2024.Transporte;

import java.util.List;

public class Camion extends VehiculoTerrestre {

    public Camion(double distancia) {
        super(distancia);
    }

    // Sobrecarga de un paquete
    @Override
    public double calcularCostoTransporte(Paquete paquete) {
        return paquete.getPeso() * 2.5 * distancia;
    }

    // Sobrecarga para muchos paquetes
    public double calcularCostoTransporte(List<Paquete> paquetes) {
        double costoTotal = 0;
        for (Paquete p : paquetes) {
            costoTotal += calcularCostoTransporte(p);
        }
        return costoTotal;
    }
}

