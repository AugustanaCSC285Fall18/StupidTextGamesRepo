/**
 * Author: Edward Ramos
 */

import java.util.Scanner;

public class WillyWonkaGame implements StupidTextGame{
	
	public String getName() {
		return "Willy Wonka";
	}
	
	public void play(Scanner console) {
		System.out.println("You stole Fizzy Lifting Drinks!");
		System.out.println("You bumped into the ceiling which now has to be washed and sterilized");
		System.out.println("So you get nothing!");
		System.out.println("You lose!");
		System.out.println("Good day, sir!");
		
	}
}
