import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList();


    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            Branch actual = branches.get(i);
            if(actual.getName().equals(branchName)){
                return actual;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addBranchTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customers for branch" + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0; i < branchCustomers.size(); i++){
                Customer customer = branchCustomers.get(i);
                System.out.println("Customer name = " + customer.getName());
                if(printTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            String[] array = new String[56];
            Branch[] branches = new Branch[5];
            return true;


        }
        return false;
    }
}
