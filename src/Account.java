public abstract class Account {

    String branchCode;
    String accountNumber;
    String accountType;
    double balance;
    Customer customer;

    public abstract String deposit(int amount);
    public abstract String viewBalance();

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    @Override
    public String toString() {
        return " Account Type: "+ accountType +" Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
