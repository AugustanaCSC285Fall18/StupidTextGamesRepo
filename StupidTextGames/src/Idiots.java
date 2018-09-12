//Name : Duc Pham
import java.util.*;

public class Idiots implements StupidTextGame {
	public String getName() {
		return "Idiots";
	}
	public void play(Scanner console) {
		System.out.println("Choose any number that you want");
		int num = console.nextInt();
		if(num % 3 == 0) {
		System.out.println("You are in idiot.");
		}
		else {
		System.out.println("You are smart");
		}
	}
}
