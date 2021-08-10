package ui; //nombre del paquete

import java.util.Scanner; 

public class Ejemplos{

	public static Scanner reader = new Scanner(System.in);

	public static void main (String[] a){


		//dobleRecorrido();
		//tablasMultiplicar();
		//promedio();
		//promedioDoWhile();
		//aleatorios();
		cadenas();

		



	}

	public static void dobleRecorrido(){
		System.out.println("Digite un número entero positivo");
		int n = reader.nextInt();

		for(int a = 0; a<= n; a++){
			System.out.println("el valor actual de a es " + a );

			for(int b=0 ; b<= n; b++){
				System.out.println("\t el valor de b es " + b );
			}
		}

	}

	public static void tablasMultiplicar(){
		System.out.println("Digite un número entero positivo");
		int n = reader.nextInt();

		for(int a = 1; a<= n; a++){
			System.out.println("La tabla del " + a );

			for(int b=1 ; b<= n; b++){
				System.out.println("\t "+ a  + " *  "+ b + " = " + (a*b)  );
			}
		}
	}

	public static void promedio(){
		double promedio = 0;
		int cantidadNotas = 0;
		double nota = 0;
		System.out.println("Ingrese una nota o -1 para terminar");
		nota = reader.nextDouble();
		while (nota != -1){
			promedio += nota;
			cantidadNotas++;
			System.out.println("Ingrese una nota o -1 para terminar");
			nota = reader.nextDouble();
		}

		if(cantidadNotas >0)
			System.out.println("El promedio es " + promedio/cantidadNotas);
		else
			System.out.println("No ha ingresado notas");
			
	}

	public static void promedioDoWhile(){
		double promedio = 0;
		int cantidadNotas = 0;
		double nota = 0;

		do{
		System.out.println("Ingrese una nota o -1 para terminar");
		nota = reader.nextDouble();
		promedio += nota;
		cantidadNotas++;
		}
		while (nota != -1);

		if(cantidadNotas-1 >0){

			System.out.println("El promedio es " + ((promedio+1)/(cantidadNotas-1)));
		}
		else
			System.out.println("No ha ingresado notas");

			
	}

	public static void aleatorios(){
		int min, max;

		min= reader.nextInt();
		max= reader.nextInt();
		int aleatorio=  min + (int)(Math.random() * ((max - min) + 1));

		System.out.println("Un num aleatorio en el rango " +
		 "[" + min + "," + max + "] es: " + aleatorio);
	
	}

	public static void cadenas(){
		String word= reader.nextLine();

		for (int index = 0; index< word.length(); index++ ){
			char letter= word.charAt(index);
			System.out.println("caracter en la posicion "+ index + ":  "+letter);

		}
	}
	
		
}