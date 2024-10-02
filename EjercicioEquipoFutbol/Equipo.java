package Clase2.EquipoFutbol;

public class Equipo {
    private String nombre;
    private Jugador[] jugadores;

    public Equipo() {
    }

    public Equipo(String nombre, Jugador[] jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        String equipo ="Equipo: " + this.nombre +'\n';
        for (Jugador jugador : this.jugadores) {
            equipo += jugador.toString() +'\n';
        }
        return equipo;
    }

    public int cantidadGoles() {
        int totalGoles = 0;
        for (Jugador jugador : this.jugadores) {
            totalGoles += jugador.getCantidadGoles();
        }
        return totalGoles;
    }
}
