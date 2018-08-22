import java.util.Random;
import java.util.Scanner;

public class StupidTextGameLauncher {

	public static void main(String[] args) {
		System.out.println("Choose a stupid text game:");
		System.out.println("1: UnluckyDice");
		System.out.println("2: ChickenToss");
		
		Scanner console = new Scanner(System.in);
		int choice = console.nextInt();
		
		if (choice == 1) {
			Random randGen = new Random();		
			int roll = randGen.nextInt(6) + 1;
			System.out.println("You rolled " + roll);
			if (roll < 3) {
				System.out.println("Too small, you lose!");
			} else {
				System.out.println("Too big, you lose!");
			}
		} else if (choice == 2) {
			System.out.println("You toss the chicken, and it lands on your head.");
			System.out.println("You lose.");
		}		

	}

}
