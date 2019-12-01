package Section7_OOP2;

public class DeluxeBurguer extends Burguer{

    public DeluxeBurguer(String rollType, double price, String meat) {
        super("Deluxe Burguer", rollType, price, meat);
        Addition addChips = new Addition("Chips", 3.5);
        Addition addDrink = new Addition("Coke", 1.5);
        this.setAddition_1(addChips);
        this.setAddition_2(addDrink);
    }

    @Override
    public void setAddition_1(Addition addition_1) {
        System.out.println("Cannot add additional in Deluxe Burguer");
    }

    @Override
    public void setAddition_2(Addition addition_2) {
        System.out.println("Cannot add additional in Deluxe Burguer");
    }

    @Override
    public void setAddition_3(Addition addition_3) {
        System.out.println("Cannot add additional in Deluxe Burguer");
    }

    @Override
    public void setAddition_4(Addition addition_4) {
        System.out.println("Cannot add additional in Deluxe Burguer");
    }
}
