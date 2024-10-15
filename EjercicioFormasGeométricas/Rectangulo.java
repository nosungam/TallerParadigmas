class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    // Constructor para inicializar largo y ancho
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Sobrescribir el método para calcular el área
    @Override
    public double calcularArea() {
        return largo * ancho; // Área = largo * ancho
    }

    // Sobrescribir toString para mostrar la información del rectángulo
    @Override
    public String toString() {
        return "Rectángulo de " + largo + "x" + ancho + " tiene un área de " + calcularArea();
    }
}
