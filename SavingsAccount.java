public class SavingsAccount extends  Account implements PayInterest {
    double interestRate = 0.05;
    
    
    public  int deposit(int amount){
        balance +=amount;
       System.out.println("You have deposited "+balance);
       return balance;
    }
    
    public void viewBalance(){
        System.out.println("You have "+balance+" in your account");
    }

    public void applyInterest(){
    
    }
    
}
