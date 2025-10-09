public class ChequeAccount extends Account implements Withdraw{

    Customer customer;

    public ChequeAccount(double openingBalance, Customer customer ){
        if (!(customer instanceof WorkingCustomer)){
            throw new IllegalArgumentException("CUSTOMER must be working");
        }
        this.customer = customer;
        this.balance = openingBalance;
        this.accountType = "Cheque Account";
    }
    @Override
    public String deposit(int amount) {
        balance += amount;
        return "Deposited: " + amount + ". New balance: " + balance;
    }
     @Override
    public String withDraw(int amount) {
        if (amount > balance) {
            return "Insufficient funds. Current balance: " + balance;
        }
        balance -= amount;
        return "Withdrawn: " + amount + ". Remaining balance: " + balance;
    }

    @Override
    public String viewBalance() {
        return "Balance: " + balance;
    }
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
