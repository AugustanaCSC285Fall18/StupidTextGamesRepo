import java.util.Scanner;
/*
 * Ehren Braun
 */
public class PasswordGame implements StupidTextGame{
	public String getName() {
		return "Password Game";
	}
	
	public void play(Scanner console) {
		System.out.println("Guess the Password! You have three tries.");
		for(int guess = 1; guess <= 3; guess++) {
			System.out.print("Guess #" + guess + ": ");
			console.next();
			System.out.println("That's not the Password!");
		}
		System.out.println("You did not get the Password, you lose!");
	}
}
