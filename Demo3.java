package mypackage;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Sample2 s1 = new Sample2();
     //s1.sum(20, 20);//we can not access by this way
     double result = Sample2.sum(20, 40.5);
     // static method involved directly
         //with the  class name
     System.out.println(" Sum = " + result);
	}

}
