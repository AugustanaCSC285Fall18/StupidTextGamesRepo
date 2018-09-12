import java.util.Scanner;

public class ChickenTossGame implements StupidTextGame {
	
	public String getName() {
		return "Chicken Toss";
	}
	
	public void play(Scanner console) {
		System.out.println("You toss the chicken, and it lands on your head.");
		System.out.println("You lose.");		
	}

}
