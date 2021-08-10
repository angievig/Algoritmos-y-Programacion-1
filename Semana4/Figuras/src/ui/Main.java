package ui; //nombre del paquete

import java.util.Scanner; 

public class Main{

	public static void main (String[] a){

		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		String cadena = "";
		for (int i= 1; i<= n; i++ ){
				for (int x= 1; x <= i; x++){ 
					cadena += "*";
				}
				cadena += "\n";
		}

		System.out.println(cadena);



	}
}