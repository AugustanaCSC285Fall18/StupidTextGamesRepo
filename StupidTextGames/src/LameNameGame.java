/*
 * Name: Bryson Adcock
 */

import java.util.Scanner;

public class LameNameGame implements StupidTextGame {

	public String getName() {
		return "Lame Name Game";
	}

	public void play(Scanner console) {
		System.out.println("Your name is lame just like this game.");
		System.out.println("I can rhyme any time.");
		System.out.println("You can't so you lose.");
	}

}
