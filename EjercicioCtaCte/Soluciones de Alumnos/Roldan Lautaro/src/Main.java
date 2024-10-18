import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Titular persona1;
        Cuenta cuenta1;
        CuentaJoven cuenta2;

        LocalDate fecha = LocalDate.of(2000,10,12);
        persona1 = new Titular("Juan",fecha);

        if (persona1.Valedad()){
            System.out.println("cuenta creada cta cte");
            cuenta1 = new Cuenta(10,persona1,1000);
        }else{
            System.out.print("no tiene edad suficiente");
        }

        if (persona1.TitularValido()){
            System.out.println("cuenta creada cuenta joven");
            cuenta2 = new CuentaJoven(12,persona1,1800);
            cuenta2.setBonificacion(35);

            System.out.println(cuenta2.toString());

        }else{
            System.out.println("No esta en el rango de edad para una cuenta joven");
        }



    }
}