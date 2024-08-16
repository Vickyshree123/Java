package MethodsStudy;

public class MathsOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsOperation mo=new MathsOperation();
		mo.addition();
		mo.addition(4,7);
		substraction();
		substraction(5,9);
	}
	
	public void addition()
	{
		int a=10;
		int b=2;
		int sum =a+b;
		System.out.println("Addition is  " +sum);
	}
	public void addition (int a,int b)
	{
		int sum =a+b;
		System.out.println("Addition is  "+sum);
	}
	public static void substraction()
	{
		int x=99;
		int y=90;
		int sub=x-y;
		System.out.println("Substraction is"+sub);
	}
	public static void substraction (int x,int y)
	{
		int sub =x-y;
		System.out.println("Substraction is"+sub);
	}

}
