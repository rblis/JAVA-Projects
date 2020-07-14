//**********************************************************
// Assignment: Lab 13 Euclidean Algorithm
// Author: Ryan Biswas
// Period:	6	
// Purpose: to repeat an equation using while statements until a certain value is reached
// Date: 10/11/13
//
// Completion time: 30 min
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
 
//*********************************************************
import java.util.Scanner;
import java.lang.Math;
public class LAB13_EuclideanAlgorithm {

	public static void main(String[] args) {
		Scanner ABC= new Scanner(System.in);
		
		System.out.println("Please Enter number A");
		int numA = Math.abs(ABC.nextInt());
		System.out.println("Please Enter number B");
		int numB = Math.abs(ABC.nextInt());
		//get numbers and makes sure they are positive
		
		int AB; //placeholder variable
		
		if (checkNum(numA,numB) == true){
			while (numB > 0) {
				AB = stepOne(numA,numB); // holds the value so it isn't affected by assignment
				numA = numB;// reassigns the new values to match the algorithm
				numB = AB;
				}
			System.out.println("The Greatest Common Divisor is :" +numA+ ", because the smaller number is: " + numB);
		}	
		else{// when the second number entered is bigger than the first one
			while (numA > 0) {
				AB = stepOne(numB,numA);
				numB = numA;
				numA = AB;
				}
		System.out.println("The Greatest Common Divisor is: " +numB+ ", because the smaller number is: " + numA); 
		//final stage of the algorithm
		}
	}

	public static boolean checkNum(int A, int B){//checks to see which number is greater of the two
		if (A>B)
			return true;
		else
			return false;
	}
	public static int stepOne(int large,int small){ //largerd number divided by smaller number and returns the remainder
		return large%small;
	}

}
/*
 *Please Enter number A
5
Please Enter number B
10
The Greatest Common Divisor is: 5, because the smaller number is: 0
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
Please Enter number A
16
Please Enter number B
2
The Greatest Common Divisor is :2, because the smaller number is: 0
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
Please Enter number A
-47
Please Enter number B
32
The Greatest Common Divisor is :1, because the smaller number is: 0

 */
