package ui;

import java.util.Scanner;

/**
 * Plantilla para resolver el seguimiento de la semana 7
 * @author angievig
 * @since march2024
 */
public class SeguimientoAPO1 {
	
	/**
	 * Constant for the maximum number of students registered in the class
	 */
	
	
	/**
	 * reader is the object for read the input, 
	 * it is declared as a global variable
	 */
	public static Scanner reader = new Scanner(System.in);


	public static void main(String[] args) {
		
		System.out.println("\n*** Bienvenidos al gestor de notas del seguimiento del grupo 7 ***\n");
		
		
		//Ciclo para pedir los datos al usuario  y llenar el arreglo
		for (int k = 0; k < MAX_STUDENTS; k++) {		
			System.out.println("Ingrese la nota del estudiante #" + (k+1));
			students[k] = reader.nextDouble();
			reader.nextLine();
		}
		
		
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void printNotas(double[] array) {
		System.out.println("|\tNotas\t|");
		for (int i = 0; i < array.length; i++) {
			System.out.println("|\t"+ array[i]+ "\t|");
		}
	}
	
	/**
	 * Método que suma la misma cantidad a cada elemento del arreglo
	 * @param bono, cantidad de décimas que se sumarán a cada nota del arreglo
	 * @param notas es un arrgelo de doubles con las notas de los estudiantes del curso
	 */
	public static void sumarBono(double bono, double[] notas) {
		
	}
	
	/**
	 * Método que calcula y retorna el promedio de los números almacenados en el arreglo
	 * que pasa como parámetro
	 * @param notas es un arreglo de doubles, que representa la notas de los estudiantes
	 * @return un número con decimales que es el promedio de los números en el arreglo.
	 */
	public static double promedio(double[] notas) {
	
	}

}
