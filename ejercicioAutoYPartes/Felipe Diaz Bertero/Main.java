import Modelos.*;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis("Monocasco");
        Carroceria carroceria = new Carroceria("Tubular","Rojo");
        Llanta llanta1 = new Llanta("Goodyear", 25.0, 20.0, 15.0);
        Llanta llanta2 = new Llanta("Goodyear", 25.0, 20.0, 15.0);
        Llanta llanta3 = new Llanta("Goodyear", 25.0, 20.0, 15.0);
        Llanta llanta4 = new Llanta("Goodyear", 25.0, 20.0, 15.0);
        Auto auto = new Auto(motor,chasis,carroceria);

        auto.agregarLlanta(llanta1);
        auto.agregarLlanta(llanta2);
        auto.agregarLlanta(llanta3);
        auto.agregarLlanta(llanta4);

        System.out.println(auto);


    }
}