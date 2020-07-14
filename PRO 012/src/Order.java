
public class Order {
	private String cusName;
	private int cusNumber;
	private int quantity;
	private int price;
	
	public Order(String name, int number, int quantity, int price){
		this.cusName = name;
		this.cusNumber = number;
		this.quantity = quantity;
		this.price = price;
	}
	public int computePrice(){
		return quantity * price;
	}
	public String toString(){
		return "Order Information: \n" + cusName + " - " + cusNumber + "\nQuantity: " + quantity + "\nprice" + price;
	}
	public boolean equals(Order other){
		return cusName == other.cusName; 
	}
}

