package org.example;

public class Main {
    public static void main(String[] args) {

    Alumno alumno= new Alumno("Santiago","Cocchi",123,6.5,4.2,9);
    Profesor profesor= new Profesor("Juan", "Perez",456);
    alumno.setProfesor(profesor);

    System.out.println("El profesor del alumno es:"+ alumno.getProfesor());
    System.out.println("El promedio de las notas del alumno es:"+alumno.sacarPromedio());
}
}