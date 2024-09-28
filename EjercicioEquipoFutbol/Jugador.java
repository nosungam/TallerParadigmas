package Clase2.EquipoFutbol;

public class Jugador {
    private String nombre;
    private String apellido;
    private int numero;
    private int cantidadGoles;

    public Jugador(String nombre, String apellido, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                ", numero=" + this.numero +
                ", cantidadGoles=" + this.cantidadGoles +
                '}';
    }

    public void hacerGol() {
        this.cantidadGoles++;
    }
}
