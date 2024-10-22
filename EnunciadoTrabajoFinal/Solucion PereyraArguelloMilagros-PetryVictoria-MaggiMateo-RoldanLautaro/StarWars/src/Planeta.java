import java.util.ArrayList;

public class Planeta {
    ArrayList <Habitante> habitantes = new ArrayList<>();

    public double calcularPoderdelMundo(){
        double poder = 0;
        for (Habitante h : habitantes){
            poder += h.calculoPoder();
        }
        return poder;
    }

    public void agregarHabitante(Habitante habitante){
        habitantes.add(habitante);
    }

    public boolean hayOrden(){
        double mayor1 = 0;
        double mayor2 = 0;
        double mayor3 = 0;
        Habitante h1 = new Habitante();
        Habitante h2 = new Habitante();
        for (Habitante h : habitantes){
            if (h.calculoPoder() > mayor1){
                mayor1 = h.calculoPoder();
                h1 = h;
            }
        }
        for (Habitante h : habitantes){
            if (h.calculoPoder() > mayor2 && h != h1){
                mayor2 = h.calculoPoder();
                h2 = h;
            }
        }
        for (Habitante h : habitantes){
            if (h.calculoPoder() > mayor3 && h != h1 && h != h2){
                mayor3 = h.calculoPoder();
            }
        }

        double posibleOrden = mayor1 + mayor2 + mayor3;

        if (posibleOrden > (calcularPoderdelMundo()/2)){
            return true;
        }else {
            return false;
        }


    }


}
