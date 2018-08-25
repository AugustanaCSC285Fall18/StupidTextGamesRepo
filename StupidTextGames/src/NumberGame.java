// Name: Anh Nguyen

import java.util.Random; 
import java.util.Scanner;
 

public class NumberGame implements StupidTextGame{

	public String getName() {
		return "Number Game";
	}
	
	public void play(Scanner console) {
		System.out.print("Choose a number from 0 to 10: ");
		int num = console.nextInt();
		Random randGen = new Random();		
		int roll = randGen.nextInt(11);
		
		System.out.println("Our number is " + roll);
		if (num == roll) {
			System.out.println("You win!");
		} else {
			System.out.println("It doesn't match! You loose!");
		}
	}

}
