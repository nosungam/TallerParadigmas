package Catedra;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Joaquin", "Alvarez", 14859, 5.97, 8.2, 9.0);
        Alumno alumno2 = new Alumno("Martin", "Rodriguez", 14269, 9.0, 8.0, 0.0);
        Profesor profesor1 = new Profesor("Alberto", "Gonzalez", "11389");
        Profesor profesor2 = new Profesor("Horacio", "Marcantonio", "19389");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        ArrayList<Profesor> profesors = new ArrayList<>();
        profesors.add(profesor1);
        profesors.add(profesor2);
        CatedraParadigma catedra = new CatedraParadigma(alumnos, profesors);
        catedra.ImprimirInscriptos();

    }
}
