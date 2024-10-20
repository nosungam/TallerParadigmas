import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double cant = 0;
        Scanner entrada = new Scanner(System.in);
        Titular titular = new Titular("Victoria","Petry",2004);
        Cuenta c1 = new Cuenta(titular,1000);
        CuentaJoven cc;
        ArrayList<Movimiento> movimientos = new ArrayList<>();


        System.out.println(c1.toString());

        if (titular.verificarEdad() == 1) {
            if (titular.esTitularValido()) {
                cc = new CuentaJoven(titular,1000,58);
                int op;
                do {
                    System.out.println("1. ingresar dinero... 2 Retirar dinero...0 Salir");
                    op = entrada.nextInt();
                    if (op == 1) {
                        System.out.println("Valor: ");
                        cant = entrada.nextDouble();
                        cc.ingresosCuenta(cant);
                        movimientos.add(new Movimiento(cant));
                    }
                    if (op == 2) {
                        //Arrraylist de titulares, cuenta para verificar que sea uno de ellos
                        System.out.println("Valor: ");
                        cant = entrada.nextDouble();
                        cc.egresosCuenta(cant);
                        movimientos.add(new Movimiento(cant));
                    }
                } while (op != 0);
                System.out.println("Cuenta joven "+cc.toString());
                System.out.print(movimientos);
            } else{
               int op;
                do {
                    System.out.println("1. ingresar dinero... 2 Retirar dinero...0 Salir");
                    op = entrada.nextInt();
                    if (op == 1) {
                        System.out.println("Valor: ");
                        cant = entrada.nextDouble();
                        c1.ingresosCuenta(cant);
                        movimientos.add(new Movimiento(cant));
                    }
                    if (op == 2) {
                        //Arrraylist de titulares, cuenta para verificar que sea uno de ellos
                        System.out.println("Valor: ");
                        cant = entrada.nextDouble();
                        c1.egresosCuenta(cant);
                        movimientos.add(new Movimiento(cant));
                    }
                } while (op != 0);
                System.out.println("Cuenta "+c1.toString());
                System.out.print(movimientos);
            }
        }

    }
}