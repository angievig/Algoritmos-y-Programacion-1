package ui; //paquete
import java.util.Scanner; //para leer entrada

import model.Date; // implementar la dependencia
/*
 To compile: javac -cp src src/ui/MainMatch.java -d bin
 To execute: java -cp bin ui.MainMatch
 */
public class MainMatch{

	static Scanner reader = new Scanner(System.in); //reader as a global variable

	public static void main (String[] args ){

		System.out.println("The template compiles!!");

		Date myDate= new Date(14,3,2022); //Relación de dependencia

		Date otraFecha = new Date(14,3,2022);

		System.out.println("myDate " + myDate);
		System.out.println("otraFecha " + otraFecha);
	}

}