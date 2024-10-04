public class TipoVehiculo {
    private String nombre;
    private float precio;
    private int cantEjes;

    public TipoVehiculo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public TipoVehiculo(String nombre, float precio, int cantEjes) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantEjes = cantEjes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(int cantEjes) {
        this.cantEjes = cantEjes;
    }

    @Override
    public String toString() {
        if (nombre.equalsIgnoreCase("camion")) {
            return "Tipo de vehículo: " + nombre + ", Precio por eje: " + precio + ", Total peaje: " + precio * cantEjes;
        }else{
            return "Tipo de vehículo: " + nombre + ", Precio del peaje: " + precio;
        }
    }
}
