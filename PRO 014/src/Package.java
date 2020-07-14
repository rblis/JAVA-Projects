
public class Package {
	private double weight, cost;
	private char ship;
	
	public Package(double weight, char ship){
		this.weight = weight;
		this.ship = ship;
		if(weight >= 1 && weight <= 8){
			if (ship == 'A'){
				cost = 2.00;
			}
			if (ship == 'G'){
				cost =  1.50;
			}
			if (ship == 'F'){
				cost =  .50;
			}
		}
		else if(weight >= 9 && weight <= 16){
			if (ship == 'A'){
				cost =  3.00;
			}
			if (ship == 'G'){
				cost =  2.35;
			}
			if (ship == 'F'){
				cost =  1.50;
			}
		}
		else if(weight >= 17){
			if (ship == 'A'){
				cost =  4.5;
			}
			if (ship == 'G'){
				cost =  3.25;
			}
			if (ship == 'F'){
				cost =  2.15;
			}
		}
	}
	public void calcCost(){
		
	}
	
	public  double getCost(){
		return cost;
	}
	public  void setCost(double cost){
		this.cost += cost;
	}
	public String toString(){
		return "|Normal Package|\nMethod: " + ship + "\nWeight: " + weight + "\nTotal Cost: $" + cost+ "\n";
	}
}
