package Section7_OOP2;

public class Burguer {
    private String rollType;
    private double price;
    private String meat;
    private String name;
    private Addition addition_1;
    private Addition addition_2;
    private Addition addition_3;
    private Addition addition_4;

    public Burguer(String name, String rollType, double price, String meat) {
        this.rollType = rollType;
        this.price = price;
        this.meat = meat;
        this.name = name;
    }

    public void setAddition_1(Addition addition_1) {
        this.addition_1 = addition_1;
    }

    public void setAddition_2(Addition addition_2) {
        this.addition_2 = addition_2;
    }

    public void setAddition_3(Addition addition_3) {
        this.addition_3 = addition_3;
    }

    public void setAddition_4(Addition addition_4) {
        this.addition_4 = addition_4;
    }

    public String account(){
        return  "Burger: " + name + " price: " + price + addition_1.toString() + addition_2.toString() +
                addition_3.toString() + addition_4.toString();
    }
}
