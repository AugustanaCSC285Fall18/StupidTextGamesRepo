import java.util.Scanner;

public class DontChooseGame implements StupidTextGame {
	
	public String getName() {
		return "Don't Choose This Game";
	}
	
	public void play(Scanner console) {
		System.out.println("You chose this game. You lose.");		
	}

}
