import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
public class Bluster extends Critter{
	private int c;
	public Bluster(int c){
		this.c = c;
		setColor(Color.magenta);
	}
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> list = new ArrayList<Actor>();
		int cRow = getLocation().getRow();
		int cCol = getLocation().getCol();
		Grid gd = getGrid();
		for (int row = cRow -2; row <= cRow+2; row++ ){
			for(int col = cCol - 2; col <= cCol+2; col++){
				if ((col != cCol && row != cRow)&&(gd.isValid(new Location(row,col)))&&(gd.get(new Location(row,col)) != null) ){
					//is the new row AND col are the same, is a valid location, and it is not null
					list.add((Actor) gd.get(new Location(row,col)));
				}
			}
		}
		return list;
	}
	 public void processActors(ArrayList<Actor> actors)
	 {
	 int count = 0;
	 for(Actor a: actors)if(a instanceof Critter)count++; 
	 if(count < c)lighten();
	 else darken();
	 } 
	 private void darken()
	 {
	 Color c = getColor();
	 int red = c.getRed();int green = c.getGreen();int blue = c.getBlue();
	 if(red > 0) red--;
	 if(green > 0) green--;
	 if(blue > 0) blue--;
	 setColor(new Color(red, green, blue));
	 } 
	 private void lighten()
	 {
	 Color c = getColor();
	 int red = c.getRed();int green = c.getGreen();int blue = c.getBlue();
	 if(red < 255) red++;
	 if(green < 255) green++;
	 if(blue < 255) blue++;
	 setColor(new Color(red, green, blue));
	 }}