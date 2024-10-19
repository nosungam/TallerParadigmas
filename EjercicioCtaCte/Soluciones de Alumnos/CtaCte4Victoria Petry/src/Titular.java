public class Titular {
    private  String nombre;
    private String apellido;
    private int año;
    private int diferencia;
    private String nombreCompleto;
    private int verifica = 0;


    public Titular(String nombre, String apellido,int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public String nombreCompleto(){
        nombreCompleto = this.nombre +  this.apellido;
        return nombreCompleto;
    }

    public int verificarEdad(){
        this.diferencia = 2024-this.año;
        if ((diferencia)>= 18) {
            this.verifica = 1;
            return this.verifica;
        }
        else{
            this.verifica = 0;
            return this.verifica;
        }
    }
    public boolean esTitularValido(){
        if(18<= this.diferencia && this.diferencia< 25){
            return true;
        } else {
            return false;
        }
    }
}
