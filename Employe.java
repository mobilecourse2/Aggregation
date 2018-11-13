 
package employe;
 
public class Employe {
    
    int id;
    String name;
    Address addr;
    
    
    public Employe(int id , String name, Address addr)
    {
        this.id=id;
        this.name=name;
        this.addr=addr;
    
    }
    
    void print()
    {
        System.out.println("EMP_ID is "+ id);
        System.out.println("EMP_Name is "+name);
        System.out.println("EMP_Address is "+addr.country);
    
    
    }
    public static void main(String[] args) {
          
        Address ad1 = new Address(38000, "Pakistan","Faisalabad" );
        
        Employe emp = new Employe(1,"Usman",ad1);
        
        emp.print();
    }
    
}
