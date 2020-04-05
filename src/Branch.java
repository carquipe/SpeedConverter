import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, Double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            Customer actual = customers.get(i);
            if(actual.getName().equals(customerName)){
                return actual;
            }
        }
        return null;
    }

    public boolean addCustomerTransaction(String customerName, Double transaction){
        Customer actual = findCustomer(customerName);
        if(actual != null) {
            actual.addTransaction(transaction);
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
