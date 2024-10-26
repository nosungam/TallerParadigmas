package org.example;

public abstract class Maestro extends Personaje{
    //Atributos
    private double midiclorianos;
    private SableDeLuz sableDeLuz;
    //Constructor vacio
    public Maestro(){

    }
    //Constructor
    public Maestro(String nombre, double valentia, double inteligencia, double poder, double midiclorianos,SableDeLuz sableDeLuz) {
        super(nombre, valentia, inteligencia, poder);
        this.midiclorianos = midiclorianos;
        this.sableDeLuz= sableDeLuz;
    }

    //Métodos

    public double getMidiclorianos() {
        return midiclorianos;
    }

    public void setMidiclorianos(double midiclorianos) {
        this.midiclorianos = midiclorianos;
    }

    public SableDeLuz getSableDeLuz() {
        return sableDeLuz;
    }

    public void setSableDeLuz(SableDeLuz sableDeLuz) {
        this.sableDeLuz = sableDeLuz;
    }
    public abstract void vivirSucesoImportante(int cargaEmocional);
}
