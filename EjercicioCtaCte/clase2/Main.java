package Clase2.EjercicioCtaCte;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        Persona persona1 = new Persona("Juan", "Perez", "12345678", 20);

        Persona persona2 = new Persona("Ana", "Gomez", "87654321", 15);

        cuenta.setNumeroCuenta("123456");
        cuenta.setTitular(persona1);
        cuenta.setSaldo(1000);
        System.out.println(cuenta.toString());

    }
}