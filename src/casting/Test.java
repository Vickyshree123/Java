package casting;

public class Test {

	public static void main(String[] args) {
		byte a=9;
		System.out.println(a);
		float b=a;
		System.out.println(b);
		System.out.println("========================");
		
		float x=99.99f;
		System.out.println(x);
		byte y=(byte)x;
		System.out.println(y);
	}

}
