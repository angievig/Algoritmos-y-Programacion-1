//package ui; //nombre del paquete

import java.util.Scanner; 

public class Palabra{

	public static void main (String[] a){

		Scanner reader = new Scanner(System.in);

		System.out.println("Digite una palabra");

		String word; //declaracion

		word = reader.nextLine(); //inicializacion


		String message =""; //salida cadena vacia


		//Codicionales


		


		if (word.contains("ch") || word.contains("rr") || word.contains("ll")){
			message += "La palabra está en español \n";
		}

		if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") 
			&& word.contains("u")){
			message += "La palabra tiene todas las vocales\n";
		}

		if (word.equals("Algoritmos1-G1")){
			message += "El mejor grupo ;-)\n";
		}

		if (word.length() >50){
			message += "La palabra tiene " + word.length() +"caracteres \n";
		}

		System.out.println(message.contains(";")? message + " tiene punto y coma": "nuevo mensaje");







	}
}