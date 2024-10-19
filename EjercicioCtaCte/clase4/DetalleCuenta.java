package Clase4.EjercicioCtaCte;

import java.util.Date;

public class DetalleCuenta {
    private Date fecha;
    private String detalle;
    private float importe;

    public DetalleCuenta(String detalle, float importe) {
        this.detalle = detalle;
        this.importe = importe;
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "DetalleCuenta{" +
                "fecha=" + fecha +
                ", detalle='" + detalle + '\'' +
                ", importe=" + importe +
                '}';
    }
}
