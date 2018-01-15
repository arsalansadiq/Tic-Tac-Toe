
public class TictactoeModel {
public int size=3;
private char[][] grid;
private boolean turn;
private static final  String  PlayerX = "X";
private static final  String  PlayerO = "X";
private int counter = 0;

public TictactoeModel(){
	grid= new char[size][size];
}

public char[][] getGrid() {
	return grid;
}
public void setValue(int i, int j , char b) {
	grid[i][j] = b;
}
public int getSize() {
	return size;
}


public void setSize(int size) {
	this.size = size;
}
public boolean hasWon(int row,int col){
	if ( grid[row][0]==(grid[row][1]) &&
	        grid[row][0]==(grid[row][2]) ) return true;

	        // check column "col"
	        if ( grid[0][col]==(grid[1][col]) &&
	        grid[0][col]==(grid[2][col]) ) return true;

	        // if row=col check one diagonal
	        if (row==col)
	            if ( grid[0][0]==(grid[1][1]) &&
	            grid[0][0]==(grid[2][2]) ) return true;

	        // if row=2-col check other diagonal
	        if (row==2-col)
	            if ( grid[0][2]==(grid[1][1]) &&
	            grid[0][2]==(grid[2][0]) ) return true;

	        // no winner yet
	        return false;
}

public static String getPlayerx() {
	return PlayerX;
}

public static String getPlayero() {
	return PlayerO;
}

public String playerTurn(){
	
	if(counter%2 == 0){
		
		return PlayerX;
	}else {
		return PlayerO;
		
	}
	
	
}	
}

