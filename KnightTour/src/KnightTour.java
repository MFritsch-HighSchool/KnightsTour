import java.util.Random;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
public class KnightTour extends World{
	String[][] world = new String[8][8];
	
	public KnightTour(int x, int y){
		super(new BoundedGrid(x,y));
		this.show();
		displayWorld();
		getLocation();
	}
	
	private void getLocation() {
		Random rand = new Random();
		System.out.println(rand.nextInt(8));
	}

	private void displayWorld() {
		Grid g = this.getGrid();
		for(int loop = 0; loop < 8; loop++){
			for(int l = 0; l < 8; l++){
				if(l==7)
					System.out.println(" "+world[l][loop]);
				else
					System.out.print(" "+world[l][loop]);
			}
		}
	}

}
