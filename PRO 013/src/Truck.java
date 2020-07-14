
public class Truck extends Vehicle{
	private double load;
	private int tow;
	
	
	public Truck(){
		load = 2.5;
		tow = 750;
	}
	public Truck(String manName, int cylinder, Person person, double load, int tow){
		super(manName, cylinder, person);
		this.load = load;
		this.tow = tow;
	}
	public void setLoad (double Load){
		load = Load;
	}
	public double getLoad(){
		return load;
	}
	public int getTow(){
		return tow;
	}
	public Boolean equals(Truck other){
		return super.equals(other) && this.load == other.load && this.tow == other.tow;
	}
	public String toString(){
		return super.toString() + "\nTruck Load: " + load + "\nTruck tow: " + tow + "\n";
	}

}
