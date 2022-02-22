// javac -cp src src/ui/Ejemplos.java -d bin
// java -cp bin ui.Ejemplos

package ui; //nombre del paquete

import java.util.Scanner; 

public class Ejemplos{

	public static Scanner reader = new Scanner(System.in);

	public static void main (String[] a){


		dobleRecorrido();
		//tablasMultiplicar();
		//promedio();
		//promedioDoWhile();
		//aleatorios();

		/*

		System.out.println("Digite una cadena");

		String entradaCadena= reader.nextLine();
		cadenas(entradaCadena);



		System.out.println("Ejemplo de los aleatorios");

		int min, max;
		System.out.println("Digite el menor");
		min= reader.nextInt();
		System.out.println("Digite el mayor");
		max= reader.nextInt();

		int salidaAleatorio=  aleatorios(min, max);
		System.out.println("Un num aleatorio en el rango " +
		 "[" + min + "," + max + "] es: " + salidaAleatorio);

		System.out.println("Un num aleatorio en el rango " +
		 "[" + min + "," + max + "] es: " + aleatorios(min, max));
*/
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

	public static int aleatorios(int min, int max){

		int aleatorio=  min + (int)(Math.random() * ((max - min) + 1));

		
	    return aleatorio;
	}

	public static void cadenas(String word){
		
		for (int index = 0; index< word.length(); index++ ){
			char letter= word.charAt(index);
			System.out.println("caracter en la posicion "+ index + ":  "+letter);
		}

	}
	
		
}