public class Auto {
    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;

    public Auto(int volumen, String tipoChasis, String color, String tipoCarroceria, String marca, int diametro, int altura, int anchura){
        motor = new Motor(volumen);
        chasis = new Chasis(tipoChasis);
        llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++){
            llantas[i] = new Llanta(marca,diametro,altura,anchura);
        }

        carroceria = new Carroceria(color, tipoCarroceria);
    }

    @Override
    public String toString() {
        String resultado = "Datos del auto:" +
                "\nMotor - Cilindros = " + motor.volumen +
                "\nChasis - Tipo = " + chasis.tipoChasis +
                "\nCarroceria - Tipo = " + carroceria.tipo + ", Color = " + carroceria.color +
                "\nLlantas - Cantidad = " + llantas.length;

        // Añadir la información de cada llanta
        for (int i = 0; i < llantas.length; i++) {
            resultado += "\nLlanta " + (i + 1) + ": " + llantas[i].toString();
        }

        return resultado;
    }

}
