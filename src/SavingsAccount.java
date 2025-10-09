import java.util.Timer;
import java.util.TimerTask;

public class SavingsAccount extends Account implements PayInterest {

    double interestRate = 0.05;
    Customer customer;


    @Override
    public String deposit(int amount){
      balance+=amount;
     return "Amount deposited is "+ amount+" and total balance is "+balance;
    }

    @Override
    public String viewBalance(){
      return "Total balance is "+balance;
    }

    @Override
    public String payInterest() {

        Timer time = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                balance += balance*interestRate;
                System.out.println("Interest applied, new balance is "+balance);
            }
        };
        time.scheduleAtFixedRate(task,0,5000);

        return "Automatic interest application started. Interest will apply every 5 seconds.";
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
