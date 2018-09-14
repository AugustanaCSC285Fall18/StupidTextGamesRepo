import java.util.Scanner;

/*
 * Author:Brent Pierce
 */
public class BaseballFanQuiz implements StupidTextGame{

	@Override
	public String getName() {
		return "Baseball Fan Quiz";
	}

	@Override
	public void play(Scanner console) {
		System.out.println("Enter your favorite baseball team (all lowercase)");
		String choice = console.next();
		
		if(choice.equalsIgnoreCase("cubs")) {
			System.out.println("Good choice, you win!");
		}else {
			System.out.println("Hmmm. That's a odd choice. You lose!");
		}
		
	}

}
