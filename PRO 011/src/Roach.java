
public class Roach {
	private int roaches;
	public int affectedPopulation;
	
	public Roach(int roaches){
		this.roaches = roaches;
	}
	public void popDouble(){
		roaches *= 2;
	}
	
	public void sprayAffected(){
		affectedPopulation = (int) (.1*roaches);
	}
	public int spraySurvivors(){//kills a random number of Roaches that are affected by Spray, simulates mutation.
		return affectedPopulation -= (int)(Math.random()*affectedPopulation);
	}
	public void kill(){
		roaches -= affectedPopulation;
	}
	public String toString(){
		return "Roaches# " + roaches;
	}
}

/*
 Roaches# 100
Re-Populating
Roaches# 200
Roaches Sprayed: 20
Killed: 9
Remaining Roaches# 191

Roaches# 191
Re-Populating
Roaches# 382
Roaches Sprayed: 38
Killed: 33
Remaining Roaches# 349

Roaches# 349
Re-Populating
Roaches# 698
Roaches Sprayed: 69
Killed: 19
Remaining Roaches# 679


 */

