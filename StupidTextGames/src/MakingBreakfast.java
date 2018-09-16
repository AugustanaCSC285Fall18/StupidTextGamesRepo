import java.util.Scanner;

/*
 * Author : Jinsoo Park
 * Created : Aug.25.2018
 * Last Modified : Aug.25.2018
 * Description : How we crap our breakfast
 * 
 */
public class MakingBreakfast implements StupidTextGame {
	
	public String getName() {
		return "MakingBreakfast";
	}
	
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		System.out.println("What do you want as breakfast?");
		System.out.println("1. Scrambled eggs");
		System.out.println("2. Pancakes");
		System.out.println("3. Bacons");
		int choice = console.nextInt();
		if(choice == 1 ) {
		System.out.println("You try to cook some scrambled eggs");
		System.out.println("Oh no! Egg just got vaporized");
		}else if(choice == 2) {
			System.out.println("You try to cook some pancakes...");
			System.out.println("Wait... what is that light in the sky?");
			System.out.println("Oh no, it is alien from Mars!");
			System.out.println("They took your pancakes for frisbee");
		}else if(choice == 3) {
			System.out.println("You got arrested for cooking Bacon");
		}else {
			System.out.println("?srebmun siht esoohc uoy did yhW\r\n" + 
					"!snoitcurtsni dewollof ev'dluohs uoY");
		}
	}


}
