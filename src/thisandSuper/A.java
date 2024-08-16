package thisandSuper;

public class A {

		int x=99;
		int y=101;
		public static void main(String[] args) 

		{
			A a= new A() ;
			a.demo1();
			
		}
		public void demo1()
		{
			int x=12;
			int sum=100+this.x;
			System.out.println(sum);
			int sub=100-x;
			System.out.println(sub);
		}

}
