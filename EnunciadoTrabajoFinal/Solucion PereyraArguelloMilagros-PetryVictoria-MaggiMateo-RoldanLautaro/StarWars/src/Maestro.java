import java.util.ArrayList;

public class Maestro extends Habitante{
    private int pazInterior;
    private Equipamiento sable;
    private ArrayList <Equipamiento> equipamientos = new ArrayList<>();
    private int midiclodianos;
    private String ladoFuerza;
    private int antiguedadMaestro;

    public Maestro(int pazInterior, Equipamiento sable, int valentia, int inteligencia, int antiguedadMaestro,int midiclodianos) {
        super(valentia, inteligencia);
        this.pazInterior = pazInterior;
        this.antiguedadMaestro = antiguedadMaestro;
        this.midiclodianos = midiclodianos;
        this.sable = sable;
        if (pazInterior > 0) {
            this.ladoFuerza = "Jedi";
        }else{
            this.ladoFuerza = "Sith";
        }
    }

    @Override
    public double calculoPoder() {
        double poder = super.calculoPoder() + (midiclodianos/1000) ;
        if (ladoFuerza.equals("Jedi")){
            poder += (sable.getPotencia()*antiguedadMaestro);
        } else if (ladoFuerza.equals("Sith")) {
            poder += (sable.getPotencia() * 2) + antiguedadMaestro;
        }
        for (Equipamiento e : equipamientos) {
            if (e.esUtil()){
                poder += e.getPotencia();
            }
        }
        return poder;
    }

    public int getPazInterior() {
        return pazInterior;
    }

    public void setPazInterior(int pazInterior) {
        this.pazInterior = pazInterior;
    }

    public Equipamiento getSable() {
        return sable;
    }

    public void setSable(Equipamiento sable) {
        this.sable = sable;
    }

    public void agregarEquipamiento(Equipamiento equipamiento){
        equipamientos.add(equipamiento);
    }


    public void vivirSucesos(int cargaEmocional){
        this.antiguedadMaestro +=1;
        if (this.ladoFuerza.equals("Sith")) {
            if (cargaEmocional > this.pazInterior) {
                this.ladoFuerza = "Jedi";
                sable.reparar();
                for (Equipamiento e : equipamientos) {
                    e.reparar();
                }
            }else{
                this.pazInterior += (this.pazInterior * 0.1);
            }
        }else if (this.ladoFuerza.equals("Jedi")) {
            this.pazInterior += cargaEmocional;
            if (this.pazInterior <= 0) {
                this.ladoFuerza = "Sith";
                sable.reparar();
                for (Equipamiento e : equipamientos) {
                    e.reparar();
                }
                this.pazInterior -= 100;
            }
        }
    }

}
