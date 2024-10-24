package ClaseMiembro;

public class Don extends Miembro {
    public Don(String nombre, String apellido, int edad, int cantidadHeridas, boolean vivo) {
        super(nombre, apellido, edad, cantidadHeridas, vivo);
    }

    @Override
    public int calcularIntimidacion() {
        return 20; // El Don tiene una intimidación fija de 20 puntos
    }

    @Override
    public String getNombreRango() {
        return "Don";
    }
}