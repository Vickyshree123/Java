package Interface;

public interface Mother {
		void look();
		default void love()
		{
			System.out.println("Mother love");
		}
		
		static void care() {
			System.out.println("Mother care");
			
		}
}
