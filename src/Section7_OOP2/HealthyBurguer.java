package Section7_OOP2;

public class HealthyBurguer extends Burguer {
    private Addition CustomAddition_1;
    private Addition CustomAddition_2;

    public HealthyBurguer(double price, String meat) {
        super("Healthy Burguer","Brown Eye Bread Roll", price, meat);
    }

    public String account(){
        return super.account() + CustomAddition_1.toString() + CustomAddition_2.toString();
    }
}
