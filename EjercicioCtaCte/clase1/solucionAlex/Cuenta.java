package CuentaBancaria;

public class Cuenta {
    private int numberAccount;
    private String name;
    private double money;
    //metodo constructor
    public Cuenta(int numberAccount, String name, double money) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {

        return "Cuenta{" +
                " Número de cuenta = " + numberAccount +
                ", Titular = " + name +
                ", Saldo =" + money +
                "}";
    }

    private int getNumberAccount() {
        return numberAccount;
    }

    private void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void ingresarDinero(double cantidad){
        if (cantidad > 0){
            money+=cantidad;
            System.out.println("Ingresó: " + cantidad + " Nuevo saldo: " + money);
        }
        else {
            System.out.println("Ingreso invalido");
        }
    }
    public void retirarDinero(double cantidad){
        if (cantidad > 0){
            money -=cantidad;
            if (money < 0){
                System.out.println("Dinero a retirar insuficiente");
            }
            else {
                System.out.println("Nueva cantidad:" + money);
            }

        }
        else {
            System.out.println("Cantidad a retirar no disponible");
        }
    }
    public void mostrar(){
        System.out.println(this.toString());
    }
}
