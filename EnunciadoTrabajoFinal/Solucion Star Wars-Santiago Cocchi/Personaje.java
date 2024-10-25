package org.example;

public abstract class Personaje {
    //Atributos
    private String nombre;
    private double valentia;
    private double inteligencia;
    private double poder;
    //Constuctor vacio
    public Personaje() {
    }
    //Constructor con sus atributos
    public Personaje(String nombre, double valentia, double inteligencia, double poder) {
        this.nombre = nombre;
        this.valentia = valentia;
        this.inteligencia = inteligencia;
        this.poder = poder;
    }
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValentia() {
        return valentia;
    }

    public void setValentia(double valentia) {
        this.valentia = valentia;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }
    public double calcularPoder(){
        return valentia+inteligencia;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", valentia=" + valentia +
                ", inteligencia=" + inteligencia +
                ", poder=" + poder +
                '}';
    }
}
