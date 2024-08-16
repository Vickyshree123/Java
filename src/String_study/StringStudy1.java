package String_study;

public class StringStudy1 {

	public static void main(String[] args) {
		String s1="Velocity";
		String s2="vel";
		String s3="Test";
		
		String m=new String ("Velocity");
		String m1=new String("Velocity");
		String m2=new String("VELOCITY");
		String m3=new String("");
		String m4=new String ("Java Classes");
		
		s3=m1.concat(m4);
		
		String m6="My,test";
		System.out.println(m6);
		System.out.println(m6.split(","));

	}

}
