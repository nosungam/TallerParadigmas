package Clase4.EjercicioCtaCte;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", "12345678", 20);
        Persona persona2 = new Persona("Ana", "Gomez", "87654321", 15);

        // Creando una CuentaJoven con bonificación
        CuentaJoven cuentaJoven = new CuentaJoven("123456", persona1, 1000, 10);
        System.out.println(cuentaJoven.toString());

        // Intentando retirar dinero con un titular válido
        cuentaJoven.retirar(200);
        System.out.println(cuentaJoven.toString());

        // Cambiando a un titular no válido
        cuentaJoven.setTitular(persona2);
        System.out.println(cuentaJoven.toString());

        // Intentando retirar dinero con un titular no válido
        cuentaJoven.retirar(100);
        System.out.println(cuentaJoven.toString());

        cuentaJoven.mostrarDetalleCuenta();
    }
}
