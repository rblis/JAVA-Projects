
public class Prep extends Warrior{
	
	public Prep(String name, char soc) {
		super(name, soc);
	
	}
	public void calculate() {
		super.setIQ((int)(Math.random()*61 + 90));
		super.setStr((int)(Math.random()*51 + 40));
		
	}
}
