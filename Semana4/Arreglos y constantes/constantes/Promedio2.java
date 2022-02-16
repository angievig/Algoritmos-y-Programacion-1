import java.util.Scanner;
public class Promedio2{
	static Scanner sc = new Scanner(System.in); //lector
	public static final int NUM_GRADES= 5;

	public static void main (String [] args){
		
		double [] grades = readGrades(); //entrada
		int[] credits = readCredits();;
		double average = 0; //salida
		int totalCredits = 0; // acumulador para el numero de creditos
		double acc = 0; //acumulador para la nota * creditos de una materia
		double grade  = 0; // input


		for (int i = 0; i < NUM_GRADES ; i++){
			acc += grades[i] * credits [i];
			totalCredits += credits[i];
		}
		average = acc/totalCredits;
		System.out.println("El promedio del semestre fue: "+ average);
	}

	public static int[] readCredits(){

		int[] outArray= new int[NUM_GRADES];
		int credit;

		for(int i=0; i< NUM_GRADES; i++){

			System.out.println("ingrese los créditos para la materia " + (i+1));
			credit = sc.nextInt();
			sc.nextLine();
			outArray[i] = credit;
		}

		return outArray;

	}

	public static double[] readGrades(){

		double[] grades= new double[NUM_GRADES];
		
		for(int i=0; i< NUM_GRADES; i++){
			System.out.println("ingrese la nota para la materia " + (i+1));
			grades[i] = sc.nextDouble();
			sc.nextLine();
		}

		return grades;

	}
}