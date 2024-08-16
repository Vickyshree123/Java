package accsessSpecifier;

public class Demo1 {
	private int a=10;
	int b=20;
	protected int c=100;
	public int d=90;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo =new Demo1();
		demo.test1();
		System.out.println(demo.a);
		
		demo.test2();
		System.out.println(demo.b);
		
		demo.test3();
		System.out.println(demo.c);
		
		demo.test4();
		System.out.println(demo.d);
		

	}
	private void test1()
	{
		System.out.println("This Demos private test1 Method");
	}
	public void test2()
	{
		System.out.println("This is default test2 method method");
	}
	public void test3()
	{
		System.out.println("This is Demos protected test3 method");
	}
	public void test4()
	{
		System.out.println("This is demo public test4 method");
	}

}
