package ClaseMiembro;

public class Soldado extends Miembro {
    public Soldado(String nombre, String apellido, int edad, int cantidadHeridas, boolean vivo) {
        super(nombre, apellido, edad, cantidadHeridas, vivo);
    }

    @Override
    public String getNombreRango() {
        return "Soldado";
    }
}