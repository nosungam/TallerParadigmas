package org.example;

public class TipoVehiculo {
    private String nombreTipo;
    private double precioPeaje;
    private int nroEjes;

    public TipoVehiculo(String nombreTipo, double precioPeaje) {
        this.nombreTipo = nombreTipo;
        this.precioPeaje = precioPeaje;
    }

    public TipoVehiculo(String nombreTipo, double precioPeaje, int nroEjes) {
        this.nombreTipo = nombreTipo;
        this.precioPeaje = precioPeaje;
        this.nroEjes = nroEjes;
    }

    public int getNroEjes() {
        return nroEjes;
    }

    public void setNroEjes(int nroEjes) {
        this.nroEjes = nroEjes;
    }

    public double getPrecioPeaje() {
        return precioPeaje;
    }

    public void setPrecioPeaje(double precioPeaje) {
        this.precioPeaje = precioPeaje;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    @Override
    public String toString() {
        if(this.getNombreTipo().equals("camion")){
            return "Tipo Vehiculo: "+this.nombreTipo + "Cant. Ejes: "+this.nroEjes+ " Precio total peaje: "+this.precioPeaje*this.nroEjes;
        }else{
            return "Tipo Vehiculo: "+this.nombreTipo +" Precio total peaje: "+this.precioPeaje;
        }

    }
}
