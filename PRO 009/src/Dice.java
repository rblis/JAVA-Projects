import java.lang.Math;
public class Dice {
	private int side;
	public Dice(){
		side = 1;
	}
	public int roll(){
		return (int)(Math.random() * 6 + 1);
	}
	public String toString(){
		return "Top Side is " + roll();
	}
}
