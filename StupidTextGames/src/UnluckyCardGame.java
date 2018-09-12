import java.util.Random;
import java.util.Scanner;

// name: Connor McGing
public class UnluckyCardGame implements StupidTextGame{

		public String getName() {
			return "Unlucky Cards";
		}
		
		public void play(Scanner console) {
			Random randGen = new Random();		
			int card = randGen.nextInt(13) + 1;
			System.out.println("You picked a " + card);
			if (card < 6) {
				System.out.println("Too small, you lose!");
			} else {
				System.out.println("Too big, you lose!");
			}		
		}	


}
