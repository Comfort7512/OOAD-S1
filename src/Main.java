//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Customer cutsomer1 = new PrivateCompany("private bag 234","Tsholofelo",76343234);

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(500);
        savings.branchCode = "2343";
        savings.accountNumber = "203220393";
        savings.accountType = "SavingsAccount";
        savings.setCustomer(cutsomer1);
        cutsomer1.addAccount(savings);

        InvestmentAccount investement = new InvestmentAccount(500);
        investement.deposit(100);
        investement.branchCode = "495040";
        investement.accountNumber= "00000000";
        investement.accountType = "Investment Account";
        investement.setCustomer(cutsomer1);
        cutsomer1.addAccount(investement);

        System.out.println(investement.viewBalance());

        /*

        System.out.println(savings.deposit(100));
        System.out.println(savings.viewBalance());

        savings.payInterest();
        cutsomer1.viewAllCustomerAccounts();*/


        cutsomer1.viewAllCustomerAccounts();
        investement.payInterest();







    }
}