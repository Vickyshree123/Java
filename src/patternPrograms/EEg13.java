package patternPrograms;

public class EEg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *         *
 * **       **
 * ***     ***
 * ****   ****
 * ***** *****
 * ****   ****
 * ***     ***
 * **       **
 * *         *
 * 
 *
 */
		//row--9 star1-->1  star2-->1 Space1-->5 space--4
		  
		int row=9;
		int star1=1;
		int star2=1;
		int space1=5;
		int space2=4;
		
		//outer for loop--rows
		for(int i=1;i<=row;i++)
		{
			//inner for loop for 
			//star
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			//space1
			for(int k=1;k<=space1;k++)
			{
				System.out.print(" ");
			}
			//space2
			for(int l=1;l<=space2;l++)
		
		{
			System.out.print(" ");
		}
			//star2
		for(int m=1;m<=star2;m++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(i<5)
		{
			star1++;
			space1--;
			space2--;
			star2++;
		}
		else
		{
			star1--;
			space1++;
			space2++;
			star2--;
			
		}
		
		}	
	}

}
