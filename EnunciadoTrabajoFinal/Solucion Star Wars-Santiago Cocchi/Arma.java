package org.example;

public class Arma {
    //Atributos
    private String nombre;
    private double potencia;
    private boolean desgaste;

    //Constructor vacio
    public Arma() {
    }

    //Constructor
    public Arma(String nombre, double potencia, boolean desgaste) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.desgaste = false;
    }

    //Métodos


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isDesgaste() {
        return desgaste;
    }

    public void setDesgaste(boolean desgaste) {
        this.desgaste = desgaste;
    }

    public void usarArma(Arma arma) {
        if (!desgaste && potencia > 10) {
            potencia -= 10;

            // Si la potencia cae por debajo de 10, el arma se considera desgastada
            if (potencia <= 10) {
                desgaste = true;
                System.out.println("El arma " + nombre + " se ha desgastado.");
            }
        } else {
            System.out.println("El arma " + nombre + " está demasiado desgastada o no tiene suficiente potencia.");

        }
    }
    public void repararArma(){
        this.desgaste=false;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                ", potencia=" + potencia +
                ", desgaste=" + desgaste +
                '}';
    }
}