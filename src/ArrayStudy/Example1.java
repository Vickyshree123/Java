package ArrayStudy;

public class Example1 {

	public static void main(String[] args) {
		
		
		String name1="RAM";
		String name2="SITA";
		
		char grade1='A';
		char grade2='B';
		
		int Roll1=1;
		int Roll2=2;
		
System.out.println(name1);
System.out.println(name2);

System.out.println("=========================");

String ar[]=new String[4];

ar[0]="VElocity";
ar[1]=	"Corporate";
ar[2]="Traing";
ar[3]="CEnter";

System.out.println(ar.length);

for(int i=ar.length-1;i>=0;i--)
{
	System.out.println(ar[i]);
}

}
}