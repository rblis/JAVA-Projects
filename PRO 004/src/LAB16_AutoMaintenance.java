//**********************************************************
// Assignment: Lab 16 Auto Maintenance
// Author: Ryan Biswas
// Period:	6	
// Purpose: using while function to reduce a number by a flat rate
// Date: 10/22/13
//
// Completion time: 25 min
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
 
//*********************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class LAB16_AutoMaintenance {

	public static void main(String[] args) {
		Scanner ABC = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		System.out.println("Amount of Gas: ");
		double gas = ABC.nextDouble();
		System.out.println("Amount to be traveled: ");
		double miles = Math.abs(ABC.nextDouble());
		
		while (gas>0)
		{
			gas= gas- miles/12;
			if (gas<0)
				break;
			if (gas<=5)
		 	{
				System.out.println("Destination reached, gas left: " + d.format(gas) + " |Refuel pls|");
				System.out.println("Amount to be traveled: ");
				miles =  Math.abs(ABC.nextDouble());	
			}
			else
			{
				System.out.println("Destination reached, gas left: " + d.format(gas));
				System.out.println("Amount to be traveled: ");
				miles =  Math.abs(ABC.nextDouble());
			}
		}
		System.out.println("Outta Gas, "+ d.format(miles-((gas+miles/12)*12)) + "mi left to destination");
		ABC.close();
	}

}
/*
 Amount of Gas: 
10
Amount to be traveled: 
12
Destination reached, gas left: 9.00
Amount to be traveled: 
54
Destination reached, gas left: 4.50 |Refuel pls|
Amount to be traveled: 
-12
Destination reached, gas left: 3.50 |Refuel pls|
Amount to be traveled: 
-60
Outta Gas, 18.00mi left to destination



Amount of Gas: 
1
Amount to be traveled: 
6
Destination reached, gas left: 0.50 |Refuel pls|
Amount to be traveled: 
5
Destination reached, gas left: 0.08 |Refuel pls|
Amount to be traveled: 
1
Outta Gas, 0.00mi left to destination


Amount of Gas: 
-60
Amount to be traveled: 
3600
Outta Gas, 720.00mi left to destination
*/