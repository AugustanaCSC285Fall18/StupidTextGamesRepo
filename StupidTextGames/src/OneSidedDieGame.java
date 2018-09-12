
import java.util.*;

public class OneSidedDieGame implements StupidTextGame {
	
	public String getName() {
		return "One Sided Die";
	}

	public void play(Scanner console) {
		System.out.println("You eagerly roll the die and watch it bounce along the table...");
		System.out.println("\nYou got a one.");
		System.out.println("You lose.");
	}

}
