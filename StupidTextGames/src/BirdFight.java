// By: Chase Fahy

import java.util.Scanner;


public class BirdFight implements StupidTextGame{

	public String getName() {
		return "Bird Fight";
	}
	
	public void play(Scanner console) {
		System.out.println("Type in the bird you want to fight!");
		System.out.println("Emu, Ostrich, Bald Eagle, Pigeon");
		String choice = console.next();
		if(choice == "Emu"|| choice == "emu") {
			System.out.println("Emus are too big to fight, you lose!");
		} else if(choice == "Ostrich"|| choice == "ostrich") {
			System.out.println("Ostriches are too fast to fight, you lose!");
		} else if(choice == "Bald Eagle"|| choice == "bald eagle") {
			System.out.println("Bald Eagles have too much freedom to fight, you lose!");
		} else if(choice == "Pigeon"|| choice == "pigeon") {
			System.out.println("Pigeons are the worst bird, you won the fight!");
		}
		
	}

}
