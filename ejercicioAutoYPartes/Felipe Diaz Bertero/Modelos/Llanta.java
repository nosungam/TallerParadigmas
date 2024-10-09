package Modelos;

public class Llanta {
    private String marca;
    private Double diametroRin;
    private Double altura;
    private Double anchura;

    public Llanta(){

    }

    public Llanta(String marca, Double diametroRin, Double altura, Double anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getDiametroRin() {
        return diametroRin;
    }

    public void setDiametroRin(Double diametroRin) {
        this.diametroRin = diametroRin;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAnchura() {
        return anchura;
    }

    public void setAnchura(Double anchura) {
        this.anchura = anchura;
    }

    public String toString(){
        return "\t\tMARCA: "+marca+"\n"+"\t\t\t\t\t\t\t\tDIAMETRO DEL RIN: "+diametroRin+" in"+"\n"+"\t\t\t\t\t\t\t\tALTURA: "+altura+" in"+"\n"+"\t\t\t\t\t\t\t\tANCHURA: "+anchura+" in"+"\n";
        //"in" representa "inches" que a su vez representa la unidad de "pulgadas"
    }
}
