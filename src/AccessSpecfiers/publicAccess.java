package AccessSpecfiers;
class A 
{ 
   public void display() 
      { 
          System.out.println("Access specfier: Public"); 
      } 
} 
public class publicAccess {
	public static void main(String args[]) 
    { 
        A obj = new A (); 
        obj.display(); 
    } 
}