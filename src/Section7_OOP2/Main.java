package Section7_OOP2;

public class Main {

    public static void main(String[] args) {
        Burguer baseBurguer = new Burguer("Crystal", 4.0, "Steak");
        Addition Tomato = new Addition("Tomato", 1.2);
        Addition Chips = new Addition("Chips", 3.5);
        Addition Carrot = new Addition("Carrot", 3.2);
        Addition Lettuce = new Addition("Lettuce", 0.5);
        baseBurguer.setAddition_1(Tomato);
        baseBurguer.setAddition_2(Chips);
        baseBurguer.setAddition_3(Carrot);
        baseBurguer.setAddition_4(Lettuce);

        System.out.println(baseBurguer.account());
    }
}
