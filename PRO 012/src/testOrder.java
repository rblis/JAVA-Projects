/*Ryan Biswas
Period 6 Lau
12/1/13

Purpose: Inheritence practice

Completion time:  20 minutes

Honor code: I pledge that this program represents
my own program code. I have received help from nobody
in designing and debugging my program. */
public class testOrder {

	public static void main(String[] args) {
		Order smallOrder =  new Order ("Tom",123,20,13);
		Order secondOrder = new Order ("Tom", 123, 20, 13);
		ExtraChargeOrder largeOrder = new ExtraChargeOrder ("John", 456, 1000, 26);
		System.out.println(smallOrder.computePrice());
		System.out.println(largeOrder.computePrice());
		System.out.println(smallOrder);
		System.out.println(largeOrder);
		System.out.println(smallOrder == secondOrder);
		System.out.println(smallOrder.equals(secondOrder));
	}

}
/*
260
26004

Order Information: 
Tom - 123
Quantity: 20
price13

Order Information: 
John - 456
Quantity: 1000
price26

false
true

 */

