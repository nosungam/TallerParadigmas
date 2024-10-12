package Modelos;

public class Chasis {
    private String tipoChasis;

    public Chasis(){

    }

    public Chasis(String tipoChasis) {
        this.tipoChasis = tipoChasis.toLowerCase();
    }

    public String getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(String tipoChasis) {
        this.tipoChasis = tipoChasis.toLowerCase();
    }

    public String toString(){
        return "\t\tTIPO: "+tipoChasis;
    }

}
