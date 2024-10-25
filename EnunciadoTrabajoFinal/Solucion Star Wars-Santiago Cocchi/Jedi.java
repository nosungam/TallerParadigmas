package org.example;

public class Jedi extends Maestro{
    //Atributos
    private double pazInterior;
    private double tiempoLuz;

    //Constructor vacio
    public Jedi(){
    }
    //Constructor
    public Jedi(String nombre, double valentia, double inteligencia, double poder, double midiclorianos,SableDeLuz sableDeLuz,double pazInterior, double tiempoLuz) {
        super(nombre, valentia, inteligencia, poder, midiclorianos,sableDeLuz);
        this.pazInterior = pazInterior;
        this.tiempoLuz=tiempoLuz;
    }
    //Métodos

    public double getPazInterior() {
        return pazInterior;
    }

    public void setPazInterior(double pazInterior) {
        this.pazInterior = pazInterior;
    }

    public double getTiempoLuz() {
        return tiempoLuz;
    }

    public void setTiempoLuz(double tiempoLuz) {
        this.tiempoLuz = tiempoLuz;
    }

    public double calcularPoder(){
        double podertotal=super.calcularPoder();
        double poderSable= getSableDeLuz().getEnergia()*tiempoLuz;
        return podertotal+poderSable+(getMidiclorianos()/1000);
    }

    @Override
    public void vivirSucesoImportante(int cargaEmocional) {
        pazInterior += cargaEmocional;
        if (pazInterior <= 0) {

            System.out.println("El Jedi ha caído al lado oscuro...");
    }   }


}
