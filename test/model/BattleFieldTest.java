package model;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

public class BattleFieldTest {
	
	private Battlefield battlef;
	
	private void setupScenary1() {
		
	}
	
	private void setupScenary2() {

		battlef = new Battlefield(5, 5);
		
	}
	
	@Test
	public void testBattlefield() {
		setupScenary1();
		
		int num = 4;
		
		Battlefield bf = new Battlefield(num, num); 
		
		assertNotNull("the new battle field is null", bf);
		
		assertTrue("The row has the wrong value", num==bf.getRows());
		assertTrue("The column has the wrong value", num==bf.getColumns());
		
	
	}
	
	@Test
	public void testFillPositions() {
		setupScenary2();
		int num = 3; 
		
		int[][] matrixGenerated = battlef.fillPositions(num, num);
		
		for (int i = 0; i < matrixGenerated.length; i++) {
			for (int j = 0; j < matrixGenerated[i].length; j++) {
				assertTrue("The matrix has a position declarated", matrixGenerated[i][j]!=0);
			}
		}
		
	}
	
	@Test
	public void testFillCoefficients() {
		setupScenary2();
		int num = 5; 
		
		int[][] matrixGenerated = battlef.fillCoefficients(num, num);
		
		for (int i = 0; i < matrixGenerated.length; i++) {
			for (int j = 0; j < matrixGenerated[i].length; j++) {
				assertTrue("The matrix has a position declarated", matrixGenerated[i][j]<=3);
			}
		}
		
	}
	
	
	
	@Test
	public void testPrimeNumber() {
		setupScenary2();
		
		int testValue1 = 29;
		int testValue2 = 6;
		boolean expectedAnswer = false;
		
		assertTrue("The method did not compare correctly the prime number", battlef.primeNumber(testValue1));
		assertTrue("The method did not compare correctly the prime number", battlef.primeNumber(testValue2) == expectedAnswer);
		
	}
	
	
	

}
