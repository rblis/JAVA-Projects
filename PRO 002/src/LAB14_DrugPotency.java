//**********************************************************
// Assignment: Lab 14 DrugPotency
// Author: Ryan Biswas
// Period:	6	
// Purpose: using while function to calculate a number that diminishes by a percentage
// Date: 10/16/13
//
// Completion time: 10 min
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
 
//*********************************************************
public class LAB14_DrugPotency {

	public static void main(String[] args) {
		double drug = 100;
		int month = 0;
		//declare that drug is started out as 100% fresh
		while (drug >50.00) {//until drug is below 50% repeats the body statements
			System.out.println("Month: " + month +" "+ drug);
			drug = drug - drug*.04;
			month++;
		}
			System.out.println("Month: " + month+" "+ drug + " DISCARD"); 
			//prints out the value after the drug was below 50% fresh
	}

}
/*
 Month: 0 100.0
Month: 1 96.0
Month: 2 92.16
Month: 3 88.47359999999999
Month: 4 84.93465599999999
Month: 5 81.53726975999999
Month: 6 78.27577896959998
Month: 7 75.14474781081599
Month: 8 72.13895789838335
Month: 9 69.25339958244803
Month: 10 66.4832635991501
Month: 11 63.8239330551841
Month: 12 61.27097573297674
Month: 13 58.82013670365767
Month: 14 56.46733123551136
Month: 15 54.208637986090906
Month: 16 52.04029246664727
Month: 17 49.958680767981384 DISCARD

 */
