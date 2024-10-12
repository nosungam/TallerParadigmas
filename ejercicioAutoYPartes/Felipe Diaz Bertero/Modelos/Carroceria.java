package Modelos;

public class Carroceria {
    private String tipo;
    private String color;

    public Carroceria(){

    }

    public Carroceria(String tipo, String color) {
        this.tipo = tipo.toLowerCase();
        this.color = color.toLowerCase();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.toLowerCase();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.toLowerCase();
    }

    public String toString(){
        return "\t\tTIPO: "+tipo+"\n"+"\t\t\t\t\t\t\t\tCOLOR: "+color;
    }
}
