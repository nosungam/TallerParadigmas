import Modelos.Autor;
import Modelos.Biblioteca;
import Modelos.Estante;
import Modelos.Libro;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel","Garcia Marquez");
        Libro libro1 = new Libro("Cien años de soledad", "000001",autor1);

        Autor autor2 = new Autor("George","Orwell");
        Libro libro2 = new Libro("1984", "000002",autor2);

        Autor autor3 = new Autor("Harper","Lee");
        Libro libro3 = new Libro("Matar a un ruiseñor","000003",autor3);

        Autor autor4 = new Autor("Jane","Austen");
        Libro libro4 = new Libro("Orgullo y prejuicio","000004",autor4);

        Autor autor5 = new Autor("Umberto","Eco");
        Libro libro5 = new Libro("El nombre de la rosa","000004",autor5);



        Estante estante1 = new Estante();
        estante1.agregarLibro(libro1);
        estante1.agregarLibro(libro2);

        Estante estante2 = new Estante();
        estante2.agregarLibro(libro3);

        Estante estante3 = new Estante();
        estante3.agregarLibro(libro4);
        estante3.agregarLibro(libro5);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarEstante(estante1);
        biblioteca.agregarEstante(estante2);
        biblioteca.agregarEstante(estante3);

        System.out.println(estante1);
        System.out.println(estante3+"\n\n");

        System.out.println(biblioteca.buscarLibroXTitulo("1984"));
        System.out.println(biblioteca.buscarLibroXAutor("Harper","Lee"));
        System.out.println("CANTIDAD TOTAL DE LIBROS EN LA BIBLIOTECA: "+biblioteca.obtenerCantidadLibros()+" LIBRO/S\n\n");
        System.out.println(biblioteca.listarLibrosAlfabeticamente());
        biblioteca.listarLibrosXAutor(autor5);
        biblioteca.moverLibroAEstante(libro1, estante3);

        System.out.println(estante1);
        System.out.println(estante3);


    }
}