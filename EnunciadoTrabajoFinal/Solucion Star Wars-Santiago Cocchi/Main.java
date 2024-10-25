package org.example;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Arma blaster= new Arma("Blaster",10,false);
        Arma halcon=new Arma("Halcon Milenario",50,false);
        ArrayList<Arma> equipamiento =new ArrayList<>();
        equipamiento.add(blaster);
        equipamiento.add(halcon);

        Soldado stormtrooper= new Soldado("Stormtrooper",50,30,0,blaster);
        Soldado stormtrooper1= new Soldado("Stormtrooper",50,30,0,blaster);
        Soldado stormtrooper2= new Soldado("Stormtrooper",50,30,0,blaster);
        Soldado stormtrooper3 = new Soldado("Stormtrooper",50,30,0,blaster);
        Soldado han= new Soldado("Han-Solo",100,200,0,halcon);
        Soldado chubby=new Soldado("Chubby",100,50,0,halcon);
        Soldado ray= new Soldado("Ray", 300, 150, 0, halcon);
        stormtrooper.tomarArma(blaster);
        stormtrooper1.tomarArma(blaster);
        stormtrooper2.tomarArma(blaster);
        stormtrooper3.tomarArma(blaster);
        han.tomarArma(halcon);
        chubby.tomarArma(halcon);




        SableDeLuz sableJedi= new SableDeLuz(100);
        Jedi obiwan= new Jedi("Obi-Wan",80,90,0,12000,sableJedi,100,10);
        System.out.println("El poder del Jedi es:"+obiwan.calcularPoder());


        SableDeLuz sableSith= new SableDeLuz(150);
        Sith darthVader= new Sith("Darth-Vader",100,85,0,15000,sableSith,200,15);
        System.out.println("El poder del sith es:"+darthVader.calcularPoder());

        ArrayList<Personaje> personajes= new ArrayList<>();
        personajes.add(stormtrooper);
        personajes.add(stormtrooper1);
        personajes.add(stormtrooper2);
        personajes.add(stormtrooper3);
        personajes.add(obiwan);
        personajes.add(darthVader);

        Planeta tatooine= new Planeta("Tatooine",personajes);
        System.out.println(tatooine);
        System.out.println("El poder total del planeta es "+tatooine.calcularPoderPlaneta());
        System.out.println("El paneta posee orden:"+tatooine.posee_orden());


    }
}