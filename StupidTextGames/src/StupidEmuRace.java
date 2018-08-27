
public class StupidEmuRace implements StupidTextGame{
	public String getName() {
		return "Emu Race";
	}
	public void play(Scanner console) {		
		System.out.println("Enter how many laps you want to race ");
		int laps = console.nextInt;
		if(laps < 6) {
			System.out.println("The emu trips you and runs ahead.");
		} else {
			System.out.println("The emu easily out laps you");
		}
		System.out.println("You lose!");	
	}	
}
