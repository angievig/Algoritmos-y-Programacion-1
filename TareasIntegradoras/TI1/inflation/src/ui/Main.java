package ui; //nombre del paquete

import java.util.Scanner; 

public class Main{

	public static Scanner reader= new Scanner(System.in);

	public static void main (String[] a){


		int option = 0; 


		System.out.println("el valor de max_Value es: " + Double.MAX_VALUE);
		/*

		do{

			System.out.println("Bienvenidos a la TI1\n"+
			 "seleccione una opcion\n" +
		 	 "(1) op1 \n"+
		 	 "(2) op1 \n" +
			 "(0) bye");

			option= reader.nextInt();
			answerOption(option);
		}while(option !=0);
		*/

	}

	public static void answerOption(int num){

		switch(num){
			case 1: 
			solveProblem1();
			break;
			
			case 2:
			solveProblem2();
			break;
			
			default: 
			System.out.println("bye uWu");
		}

	}

	public static void solveProblem1(){
		System.out.println("este es el metodo del problema 1");

	}

	public static void solveProblem2(){
		System.out.println("este es el metodo del problema 2");
	}




}