package Catedra;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Double notaPrimerParcial;
    private Double notaSegundoParcial;
    private Double notaRecuperatorio;

    public Alumno(String nombre, String apellido, Integer legajo, Double notaPrimerParcial , Double notaSegundoParcial, Double notaRecuperatorio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.notaPrimerParcial = notaPrimerParcial;
        this.notaSegundoParcial = notaSegundoParcial;
        this.notaRecuperatorio = notaRecuperatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Double getNotaPrimerParcial() {
        return notaPrimerParcial;
    }

    public void setNotaPrimerParcial(Double notaPrimerParcial) {
        this.notaPrimerParcial = notaPrimerParcial;
    }

    public Double getNotaSegundoParcial() {
        return notaSegundoParcial;
    }

    public void setNotaSegundoParcial(Double notaSegundoParcial) {
        this.notaSegundoParcial = notaSegundoParcial;
    }
    public Double getNotaRecuperatorio(){
        return notaRecuperatorio;
    }
    public  void setNotaRecuperatorio(){
        this.notaRecuperatorio = notaRecuperatorio;
    }
}
