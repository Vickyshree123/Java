package MethodsStudy;


public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main Method is Running");
		m1();
		Test1 test1 = new Test1();
		
		test1.m2();
		System.out.println("===================");
		
		
		
		Test2.m3();
		
		
		Test2 test2 =new Test2();
		test2.m4();
		
		System.out.println("Main Method is stopped");

	}
		public static void m1()
		{
			System.out.println("This is static regular m1 method from Test1 class ");
		}
		public void m2()
		{
			System.out.println("This is non-static regular m2 method from Test1 class ");
		}
}
