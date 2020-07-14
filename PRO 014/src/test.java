/*Ryan Biswas
Period 6 Lau
12/5/13

Purpose: To create a subclass that manipulates instance variable not declared in the superclass constructor (double cost)

Completion time:  20 minutes

Honor code: I pledge that this program represents
my own program code. I have received help from nobody
in designing and debugging my program. */
public class test {

	public static void main(String[] args) {
		System.out.println("A == AIR SHIPING | G == GROUND SHIPPING | F == FREIGHT SHIPPING\n");
		Package light = new Package(5, 'A');
		Package heavy = new Package(20, 'F');
		
		System.out.println(light);
		System.out.println(heavy);
		
		InsuredPackage lightIns = new InsuredPackage (5, 'A');
		InsuredPackage heavyIns = new InsuredPackage (20, 'F');
		
		System.out.println(lightIns);
		System.out.println(heavyIns);
		

	}

}
/*
A == AIR SHIPING | G == GROUND SHIPPING | F == FREIGHT SHIPPING

|Normal Package|
Method: A
Weight: 5.0
Total Cost: $2.0

|Normal Package|
Method: F
Weight: 20.0
Total Cost: $2.15

|Insured Package|
 Method: A
Weight: 5.0
Total Cost: $5.95

|Insured Package|
 Method: F
Weight: 20.0
Total Cost: $6.1

*/
