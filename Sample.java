package mypackage;

public class Sample {
    private  double num1, num2;
    
   // Sample(double x, double y)//parameterized constructor
   // {
    //	num1= x;
    //	num2 = y;
   // }
   // void Sum()//method no return type and no para
    //double Sum()//method with return type and no para
    double Sum(double num1, double num2)//with return type
    //and with parameter
    {
    	double res = num1 + num2;
    	return res;
    	//System.out.println("The Result is "+ res);
    }
}
