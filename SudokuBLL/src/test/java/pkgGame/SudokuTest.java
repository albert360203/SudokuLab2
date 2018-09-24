package pkgGame;

import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.Test;

public class SudokuTest 
{
	@Test
	public void getRegion_v1_Test1() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		int[] expectedArr = {7,6,1,8,5,3,9,2,4};

		assertTrue(Arrays.equals(s1.getRegion(4), expectedArr));
	}
	
	@Test
	public void getRegion_v1_Test2() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		int[] expectedArr = {2,8,4,6,3,5,1,7,9};

		assertTrue(Arrays.equals(s1.getRegion(8), expectedArr));
	}
	
	@Test
	public void getRegion_v2_Test1() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		int[] expectedArr = {7,6,1,8,5,3,9,2,4};

		assertTrue(Arrays.equals(s1.getRegion(5,5), expectedArr));
	}
	
	@Test
	public void getRegion_v2_Test2() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		int[] expectedArr = {2,8,4,6,3,5,1,7,9};

		assertTrue(Arrays.equals(s1.getRegion(7,8), expectedArr));
	}
	
	@Test
	public void isSudoku_Test1() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};
		Sudoku s1 = new Sudoku(puzzle);

		assertTrue(s1.isSudoku());
	}
	
	@Test
	public void isSudoku_Test2() throws Exception
	{
		int[][] puzzle = {{3,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};
		Sudoku s1 = new Sudoku(puzzle);

		assertFalse(s1.isSudoku());
	}
	
	@Test
	public void isSudoku_Test3() throws Exception
	{
		int[][] puzzle = {{1,2,3,4,5,6,7,8,9},
				          {2,3,4,5,6,7,8,9,1},
				          {3,4,5,6,7,8,9,1,2},
						  {4,5,6,7,8,9,1,2,3},
						  {5,6,7,8,9,1,2,3,4},
						  {6,7,8,9,1,2,3,4,5},
						  {7,8,9,1,2,3,4,5,6},
						  {8,9,1,2,3,4,5,6,7},
						  {9,1,2,3,4,5,6,7,8}};
		Sudoku s1 = new Sudoku(puzzle);

		assertFalse(s1.isSudoku());
	}
	
	@Test
	public void isSudoku_Test4() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,0}};
		Sudoku s1 = new Sudoku(puzzle);

		assertFalse(s1.isSudoku());
	}
	
	@Test
	public void isPartialSudoku_Test1() throws Exception
	{
		int[][] puzzle = {{5,3,4,6,7,8,9,1,2},
				          {6,7,2,1,9,5,3,4,8},
				          {1,9,8,3,4,2,5,6,7},
						  {8,5,9,7,6,1,4,2,3},
						  {4,2,6,8,5,3,7,9,1},
						  {7,1,3,9,2,4,8,5,6},
						  {9,6,1,5,3,7,2,8,4},
						  {2,8,7,4,1,9,6,3,5},
						  {3,4,5,2,8,6,1,7,9}};  // Doesn't contain zero at all.
		Sudoku s1 = new Sudoku(puzzle);
		
		assertFalse(s1.isPartialSudoku());
	}
	
	@Test
	public void isPartialSudoku_Test2() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},
				          {6,0,0,1,9,5,0,0,0},
				          {0,9,8,0,0,0,0,6,0},
						  {8,0,0,0,6,0,0,0,3},
						  {4,0,0,8,0,3,0,0,1},
						  {7,0,0,0,2,0,0,0,6},
						  {0,6,0,0,0,0,2,8,0},
						  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		
		assertTrue(s1.isPartialSudoku());
	}
	
	@Test
	public void isPartialSudoku_Test3() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,5,0,0,0,0},   // Row0: the number 5 duplicates.
				          {6,0,0,1,9,5,0,0,0},
				          {0,9,8,0,0,0,0,6,0},
						  {8,0,0,0,6,0,0,0,3},
						  {4,0,0,8,0,3,0,0,1},
						  {7,0,0,0,2,0,0,0,6},
						  {0,6,0,0,0,0,2,8,0},
						  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		
		assertFalse(s1.isPartialSudoku());
	}
	
	@Test
	public void isPartialSudoku_Test4() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},   
				          {6,0,0,1,9,5,0,0,0},
				          {0,9,8,0,0,0,0,6,0},
						  {8,0,0,0,6,0,0,0,3},
						  {4,0,0,8,0,3,0,0,1},
						  {7,0,0,0,2,0,0,0,6},
						  {0,6,0,0,0,0,2,8,0},
						  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,6}}; // Col8: the number 6 duplicates.
		Sudoku s1 = new Sudoku(puzzle);
		
		assertFalse(s1.isPartialSudoku());
	}
	
	@Test
	public void isPartialSudoku_Test5() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},
				          {6,0,0,1,9,5,0,0,0},
				          {0,9,8,0,0,0,0,6,0},
						  {8,0,0,0,6,0,0,0,3},
						  {4,0,0,2,0,3,0,0,1},  //Region4: the number 2 duplicates.
						  {7,0,0,0,2,0,0,0,6}, 
						  {0,6,0,0,0,0,2,8,0},
						  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);
		
		assertFalse(s1.isPartialSudoku());
	}
	
	@Test
	public void isValidValue_Test1() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},
						  {6,0,0,1,9,5,0,0,0},
				 	 	  {0,9,8,0,0,0,0,6,0},
				 		  {8,0,0,0,6,0,0,0,3},
				 		  {4,0,0,8,0,3,0,0,1}, // Place 5 at puzzle[4][4].
				 		  {7,0,0,0,2,0,0,0,6},
				 		  {0,6,0,0,0,0,2,8,0},
				 		  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);

		assertTrue(s1.isValidValue(4, 4, 5));
	}
	
	@Test
	public void isValidValue_Test2() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},
						  {6,0,0,1,9,5,0,0,0},
				 	 	  {0,9,8,0,0,0,0,6,0},
				 		  {8,0,0,0,6,0,0,0,3},
				 		  {4,0,0,8,0,3,0,0,1}, // Place 4 at puzzle[4][4]. Two 4s in Row4.
				 		  {7,0,0,0,2,0,0,0,6},
				 		  {0,6,0,0,0,0,2,8,0},
				 		  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);

		assertFalse(s1.isValidValue(4, 4, 4));
	}
	
	@Test
	public void isValidValue_Test3() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},
						  {6,0,0,1,9,5,0,0,0},
				 	 	  {0,9,8,0,0,0,0,6,0},
				 		  {8,0,0,0,6,0,0,0,3},
				 		  {4,0,0,8,0,3,0,0,1}, // Place 7 at puzzle[4][4]. Two 7s in Col4.
				 		  {7,0,0,0,2,0,0,0,6},
				 		  {0,6,0,0,0,0,2,8,0},
				 		  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);

		assertFalse(s1.isValidValue(4, 4, 7));
	}
	
	@Test
	public void isValidValue_Test4() throws Exception
	{
		int[][] puzzle = {{5,3,0,0,7,0,0,0,0},
						  {6,0,0,1,9,5,0,0,0},
				 	 	  {0,9,8,0,0,0,0,6,0}, // Place 7 at puzzle[2][5]. Two 7s in Region1.
				 		  {8,0,0,0,6,0,0,0,3},
				 		  {4,0,0,8,0,3,0,0,1}, 
				 		  {7,0,0,0,2,0,0,0,6},
				 		  {0,6,0,0,0,0,2,8,0},
				 		  {0,0,0,4,1,9,0,0,5},
						  {0,0,0,0,8,0,0,7,9}};
		Sudoku s1 = new Sudoku(puzzle);

		assertFalse(s1.isValidValue(5, 2, 7));
	}
	
}
