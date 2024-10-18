package POO2024.Transporte;

import java.util.ArrayList;
import java.util.List;

public class TransporteMain {

    public static void main(String[] args) {
        Paquete paquete1 = new Paquete(10); // 10 kg
        Paquete paquete2 = new Paquete(20); // 20 kg
        Paquete paquete3 = new Paquete(30); // 30 kg

        //Se crea la lista de los paquetes
        List<Paquete> paquetes = new ArrayList<>();
        paquetes.add(paquete1);
        paquetes.add(paquete2);
        paquetes.add(paquete3);

        Camion camion = new Camion(300);
        Camioneta camioneta = new Camioneta(50);
        AvionCarga avionCarga = new AvionCarga(1000, 200);
        Helicoptero helicoptero = new Helicoptero(150, 150);


        //Acá calculamos los costos
        System.out.println("Costo transporte Camión (3 paquetes): " + camion.calcularCostoTransporte(paquetes));
        System.out.println("Costo transporte Camioneta (1 paquete): " + camioneta.calcularCostoTransporte(paquete1));
        System.out.println("Costo transporte Avión de Carga (3 paquetes): " + avionCarga.calcularCostoTransporte(paquetes));
        System.out.println("Costo transporte Helicóptero (1 paquete): " + helicoptero.calcularCostoTransporte(paquete2));
    }
}

