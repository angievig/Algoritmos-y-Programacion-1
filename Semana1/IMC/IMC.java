import java.util.Scanner; //para leer entrada
/*
 To compile: javac IMC.java
 To execute: java IMC
 */
public class IMC{
 

	public static void main (String[] args ){

		//se define el objeto lector
		Scanner lector = new Scanner(System.in); //lector es el objeto que permite leer la entrada

		//Se definen las variables, todas son números con decimales
		double peso, altura, resultado;

		// Se muestra un mensaje pidiendo el peso
		System.out.println ("digite el peso");

		//Se lee la entrada como un dato de tipo double y se guarda en la variable peso
		peso = lector.nextDouble();

		//Se muestra un mensaje pidiendo la altura
		System.out.println ("digite la altura");

		//Se lee la entrada un dato de tipo double y se guarda en la variable altura
		altura = lector.nextDouble();

		//Se aplica la formula y se guarda el resultado en la variable resultado
		resultado = peso / (altura * altura);


		// Se escribe en la consola un mensaje compuesto incluyendo el resultado
		System.out.println ("El IMC es: "+ resultado);

	}

}