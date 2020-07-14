
public class Jock extends Warrior{
	
	public Jock(String name, char soc) {
		super(name, soc);
	
	}
	public void calculate() {
		super.setIQ((int)(Math.random()*61 + 80));
		super.setStr((int)(Math.random()*51 + 50));
		
	}
}
