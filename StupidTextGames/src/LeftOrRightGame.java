import java.util.Scanner;
import java.util.*;


/**
 * 
 * @author April Tran
 *
 *This game makes player randomly choose between left or right. 
 */
public class LeftOrRightGame implements StupidTextGame {
	
	public String getName() {
		return "Left or Right?";
	}
	
	public void play(Scanner console) {
		System.out.println("\nLet's guess.... Left or Right?");
		Random rand = new Random();
		int roll = rand.nextInt(2) ;
		System.out.println(roll);
		
		String ans = console.next();
		int answer = 2;
		
		if(ans.equalsIgnoreCase("left")) {
			answer = 0;
		}else if(ans.equalsIgnoreCase("right")) {
			answer = 1;
		}
		
		if(roll == answer) {
			System.out.println("That's right! You win!");
		}else {
			System.out.println("Too stupid! You lose!");
		}
	}

}
