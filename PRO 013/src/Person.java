
public class Person {
	private String name;
	private int age;
	
	public Person () {
		name = "No name yet";
		age = 0;
	}
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName (String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String toString(){
		return "Name: " + name + "\nAge: " + age;
	}
	public Boolean equals (Person other){
	return this.name.equalsIgnoreCase(other.name) && this.age == other.age;
	}
	
}

Owner: Name: Lau
Age: 38
Manufactorer name: Toyota
Number of Cylinder: 8

Owner: Name: Lau
Age: 38
Manufactorer name: BMW
Number of Cylinder: 10

Owner: Name: Lau
Age: 38
Manufactorer name: Ford
Number of Cylinder: 18
Truck Load: 2.8
Truck tow: 1000


Owner: Name: Lau
Age: 38
Manufactorer name: GM
Number of Cylinder: 20
Truck Load: 3.1
Truck tow: 1200














