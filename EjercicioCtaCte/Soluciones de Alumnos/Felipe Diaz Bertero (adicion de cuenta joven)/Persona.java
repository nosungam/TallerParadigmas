import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int añoNacimiento;
    private int edad;


    public Persona(){

    }

    public Persona(String nombre, String apellido, String dni, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNacimiento = añoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int fechaNacimiento){
        int year = LocalDate.now().getYear();
        this.edad = year - fechaNacimiento;
    }

    public int getEdad(){
        return this.edad;
    }

    @Override
    public String toString() {
        return "Nombre: '" + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Dni: " + dni + "\n";
    }
}
