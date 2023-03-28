package Gruppo_4;

public class Grid {
	
	//per implementarla all'interno del main o in un'altra funzione:
	
	//Grid grid= new Grid();
	//int player = 2; // creare sistema per rilevare giocatori
	//grid.printGrid(grid.getGeneralGrid(player));
	
	private static int row = 10;
	private static int column= 10;
	
	int [][] grid=new int [row][column];
	
	
	int[][] getGeneralGrid(int player){
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				
				
				if (isPlaceRight (player,  i,  j)) {
					this.grid [i][j] = (int) (Math.random() * 6) +1;
					
				} else {
					this.grid [i][j] = 0;
				}
			}
		}
		
		return grid;
	}
	
	
	private boolean isPlaceRight (int player, int i, int j) {
		switch(player) {
			case 4:
				if (!adapt4Players (i, j))
					return false;
				break;
			case 3:
				if (!adapt3Players (i, j))
					return false;
				break;
			case 2:
				if (!adapt2Players (i, j))
					return false;
				break;
			default:
				return false;
		}
		
		
		return true;
	}
	
	private boolean adapt4Players (int i, int j){
		
				
				//inizio controlli e nullificazione cifre
			
				if (i==1 && (j!=4 && j!=5)) {
						return false;
					}
				
				
				if (i==2 && (j==1||j==2||j==3||j==7||j==8||j==9)) {
					return false; 
				}
				
				if ((i==3||i ==7) && (j==1||j==2||j==8||j==9))
				return false;
				
				if (i==4 && j==1) {
					return false;
				}
				
				if (i==6 && j==9) {
					return false;
				}
				
				if (i==8 && (j==1||j==2||j==3||j==7||j==8||j==9)) {
					return false; 
				}
				
				if (i==9 && (j==1||j==2||j==3||j==4||j==7||j==8||j==9)) {
					return false;
				}
				
				
			
		return true;
}
	
	private boolean adapt3Players (int i, int j) {
		if (adapt4Players (i, j)) {
			
			if (i==5 && (j==1||j==9)) {
				return false;
			}
		
			if (j==5 && (i==1||i==9)) {
				return false;
			}
			if (i==2 && j==6) {
				return false;
			}
			if (i==8 && j==4) {
				return false;
			}
			if (i==4 && j==1) {
				return false;
			}
			if (i==6 && j==9) {
				return false;
			}
			
			return true;
			
		}
		return false;
	}

	private boolean adapt2Players (int i, int j) {
		if (adapt3Players (i, j)) {
			if ((i==3 || i ==7) && (j==3|| j==7)) {
				return false;
			}
			if (i==1 && j==4) {
				return false;
			}
			if (i==9 && j==6) {
				return false;
			}
			if (i==4 && j==9) {
				return false;
			}
			if (i==6 && j ==1) {
				return false;
			}	
			
			return true;
		}
	
		return false;
	}
	
	
	
	
	
	public void printGrid(int grid[][]) {
		for (int i=1; i<=9; i++) {
			System.out.print("\n"+(i)+": ");
			for (int j=1; j<=9; j++) {
					System.out.print(grid[i][j]+" ");
				}
			}
		}
}

