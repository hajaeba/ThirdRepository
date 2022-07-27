package mypackage;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constPersonclass p1 = new constPersonclass();
		//default constructor involved
		p1.talk();
		constPersonclass p2 = new constPersonclass("mandu",30);
		//Parameterized constructor called
		p2.talk();//method called
	}

}
