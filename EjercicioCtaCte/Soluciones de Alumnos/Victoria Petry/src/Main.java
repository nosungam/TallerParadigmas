import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double cant = 0;
        Scanner entrada = new Scanner(System.in);
        Titular titular = new Titular("Victoria","Petry",2004);
        Cuenta c1 = new Cuenta(titular,1000);
        System.out.println(c1.toString());

        if (titular.verificarEdad() == 1) {
            System.out.println("Valor a decrementar: ");
            cant = entrada.nextDouble();
            c1.decrementarSaldo(cant);
            System.out.println(c1.toString());
        }
    }
}