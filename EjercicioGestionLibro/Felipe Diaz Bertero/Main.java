import Modelos.Autor;
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

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);


    }
}