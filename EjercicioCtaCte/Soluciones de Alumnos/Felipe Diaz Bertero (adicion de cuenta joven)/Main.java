public class Main {
    public static void main(String[] args){

        Persona persona1 = new Persona("Felipe","Diaz Bertero","44900185",2003);
        persona1.setEdad(2003);
        Cuenta cuenta1 = new Cuenta(persona1);
        Movimientos lista1 = new Movimientos();
        cuenta1.agregarMovimiento("RECIBO",500);
        cuenta1.agregarMovimiento("TRANSFERENCIA",850);



        Persona persona2 = new Persona("Juan","Perez","45901186",2015);
        Cuenta cuenta2 = new Cuenta(persona2);
        Movimientos lista2 = new Movimientos();
        cuenta2.agregarMovimiento("RECIBO",250);
        cuenta2.agregarMovimiento("TRANSFERENCIA",130);
        cuenta2.agregarMovimiento("TRANSFERENCIA",1300);

        Persona persona3 = new Persona("Juan","Lopez","46902187",2001);
        persona3.setEdad(2001);
        Cuenta cuenta3 = new Cuenta(persona3);
        Movimientos lista3 = new Movimientos();
        cuenta3.agregarMovimiento("RECIBO",900);
        cuenta3.agregarMovimiento("TRANSFERENCIA",250);


        System.out.println(cuenta1);
        System.out.println("\n\n\n");
        System.out.println(cuenta2);
        System.out.println("\n\n\n");
        System.out.println(cuenta3);



    }
}
