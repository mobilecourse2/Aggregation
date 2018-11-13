 
package employe;

 
public class Address {
    
    String country , state;
    int pincode;
    
    public Address(int pincode, String country, String state)
    {
        this.country=country;
        this.pincode=pincode;
        this.state=state;
        
    }
    
}
