package org.example;

public class Main {
    public static void main(String[] args) {
        TipoVehiculo camion = new TipoVehiculo("camion",5000,4);
        TipoVehiculo moto = new TipoVehiculo("moto",5000);
        TipoVehiculo auto = new TipoVehiculo("auto",10000);


        Vehiculo vehiculo1 = new Vehiculo("DXR010",auto);
        Vehiculo vehiculo2 = new Vehiculo("AF458NM",camion);
        Vehiculo vehiculo3 = new Vehiculo("AA123SF",moto);
        Vehiculo vehiculo4 = new Vehiculo("GRM101",auto);

        Estacion estacion = new Estacion("Estacion 1","Gral. San Martin");
        estacion.agregarVehiculo(vehiculo1);
        estacion.agregarVehiculo(vehiculo2);
        estacion.agregarVehiculo(vehiculo3);
        estacion.agregarVehiculo(vehiculo4);

        System.out.println(estacion.toString());

    }
}