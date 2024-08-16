package patternPrograms;

public class Eg3 {

	public static void main(String[] args) {
		//*****
		//*****
		//*****
		
		//row-->3columns-->5
		//think about row 1st-->outer loop rows
		//inner for  loop-->for columns
		
		int row=3;
		int column=5;
		
		
	//for outer loop--row
		for(int i=1;i<=row;i++)//1,2,3,4...
		{
			for (int j=1;j<=column;j++)//1,2,3,4,5
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
