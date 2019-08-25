package model;

public class SpaceShip implements MatrixMultiplication {

	private int posX;
	private int posY;
	
	
	public SpaceShip(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public boolean cousinNumber(){
		  int xyPosition=posX+posY;
		  int contador = 2;
		  boolean flag=true;
		  while ((flag) && (contador!=xyPosition)){
		    if (xyPosition % contador == 0) {
		    	flag = false;
		    }	      
		    contador++;
		  }
		  return flag;
		}


	@Override
	public int[][] componentToComponent() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int[][] combiningRows() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int[][] combiningColumns() {
		// TODO Auto-generated method stub
		return null;
	}
}
