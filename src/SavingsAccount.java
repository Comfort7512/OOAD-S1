import java.util.Timer;
import java.util.TimerTask;

public class SavingsAccount extends Account implements PayInterest {

    double interestRate = 0.05;
    Customer customer;


    public SavingsAccount(Customer customer){
        this.customer = customer;

    }
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
        long period = 30L * 24 * 60 * 60 * 1000; // every 30 days interest will apply


        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                balance += balance*interestRate;
                System.out.println("Interest applied, new balance is "+balance);
            }
        };
        time.scheduleAtFixedRate(task,0,period);

        return "Automatic interest application started. Interest will apply every 5 seconds.";
    }

}
