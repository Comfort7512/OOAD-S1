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
        accounts.add(account);

    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void viewAllCustomerAccounts(){
        for(Account acc : accounts){
            System.out.println(acc);
        }
    }

}
