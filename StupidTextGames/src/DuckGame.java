/**
 * Name: Genesis Sarmiento
 */

import java.util.Scanner;
public class DuckGame implements StupidTextGame {

	public static void main(String[] args) {
		

	}
	
	public String getName() {
		return "Duck Game";
	}
	
	public void play(Scanner console) {
		System.out.println("Answer this question correctly and you will get a prize!\n");
		System.out.println("What sound does a duck make?");
		
		String answer = console.next();
		
		if(answer.equalsIgnoreCase("quack")) {
			System.out.println("\nWrong!\nYou lose.");
		}else {
			System.out.println("\nCorrect! Your prize is...\n\nNothing.");
		}
	}

}
