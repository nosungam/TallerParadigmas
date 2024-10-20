import java.util.ArrayList;
import java.util.Scanner;

public class Peaje {
    private String nombre;
    private String dpto;
    //ArrayList<Vehiculo> v = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
    private int contAuto = 0;
    private int contMotos = 0;
    private int contCamiones = 0;
    private int cantTotal = 0;

    public Peaje(String nombre, String dpto) {
        this.nombre = nombre;
        this.dpto = dpto;
    }

    int total = 0;
    public void valorTotal(int suma){
        this.cantTotal += suma;
    }
    public int getValorTotal(){
        return this.cantTotal;
    }

    public int tarifaPeaje(int var){
        int tarifa = 0;
        if (var == 1){
             tarifa = 10000;
             this.contAuto += 1;
        }
        if (var == 2){
             tarifa = 5000;
             this.contMotos += 1;
        }
        if (var == 3){
            System.out.println("Ingrese cant ejes..");
            int c = entrada.nextInt();
             tarifa = c * 5000 ;
             this.contCamiones += 1;
        }
        return tarifa;
    }
    public String toString (){
        return "Cantidad de autos: " + this.contAuto +"\n'"+
                "Cantidad de motos: " + this.contMotos +"\n'"+
                "Cantidad de camion: " + this.contCamiones;
    }

}
