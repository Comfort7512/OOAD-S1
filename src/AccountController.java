import java.util.ArrayList;

public class AccountController {

    public void addAccountToCustomer(Customer customer,Account account){
        ArrayList<Account> accounts = customer.getAccounts();
        if(accounts.size()>3){
            System.out.println("Cannot have more than 3 accounts.");
            return;
        }

        for(Account acc: accounts){
            if(acc.getClass()==account.getClass()){
                throw new IllegalArgumentException("Cannot have more than one account type");

            }
        }
        customer.addAccount(account);
        System.out.println("Account added successfully for " + customer.getName());
    }




}
