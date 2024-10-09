package Modelos;

import java.util.ArrayList;

public class Auto {
    private Motor motor;
    private Chasis chasis;
    private ArrayList<Llanta> llantas = new ArrayList<>();
    private Carroceria carroceria;

    public Auto() {
    }

    public Auto(Motor motor, Chasis chasis, Carroceria carroceria) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public void agregarLlanta(Llanta llanta){
        llantas.add(llanta);
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public String toString(){
        return
                "DETALLES DEL MOTOR: "+motor+"\n"+
                "DETALLES DEL CHASIS: "+chasis+"\n"+
                "DETALLES DE LAS LLANTAS: "+llantas+"\n"+
                "DETALLES DE LA CARROCERIA: "+carroceria+"\n";
    }


}
