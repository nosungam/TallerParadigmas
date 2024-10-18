package POO2024.Transporte;

public abstract class VehiculoAereo extends Vehiculo {
    protected double impuestoAereo;

    public VehiculoAereo(double distancia, double impuestoAereo) {
        super(distancia);
        this.impuestoAereo = impuestoAereo;
    }
}

