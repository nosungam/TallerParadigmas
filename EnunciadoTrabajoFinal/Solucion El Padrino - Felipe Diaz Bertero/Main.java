import ClaseArma.CuerdaPiano;
import ClaseArma.Daga;
import ClaseArma.Revolver;
import ClaseArma.RevolverOxidado;
import ClaseFamilia.Familia;
import ClaseMiembro.Don;
import ClaseMiembro.*;
import ClaseMiembro.Soldado;
import ClaseMiembro.SubJefe;

public class Main {
    public static void main(String[] args) {

        Don don1 = new Don("Salvatore", "Leone", 55, 0, true);
        Don don2 = new Don("Franco", "Forelli", 45, 0, true);

        SubJefe subJefeA1 = new SubJefe("Antonio", "Cipriani", 40, 0, true);
        Revolver revolver1 = new Revolver(true, 6);
        subJefeA1.agregarArma(revolver1);

        SubJefe subJefeA2 = new SubJefe("Joey", "Leone", 31, 0, true);
        Daga daga1 = new Daga(4);
        subJefeA2.agregarArma(daga1);

        SubJefe subJefeB1 = new SubJefe("Sonny", "Forelli", 35, 0, true);
        RevolverOxidado revolverOxidado1 = new RevolverOxidado();
        subJefeB1.agregarArma(revolverOxidado1);

        Soldado soldadoA1 = new Soldado("Claude", "Speed", 31, 0, true);
        CuerdaPiano cuerdaPiano1 = new CuerdaPiano(true);
        soldadoA1.agregarArma(cuerdaPiano1);

        Soldado soldadoB1 = new Soldado("Tommy", "Vercetti", 35, 0, true);
        Soldado soldadoB2 = new Soldado("Lance", "Vance", 34, 0, true);
        Soldado soldadoB3 = new Soldado("Carl", "Johnson", 21, 0, true);


        Familia familiaLeone = new Familia("Familia Leone");
        Familia familiaForelli = new Familia("Familia Forelli");


        familiaLeone.setDon(don1);
        familiaLeone.agregarSubJefe(subJefeA1);
        familiaLeone.agregarSubJefe(subJefeA2);
        familiaLeone.agregarSoldado(soldadoA1);


        familiaForelli.setDon(don2);
        familiaForelli.agregarSubJefe(subJefeB1);
        familiaForelli.agregarSoldado(soldadoB1);
        familiaForelli.agregarSoldado(soldadoB2);
        familiaForelli.agregarSoldado(soldadoB3);


        System.out.println("¿El Don Salvatore está muerto? " + !don1.isVivo());
        System.out.println("¿El Don Franco está muerto? " + !don2.isVivo());


        Miembro masPeligrosoLeone = familiaLeone.encontrarMasPeligroso();
        System.out.println("El miembro más peligroso de la Familia Leone es: " + masPeligrosoLeone.getNombreRango());

        Miembro masPeligrosoForelli = familiaForelli.encontrarMasPeligroso();
        System.out.println("El miembro más peligroso de la Familia Forelli es: " + masPeligrosoForelli.getNombreRango());


        System.out.println("Antonio Cipriani ataca a la familia Forelli:");
        Miembro objetivo = familiaForelli.encontrarMasPeligroso();
        System.out.println("La víctima es: " + objetivo.getNombreRango() + " de la familia Forelli.");


        subJefeA1.agregarArma(new Revolver(true, 3));
        System.out.println("El subJefe más peligroso de la familia Leone ahora tiene " + subJefeA1.calcularIntimidacion() + " puntos de intimidación");


        System.out.println("\n--- Luto en la Familia Leone: Ha muerto el Don ---");
        don1.setVivo(false);
        familiaLeone.luto();


        System.out.println("El nuevo Don de la Familia Leone es: " + familiaLeone.encontrarMasPeligroso().getNombreRango());


        subJefeB1.agregarArma(revolverOxidado1);
        System.out.println("Sonny Forelli usa un revolver oxidado y tiene " + subJefeB1.calcularIntimidacion() + " puntos de intimidación");
    }
}
