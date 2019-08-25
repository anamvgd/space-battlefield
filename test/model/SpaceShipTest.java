package model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class SpaceShipTest {
	
	private SpaceShip spaces;
	
	private void setupScenary1() {
		
	}
	
	@Test
	public void testSpaceShip() {
		setupScenary1();
		
		int posX = (int)(Math.random()*5+1);
		int posY = (int)(Math.random()*5+1);
		
		spaces = new SpaceShip(posX, posY);
		
		assertNotNull("the new battle field is null", spaces);
		
		assertTrue("The row has the wrong value", posX==spaces.getPosX());
		assertTrue("The column has the wrong value", posY==spaces.getPosY());
		
	
	}



}
