public class Main {
    public static void main(String[] args) {
        // Creación de tipos de vehículos
        TipoVehiculo tipoCamion = new TipoVehiculo("Camion", 5000, 4);
        TipoVehiculo tipoMoto = new TipoVehiculo("Moto", 5000);
        TipoVehiculo tipoCarro = new TipoVehiculo("Auto", 10000);

        // Creación de vehículos
        Vehiculo vehiculo1 = new Vehiculo(tipoCamion, "AA111AA");
        Vehiculo vehiculo2 = new Vehiculo(tipoMoto, "A123BCD");
        Vehiculo vehiculo3 = new Vehiculo(tipoCarro, "BB222BB");

        // Creación de peaje
        Peaje peaje = new Peaje("Peaje j", "General San Martin");

        // Agregamos vehículos al peaje
        peaje.agregarVehiculo(vehiculo1);
        peaje.agregarVehiculo(vehiculo2);
        peaje.agregarVehiculo(vehiculo3);

        // Imprimimos los datos del peaje
        System.out.println(peaje.toString());
    }
}
