
public abstract class Warrior {
	private String name;
	private int IQ;
	private int str;
	private char soc;
	
	public Warrior(String n, char s){
		name = n;
		soc = s;
	}
	public abstract void calculate();
	
	public boolean fight (Warrior other){
		if (this.str > other.str){
			if (other.IQ < this.IQ+20){
				System.out.println(this.name + other .name);
				System.out.println(this.name + " beats "+ other.name+ " by strength");
				return true;
				}
			else {
				System.out.println(this.name + other .name);
				System.out.println(other.name + " beats "+ this.name+ " by IQ");
				return false;
				}
		}
		else{
			if (other.IQ > this.IQ+20){
				System.out.println(this.name + other .name);
				System.out.println(other.name + " beats "+ this.name+ "  by strength");
				return false;}
			else {
				System.out.println(this.name + other .name);
				System.out.println(this.name + " beats "+ other.name+ "  by IQ");
				return true;	
			}
		}
	}
	public void setIQ(int iQ) {
		IQ = iQ;
	}
	public void setStr(int str) {
		this.str = str;
	}
	public void setSoc(char soc) {
		this.soc = soc;
	}
	public boolean equals(Object obj) {//experimental equals method, appears to be working
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Warrior other = (Warrior) obj;
		if (IQ != other.IQ)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (soc != other.soc)
			return false;
		if (str != other.str)
			return false;
		return true;
	}
	public String toString() {
		return "[Name] " + name + " [IQ] " + IQ + " [Strength] " + str + " [Social Security] " + soc;
	}
	
	
}
