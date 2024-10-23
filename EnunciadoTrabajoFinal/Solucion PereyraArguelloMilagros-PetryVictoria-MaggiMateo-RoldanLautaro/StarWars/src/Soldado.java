import java.util.ArrayList;

public class Soldado extends Habitante{
    ArrayList<Equipamiento> equipamientos = new ArrayList<>();

    public Soldado(int valentia, int inteligencia) {
        super(valentia, inteligencia);
    }

    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamientos.add(equipamiento);
    }

    @Override
    public double calculoPoder() {
        double poder = super.calculoPoder();
        for (Equipamiento e : equipamientos) {
            if (e.esUtil()){
                poder += e.getPotencia();
            }
        }
        return poder;
    }

    public void UsarEquipamiento(Equipamiento equipamiento){
        for (Equipamiento e : equipamientos){
            if(e == equipamiento){
                e.setDesgaste(0.1);
            }
        }
    }

    public ArrayList<Equipamiento> getEquipamientos() {
        return equipamientos;
    }

}
