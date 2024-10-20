import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op =  1;
        Scanner entrada = new Scanner(System.in);
        Peaje p1 = new Peaje("Las Marias","Santa Rosa");

        while (op!= 2){
            System.out.println("Ingrese opcion: 1..2");
            op = entrada.nextInt();
            if (op == 1){
                System.out.println("Ingrese vehiculo a calcular tarifa...");
                System.out.println("1. Auto, 2. Moto, 3.Camión");
                int var = entrada.nextInt();
                int v = p1.tarifaPeaje(var);
                System.out.println("Tarifa: " + v);
                p1.valorTotal(v);
            }
            if (op == 2){
                System.out.println("Imprimiendo informe por pantalla...");
                System.out.println(p1.toString());
                System.out.println("Total acumulado: $" + p1.getValorTotal());
            }
        }
    }
}