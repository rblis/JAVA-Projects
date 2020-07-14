
public class ExtraChargeOrder extends Order {
	private int quantity, price;
	public ExtraChargeOrder(String name, int number, int quantity, int price) {
		super(name,number, quantity, price);
		this.quantity = quantity;
		this.price = price;
	}
	public int computePrice(){
		return quantity * price + 4;
	}
	
}