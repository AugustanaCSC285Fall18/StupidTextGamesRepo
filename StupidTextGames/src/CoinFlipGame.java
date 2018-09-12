import java.util.Scanner;

/*
 * Wesley Pulver
 * 24 August 2018
 * Augustana College CSC 285
 */

import java.util.Random;
public class CoinFlipGame implements StupidTextGame{

	public String getName() {
		return "Coin Flip";
	}

	public void play(Scanner console) {
		Random rand = new Random();
		int flip = rand.nextInt(1);
		if(flip == 0) {
			System.out.println("Heads, you lose");
		}else {
			System.out.println("Tails, you lose");
		}
	}

}
