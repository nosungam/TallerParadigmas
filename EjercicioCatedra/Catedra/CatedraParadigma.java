package Catedra;

import Partido.Jugador;

import java.util.ArrayList;

public class CatedraParadigma {
    ArrayList<Alumno> alumnos;
    ArrayList<Profesor>profesores;
    public  CatedraParadigma(ArrayList alumnos, ArrayList profesores){
        this.alumnos = alumnos;
        this.profesores = profesores;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    public  void ImprimirInscriptos(){
        System.out.println("Alumnos Inscriptos: ");
        for(Alumno i: alumnos){
            System.out.println("Nombre alumno: " + i.getNombre() + " Nota primer parcial: " + i.getNotaPrimerParcial() + " Nota segundo parcial: " + i.getNotaSegundoParcial() + " Nota recuperatorio: " + i.getNotaRecuperatorio());
        }
    }
}
