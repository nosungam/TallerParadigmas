package org.example;

import java.util.ArrayList;
import java.util.List;

public class Soldado extends Personaje{
    //Atributos
    private List<Arma> equipamiento;

    //Constructor vacio
    public Soldado(){
    }
    //Constructor
    public Soldado(String nombre, double valentia, double inteligencia, double poder, Arma equipamiento) {
        super(nombre, valentia, inteligencia, poder);
        this.equipamiento=new ArrayList<>();
    }

    public List<Arma> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<Arma> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public void tomarArma(Arma arma) {
        equipamiento.add(arma);
    }

}
