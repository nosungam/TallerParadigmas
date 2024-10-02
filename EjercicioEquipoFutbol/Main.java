package Clase2.EquipoFutbol;

public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Juan", "Perez", 4);
        Jugador jugador2 = new Jugador("Pedro", "Gomez", 10);
        Jugador jugador3 = new Jugador("Carlos", "Rodriguez", 7);
        Jugador jugador4 = new Jugador("Jose", "Lopez", 9);
        Jugador jugador5 = new Jugador("Luis", "Gonzalez", 11);

        Equipo equipo1 = new Equipo("Equipo 1", new Jugador[]{jugador1, jugador2, jugador3, jugador4, jugador5});

        System.out.println(equipo1.toString());

        System.out.println("Cantidad de goles del equipo: " + equipo1.cantidadGoles());

        jugador1.hacerGol();
        System.out.println("Cantidad de goles del equipo: " + equipo1.cantidadGoles());

    }
}
