/**
 * @author Omidullah Barikzay
 */

import java.util.Scanner;

public class SelectNumber implements StupidTextGame {

	public String getName() {
		return "Number Selection";
	}
	
	public void play(Scanner console) {
		System.out.print("Guess the right number from 0 to 100:  ");
		int choice = console.nextInt();
		if(choice<50) {
			System.out.println("You didn't guess the right number");
			System.out.println("You lose");
		}else if(choice>50) {
			System.out.println("It's not even close");
			System.out.println("Maybe next time");
		}else {
			System.out.println("Nope it would be to easy if it was this number");
		}

	}

}
