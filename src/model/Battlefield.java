package model;

import java.util.ArrayList;
import java.util.List;

public class Battlefield {
	
	private int rows;
	private int columns;
	private int[][] battlefield;
	
	private List<SpaceShip> spaceShip;
	
	
	public Battlefield(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		battlefield = new int[rows][columns];
		spaceShip = new ArrayList<SpaceShip>();
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

	public int[][] fillPositions(int num, int col){
		
		int[][] positions = new int[num][col];
		int prime = 0;
		
		for (int I = 0; I < positions.length; I++) {
			for (int J = 0; J < positions[I].length; J++) {
				int value = (int) (Math.random()*100+1);
				
				positions[I][J] = value;
				
				if(primeNumber(value)) {
					SpaceShip sp = new SpaceShip(num, col);
					spaceShip.add(sp);
					prime++;
				}
			
			
			}
		}
		
		if(prime == 0) {
			int counting = 0;
			
			while(counting < 5) {
				
				int pos = (int)(Math.random()*num+1);
				int posY = (int)(Math.random()*col+1);
				int val = (int)(Math.random()*100+1);
				if(primeNumber(val)) {
					positions[pos][posY] = val;
					
				}
				
				counting++;
				
			}
		}
		
		return positions;
	}
	
	public int[][] fillCoefficients(int num, int col){
		
		int[][] positions = new int[num][col];
		
		for (int I = 0; I < num; I++) {
			for (int J = 0; J < col; J++) {
				int value = (int) (Math.random()*3+1);
				
				positions[I][J] = value;
				
			}
		}

		return positions;
	}
	
	public boolean primeNumber(int value){
		
		  int contador = 2;
		  boolean prime = true;
		  while ((prime) && (contador!=value)){
		    if (value % contador == 0) {
		    	prime = false;
		    }	      
		    contador++;
		  }
		  return prime;
		}

	
}
