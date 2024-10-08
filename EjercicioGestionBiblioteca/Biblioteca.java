import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Estante> estantes = new ArrayList<>();

    public Biblioteca() {
    }

    public List<Estante> getEstantes() {
        return estantes;
    }

    public void setEstantes(List<Estante> estantes) {
        this.estantes = estantes;
    }

    public void agregarEstante(String codigo) {
        Estante estante = new Estante(codigo);
        this.estantes.add(estante);
    }

    public void eliminarEstate(String codigo) {
        //estantes.removeIf(estante -> estante.getCodigo().equals(codigo));
        for (Estante estante : estantes) {
            if (estante.getCodigo().equals( codigo )) {
                estantes.remove(estante);
                break;
            }
        }
    }

    public void agregarLibro(Libro libro, String codigoEstante) {
        for (Estante estante : estantes) {
            if (estante.getCodigo().equals( codigoEstante )) {
                estante.agregarLibro(libro);
            }
        }
    }

    public void eliminarLibro(String ISBN, String codigoEstante) {
        for (Estante estante : estantes) {
            if (estante.getCodigo().equals( codigoEstante )) {
                estante.eliminarLibro(ISBN);
            }
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        Libro libro = null;
        for (Estante estante : estantes) {
            libro = estante.buscarLibroPorTitulo(titulo);
            if (libro != null) {
                break;
            }
        }
        return libro;
    }

    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> libros= new ArrayList<>();
        for (Estante estante : estantes) {
            List<Libro> librosEstante = estante.buscarLibroPorAutor(autor);
            if (librosEstante != null) {
                libros.addAll(librosEstante);
            }
        }
        return libros;
    }

    public List<Libro> buscarLibrosPorSubstring(String subcadena) {
        List<Libro> libros = new ArrayList<>();
        for (Estante estante : estantes) {
            List<Libro> librosEstante = estante.buscarLibroPorSubcadena(subcadena);
            if (librosEstante != null) {
                libros.addAll(librosEstante);
            }
        }
        return libros;
    }

    public int cantidadLibros() {
        int cantidad = 0;
        for (Estante estante : estantes) {
            cantidad += estante.cantidadLibros();
        }
        return cantidad;
    }

    public String listarLibrosAlfabeticamente() {
        StringBuilder builder = new StringBuilder();
        for (Estante estante : estantes) {
            builder.append("Estante ").append(estante.getCodigo()).append(":\n");
            builder.append(estante.listarLibrosAlfabeticamente());
        }
        return builder.toString();
    }

    public void moverLibro(String ISBN, String codigoEstanteOrigen, String codigoEstanteDestino) {
        Libro libro = null;
        for (Estante estante : estantes) {
            if (estante.getCodigo().equals( codigoEstanteOrigen )) {
                libro = estante.buscarLibroPorISBN(ISBN);
                if (libro != null) {
                    estante.eliminarLibro(ISBN);
                    break;
                }
            }
        }
        for (Estante estante : estantes) {
            if (estante.getCodigo().equals( codigoEstanteDestino )) {
                estante.agregarLibro(libro);
                break;
            }
        }
    }
}
