public class Libro {
    private String titulo;
    private Autor autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;

        String nombre = autor.split(" ",2)[0];
        String apellido = autor.split(" ",2)[1];

        this.autor = new Autor(nombre, apellido);
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor.getNombreCompleto() +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
