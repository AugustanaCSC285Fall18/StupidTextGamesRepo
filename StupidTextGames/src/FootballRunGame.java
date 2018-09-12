import java.util.Random;

public class FootballRunGame {
//Jack Miller
	public static void main(String[] args) {
		Random rand = new Random();
		int run = rand.nextInt(3)+1;
		if(run == 1) {
			System.out.println("You fumbled the football. You Lose!");
		}else if( run == 2) {
			System.out.println("You caught the pass! But you dropped it after a few yards. You Lose!");
		}else {
			System.out.println("You caught a pass and ran it in for a TD! It was your team's endzone. You Lose!");
		}
	}

}
