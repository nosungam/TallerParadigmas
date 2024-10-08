import java.util.ArrayList;
import java.util.List;

public class Estante {
    private List<Libro> libros = new ArrayList<>();
    private String codigo;

    public Estante(String codigo) {
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
        System.out.println("Libro agregado");
    }

    public void eliminarLibro(String ISBN) {
        //libros.removeIf(libro -> libro.getISBN().equals(ISBN));
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                libros.remove(libro);
                System.out.println("Libro eliminado");
                break;
            }
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        Libro libro = null;
        for (Libro libroActual : libros) {
            if (libroActual.getTitulo().equals(titulo)) {
                libro = libroActual;
                break;
            }
        }
        return libro;
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> libros = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getAutor().getNombreCompleto().equals(autor)) {
                libros.add(libro);
            }
        }
        return libros;
    }

    public int cantidadLibros() {
        return libros.size();
    }

    public List<Libro> buscarLibroPorSubcadena(String subcadena) {
        List<Libro> libros = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getTitulo().contains(subcadena)) {
                libros.add(libro);
            }
        }
        return libros;
    }

    public String listarLibrosAlfabeticamente() {
        StringBuilder builder = new StringBuilder();
        libros.sort((libro1, libro2) -> libro1.getTitulo().compareTo(libro2.getTitulo()));
        for (Libro libro : libros) {
            builder.append(libro.getTitulo()).append("\n");
        }
        return builder.toString();
    }

    public Libro buscarLibroPorISBN(String ISBN) {
        Libro libro = null;
        for (Libro libroActual : libros) {
            if (libroActual.getISBN().equals(ISBN)) {
                libro = libroActual;
                break;
            }
        }
        return libro;
    }
}
