import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;


public class QuickCrab extends CrabCritter{

	public QuickCrab(){
		
	}
	public ArrayList<Location> getMoveLocations()
    {
        Grid gd = getGrid();
		ArrayList<Location> locs = new ArrayList<Location>();
        int dir = getDirection()+90;
		Location right = getLocation().getAdjacentLocation(dir);//right
        Location rightOne = getLocation().getAdjacentLocation(dir).getAdjacentLocation(dir);//right of right loc
        Location left = getLocation().getAdjacentLocation(dir+180);
        Location leftOne = getLocation().getAdjacentLocation(dir+180).getAdjacentLocation(dir+180);
        
        if (gd.isValid(leftOne) && gd.isValid(rightOne)){//both are valid
        	if((gd.get(left) == null && gd.get(leftOne) == null) && (gd.get(right) == null && gd.get(rightOne) == null)){//both are empty
        		locs.add(rightOne);
        		locs.add(leftOne);
        	}
        	else if((gd.get(left) == null && gd.get(leftOne) == null))locs.add(leftOne);//left is empty
        	else locs.add(rightOne);
        }
        else if (gd.isValid(left))if((gd.get(left) == null && gd.get(leftOne) == null))locs.add(leftOne);//only one of them are in the grid
        else if (gd.isValid(right))if((gd.get(right) == null && gd.get(rightOne) == null))locs.add(rightOne);
        else locs = super.getMoveLocations();//behaves like crabcritter
        return locs;
    }

}
