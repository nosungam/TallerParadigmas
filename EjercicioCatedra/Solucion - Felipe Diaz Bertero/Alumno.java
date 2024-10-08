import java.util.ArrayList;

public class Alumno extends Persona{
    private String legajo;
    private ArrayList<Double> notas = new ArrayList<>();
    private double promedio;

    public Alumno(String nombre, String apellido, String legajo) {
        super(nombre, apellido);
        this.legajo = legajo;
    }


    public Alumno(){

    }

    public void cargarNotas(double nota){
        notas.add(nota);
    }

    public void calcularPromedioFinal(){
        double suma = 0.0;
        for (Double n: notas){
            suma = suma + n;
        }

        this.promedio = (suma / notas.size());
    }

    public ArrayList<Double> getNotas(){
        return notas;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public double getPromedio(){
        return promedio;
    }
    public void agregarNotaRecuperatorio(double notaOriginal, double notaRecuperatorio){
        notas.add(notaOriginal - notaRecuperatorio);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo='" + legajo + '\'' +
                ", notas=" + notas +
                ", promedio=" + promedio +
                '}';
    }


}
