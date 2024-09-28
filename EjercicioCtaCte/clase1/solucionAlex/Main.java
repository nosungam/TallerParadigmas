package CuentaBancaria;

public class Main {
    public static void main(String [] args){
        Cuenta cuenta1 = new Cuenta(150,"Alex",0.0);
        cuenta1.ingresarDinero(80.5);
        cuenta1.retirarDinero(10);
        cuenta1.mostrar();
    }
}
