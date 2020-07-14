	//**********************************************************
	// Assignment: Dice Lab
	// Author: Ryan Biswas
	// Period:	6	
	// Purpose: practice with random method and for statments
	// Date: 11/17/13
	//
	// Completion time: 10 min
	//
	// Honor Code: I pledge that this program represents my own
	//   program code. I received help from nobody in designing and debugging my program.
	 
	//*********************************************************
public class testDice {

	public static void main(String[] args) {
		Dice d = new Dice();
		for (int k = 1; k<=6; k++){
			d.roll();
			System.out.println(d);
		}

	}

}
/*
Top Side is 3
Top Side is 1
Top Side is 3
Top Side is 6
Top Side is 5
Top Side is 2

 */

