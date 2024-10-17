class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Sobrescribir el método para calcular el área con el radio
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Área = π * radio^2
    }

    // Sobrecarga del método para calcular el área usando el diámetro
    public double calcularArea(int diametro) {
        double radioDesdeDiametro = diametro / 2.0;
        return Math.PI * Math.pow(radioDesdeDiametro, 2);
    }

    @Override
    public String toString() {
        return "Círculo con radio " + radio + " tiene un área de " + calcularArea();
    }
}
