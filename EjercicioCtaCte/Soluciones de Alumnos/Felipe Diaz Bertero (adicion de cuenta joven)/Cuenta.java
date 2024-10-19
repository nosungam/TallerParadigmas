import java.util.ArrayList;

public class Cuenta {
    private Persona persona;
    private ArrayList<Movimientos> listaMovimientos = new ArrayList<>();
    private static double saldo = 0.0;
    private int banderaEdad = 0;




    public Cuenta(Persona persona) {
        if (persona.getEdad() >= 18) {
            this.persona = persona;
        } else {
            this.persona = persona;
            System.out.println("LA PERSONA NO ES MAYOR DE EDAD");
            banderaEdad = 1;
        }

    }

    public Cuenta() {
    }

    public Persona getPersona() {
        return persona;
    }

    public boolean esTitularValido(){
        if (persona.getEdad() >= 18 && persona.getEdad() <= 25){
            return true;
        }
        else{
            return false;
        }
    }

    public void agregarMovimiento(String mov, double mont){
        {
            if (mov.equals("TRANSFERENCIA")){
                if (esTitularValido()){
                    Movimientos movimiento = new Movimientos(mov, mont);
                    listaMovimientos.add(movimiento);
                }
                else{
                    System.out.println("OPERACION NO VALIDA");
                }

            }
            else{
                Movimientos movimiento = new Movimientos(mov, mont);
                listaMovimientos.add(movimiento);
            }
        }

    }

    public void setPersona(Persona Persona) {
        this.persona = Persona;
    }

    public ArrayList<Movimientos> getListaMovimientos() {
        return listaMovimientos;
    }

    public void setMovimientos(ArrayList<Movimientos> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    @Override
    public String toString() {
        return "";
    }

    public double obtenerSaldo(){
        double saldo = 0.0;
        for(Movimientos m: listaMovimientos){

            if (m.getMovimiento().equals("RECIBO")){
                saldo = saldo + m.getMonto();
            }
            else if (m.getMovimiento().equals("TRANSFERENCIA")){
                saldo = saldo - m.getMonto();
            }

        }

        return saldo;

    }

}
