
public class Student {
private int ID;
private String name;
private double GPA;

public Student(int ID, String name, double GPA){ 
	this.ID = ID;
	this.name = name;
	this.GPA = GPA;
}
public void setID(int iD) {
	ID = iD;
}
public void setName(String name) {
	this.name = name;
}
public void setGPA(double GPA) {
	this.GPA = GPA;
}

public int getID() {
	return ID;
}
public String getName() {
	return name;
}
public double getGPA() {
	return GPA;
}
public String toString(){
return "ID- " + ID + "\nName- " + name + "\nGPA- " + GPA;

}

}
