import java.util.ArrayList;

public class Cuenta {
    private int nroCuenta;
    Titular dueño;
    private double saldo = 0;
    ArrayList<Double> transacciones = new ArrayList<>();

    public Cuenta(int nroCuenta, Titular dueño, double saldo) {
        this.dueño = dueño;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public void RegistrarTransferencia(double resta){
        this.saldo -= resta;
        transacciones.add(-resta);
    }

    public void RegistrarIngreso(double Suma){
        this.saldo += Suma;
        transacciones.add(Suma);
    }

    public String toString(){
        return ("El numero de cuenta es: "+ this.nroCuenta +"\nEl dueño de la cuenta es :" + this.dueño.conocerT() + "\n" + "Su saldo es: $" + saldo );
    }
}
