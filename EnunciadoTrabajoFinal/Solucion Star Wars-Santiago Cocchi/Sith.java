package org.example;

public class Sith extends Maestro{
    //Atributos
    private double odio;
    private double timpoSith;

    //Constructor vacio
    public Sith(){}

    //Constructor
    public Sith(String nombre, double valentia, double inteligencia, double poder, double midiclorianos,SableDeLuz sableDeLuz,double odio,double timpoSith) {
        super(nombre, valentia, inteligencia, poder, midiclorianos,sableDeLuz);
        this.odio = odio;
        this.timpoSith=timpoSith;
    }

    //Métodos

    public double getOdio() {
        return odio;
    }

    public void setOdio(double odio) {
        this.odio = odio;
    }

    public double getTimpoSith() {
        return timpoSith;
    }

    public void setTimpoSith(double timpoSith) {
        this.timpoSith = timpoSith;
    }

    public double calcularPoder(){
        double poderTotal=super.calcularPoder();
        double poderSable= 2* getSableDeLuz().getEnergia()*timpoSith;

        return poderTotal+ poderSable+ getMidiclorianos()/1000;
    }

    @Override
    public void vivirSucesoImportante(int cargaEmocional) {
        if (cargaEmocional > odio) {
            System.out.println("El Sith ha visto la luz y se arrepiente...");
        }
    }


}
