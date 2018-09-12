// Evan St. Paul

import java.util.Random;
import java.util.Scanner;

public class BurgerKingOrNotGame implements StupidTextGame {
	
	public String getName() {
		return "Is This an Appropriate Moment to Eat Burger King?";
	}
	
	public void play(Scanner console) {
		System.out.println("In which of the following three scenarios is it appropriate to eat Burger King? (Choose One):\n");
		System.out.println("1: You're hungry and have a taste for some good Fast Food.");
		System.out.println("2: Someone offers you a free Whopper");
		System.out.println("3: You were lost in the wilderness for days without food and water and have just found your way back to civilization, where you happen to drive by a BurgerKing.");
		int response = console.nextInt();
		if (response > 0 && response < 4) {
			System.out.println("Wrong, it is never appropriate to get Burger King because Wendy's is better in every way.");
			
		} else {
			System.out.println("Please enter either 1, 2 or 3");
		}

	}
	
}
