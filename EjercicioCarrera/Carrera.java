import java.util.ArrayList;
import java.util.Random;

public class Carrera {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private Random random = new Random();

    // Método para agregar vehículos a la carrera
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Método para simular vueltas
    public void registrarTiemposDeVueltas(int vueltas) {
        for (Vehiculo vehiculo : vehiculos) {
            for (int i = 0; i < vueltas; i++) {
                int tiempo = random.nextInt(100) + 100; // Tiempo aleatorio entre 100 y 200 segundos
                vehiculo.agregarTiempoDeVuelta(tiempo);
            }
        }
    }

    // Método para determinar el ganador
    public Vehiculo determinarGanador() {
        Vehiculo ganador = null;
        double mejorVelocidad = Double.MAX_VALUE;

        for (Vehiculo vehiculo : vehiculos) {
            double velocidad = vehiculo.calcularVelocidadPromedio();
            if (velocidad < mejorVelocidad) {
                mejorVelocidad = velocidad;
                ganador = vehiculo;
            }
        }
        return ganador;
    }

    // Método para ordenar los vehículos por su velocidad promedio (de más rápido a más lento)
    private void ordenarVehiculosPorVelocidad() {
        vehiculos.sort((v1, v2) -> Double.compare(v1.calcularVelocidadPromedio(), v2.calcularVelocidadPromedio()));
    }

    // Validación para iniciar la carrera
    public boolean puedeIniciarCarrera() {
        return vehiculos.size() >= 2;
    }

    // Mostrar los resultados
    public void mostrarResultados() {
        ordenarVehiculosPorVelocidad();
        System.out.println("Resultados de la carrera:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getNombre() + " - Velocidad Promedio: " + vehiculo.calcularVelocidadPromedio());
        }
    }
}
