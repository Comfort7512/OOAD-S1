import java.util.Timer;
import java.util.TimerTask;

public class InvestmentAccount extends Account implements PayInterest,Withdraw {

    double interestRate = 5;
     final double minimumDeposit = 500;
    Customer customer;

    public InvestmentAccount(double openingBalance){
        if(openingBalance<minimumDeposit){
           throw new IllegalArgumentException("Minimum balance should be 500");
        }else {
            this.balance = openingBalance;

        }
    }


    @Override
    public String deposit(int amount){
        balance+=amount;
        return "Amount deposited is "+ amount+" and total balance is "+balance;
    }
      @Override
      public String withDraw(int amount){
        if(amount>balance){
            System.out.println("No sufficient funds");
        }
        balance-=amount;
        return "You have withdrawn "+amount+ " and have remaining balnce of "+balance;
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
    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
