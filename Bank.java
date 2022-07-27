package mypackage;

public class Bank {
   private int accno;
   private String name;
   private float balance;
   private float profit;//this is example of Abstraction
   private float loan;//we do not need to use profit and 
   //loan variable b/c hiding complexity of object
   
   public void display_to_clerk()
   {
	   System.out.println("Accno: " +accno);
	   System.out.println("Name: " +name);
	   System.out.println("Balance: " +balance);


   }
}
