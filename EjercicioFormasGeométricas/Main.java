public class Main {
    public static void main(String[] args) {
        // Crear instancia de Circulo con radio
        Circulo circulo = new Circulo(5.0);
        System.out.println(circulo.toString());

        // Calcular el área del círculo usando el diámetro (sobrecarga)
        System.out.println("Área del círculo con diámetro 10: " + circulo.calcularArea(10));

        // Crear instancia de Rectangulo con largo y ancho
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        System.out.println(rectangulo.toString());

        // Uso de polimorfismo
        Forma forma1 = circulo;
        Forma forma2 = rectangulo;

        System.out.println(forma1.toString());
        System.out.println(forma2.toString());
    }
}