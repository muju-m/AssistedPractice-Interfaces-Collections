package AccessSpecfiers;
class BaseClass 
{ 
    void display()     
       { 
           System.out.println("BaseClass: Display with 'dafault' scope"); 
       } 
} 
public class defaultAccess {
	  public static void main(String args[]) 
      {   
        
         BaseClass obj = new BaseClass(); 
  
         obj.display();   
      } 
}
