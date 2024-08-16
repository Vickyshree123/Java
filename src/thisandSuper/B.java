package thisandSuper;

public class B extends A {
	
	int x=1;

	public static void main(String[] args) {
		B b=new B();
		b.demo2();

	}
	public void demo2()
	{
		int x=2;
		int sum1=100+x;
		System.out.println(sum1);
		
		int sum2=100+this.x;
		System.out.println(sum2);
		
		int sum3=100+super.x;
		System.out.println(sum3);
		
		int sum4=100+y;
		
	}

}
