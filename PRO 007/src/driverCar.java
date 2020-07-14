
public class driverCar {

	public static void main(String[] args) {
		Car Driver =  new Car("Mercedes Benz", 2012, 25674, 65000);
		System.out.println(Driver);
		System.out.println("Test drving for fifty miles");
		Driver.testDrive(50);
		System.out.println("New Information: \n" + Driver);
		
	}

}