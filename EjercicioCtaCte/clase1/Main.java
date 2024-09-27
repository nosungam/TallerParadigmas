package Clase1.EjercicioCtaCte;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setNumeroCuenta("123456");
        cuenta.setTitular("Juan");
        cuenta.setSaldo(1000);
        System.out.println(cuenta.toString());
        cuenta.ingresar(500);
        System.out.println(cuenta.toString());
        cuenta.retirar(200);
        System.out.println(cuenta.toString());
    }
}