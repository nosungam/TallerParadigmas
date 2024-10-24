package ClaseFamilia;

import ClaseMiembro.Don;
import ClaseMiembro.Miembro;
import ClaseMiembro.Soldado;
import ClaseMiembro.SubJefe;

import java.util.ArrayList;

public class Familia {
    private String nombre;
    private ArrayList<SubJefe> subJefes = new ArrayList<>();
    private ArrayList<Soldado> soldados = new ArrayList<>();
    private Don don;

    public Familia(String nombre) {
        this.nombre = nombre;
    }

    public void setDon(Don don) {
        this.don = don;
    }

    public void agregarSubJefe(SubJefe s) {
        subJefes.add(s);
    }

    public void agregarSoldado(Soldado s) {
        soldados.add(s);
    }

    public Miembro encontrarMasPeligroso() {
        Miembro masPeligroso = null;
        int mayorIntimidacion = 0;

        if (don != null && don.isVivo()) {
            mayorIntimidacion = don.calcularIntimidacion();
            masPeligroso = don;
        }

        for (SubJefe subJefe : subJefes) {
            if (subJefe.isVivo()) {
                int intimidacion = subJefe.calcularIntimidacion();
                if (intimidacion > mayorIntimidacion) {
                    mayorIntimidacion = intimidacion;
                    masPeligroso = subJefe;
                }
            }
        }

        for (Soldado soldado : soldados) {
            if (soldado.isVivo()) {
                int intimidacion = soldado.calcularIntimidacion();
                if (intimidacion > mayorIntimidacion) {
                    mayorIntimidacion = intimidacion;
                    masPeligroso = soldado;
                }
            }
        }

        return masPeligroso;
    }

    public void luto() {
        if (don != null && don.isVivo()) {
            System.out.println("No puede haber luto si el Don está vivo.");
            return;
        }

        for (SubJefe subJefe : subJefes) {
            if (subJefe.contarArmasEnCondiciones() <= 2) {
                Soldado degradado = new Soldado(subJefe.getNombre(), subJefe.getApellido(), subJefe.getEdad(), subJefe.getCantidadHeridas(), subJefe.isVivo());
                soldados.add(degradado);
            }
        }

        for (Soldado soldado : soldados) {
            if (soldado.contarArmasEnCondiciones() > 2) {
                SubJefe promovido = new SubJefe(soldado.getNombre(), soldado.getApellido(), soldado.getEdad(), soldado.getCantidadHeridas(), soldado.isVivo());
                subJefes.add(promovido);
            }
        }

        Miembro nuevoDon = encontrarMasPeligroso();
        if (nuevoDon instanceof Don) {
            this.don = (Don) nuevoDon;
        }
    }
}
