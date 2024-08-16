package controlStatement;

public class Else_If_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=17;
		
		
		if (marks>=60)
		{
			System.out.println("You are in 1st class");
		}
		else if(marks>=50)
		{
			System.out.println("You are in 2nd class");
		}
		else if(marks>=40)
		{
			System.out.println("You are in just pass class");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
