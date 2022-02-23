package ui; //paquete
import java.util.Scanner; //para leer entrada
/*
 To compile: javac -cp src src/ui/AverageFlag.java -d bin
 To execute: java -cp bin ui.AverageFlag
 */
public class AverageFlag{

	static Scanner reader = new Scanner(System.in); //reader as a global variable

	public static final int SIZE = 3;

	public static void main (String[] args ){

		double grade =0; //input, to read the grades 
		double average =0; //output with the average

		double [] gradesArray = new double[SIZE]; //arreglo para guardar las notas

		//Reading the input

		System.out.println("Please insert a grade, -1 to finish");
		grade = reader.nextDouble();
		reader.nextLine();


		int i=0;
		while(grade != -1 && i< SIZE){
			gradesArray[i] = grade;
			i++;
			System.out.println("Please insert a grade, -1 to finish");
			grade = reader.nextDouble();
			reader.nextLine();
		}

		if (i < SIZE){
		gradesArray[i]=grade;

		average = averageArray(gradesArray);

		if (average>=0){
			System.out.println("the average is " + average);
		} 
		else 
			System.out.println("There is no input :-(");
	}else 
	 System.out.println("There's more grades than space in the array :-(");






		
	

	}

	public static double averageArray(double [] array){

		double acc = 0;
		int count =0;
		double average= 0;

		for(int i=0; i< array.length && array[i] != -1; i++){
			acc += array[i];
			count++;
		}

		if (count>0){
			average = acc/count;
			
		} 
		else 
			average = -1;

		return average;
	}


}