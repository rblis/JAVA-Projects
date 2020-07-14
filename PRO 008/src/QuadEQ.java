import  java.lang.Math;
public class QuadEQ {
	private double a,b,c;
	public QuadEQ(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getSo1(){
		return (-1*b + Math.sqrt(Math.pow(b, 2) + -4*a*c)) / (2*a);
	}
	public double getSo2(){
		return (-1*b - Math.sqrt(Math.pow(b, 2) + -4*a*c)) / (2*a);
	}
	private double findDiscrim(){
		return Math.pow(b, 2) - 4*a*c;
	}
	public boolean equalRoot(){
		if (getSo1() == getSo2()) return true;
		else return false;
	}
	public boolean noSo(){
		if (findDiscrim() <0) {return true;}
		else {return false;}
	}
	public boolean equals(QuadEQ other)
	   {
	      return  this.a == other.a &&
	    		  this.b == other.b &&
	    		  this.c == other.c;
	   }
	public String toString(){
		if (noSo() == true){
			return "No Solutions";
		}
		else if (equalRoot() == true){
			return "Only one root, \nx = " + getSo1() + 
					"\nThe Discriminant is: " + findDiscrim();
		}
		else {
			return "x = " + getSo1() + " or " + getSo2()+
				"\nThe Discriminant is: " + findDiscrim();}
	}
	
}
