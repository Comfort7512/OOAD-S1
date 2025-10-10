import java.util.ArrayList;

public abstract class Customer {

     String address;
     String name;
     int phoneNumber;
    private ArrayList<Account> accounts;

    public Customer(){
       this.accounts= new ArrayList<>();
    }

    public Customer(String address,String name, int phoneNumber){
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addAccount(Account account){
           accounts.add(account);

    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void viewAllCustomerAccounts(){
        for(Account acc : accounts){
            System.out.println("The customer "+getName()+ " has"+acc.getAccountType());
        }

    }


}
