//**********************************************************
// Assignment: Lab 18 Perfect/Amicable numbers
// Author: Ryan Biswas
// Period:	6	
// Purpose: using multiple conditions to test numbers within a range
// Date: 10/28/13
//
// Completion time: 35 min
//
// Honor Code: I pledge that this program represents my own
//   program code.(asked someone on what the two numbers (x&y) are for amicable numbers) I received help from nobody in designing and debugging my program.
 
//*********************************************************
public class LAB18_PerfectAmicableNumbers {

	public static void main(String[] args) {
		int numb = 2, namb= 0;
		System.out.println("NUMBER|ALIQUOT SUM|TYPE");
		
		while (numb<=500){
		namb = aliSum(numb);
		
		if (numb==namb)//basically if the aliquote sum equals to the orig number
			System.out.println(numb+"|"+aliSum(numb)+"|Perfect");
		
		if (numb == aliSum(namb) && namb == aliSum(numb) && numb!=namb)
			//follows the definition and prevents reprints if perfect == amicable
			System.out.println(numb+"|"+namb+"|Amicable");
		numb++;
		}//
		
	}
	public static int aliSum(int testNumb){
		int a = 1, aliSum = 0;
		while (a < testNumb){
			if (testNumb % a==0)
				aliSum +=a;
			a++;
		//a factor of a number returns no remainder, if it does not return integer it then adds them to variable aliSum the number is increased until it is equal to the input number
		}
		return aliSum;
	}
}
/*

NUMBER|ALIQUOT SUM|TYPE
6|6|Perfect
28|28|Perfect
220|284|Amicable
284|220|Amicable
496|496|Perfect

*/