package Modelos;

public class Motor {
    private double volumen = 0.0;

    public Motor(){

    }

    public Motor(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String toString(){
        return "\t\tVOLUMEN: "+volumen+" l"; //"l" representa la unidad de "litros"
    }
}
