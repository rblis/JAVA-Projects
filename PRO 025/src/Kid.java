import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.Critter;

import java.awt.Color;
import java.util.ArrayList;


public class Kid extends ChameleonCritter{
	
	public void processActors(ArrayList<Actor> actors){
		ArrayList<Integer> twoloc = new ArrayList<Integer>();int z=0;
		for (int k =0; k < actors.size(); k++){
			if (actors.get(k).getLocation().equals(getLocation().getAdjacentLocation(getDirection()))||
					actors.get(k).getLocation().equals(getLocation().getAdjacentLocation(getDirection()-180))){
				twoloc.add(k);
			}
		}
		if (twoloc.size()>0){
			int zz = twoloc.get((int)(Math.random()*twoloc.size()));
			setColor(actors.get(zz).getColor());
		}
		else {Color c = getColor();
        int red = (int) (c.getRed() * (1 - .25));
        int green = (int) (c.getGreen() * (1 - .25));
        int blue = (int) (c.getBlue() * (1 - .25));

        setColor(new Color(red, green, blue));
        return;}
	}
	

}
