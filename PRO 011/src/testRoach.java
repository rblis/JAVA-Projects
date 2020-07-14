
public class testRoach {

	public static void main(String[] args) {
		Roach bug = new Roach(100);
		for(int k = 1; k <4; k++){
			System.out.println(bug);
			System.out.println("Re-Populating");
			bug.popDouble();
			System.out.println(bug);
			bug.sprayAffected();
			System.out.println("Roaches Sprayed: "+ bug.affectedPopulation);
			System.out.println("Killed: " + bug.spraySurvivors());
			bug.kill();
			System.out.println("Remaining "+ bug +"\n");
		}

	}

}
