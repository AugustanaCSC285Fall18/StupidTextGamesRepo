/*
 * Name: Meghan Stovall
 */

import java.util.Scanner;

public class AngryPenguinGame implements StupidTextGame {

	public String getName() {
		return "Angry Penguin";
	}
	
	public void play(Scanner console) {
		System.out.print("You made the penguin angry.");
		System.out.print("You lose.");
	}
}
