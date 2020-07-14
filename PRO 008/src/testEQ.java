import java.util.Scanner;
public class testEQ {
	//**********************************************************
	// Assignment: Quadratic Equation Lab
	// Author: Ryan Biswas
	// Period:	6	
	// Purpose: practice and implementation of Class objects and toString object
	// Date: 11/17/13
	//
	// Completion time: 20 min
	//
	// Honor Code: I pledge that this program represents my own
	//   program code. I received help from nobody in designing and debugging my program.
	 
	//*********************************************************
	public static void main(String[] args) {
		Scanner IO = new Scanner(System.in);
		System.out.println("Enter A, B,& C from Ax^2 + Bx + C");
		int a = IO.nextInt();
		int b = IO.nextInt();
		int c = IO.nextInt();
		QuadEQ EQ1 = new QuadEQ(a,b,c);
		System.out.println("");
		System.out.println(EQ1);
		
	}

}

/*
 Enter A, B,& C from Ax^2 + Bx + C
1
5
-3

x = 0.5413812651491097 or -5.541381265149109
The Discriminant is: 37.0

Enter A, B,& C from Ax^2 + Bx + C
1
2
1

Only one root, 
x = -1.0
The Discriminant is: 0.0


Enter A, B,& C from Ax^2 + Bx + C
100
5
2

No Solutions
*/
 