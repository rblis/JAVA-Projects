
public class Thug extends Warrior{
	
	public Thug(String name, char soc) {
		super(name, soc);
	
	}
	public void calculate() {
		super.setIQ((int)(Math.random()*31 + 60));
		super.setStr((int)(Math.random()*21+80));
		
	}
}
