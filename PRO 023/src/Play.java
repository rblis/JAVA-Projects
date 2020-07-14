import java.util.ArrayList;


public class Play {

	public static void main(String[] args) {
		ArrayList <Warrior> list = new ArrayList <Warrior>();
		Warrior [] War = new Warrior[5];
		War[0] = new Nerd ("Nerd", 'N');
		list.add(new Nerd ("Nerd", 'N'));
		War[1] = new Jock ("Joke", 'J');
		list.add(new Jock ("Joke", 'J'));
		War[2] = new Prep ("Prop", 'P');
		list.add(new Prep ("Prop", 'P'));
		War[3] = new Thug ("Thug", 'T');
		list.add(new Thug ("Thug", 'T'));
		War[4] = new Freak ("Frail", 'F');
		list.add(new Freak ("Frail", 'F'));
		
		for (int k = 0; k <War.length; k++){
		War[k].calculate();
		System.out.println(War[k]);
		}
		System.out.println("\nCafeteria Food Fights\n");
		
		deathMatch(list);
		
		/*
		for (int k = 0; k <War.length; k++){
			War[(int)(Math.random()*5)].fight(War[(int)(Math.random()*5)]);
		}*/
	}
	
	public static void deathMatch(ArrayList<Warrior> list){
		int items = 5;
		while ( list.size() > 1){
			int x = (int)(Math.random()*items); int y = (int)(Math.random()*items); 
			if (list.get(x).fight(list.get(y)) ==  true){
				list.remove(y);
				items--;
			}
			else{ 
				list.remove(x);
				items--;
			}
		}
		System.out.println(list.get(0));
	}

}
