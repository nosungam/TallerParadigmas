import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Autor autor1 = new Autor("Gabriel", "García Márquez");
        Autor autor2 = new Autor("Julio", "Cortázar");
        Autor autor3 = new Autor("Mario", "Vargas Llosa");
        Libro libro1 = new Libro("Cien años de soledad", autor1, "978-84-376-0494-7");
        Libro libro2 = new Libro("Rayuela", autor2, "978-84-376-0494-8");
        Libro libro3 = new Libro("La ciudad y los perros", autor3, "978-84-376-0494-9");

        biblioteca.agregarEstante("1L");
        biblioteca.agregarEstante("2L");
        biblioteca.agregarEstante("3L");

        biblioteca.agregarLibro(libro1, "1L");
        biblioteca.agregarLibro(libro2, "2L");
        biblioteca.agregarLibro(libro3, "1L");

        System.out.println(biblioteca.buscarLibroPorTitulo("Rayuela"));

        List<Estante> estantes1 = biblioteca.getEstantes();
        for (Estante estante: estantes1){
            System.out.println(estante.getCodigo());
        }
        biblioteca.eliminarEstate("3L");
        List<Estante> estantes2 = biblioteca.getEstantes();
        for (Estante estante: estantes2){
            System.out.println(estante.getCodigo());
        }

        biblioteca.eliminarLibro("978-84-376-0494-8", "2L");

        System.out.println(biblioteca.buscarLibroPorTitulo("Rayuela"));

        System.out.println(biblioteca.cantidadLibros());
        System.out.println(biblioteca.listarLibrosAlfabeticamente());

        List<Libro> libroConDosPalabras = biblioteca.buscarLibrosPorSubstring(" ");
        for (Libro libro: libroConDosPalabras){
            System.out.println(libro.getTitulo());
        }

        List<Libro> librosPorAutor = biblioteca.buscarLibrosPorAutor("Gabriel García Márquez");
        for (Libro libro: librosPorAutor){
            System.out.println(libro.getTitulo());
        }

        biblioteca.moverLibro("978-84-376-0494-7", "1L", "2L");

    }
}
