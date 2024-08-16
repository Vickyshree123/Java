package controlStatement;

public class Nested_If_Statement {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String emailId="java@gmail.com";
		String password="java@1234";
		
		if (emailId=="java@gmail.com")
		{
			System.out.println("Email Id is correct,plese enter password");
		
			if(password=="java@1234")
			{
				System.out.println("Password is correct,Login Success");
			}
			else
			{
				System.out.println("incorrect Password");
			}
		}
	else
		{
		System.out.println("Emailid is incorrect");
	    }

	}
}
