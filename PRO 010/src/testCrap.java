	//**********************************************************
	// Assignment: Crap Lab
	// Author: Ryan Biswas
	// Period:	6	
	// Purpose: practice with random method, for statements and more practice using Brain
	// Date: 11/19/13
	//
	// Completion time: 35 min
	//
	// Honor Code: I pledge that this program represents my own
	//   program code. I received help from nobody in designing and debugging my program.
	 
	//*********************************************************
import java.util.Scanner;
public class testCrap {

	public static void main(String[] args) {
		Scanner IO = new Scanner(System.in);		
		Craps newGame = new Craps();
		
		System.out.println("Lets play!");
		
		if (IO.nextLine().isEmpty()){//spent a lot of time on this :( so simple
			
			
			System.out.println("First Role" + "\n");
			newGame.rollDice();
			
			System.out.println(newGame+ "\n");
			if (newGame.sumDice() == 7 || newGame.sumDice() == 11){
				System.out.println("YOU WIN!!!");
				System.exit(0);
			}
			
			else if (newGame.sumDice() == 2 || newGame.sumDice() == 12){
				System.out.println("YOU LOOSE!!!");
				System.exit(0);
			}
			else{
				
				System.out.println("Set Point: " + newGame.sumDice() + "\nYou will loose if you roll a 7 or 11\n");
			}
			int setPoint = newGame.sumDice();
			
			
			for(int k =1; k<6; k++){
			System.out.println("Roll#"+k);
			System.out.println("Now Rolling" + "\n");
			newGame.rollDice();
			System.out.println(newGame+ "\n");
			
			if (newGame.sumDice() == setPoint){
				System.out.println("YOU WIN!!!");
				System.exit(0);
			}
			else if (newGame.sumDice() == 7 || newGame.sumDice() == 11){
				System.out.println("YOU LOOSE!!!");
				System.exit(0);
			}
			else
				System.out.println("ReRoll");
			}
			System.out.println("Game Tie?");
		}
	}

}
/*
Lets play!

Dice 1: 1
Dice 2: 1
Sum: 2

First Role

Dice 1: 2
Dice 2: 5
Sum: 7

YOU WIN!!!
---------
Lets play!

Dice 1: 1
Dice 2: 1
Sum: 2

First Role

Dice 1: 6
Dice 2: 5
Sum: 11

YOU WIN!!!
------
Lets play!

First Role

Dice 1: 4
Dice 2: 6
Sum: 10

Set Point: 10
You will loose if you roll a 7 or 11

Roll#1
Now Rolling

Dice 1: 1
Dice 2: 2
Sum: 3

ReRoll
Roll#2
Now Rolling

Dice 1: 3
Dice 2: 1
Sum: 4

ReRoll
Roll#3
Now Rolling

Dice 1: 1
Dice 2: 6
Sum: 7

YOU LOOSE!!!
---------
Lets play!

First Role

Dice 1: 3
Dice 2: 5
Sum: 8

Set Point: 8
You will loose if you roll a 7 or 11

Roll#1
Now Rolling

Dice 1: 1
Dice 2: 1
Sum: 2

ReRoll
Roll#2
Now Rolling

Dice 1: 5
Dice 2: 3
Sum: 8

YOU WIN!!!
---------
Lets play!

First Role

Dice 1: 3
Dice 2: 6
Sum: 9

Set Point: 9
You will loose if you roll a 7 or 11

Roll#1
Now Rolling

Dice 1: 3
Dice 2: 1
Sum: 4

ReRoll
Roll#2
Now Rolling

Dice 1: 6
Dice 2: 2
Sum: 8

ReRoll
Roll#3
Now Rolling

Dice 1: 1
Dice 2: 3
Sum: 4

ReRoll
Roll#4
Now Rolling

Dice 1: 4
Dice 2: 1
Sum: 5

ReRoll
Roll#5
Now Rolling

Dice 1: 4
Dice 2: 1
Sum: 5

ReRoll
Game Tie?
 
 */
 
