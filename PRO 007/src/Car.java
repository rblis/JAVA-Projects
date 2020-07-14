//**********************************************************
// Assignment: Car Lab
// Author: Ryan Biswas
// Period:	6	
// Purpose: practice and implementation of Class objects
// Date: 11/13/13
//
// Completion time: 10 min
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
 
//*********************************************************
public class Car {
		private String make;
		private int year, mile, cost;
	public Car(){
		make = "Toyota";
		year = 2013;
		mile = 1000;
		cost = 35000;
}
	public Car(String make, int year, int mile, int cost){
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.cost = cost;
}
	public String toString(){
		return  "make: " + make +
				"\nusage: " + mile + "mi - " + year + "yr" +
				"\ncost: $" + cost;
}
	public int testDrive(int driveMile){
		return mile + driveMile;
	}
}
// copy pasted to fit one paper (i amde a seperate class)

/*
make: Mercedes Benz
usage: 25674mi - 2012yr
cost: $65000

 */

