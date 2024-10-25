package org.example;

import java.util.ArrayList;

public class Planeta {
    //Atributos
    private String nombre;
    private ArrayList<Personaje> personajes = new ArrayList<>();

    //Constructor vacio
    public Planeta(){
    }
    //Constructor
    public Planeta(String nombre,ArrayList<Personaje> personajes) {
        this.nombre=nombre;
        this.personajes = personajes;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public double calcularPoderPlaneta() {
        double poderTotal = 0;
        for (Personaje p : personajes) {
            poderTotal += p.calcularPoder();
        }
        return poderTotal;
    }

    public boolean posee_orden() {
        if (personajes.size() < 3) {
            return false;
        }

        double max1 = 0, max2 = 0, max3 = 0;


        for (Personaje p : personajes) {
            double poderActual = p.calcularPoder();

            if (poderActual > max1) {

                max3 = max2;
                max2 = max1;
                max1 = poderActual;
            } else if (poderActual > max2) {

                max3 = max2;
                max2 = poderActual;
            } else if (poderActual > max3) {

                max3 = poderActual;
            }
        }

        double poderTop3 = max1 + max2 + max3;

        double mitadPoderPlaneta = calcularPoderPlaneta() / 2;

        return poderTop3 > mitadPoderPlaneta;
    }

    @Override
    public String toString() {
        return "Planeta{" +
                "nombre='" + nombre + '\'' +
                ", personajes=" + personajes +
                '}';
    }
}
