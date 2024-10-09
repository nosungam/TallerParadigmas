package Modelos;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;

    public Libro(){

    }

    public Libro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String toString(){
        return
                "LIBRO: "+"'"+titulo+"'"+"-"+
                "AUTOR: "+autor+"-"+
                "ISBN: "+isbn+"\t\t";
    }

}
