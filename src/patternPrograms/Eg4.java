package patternPrograms;

public class Eg4 {

	public static void main(String[] args) {
		
/*      *
		**
		***
		****
		*****
       */
		
		//row-->5 column-->5
		//!st row stars count-->star-->1
		
		int row =5;
		int column=5;
		int star=1;
		
		//outer for  loop -->rows
		for(int i=1;i<=row;i++)
		{
			//inner for loop--column
			for (int j = 1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			
		}
	}

}
