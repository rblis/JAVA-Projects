
// Assignment: Array LAB
// Author: Ryan Biswas
// Period:6
// Purpose:Properties of Arrays
// Date: 1/12/14
// Completion time: 20 mins
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment, write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************
public class play {

	public static void main(String[] args) {
		int [] array = {15, -5, 25, 75, 9, -2, -80, -100, 99, 21, 23, 40, 45, 67,
                100, 44, 28, 1, 3};
			OneDim obj = new OneDim (array);
			System.out.println (obj.findMax());
			System.out.println (obj.findMin());
			System.out.println (obj.findMaxIndex());
			System.out.println (obj.findMinIndex());
			System.out.println (obj.find (3));

			
			arrayPrint(obj.posArray());
			arrayPrint(obj.negArray());

			System.out.println(obj.evenMembers());  
			System.out.println(obj.oddMembers()); 			

				
			System.out.println("Sum : " + obj.sum());
			System.out.println("Avg : " + obj.average());
			int kobalt[] = new int [2]; int x = 0;
			
			

	}
	public static void arrayPrint(int[] list){
		for (int ele: list){
			System.out.print("[" + ele + "]");
			
		}
		System.out.println("");
	}

}
/*
 *100
-100
14
7
true
[15][25][75][9][99][21][23][40][45][67][100][44][28][1][3]
[-5][-2][-80][-100]
[-2][-80][-100][40][100][44][28]
[15][25][75][9][99][21][23][45][67][1][3]
Sum : 408
Avg : 21.473684210526315
 */
