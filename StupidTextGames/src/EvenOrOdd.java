/*kevin monroy*/

import java.util.Scanner;

public class EvenOrOdd implements StupidTextGame {



	public String getName() {
		return "Even or Odd?";
	}


	public void play(Scanner console) {
		System.out.println("Choose a number and i will tell you if it is even or odd!");
		int input = console.nextInt();
		
		if (input % 2 == 0) {
			System.out.println(input + "is even.");
		} else {
			System.out.println(input + "is odd.");
		}
	}

}
