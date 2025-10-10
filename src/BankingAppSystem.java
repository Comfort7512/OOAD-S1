//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankingAppSystem {
    public static void main(String[] args) {


        Customer TsholofeloCompany = new PrivateCompany("private bag 234","Tsholofelo",76343234);

        SavingsAccount savings = new SavingsAccount(TsholofeloCompany);
        savings.deposit(500);
        savings.branchCode = "2343";
        savings.accountNumber = "203220393";
        savings.accountType = "SavingsAccount";
        TsholofeloCompany.addAccount(savings);

        //SavingsAccount savings1 = new SavingsAccount(TsholofeloCompany);



        InvestmentAccount investement = new InvestmentAccount(500,TsholofeloCompany);
        investement.deposit(100);
        investement.branchCode = "495040";
        investement.accountNumber= "00000000";
        investement.accountType = "Investment Account";

        TsholofeloCompany.addAccount(investement);
        TsholofeloCompany.viewAllCustomerAccounts();

        //System.out.println(investement.viewBalance());
        Customer Henry = new WorkingCustomer("Henry","po box 48","private Bag 004","Okavango",7858473);


        ChequeAccount chkaccount = new ChequeAccount(6000,Henry);
        chkaccount.withDraw(500);
        chkaccount.accountNumber = "343322";

        AccountController controller = new AccountController();
        controller.addAccountToCustomer(TsholofeloCompany,savings);
        //TsholofeloCompany.viewAllCustomerAccounts();
        //Henry.addAccount(chkaccount);
        //Henry.viewAllCustomerAccounts();





        /*

        System.out.println(savings.deposit(100));
        System.out.println(savings.viewBalance());

        savings.payInterest();
        cutsomer1.viewAllCustomerAccounts();*/


        //cutsomer1.viewAllCustomerAccounts();ddd
        //investement.payInterest();







    }
}