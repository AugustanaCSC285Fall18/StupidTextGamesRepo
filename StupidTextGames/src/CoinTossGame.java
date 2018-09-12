/**
 * Name: Kathryn Clark
 * Class: CSC 285
 * Date: 24 August 2018
 * 
 * Description: This class creates another text game in which the computer
 * flips a coin and the player can never win.
 */

import java.util.*;

public class CoinTossGame implements StupidTextGame {

	public String getName() {
		return "Coin Toss";
	}

	public void play(Scanner console) {
		System.out.println("Heads I (The Computer) win. Tails you lose.");
		Random rng = new Random();
		int coinToss = rng.nextInt(2);
		if (coinToss == 0) {
			System.out.println("Heads, I win.");
		} else {
			System.out.println("Tails, you lose.");
		}
	}
	
}
