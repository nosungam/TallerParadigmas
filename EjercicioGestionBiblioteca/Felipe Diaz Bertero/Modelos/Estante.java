package Modelos;
import java.util.ArrayList;

public class Estante {
    private ArrayList<Libro> listaLibros = new ArrayList<>();

    public Estante(){

    }

    public void agregarLibro(Libro l){
        listaLibros.add(l);
    }

    public void quitarLibro(Libro l){
        listaLibros.remove(l);
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public String toString(){
        return listaLibros+"";
    }

}
