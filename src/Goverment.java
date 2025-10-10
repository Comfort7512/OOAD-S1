public class Goverment extends  Customer{
    int govermentID;
    String signatureAuthority;

    public Goverment(String name,String address,int phoneNumber,String signatureAuthority,int govermentID){
        this.name = name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.signatureAuthority = signatureAuthority;
        this.govermentID=govermentID;

    }
}
