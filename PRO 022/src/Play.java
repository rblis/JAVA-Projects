
public class Play {

	public static void main(String[] args) {
	PhoneCall [] calls =  new PhoneCall [3];
	calls[0] = new LocalCall (10,2);
	calls[1] = new LongDistanceCall(3);
	calls[2] = new ReducedCall(8);
	for (PhoneCall call: calls)
		System.out.println (call);
	}

}
