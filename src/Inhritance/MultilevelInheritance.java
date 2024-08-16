package Inhritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandMother grandMother =new GrandMother();
		grandMother.singing();
		GrandMother.stories();
		
		
		Mother mother=new Mother();
		mother.recipe();
		mother.look();
		mother.singing();
		
		Mother.nature();
		Mother.stories();
		
		
		
		Doughter12 daughter= new Doughter12();
		daughter.hobbies();
		daughter.study();
		daughter.recipe();
		daughter.look();
		daughter.singing();
		
		
		Doughter12.nature();
		Doughter12.stories();
		
		

	}

}
