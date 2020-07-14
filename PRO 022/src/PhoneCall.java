
public abstract class PhoneCall {
private int duration;

public PhoneCall(int duration) {
	this.duration = duration;
}

public int getDuration() {
	return duration;
}
public abstract double getRate();

private int calculate(){
	return (int) (getRate()*duration);
}


public String toString() {
	return "Duration [" + duration + "] X Rate [" + getRate() + "] == Total [" + calculate() + "]";
}

}
