package Interface;

import MethodsStudy.Mainmethid;

public class Son implements Mother, Father{

	public static void main(String[] args) {
		
      Son son=new Son();
      son.look();
      son.nature();
      son.love();
      
      System.out.println("================================");
      
      Mother.care();
      Father.care();

	}
	
	public void nature()
	{
		System.out.println("Fathrs nature");
	}
	
	public void look()
	{
		System.out.println("Mothers look");
	}
	
	public  void love()
	{
		Mother.super.love();
		Father.super.love();
	}

}
