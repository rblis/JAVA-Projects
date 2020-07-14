
public class LocalCall extends PhoneCall{
private double rate;

public LocalCall(int duration, double rate) {
	super(duration);
	this.rate = rate;
}
public double getRate() {
	return rate;
}
public String toString() {
	return super.toString();
}
}
