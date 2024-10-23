public class Main {
    public static void main(String[] args) {
        Planeta Tatooine = new Planeta();

        Maestro Rey = new Maestro(100,new Equipamiento("sable",100,0),1000,200,1,1000);
        Soldado HanSolo = new Soldado(100,25);
        Equipamiento HalconMilenario = new Equipamiento("Halcon",1000,0.6);
        HanSolo.setEquipamiento(HalconMilenario);
        HanSolo.UsarEquipamiento(HalconMilenario);
        HanSolo.UsarEquipamiento(HalconMilenario);
        Soldado Chubby = new Soldado(100,2);
        Chubby.setEquipamiento(HalconMilenario);
        Chubby.UsarEquipamiento(HalconMilenario);

        Tatooine.agregarHabitante(Rey);
        Tatooine.agregarHabitante(HanSolo);
        Tatooine.agregarHabitante(Chubby);

        System.out.println("Rey Jedi");
        System.out.println(Rey.calculoPoder());
        System.out.println(HanSolo.calculoPoder());
        System.out.println(Chubby.calculoPoder());
        System.out.println(Tatooine.calcularPoderdelMundo());

        System.out.println("Rey Sith");
        Rey.agregarEquipamiento(HalconMilenario);
        Rey.vivirSucesos(-100);
        System.out.println(Rey.calculoPoder());

        System.out.println(HanSolo.calculoPoder());
        System.out.println(Chubby.calculoPoder());
        System.out.println(Tatooine.calcularPoderdelMundo());

        if (Tatooine.hayOrden()){
            System.out.println("Hay Orden");
        }else{
            System.out.println("No hay Orden");
        }

        Maestro Anakin = new Maestro(100,new Equipamiento("sable",100,0),1000,1000,1,10000);
        Anakin.vivirSucesos(-150);

        Maestro DarthVader = Anakin;
        DarthVader.vivirSucesos(-100);
        DarthVader.vivirSucesos(-300);

        DarthVader.vivirSucesos(1000);

        Anakin = DarthVader;

        System.out.println(Anakin.calculoPoder());



    }
}