
public class Craps {
	private int dice1 = 1, dice2 = 1;
	public  void rollDice(){
		dice1 = (int) (Math.random() *6 + 1);
		dice2 = (int) (Math.random()*6+ 1);
	}
	public int sumDice(){
		return dice1 + dice2;
	}
	public String toString(){
		return "Dice 1: " + dice1 + "\nDice 2: " + dice2 + "\nSum: " + sumDice();
	}
}
