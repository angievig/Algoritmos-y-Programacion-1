package ui;

import java.util.Scanner;

/**
 * Solution to the first practical evaluation
 * To compile javac -cp src src/ui/GiroEvalPractica.java -d bin
 * To execute java -cp bin ui/GiroEvalPractica   
 * @author angievig
 * @since march2024
 */
public class GiroEvalPractica {
	
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

		// Option is the variable to read the input
		int option;
		showMenu();
		option = reader.nextInt();

		//total is the variable used to count all the registrations
		int total =0; // as is a counter its initial value is zero

		//The following variables are used to count the register for each category, 
		// as counters, they start on zero
		int cat1 = 0;
		int cat2 = 0;
		int cat3 = 0;


		//the condition is composed, the loop must stop either 
		//- when the user chooses 0
		//- when the total of subscriptions reaches the maximum
		while(option!=0 && total<MAX_SUBSCRIPTIONS) {

			//Option is a number different than zero for the while loop condition
			switch(option) {
			case 1:
				cat1++;
				break;
			case 2: 
				cat2++;
				break;
			case 3:
				cat3++;
				break;
			default:
				System.out.println("wrong option");
			}

			// avance del ciclo
			total++;
			showMenu();
			option= reader.nextInt();
		}
		
		//Una vez termina el ciclo se hacen los reportes
		if(total ==	MAX_SUBSCRIPTIONS) {
			System.out.println("Sorry, you reached the maximum number of registrations ("
								+ MAX_SUBSCRIPTIONS + ")");
		}
		int money = calculateTotalRaised(cat1, cat2, cat3);
		showSummary(total, cat1, cat2, cat3, money);
		
	}

	/**
	 * Method to calculate the total amount of money raised by the registration process
	 * @param numReg1 is the number of registrations in category legend (category one)
	 * @param numReg2 is the number of registrations in category 65K (category two)
	 * @param numReg3 is the number of registrations in category Carmelo (category three)
	 * @return the total amount of money considering the registration prices of each category
	 */
	private static int calculateTotalRaised(int numReg1, int numReg2, int numReg3) {
		
		return numReg1* PRICE_LEGEND + numReg2* PRICE_65K + numReg3* PRICE_CARMELO;
	}

	/**
	 * Method to display in the console the message with the four option of the registration app
	 */
	private static void showMenu() {
		System.out.println("Welcome to the Giro de Rigo resgistration app"
				+ "\nSelect one of the following options:"
				+ "\n1) Reto Leyenda - 155 km"
				+ "\n2) Reto - 65 Km"
				+ "\n3) Reto de Carmelo - 30 Km"
				+ "\n0) to exit the application");
		
	}

	/**
	 * Method to display in the console the message with the summary of the registration process
	 * @param total is the total number of registrations
	 * @param cat1 is the number of registrations in category legend (category one)
	 * @param cat2 is the number of registrations in category 65K (category two)
	 * @param cat3 is the number of registrations in category Carmelo (category three)
	 * @param totalRaised is the amount of money raised in the registration process
	 */
	private static void showSummary(int total, int cat1, int cat2, int cat3, int totalRaised) {
		System.out.println("*** Summary of registrations ***");
		System.out.println("There is a total of "+ total+ " registrations where:");
		System.out.println(" --> "+ cat1 + " are registered in the Reto Leyenda: 155 km");
		System.out.println(" --> "+ cat2 + " are registered in the Reto 65 Km");
		System.out.println(" --> "+ cat3 + " are registered in the Reto de Carmelo 30 Km");
		System.out.println("The total amount of money raised by the registration process is $" + totalRaised);	
	}
}
