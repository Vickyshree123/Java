package patternPrograms;

public class Eg6 {

	public static void main(String[] args) {
		
		/*
		 *  *****
		 *   ****
		 *    ***
		 *     **
		 *      *
		 */
		//row--5 column--5
		
	int row=5;
	int star=5;
	int space=0;
	//outer for loop
	
	for (int i=1;i<=row;i++)
	{
		//inner for loop
		//for space
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
			
		}
		//for star
		for (int k=1;k<=star;k++)
		{
		System.out.print("*");

	}
		System.out.println();
		space++;
		star--;
				
	}

}
}