import java.util.ArrayList;

public abstract class Customer {

     String address;
     String name;
     int phoneNumber;

    public Customer(){

    }

    public Customer(String address,String name, int phoneNumber){
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account account){
        if(accounts.size() > 3){
            System.out.println("Cannot have more than 3 accounts");
        }
        for(Account acc : accounts){
            if(acc.getClass() == account.getClass()){
                throw new IllegalArgumentException("Cannot have more than type of accounts");
            }
        }
        accounts.add(account);

    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void viewAllCustomerAccounts(){
        for(Account acc : accounts){
            System.out.println("The customer has "+acc);
        }

    }


}
