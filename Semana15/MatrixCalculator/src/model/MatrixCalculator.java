package model;

import java.util.ArrayList;
import java.util.Iterator;

public class MatrixCalculator {
	
	private ArrayList<int[][]> numericMatrices;
	private ArrayList<String[][]> stringMatrices;
	
	public MatrixCalculator() {
		numericMatrices= new ArrayList<int[][]>() ;
		stringMatrices= new ArrayList<String[][]>();
		
	}
	
	public String showMatrices() {
		String out="";
		out += "Numeric matrices \n";
		for(int i=0; i< numericMatrices.size(); i++) {
			out+= printNumeric(numericMatrices.get(i));
		}
		out += "String matrices \n";
		for(int i=0; i< stringMatrices.size(); i++) {
			out+= printString(stringMatrices.get(i));
		}
		
		return out;
	}

	private String printString(String[][] matrix) {
		String print ="";
		

		return print;
	}

	private String printNumeric(int[][] numbers) {
		String print ="";
		for (int i=0; i< numbers.length; i++ ) { // filas numbers.length
			for (int j = 0; j < numbers[0].length; j++) { //columnas numbers[0].length
				print += numbers[i][j] + " ";
			}
			print += "\n";
		}
		return print;
	}
	
	

	public String createMatrix(int type, int rows, int columns) {
		String out="";
		switch(type) {
		case 1: //numeric Matrix
			int [][] newMatrix;
			newMatrix= new int[rows][columns];
			newMatrix[0][0] = 1;
			numericMatrices.add(newMatrix);
			out = printNumeric(newMatrix);
			
			break;
		case 2:
			
		}
		
		return out;
		
	}
	
	public void addNumeric (int[][] numMatrix) {
		numericMatrices.add(numMatrix);
	}
	

}
