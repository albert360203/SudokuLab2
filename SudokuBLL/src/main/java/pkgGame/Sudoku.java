package pkgGame;

import java.util.Arrays;

import java.lang.Math;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare 
{
	
	private int iSize;
	private int iSqrtSize;
	
//两个constructor都没写好。没有throw	
	
	public Sudoku(int size)
	{
		super();
		iSize = size;
		iSqrtSize = (int) Math.sqrt(size);
	}
	
	public Sudoku(int[][] latinSquare)
	{
		super(latinSquare);
		iSize = latinSquare.length;
		iSqrtSize = (int) Math.sqrt(iSize);
	}
	
	protected int[][] getPuzzle()
	{
		return super.getLatinSquare();
	}
	
	protected int[] getRegion(int iRegionNbr)
	{
		
		int[][] p = this.getPuzzle();
	
		int startRow = (iRegionNbr / iSqrtSize) * iSqrtSize;
	//  int startCol = (iRegionNbr % iSqrtSize) * iSqrtSize;
		int startCol = (iRegionNbr * iSqrtSize) % iSize;
		int[] arr = new int[iSize];
		int count = 0;
		
		for(int i=startRow; i<(startRow+iSqrtSize); i++)
		{
			for(int j=startCol; j<(startCol+iSqrtSize); j++)
			{
				arr[(count)] = p[i][j];
				count++;
			}
		}
		return arr;
	}
	
	protected int[] getRegion(int iCol, int iRow)
	{
		int startRegionRow = iRow/iSqrtSize ;
		int startRegionCol = iCol/iSqrtSize;
		int iRegionNbr = startRegionRow*iSqrtSize+startRegionCol;
		return getRegion(iRegionNbr);
	}
	
	public boolean isPartialSudoku()
	{
		if(!this.ContainsZero())
			return false;
	    
		for (int i = 0; i < this.iSize; i++) {
			if (this.hasDuplicatesIgnoringZero(this.getRow(i)))
				return false;
		}

		for (int j = 0; j < this.iSize; j++) {
			if (this.hasDuplicatesIgnoringZero(this.getColumn(j)))
				return false;
		}
		
		for (int r = 0; r < this.iSize; r++) {
			if (this.hasDuplicatesIgnoringZero(this.getRegion(r)))
				return false;
		}
		
		return true;
	}
	
	public boolean isSudoku()
	{
		if(this.ContainsZero())
			return false;
		
		if(!this.isLatinSquare())
			return false;
		
		for(int r=0; r<iSize; r++)
			if(this.hasDuplicates(this.getRegion(r)) ||
			  !this.hasAllValues(this.getRegion(r),this.getRow(0)))
				return false;
		
		return true;
	}
	
	public boolean isValidValue(int iCol, int iRow, int iValue)
	{
		int tmp = this.getPuzzle()[iRow][iCol];
		this.getPuzzle()[iRow][iCol] = iValue;
		
		if (this.hasDuplicatesIgnoringZero(this.getRow(iRow)))
		{
			this.getPuzzle()[iRow][iCol] = tmp;
			return false;
		}

		if (this.hasDuplicatesIgnoringZero(this.getColumn(iCol)))
		{
			this.getPuzzle()[iRow][iCol] = tmp;
			return false;
		}
	
		if (this.hasDuplicatesIgnoringZero(this.getRegion(iCol, iRow)))
		{
			this.getPuzzle()[iRow][iCol] = tmp;
			return false;
		}
		
		this.getPuzzle()[iRow][iCol] = tmp;
		return true;
	}

}
