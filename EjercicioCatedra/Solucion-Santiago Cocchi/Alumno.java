package org.example;

import java.util.ArrayList;

public class Alumno {
     private String nombre;
     private String apellido;
     private int legajo;
     private double notaPrimerParcial;
     private double notaSegundoParcial;
     private double notaRecuperatorio;
     private Profesor profesor;


     public Alumno() {
     }

     public Alumno(String nombre, String apellido, int legajo, double notaPrimerParcial, double notaSegundoParcial, double notaRecuperatorio) {
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

     public int getLegajo() {
          return legajo;
     }

     public void setLegajo(int legajo) {
          this.legajo = legajo;
     }

     public double getNotaPrimerParcial() {
          return notaPrimerParcial;
     }

     public void setNotaPrimerParcial(double notaPrimerParcial) {
          this.notaPrimerParcial = notaPrimerParcial;
     }

     public double getNotaSegundoParcial() {
          return notaSegundoParcial;
     }

     public void setNotaSegundoParcial(double notaSegundoParcial) {
          this.notaSegundoParcial = notaSegundoParcial;
     }

     public double getNotaRecuperatorio() {
          return notaRecuperatorio;
     }

     public void setNotaRecuperatorio(double notaRecuperatorio) {
          this.notaRecuperatorio = notaRecuperatorio;
     }

     public Profesor getProfesor() {
          return profesor;
     }

     public void setProfesor(Profesor profesor) {
          this.profesor = profesor;
     }

     public double sacarPromedio(){
          double suma=notaPrimerParcial+notaSegundoParcial+notaRecuperatorio;
          return suma/3;
     }

     @Override
     public String toString() {
          return "Alumno{" +
                  "nombre='" + nombre + '\'' +
                  ", apellido='" + apellido + '\'' +
                  ", legajo=" + legajo +
                  ", notaPrimerParcial=" + notaPrimerParcial +
                  ", notaSegundoParcial=" + notaSegundoParcial +
                  ", notaRecuperatorio=" + notaRecuperatorio +
                  ", profesor=" + profesor +
                  '}';
     }
}
