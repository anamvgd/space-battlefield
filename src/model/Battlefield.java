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


	
}
