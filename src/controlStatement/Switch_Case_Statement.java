package controlStatement;

public class Switch_Case_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int day=6;
       switch(day)
       {
       case 1:System.out.println("Today is Sunday");
       break;
       
       case 2:System.out.println("Today is Monday");
       break;


       case 3:System.out.println("Today is Tuesday");
       break;
       
       case 4:System.out.println("Today is Wendsday");
       break;
       
       case 5:System.out.println("Today is Thursday");
       break;
       
       case 6:System.out.println("Today is friday");
       break;
       
       case 7:System.out.println("Today is Saturday");
       break;
       
       
       default:
    	   System.out.println("Please Enter value between 1 to 7");
           break;
       
       }
       
       
       
       
       
       
       char gender='M';
       switch(gender)
       {
       case 'M':System.out.println("You are Male");
       break;
       
       case 'F':System.out.println("You are Female");
       break;
       
       default: System.out.println("Please Enter gender Value between M/F");
       break;
       }
	}

}
