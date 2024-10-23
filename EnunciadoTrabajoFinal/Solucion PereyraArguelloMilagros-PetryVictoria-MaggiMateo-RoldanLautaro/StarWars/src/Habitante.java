public class Habitante {
    private int valentia;
    private int inteligencia;


    public Habitante(int valentia, int inteligencia) {
        this.valentia = valentia;
        this.inteligencia = inteligencia;
    }

    public Habitante (){

    }

    public double calculoPoder(){
        double poder = valentia + inteligencia;
        return poder;
    }


}
