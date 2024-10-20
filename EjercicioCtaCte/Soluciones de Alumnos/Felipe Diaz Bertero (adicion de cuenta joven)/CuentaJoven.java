public class CuentaJoven extends Cuenta {
    private double bonificacion;

    public CuentaJoven(){

    }

    public CuentaJoven(Persona persona) {
        super(persona);
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }



    public void agregarMovimiento(String mov, double mont){
        if (mov.equals("TRANSFERENCIA") && esTitularValido()){
            Movimientos movimiento = new Movimientos(mov, mont);
            super.getListaMovimientos().add(movimiento);
        }
        else if (mov.equals("TRANSFERENCIA") && !esTitularValido()){
            System.out.println("NO SE PUDO EFECTUAR ESTA OPERACION PORQUE LA CUENTA NO ES VALIDA.");
        }
        else if (mov.equals("RECIBO") && !esTitularValido()){
            Movimientos movimiento = new Movimientos(mov, mont);
            super.getListaMovimientos().add(movimiento);
        }
        else if (mov.equals("RECIBO") && esTitularValido()){
            Movimientos movimiento = new Movimientos(mov, mont);
            super.getListaMovimientos().add(movimiento);
        }

    }

    public String toString(){
        if (esTitularValido()){
            return "Cuenta Joven: \n" +
                    "Persona = " + super.getPersona()+ "\n" +
                    "Movimientos = \n" + super.getListaMovimientos() + "\n" +
                    "Saldo = " + this.obtenerSaldo() + "\n" +
                    "Bonificacion = %30";
        }
        else{
            return "";
        }
    }



}
