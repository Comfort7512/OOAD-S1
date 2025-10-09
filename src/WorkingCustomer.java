public class WorkingCustomer extends  Customer{
    String companyName;
    String companyAddress;


    public WorkingCustomer(String name, String address, String companyAddress,String companyName,int phone){
        this.name = name;
        this.address =address;
        this.companyAddress=companyAddress;
        this.companyName = companyName;
        this.phoneNumber = phone;
    }
}
