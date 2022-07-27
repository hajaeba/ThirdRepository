package mypackage;

public class constPersonclass {
// properties of a person -instance variable
	  private String name;//instance variable
	  private int age;
	  //default constructor
	  
	  constPersonclass()//default constructor
	  {
		  name = "Jay";//Initialization variable
		  age = 25;
		  
	  }
	  constPersonclass(String n, int a) //Parameterized constructor
	  {                                  //constructor
		  name = n;//Initialization
		  age = a;
		  
	  }
	  // action done by person
	  void talk()//method
	  {
		  System.out.println("Hello I am "+name);
		  System.out.println("my age is "+age);
		  
	  }
}