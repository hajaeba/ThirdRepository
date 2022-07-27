package mypackage;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Employee eobj = new Employee();

//eobj.displayDetails();
	//Bank obj = new Bank();
	//obj.display_to_clerk();
		Person jay = new Person();
//hash code is a unique identification number allotted
	//to the object by jvm
		System.out.println("Hash Code:" + jay.hashCode());
		//jay.name = "haju";
		//jay.age = 35;
		//jay.talk();//calling method 
		Person p2 =new Person();
		p2.talk();
		Person raj = new Person();
		raj.name = "RAJULU";// set the variable value
		raj.age = 44;
		raj.talk();
		Person p3 = new Person();
		p3.name = "kamu";
		p3.age =  25;
		p3.talk();//must call
		
	}

}
