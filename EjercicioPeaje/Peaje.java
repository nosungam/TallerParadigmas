import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private String nombre;
    private String departamento;
    
    private static int totalPeaje = 0;
    private static int totalCamiones = 0;
    private static int totalMotos = 0;
    private static int totalAutos = 0;

    private List<Vehiculo> vehiculos;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        calcularPeaje(vehiculo);

        if(vehiculo.getTipo().getNombre().equalsIgnoreCase("camion")){ // .equalsIgnoreCase("camion") === .toLowerCase().equals("camion")
            totalCamiones++;
        }else if(vehiculo.getTipo().getNombre().equalsIgnoreCase("moto")){
            totalMotos++;
        } else if(vehiculo.getTipo().getNombre().equalsIgnoreCase("auto")) {
            totalAutos++;
        }
    }

    public void calcularPeaje(Vehiculo vehiculo) {
        float precio;
        if (vehiculo.getTipo().getNombre().equalsIgnoreCase("camion")) {
            precio = vehiculo.getTipo().getPrecio() * vehiculo.getTipo().getCantEjes();
        }else{
            precio = vehiculo.getTipo().getPrecio();
        }
        totalPeaje += precio;
    }

    @Override
    public String toString() {
        String resultado = "Peaje: " + nombre + ", Departamento: " + departamento +
                "\nTotal Recaudado: " + totalPeaje +
                "\nTotal Camiones: " + totalCamiones +
                "\nTotal Motos: " + totalMotos +
                "\nTotal Autos: " + totalAutos +
                "\nVehículos que han pasado por el peaje:";

        for (Vehiculo v : vehiculos) {
            resultado += "\n" + v.toString();
        }

        return resultado;
    }
}
