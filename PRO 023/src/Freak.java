
public class Freak extends Warrior{
	
	public Freak(String name, char soc) {
		super(name, soc);
	
	}
	public void calculate() {
		super.setIQ((int)(Math.random()*121 + 60));
		super.setStr((int)(Math.random()*100 + 1));
		
	}
}
