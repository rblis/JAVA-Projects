//**********************************************************
// Assignment: Lab 15 Credit Card Bill
// Author: Ryan Biswas
// Period:	6	
// Purpose: using while function to calculate a number that diminishes by a percentage
// Date: 10/19/13
//
// Completion time: 20 min
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from nobody in designing and debugging my program.
 
//*********************************************************
import java.util.Scanner;
import java.text.DecimalFormat;
public class LAB15_CreditCardBill {

	public static void main(String[] args) {
		DecimalFormat d = new DecimalFormat("0.00");
		Scanner ABC = new Scanner(System.in);
		System.out.print("Enter Current Debt: ");
		double debt = ABC.nextDouble();
		System.out.print("Enter Monthly Payment: ");
		double mPay = ABC.nextDouble();
		double tPay = 0;
		int month = 0;
		while (debt > 0)
		{
			System.out.print("Month-" + month + "  ");
			System.out.print("DEBT: $"+ d.format(debt) + " - ");
			System.out.println("PAYED: $" + d.format(tPay));
			month++;
			if (debt < mPay)
				System.out.println("Month-" + month + "  NO MORE IN DEBT" + " - " +"PAYED: $" + d.format(tPay +(debt * 1.015)));
			
			{
			debt = debt - mPay;
			debt = debt * 1.015;
			tPay += mPay;
			
		}
		/*
**The monthly interest is at base value (1.5%)

Enter Current Debt: 1000
Enter Monthly Payment: 100
Month-0  DEBT: $1000.00 - PAYED: $0.00
Month-1  DEBT: $913.50 - PAYED: $100.00
Month-2  DEBT: $825.70 - PAYED: $200.00
Month-3  DEBT: $736.59 - PAYED: $300.00
Month-4  DEBT: $646.14 - PAYED: $400.00
Month-5  DEBT: $554.33 - PAYED: $500.00
Month-6  DEBT: $461.14 - PAYED: $600.00
Month-7  DEBT: $366.56 - PAYED: $700.00
Month-8  DEBT: $270.56 - PAYED: $800.00
Month-9  DEBT: $173.12 - PAYED: $900.00
Month-10  DEBT: $74.21 - PAYED: $1000.00
Month-11  NO MORE IN DEBT - PAYED: $1075.33


Enter Current Debt: 500
Enter Monthly Payment: 25
Month-0  DEBT: $500.00 - PAYED: $0.00
Month-1  DEBT: $482.12 - PAYED: $25.00
Month-2  DEBT: $463.98 - PAYED: $50.00
Month-3  DEBT: $445.57 - PAYED: $75.00
Month-4  DEBT: $426.88 - PAYED: $100.00
Month-5  DEBT: $407.90 - PAYED: $125.00
Month-6  DEBT: $388.65 - PAYED: $150.00
Month-7  DEBT: $369.10 - PAYED: $175.00
Month-8  DEBT: $349.26 - PAYED: $200.00
Month-9  DEBT: $329.13 - PAYED: $225.00
Month-10  DEBT: $308.69 - PAYED: $250.00
Month-11  DEBT: $287.94 - PAYED: $275.00
Month-12  DEBT: $266.89 - PAYED: $300.00
Month-13  DEBT: $245.52 - PAYED: $325.00
Month-14  DEBT: $223.82 - PAYED: $350.00
Month-15  DEBT: $201.81 - PAYED: $375.00
Month-16  DEBT: $179.46 - PAYED: $400.00
Month-17  DEBT: $156.78 - PAYED: $425.00
Month-18  DEBT: $133.75 - PAYED: $450.00
Month-19  DEBT: $110.38 - PAYED: $475.00
Month-20  DEBT: $86.66 - PAYED: $500.00
Month-21  DEBT: $62.59 - PAYED: $525.00
Month-22  DEBT: $38.15 - PAYED: $550.00
Month-23  DEBT: $13.35 - PAYED: $575.00
Month-24  NO MORE IN DEBT - PAYED: $588.55
		 
		 *
		 */
			
			
			
		}
	}

}
