import java.util.Scanner;

/*
 * NAME: AJ Housholder
 * Date: 8/24/18
 * Class: CSC285
 */
public class MoreThanFiveGame {

	public static void main(String[] args) {
	  Scanner console = new Scanner(System.in);
	  System.out.print("Please type an integer:");
	  int userInput = console.nextInt();
	  if(userInput > 5) {
		  System.out.println("Congrats! You picked a number higher than Five");
	  } else {
		  System.out.println("It is with deep regret that I must inform you that you have picked a number less than 5.");
	  }
	}

}
