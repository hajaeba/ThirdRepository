package mypackage;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Sample s1 = new Sample(10,22.5);
     //paramerized constructor called
     //s1.Sum();//no return type
		Sample s1 = new Sample();
     double result = s1.Sum(20,30.6);// method with return type called
                             // and parameter
     System.out.println(" The result is "+result);
	}

}
