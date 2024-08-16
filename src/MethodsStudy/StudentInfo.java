package MethodsStudy;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo info = new StudentInfo();
		info.displayInformation();
		info.displayInformation("Test1",10, 22.3f,'A',89.9f,true);
		info.displayInformation("Test2",11,23.3f,'B',99.1f,false);

	}

	public void displayInformation() {
		String name = "Swamini";
		int rollNum = 45;
		char div = 'B';
		float marks = 98.9f;
		boolean result = true;
		System.out.println("====================================================");
		System.out.println("Student name is " + name);
		System.out.println("Student rollnum is " + rollNum);
		System.out.println("Student div is  " + div);
		System.out.println("Student marks is  " + marks);
		System.out.println("Student result is  " + result);
		System.out.println("======================================================");

	}
	public void  displayInformation(String name,int rollNum,float age,char div ,float marks,boolean result)
	{

		System.out.println("====================================================");
		System.out.println("Student name is " + name);
		System.out.println("Student rollnum is " + rollNum);
		System.out.println("Student div is  " + div);
		System.out.println("Student marks is  " + marks);
		System.out.println("Student result is  " + result);
		System.out.println("======================================================");
		
	}
}
