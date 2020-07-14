/*Ryan Biswas
Period 6 Lau
12/34/13

Purpose: To create an object and use it in multple classes 

Completion time:  30 minutes

Honor code: I pledge that this program represents
my own program code. I have received help from nobody
in designing and debugging my program. */
public class driver {

	public static void main(String[] args) {
	
	Person lau = new Person("Lau", 38);	
	Vehicle newcar = new Vehicle("Toyota", 8, lau);
	Vehicle oldcar = new Vehicle("BMW", 10, lau);
	Truck newtruck = new Truck("Ford", 18, lau, 2.8,1000);
	Truck oldtruck = new Truck("GM", 20, lau, 3.1,1200);
	
	System.out.println(newcar);
	System.out.println(oldcar);
	System.out.println(newtruck);
	System.out.println(oldtruck);
	}

}
