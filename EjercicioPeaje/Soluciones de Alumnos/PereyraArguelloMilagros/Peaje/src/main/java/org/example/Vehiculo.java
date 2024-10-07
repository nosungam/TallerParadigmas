package org.example;

public class Vehiculo {
    private String patente;
    private TipoVehiculo tipoVehiculo;

    public Vehiculo(String patente, TipoVehiculo tipoVehiculo) {
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo - Patente: "+this.patente+" Tipo: "+tipoVehiculo.getNombreTipo();
    }
}
