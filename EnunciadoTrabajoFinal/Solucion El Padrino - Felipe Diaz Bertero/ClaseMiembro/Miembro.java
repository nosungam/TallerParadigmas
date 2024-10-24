package ClaseMiembro;

import ClaseArma.Arma;

import java.util.ArrayList;

public class Miembro {
    private String nombre;
    private String apellido;
    private int edad;
    private int cantidadHeridas;
    private boolean vivo;
    private ArrayList<Arma> armasDisponibles = new ArrayList<>();

    public Miembro(String nombre, String apellido, int edad, int cantidadHeridas, boolean vivo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantidadHeridas = cantidadHeridas;
        this.vivo = vivo;
    }

    public void agregarArma(Arma a) {
        armasDisponibles.add(a);
    }

    public boolean isVivo() {
        return vivo;
    }

    public int calcularIntimidacion() {
        int intimidacion = 0;
        for (Arma arma : armasDisponibles) {
            intimidacion += arma.calcularPeligrosidad();
        }
        return intimidacion;
    }

    public int contarArmasEnCondiciones() {
        int contador = 0;
        for (Arma arma : armasDisponibles) {
            if (arma.isCondicion()) {
                contador++;
            }
        }
        return contador;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombreRango() {
        return "Miembro";
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadHeridas() {
        return cantidadHeridas;
    }

    public void setCantidadHeridas(int cantidadHeridas) {
        this.cantidadHeridas = cantidadHeridas;
    }

    public ArrayList<Arma> getArmasDisponibles() {
        return armasDisponibles;
    }

    public void setArmasDisponibles(ArrayList<Arma> armasDisponibles) {
        this.armasDisponibles = armasDisponibles;
    }
}