public class CuentaJoven extends Cuenta{
    private int bonificacion;
    public CuentaJoven(int nroCuenta, Titular dueño, double saldo) {
        super(nroCuenta, dueño, saldo);
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public String toString(){
        return ("Cuenta Joven, su boinificacion es de :" + this.bonificacion + "%");
    }
}
