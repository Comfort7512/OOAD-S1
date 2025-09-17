public abstract class Account {
    String acccountNumber;
    String branchCode;
    String accountType;
    int balance;
    
    public abstract int deposit(int amount);
    public abstract void viewBalance();
}
