import java.util.ArrayList;

public abstract class Vehiculo {
    protected String nombre;
    protected ArrayList<Integer> tiemposDeVuelta = new ArrayList<>();

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    // Método para agregar tiempos de vuelta
    public void agregarTiempoDeVuelta(int tiempo) {
        tiemposDeVuelta.add(tiempo);
    }

    // Método para calcular el tiempo promedio de vueltas
    public double calcularTiempoPromedio() {
        int suma = 0;
        for (int tiempo : tiemposDeVuelta) {
            suma += tiempo;
        }
        return !tiemposDeVuelta.isEmpty() ? (double) suma / tiemposDeVuelta.size() : 0;
    }

    // Método abstracto para calcular la velocidad promedio (será implementado en las clases derivadas)
    public abstract double calcularVelocidadPromedio();

    public String getNombre() {
        return nombre;
    }
}
