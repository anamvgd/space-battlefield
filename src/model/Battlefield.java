package model;

public class Battlefield {
	
	private int rows;
	private int columns;
	private int[][] battlefield;
	
	
	public Battlefield(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		battlefield = new int[rows][columns];
	}

	
	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}


	public int[][] getBattlefield() {
		return battlefield;
	}


	public void setBattlefield(int[][] battlefield) {
		this.battlefield = battlefield;
	}

	public int[][] fillPositions(int num){
		
		int[][] positions = new int[num][num];
		
		for (int I = 0; I < positions.length; I++) {
			for (int J = 0; J < positions[I].length; J++) {
				int value = (int) (Math.random()*100+1);
				
				positions[I][J] = value;
			}
		}
		
		return positions;
	}
	

	
}
