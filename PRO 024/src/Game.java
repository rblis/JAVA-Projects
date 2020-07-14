import java.util.Scanner;
public class Game {
private  int [] [] grid; private String [] [] board; String pBoard = ""; private int blocks;
	public Game(int grid) {
	if (grid == 1){
		blocks = 25;
		this.grid = new int [5][5];
		board = new String [5][5];
	}
	else{ 
		blocks =100;
		this.grid = new int [10][10];
		board = new String [10][10];
	}
	}
	public void generateGrid(){//creates board and grid randomly random 
		int bomb =6;//can only have 6 bombs at a time
		for (int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[0].length; col++){
				board[row][col] = "[ ]";
				//attempts to distribute bombs evenly across the grid
				if (bomb >3 && row < grid.length/2){
					grid[row][col] =  (int)(Math.random()*2);
					if (grid[row][col]==1) bomb--;
				}
				else if(bomb >0 && row >= grid.length/2){
					grid[row][col] =  (int)(Math.random()*2);
					if (grid[row][col]==1) bomb--;}
				else
					grid[row][col] = 0;
			}
		}
	
	}
	public void playGame(){
		Scanner IO = new Scanner(System.in);
		int round =0;
		while (round > -1){//repeats until done
			System.out.println("GO [ROW,COL]");
			int r = IO.nextInt(); int c = IO.nextInt();
			int counter = 0;
		if(grid[r][c] == 1){//if the entered coordinates are bombs
			board[r][c] = "[X]";
			System.out.println("Game Over");
			round--;
		}
		else{//fills a piece with the counter information + counts neighboring bombs
		for (int row = r-1; row < r + 2; row++) { 
			for (int col = c - 1; col < c + 2; col++){
				 if (row >-1 && col >-1 && row < grid.length && col < grid[0].length && !(row == r && col == c)){
					 if (grid[row][col] == 1){ counter++; }
				 }
			}
				
		}
		board[r][c] = "[" + counter + "]";
		}
		printBoard();
		if (checkBoard() == true){//checks if all pieces are filled 
			System.out.println("Game Over");
			round--;
		}
		}
	}
	public void printBoard(){//prints the new board everytime based on the board array 
		pBoard = "";
		for (int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[0].length; col++){
				pBoard += this.board[row][col]; 
			}
			pBoard += "\n";
			}
		System.out.println("\n" + pBoard);
	}
	 public Boolean checkBoard(){//checks to see if the board is filled
		 int counter = 0;
		 for (int row = 0; row < grid.length; row++){
				for(int col = 0; col < grid[0].length; col++){
					if (board[row][col] != "[ ]")counter++;
				}
		}
		 if (counter+6 == blocks)return true;
		 else return false;
	 }
	public String toString(){
	 String sum = "", board = "";
		for (int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[0].length; col++){
			sum += "[" + grid[row][col] + "]";
			board += this.board[row][col]; 
		}
			sum+= "\n";
			board += "\n";}
		return sum + "\n" + board;
				
	}

}
