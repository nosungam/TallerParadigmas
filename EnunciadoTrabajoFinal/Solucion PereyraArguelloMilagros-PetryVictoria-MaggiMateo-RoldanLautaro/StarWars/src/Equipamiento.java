public class Equipamiento {
    private String nombre;
    private int potencia;
    private double desgaste;

    public Equipamiento(String nombre, int potencia, double desgaste) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.desgaste = desgaste;
    }

    public boolean esUtil(){
        if (this.potencia > 10 && this.desgaste <= 0.8){
            return true;
        }else{
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getDesgaste() {
        return desgaste;
    }

    public void setDesgaste(double desgaste) {
        this.desgaste += desgaste;
    }

    public void reparar(){
        this.desgaste = 0;
    }
}
