import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class Titular {
    private String nombreUsuario;
    private LocalDate Añonac;

    public Titular(String Nombre, LocalDate nac) {
        this.nombreUsuario = Nombre;
        this.Añonac = nac;
    }

    public void setEdad(){

    }

    public String conocerT(){
        return this.nombreUsuario;
    }

    public int getEdad(){
        long dias = YEARS.between(this.Añonac,LocalDate.now());
        return Math.toIntExact(dias);
    }

    public Boolean Valedad(){
        long dias = YEARS.between(this.Añonac,LocalDate.now());
        if(dias>=18){
            return true;
        }else{
            return false;
        }
    }

    public Boolean TitularValido(){
        int edad = getEdad();
        if ( edad > 18 && edad < 25){
            return true;
        }else{
            return false;
        }
    }


}
