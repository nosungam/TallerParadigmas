package ClaseMiembro;

public class SubJefe extends Miembro {
    public SubJefe(String nombre, String apellido, int edad, int cantidadHeridas, boolean vivo) {
        super(nombre, apellido, edad, cantidadHeridas, vivo);
    }

    @Override
    public int calcularIntimidacion() {
        return super.calcularIntimidacion() * 2; // Intimidación duplicada para SubJefes
    }


    @Override
    public String getNombreRango() {
        return "SubJefe";
    }
}