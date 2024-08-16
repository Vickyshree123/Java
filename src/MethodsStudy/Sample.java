package MethodsStudy;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main method running");
testMe();
testMe();
testMe();
System.out.println("Main method finished");
Demo.display();
Demo.display2();
	}
	public static void testMe()
	{
		System.out.println("This is testMe regular method");
		Demo.display();
	}

}
