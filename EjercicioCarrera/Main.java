public class Main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();

        carrera.agregarVehiculo(new AutoCarrera("Ferrari"));
        carrera.agregarVehiculo(new Motocicleta("Yamaha"));
        carrera.agregarVehiculo(new Camion("Mercedes Truck"));

        if (carrera.puedeIniciarCarrera()) {
            carrera.registrarTiemposDeVueltas(5); // Simular 5 vueltas

            carrera.mostrarResultados();

            Vehiculo ganador = carrera.determinarGanador();
            System.out.println("El ganador es: " + ganador.getNombre() + " con velocidad promedio de " + ganador.calcularVelocidadPromedio());
        } else {
            System.out.println("No hay suficientes vehículos para iniciar la carrera.");
        }
    }
}
