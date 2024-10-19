package Clase4.EjercicioCtaCte;

public class CuentaJoven extends Cuenta {
    private float bonificacion;

    // Constructor con bonificación
    public CuentaJoven(String numeroCuenta, Persona titular, float saldo, float bonificacion) {
        super(numeroCuenta, titular, saldo);
        this.bonificacion = bonificacion;
    }

    // Getters y Setters
    public float getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(float bonificacion) {
        this.bonificacion = bonificacion;
    }

    // Método que verifica si el titular es válido (mayor de 18 y menor de 25 años)
    @Override
    public boolean esTitularValido() {
        int edadTitular = this.getTitular().getEdad();
        return edadTitular >= 18 && edadTitular < 25;
    }

    // Sobreescribir el método retirar para verificar si el titular es válido
    @Override
    public void retirar(float cantidad) {
        if (esTitularValido()) {
            super.retirar(cantidad);
        } else {
            System.out.println("No se puede retirar dinero. El titular no es válido.");
        }
    }

    // Método para mostrar información de la cuenta joven
    @Override
    public String toString() {
        return "Cuenta Joven{" +
                "numeroCuenta='" + getNumeroCuenta() + '\'' +
                ", titular='" + getTitular().getNombre() + ' ' + getTitular().getApellido() + '\'' +
                ", saldo=" + getSaldo() +
                ", bonificación=" + bonificacion + "%" +
                '}';
    }
}