package Modelos;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Estante> estantes = new ArrayList<>();
    private Libro libroEncontrado;

    public Biblioteca(){

    }


    public void agregarEstante(Estante e){
        estantes.add(e);
    }

    public void quitarEstante(Estante e){
        estantes.remove(e);
    }

    public Libro buscarLibroXAutor(String nombre, String apellido){
        int coincidencias = 0;
        Libro libroEncontrado = null;

        for (Estante e: estantes){
            for (Libro l: e.getListaLibros()){
                if (l.getAutor().getNombre().equals(nombre) && l.getAutor().getApellido().equals(apellido)){
                    libroEncontrado = new Libro(l.getTitulo(),l.getIsbn(),l.getAutor());
                    coincidencias++;
                }
            }
        }

        if (coincidencias >= 1){
            return libroEncontrado;
        }
        else{
            System.out.println("LIBRO NO ENCONTRADO!!");
        }
        return null;
    }

    public Libro buscarLibroXTitulo(String titulo){
        int coincidencias = 0;
        Libro libroEncontrado = null;

        for (Estante e: estantes){
            for (Libro l: e.getListaLibros()){
                if (l.getTitulo().equals(titulo)){
                    libroEncontrado = new Libro(l.getTitulo(),l.getIsbn(),l.getAutor());
                    coincidencias++;
                }
            }
        }

        if (coincidencias >= 1){
            return libroEncontrado;
        }
        else{
            System.out.println("LIBRO NO ENCONTRADO!!");
        }
        return null;
    }

    public int obtenerCantidadLibros(){
        int cantidad = 0;
        for (Estante e: estantes){
            for (Libro l: e.getListaLibros()){
                cantidad++;
            }
        }

        return cantidad;
    }

    public ArrayList<String> listarLibrosAlfabeticamente(){
        ArrayList<String> librosAlfabeticamente = new ArrayList<>();

        for (Estante e: estantes){
            for (Libro l: e.getListaLibros()){
                librosAlfabeticamente.add(l.getTitulo());
            }
        }

        Collections.sort(librosAlfabeticamente);

        return librosAlfabeticamente;
    }

    public void listarLibrosXAutor(Autor autor){
        ArrayList<Libro> librosXAutor = new ArrayList<>();
        for (Estante e: estantes){
            for (Libro l: e.getListaLibros()){
                if (l.getAutor().equals(autor)){
                    librosXAutor.add(l);
                }
            }
        }

        System.out.println(librosXAutor);

    }

    public void moverLibroAEstante(Libro libro, Estante estanteAMover){
        int indiceEstante = -1;
        Estante estanteTemporal = new Estante();

        for (int i = 0; i < estantes.size(); i++) {
            Estante e = estantes.get(i);
            for (Libro l : e.getListaLibros()) {
                if (libro == l) {
                    estanteTemporal = e;
                    indiceEstante = i;
                    break;
                }
            }
            if (indiceEstante != -1) {
                break;
            }
        }

        estanteAMover.agregarLibro(libro);
        estanteTemporal.quitarLibro(libro);


    }

}
