package variableTypes;

public class Sample2 
{
	int x = 8;// non static global variable
	static int y = 10;// static gloable variable

	public static void main(String[] args) 
	{
		//call global variable from same class
		//to call non static global variable==>need to create object of class
		//Object Name.variabableName
		Sample2 sample2 =new Sample2();
	System.out.println("calling non static globle variable"+sample2.x);
	System.out.println("Static globle variable"+y);
	
	
	//call static variable from another class
	//to call non static global variable from another class==>create object of that c
		// TODO Auto-generated method stub
	Sample3 s3 =new Sample3();//
	System.out.println("Callling non static global variable from another class"+ s3.x);
	System.out.println("Calling static globle varible from another class " + Sample3.y);
	
	sample2.test1();
	
	
	//Sample3.test2();

}

	public void test1() {
		int sum = 10 + x;
		int sub = 90 - y;
		System.out.println("Sum is " + sum);
		System.out.println("Sub is " + sub);
	}



}
