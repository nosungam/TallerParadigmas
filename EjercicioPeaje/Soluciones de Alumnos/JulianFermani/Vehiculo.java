public class Vehiculo {
    private TipoVehiculo tipo;
    private String placa;

    public Vehiculo(TipoVehiculo tipo, String placa) {
        this.tipo = tipo;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "Vehículo placa: " + placa + ", Tipo: " + tipo.getNombre() +
                "\n" + tipo.toString();
    }
}
