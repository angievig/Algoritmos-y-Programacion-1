package ui;

import java.util.Scanner;

/**
 * Partial solution to the Giro de Rigo prototype 2  
 * To compile javac -cp src src/ui/GiroPrototipo2.java -d bin
 * To execute java -cp bin ui/GiroPrototipo2
 * @author angievig
 * @since march2024
 */
public class GiroPrototipo2 {
	
	/**
	 * Constant for the maximum number of subscriptions
	 */
	public static final int MAX_SUBSCRIPTIONS =5;
	public static final int PRICE_LEGEND = 1000000;
	public static final int PRICE_65K = 850000;
	public static final int PRICE_CARMELO = 500000;
	
	
	/**
	 * reader is the object for read the input, 
	 * it is declared as a global variable
	 */
	public static Scanner reader = new Scanner(System.in);

	/**
	 * The main method, starts the execution of the program
	 * @param args, is an array of strings
	 */
	public static void main(String[] args) {

		// flag es una variable para parar el ciclo, 1 para seguir y 0 para parar
		int flag = 1;

		//numRegistrados is the variable used to count all the registrations
		int numRegistrados =0; // as is a counter its initial value is zero
		
		
		//TODO declare e inicialice los arreglos
		String[] names = new String[MAX_SUBSCRIPTIONS];
		int[] categories = new int[MAX_SUBSCRIPTIONS];
		double[] times = new double[MAX_SUBSCRIPTIONS];



		//the condition is composed, the loop must stop either 
		//- when the user chooses 0
		//- when the total of subscriptions reaches the maximum
		while(flag==1 && numRegistrados<MAX_SUBSCRIPTIONS) {
			
			System.out.println("Ingrese el nombre del competidor");
			names[numRegistrados] = reader.nextLine();
			
			System.out.println("Ingrese el tiempo del competidor (minutos.segundos)");
			times[numRegistrados] = reader.nextDouble();
			reader.nextLine();
			
			System.out.println("Ingrese la categoría del competidor (1) (2) (3)");
			categories[numRegistrados] = reader.nextInt();
			reader.nextLine();
			
			// avance del ciclo
			numRegistrados++;
			System.out.println("Desea seguir registrando competidores?"
					+ "1 para si, otro número entero para no");
			flag= reader.nextInt();
			reader.nextLine();
		}
		
		//Una vez termina el ciclo se hacen los reportes
		if(numRegistrados ==	MAX_SUBSCRIPTIONS) {
			System.out.println("No puede ingresar más registros, el máximo es ("
								+ MAX_SUBSCRIPTIONS + ")");
		}
		
		//TODO Llamar el método para mostrar los registros
		printData(numRegistrados, names, categories, times);
		
		//TODO Llamar el método que calcula y muestra el resumen
		
		
	
	}
	
	
	/**
	 * Método que imprime los registros de los deportistas guardados en los arreglos 
	 * @param total, número total de registrados
	 * @param nom arreglo de nombres
	 * @param cat arreglo de categorias
	 * @param temps arreglo de tiempos de los competidores
	 */
	//TODO Arreglar el error en la definición de los parámetros
	public static void printData(int total, String[] nom, int[] cat, double[] temps) {
		
		System.out.println("Nombre \t | Categoria \t | Time ");
		
		for(int i=0; i<nom.length && i<total; i++) {
			
			System.out.println(nom[i]+ "\t | "+ cat[i] + " \t | " + temps[i] );
			
			
		}
		
	}

	


	/**
	 * Method to display in the console the message with the summary of the registration process
	 * calcula el total de competidores por cada una de las categorías
	 * y luego el total del dinero recaudado
	 * @param total is the total number of registrations
	 * @param categorias es el arreglo con las categorías de los competidores
	 */
	public static void showSummary(int total, int[] categorias) {
		System.out.println("*** Summary of registrations ***");
		System.out.println("There is a total of "+ total+ " registrations where:");
		
		// TODO Usa un recorrido para calcular cuantos ciclistas hay registrados en cada categoria
		
		//TODO Calcula el total del dinero recaudado
	}
	
	/**
	 * Completar el contrato
	 * @param name
	 * @param names
	 * @return
	 */
	public static String buscarPorNombre(String name, String[] names) {
		//TODO completar el método
		return "salida";
		
	}
	
	/**
	 * Completar el contrato
	 * @param times
	 * @return
	 */
	public static double menorTiempo(double[] times) {
		//TODO completar el método
		return 0;
	}
	
	/**
	 * Completar contrato
	 * @param ajuste
	 * @param tiempos
	 */
	public static void ajustarTiempo(double ajuste, double[] tiempos) {
		
		//TODO completar método
		
	}
}
