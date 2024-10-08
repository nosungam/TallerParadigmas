package org.example;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String nombre;
    private String dpto;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    private static int cantCamiones = 0;
    private static int cantAutos = 0;
    private static int cantMotos = 0;
    private static double totalPeaje = 0;

    public Estacion(String nombre, String dpto) {
        this.nombre = nombre;
        this.dpto = dpto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        calcularPrecioPeaje(vehiculo);
        if(vehiculo.getTipoVehiculo().getNombreTipo().equals("camion")){
            cantCamiones++;
        }
        if(vehiculo.getTipoVehiculo().getNombreTipo().equals("auto")){
            cantAutos++;
        }
        if(vehiculo.getTipoVehiculo().getNombreTipo().equals("moto")){
            cantMotos++;
        }

    }

    public void calcularPrecioPeaje(Vehiculo vehiculo){
        double precio;
        if(vehiculo.getTipoVehiculo().getNombreTipo().equals("camion")){
            precio = vehiculo.getTipoVehiculo().getPrecioPeaje()*vehiculo.getTipoVehiculo().getNroEjes();
        }else{
            precio = vehiculo.getTipoVehiculo().getPrecioPeaje();
        }
        totalPeaje+=precio;
    }

    @Override
    public String toString(){
        String informacion = "Peaje -- Nombre: "+this.nombre + " Dpto.: "+this.dpto+
                "\n\tTotal recaudado en el peaje: $"+totalPeaje+
                "\n\t\tCant. Camiones: "+cantCamiones+
                "\n\t\tCant. Autos: "+cantAutos+
                "\n\t\tCant. Motos: "+cantMotos+
                "\nVehiculos que pasaron por el peaje: ";

        for(Vehiculo i:vehiculos){
            informacion += "\n\t" +i.toString();
        }

        return informacion;
    }



}
