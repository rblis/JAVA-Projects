
public class Vehicle {
	private String manName;
	private int cylinder;
	private Person owner;
	
	public Vehicle(){
		manName = "Honda";
		cylinder = 10;
	}
	public Vehicle (String manName, int cylinder, Person person){
		this.manName = manName;
		this.cylinder = cylinder;
		owner = person;
	}
	public void setManName (String manName){
		this.manName = manName;
	}
	public String getManName(){
		return manName;
	}
	public int getCylinder(){
		return cylinder;
	}
	public Boolean equals(Vehicle other){
		return this.manName == other.manName && this.cylinder == other.cylinder && this.owner == other.owner;
	}
	public String toString(){
		return "\n" + "Owner: " + owner +"\nManufactorer name: " + manName + "\nNumber of Cylinder: " + cylinder;
	}
}
