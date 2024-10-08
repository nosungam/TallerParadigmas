public class Llanta {
    String marca;
    int diametroRin, altura, anchura;

    Llanta(String marca, int diametroRin, int altura, int anchura){
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    @Override
    public String toString(){
        return("Marca = " + this.marca +
                "\nDiámetro del rin = " + this.diametroRin +
                "\nAltura = " + this.altura +
                "\nAnchura = " + this.anchura);
    }
}
