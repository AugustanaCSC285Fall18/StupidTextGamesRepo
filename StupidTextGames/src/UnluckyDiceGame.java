import java.util.Random;
import java.util.Scanner;

public class UnluckyDiceGame implements StupidTextGame {
	
	public String getName() {
		return "Unlucky Dice";
	}
	
	public void play(Scanner console) {
		Random randGen = new Random();		
		int roll = randGen.nextInt(6) + 1;
		System.out.println("You rolled " + roll);
		if (roll < 3) {
			System.out.println("Too small, you lose!");
		} else {
			System.out.println("Too big, you lose!");
		}		
	}	


}
