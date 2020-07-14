
public class InsuredPackage extends Package{
	private double cost, weight;
	private char ship;
	public InsuredPackage(double weight, char ship) {
		super(weight, ship);
		cost = this.insuranceCost();
		this.weight = weight;
		this.ship = ship;
	}
	public double insuranceCost(){
		if (super.getCost() >= 0 && super.getCost() <= 1.00){
			return super.getCost() + 2.45;
		}
		else if (super.getCost() >= 1.01 && super.getCost() <= 3.00){
			return super.getCost() + 3.95;
		}
		else if (super.getCost() >= 3.01){
			return super.getCost() + 5.55;
		}
		return 0;
	}
	public String toString(){
		return "|Insured Package|\n Method: " + ship + "\nWeight: " + weight + "\nTotal Cost: $" + cost+ "\n";
	}

	
	
}
