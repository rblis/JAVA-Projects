
public class Nerd extends Warrior{
	
	public Nerd(String name, char soc) {
		super(name, soc);
	
	}
	public void calculate() {
		super.setIQ((int)(Math.random()*61 + 120));
		super.setStr((int)(Math.random()*61 + 20));
		
	}

}
