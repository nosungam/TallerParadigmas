public class Main {
    public static void main(String[] args){
        Alumno alumno1 = new Alumno("Felipe","Diaz Bertero","15326");
        alumno1.cargarNotas(3);
        alumno1.cargarNotas(4);
        alumno1.cargarNotas(10);
        alumno1.agregarNotaRecuperatorio(10,3);
        alumno1.calcularPromedioFinal();

        System.out.println(alumno1.getNotas());
        System.out.println(alumno1.getPromedio());

        Profesor profesor1 = new Profesor("Roberto","Perez");
        System.out.println(profesor1);


    }
}
