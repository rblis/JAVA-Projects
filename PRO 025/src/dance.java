import info.gridworld.actor.Bug;
//this was declared using:  dance d = new dance(new int[] {2,4,8,16});
public class dance extends Bug{

	private int []aray;
	private int stp =0;
	
	
	public dance(int[] aray){
		this.aray = aray;
	}
	public void act(){
	
		if (stp == aray.length)stp=0;
			
		turner(aray[stp]);
		stp++;
		super.act();act();
			
	}
	public void turner(int k){
		for (int j=0; j<k;j++){
			turn();
		}
	}
}
