import java.util.Scanner;

// Name : Tiffany Nguyen
public class FlyingChickenGame implements StupidTextGame {

	public String getName() {
		return "Flying Chicken Game";
	}
	
	public void play(Scanner console) {
		System.out.println("How old is your chicken?");
		int age = console.nextInt();
		System.out.println("Your chicken can fly upto : " + age*Math.E + " meters! ");
	}

}
