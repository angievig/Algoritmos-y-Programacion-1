package ui; //nombre del paquete

import java.util.Scanner; 

public class Arreglos{

public static Scanner reader= new Scanner(System.in);

	public static void main (String[] a){

		int option = 0; 
		do{
			System.out.println(
			 "seleccione una opcion\n" +
		 	 "(1) recorrido total \n"+
		 	 "(2) recorrido parcial \n" +
		 	 "(3) Doble recorrido \n" +
			 "(0) bye");

			option= reader.nextInt();
			answerOption(option);
		}while(option !=0);



	}
	/**
	* Descripción: ¿qué hace mi método? (concisa, un par de líneas)</br>
	* <b> pre:</b> ¿cuáles son las condiciones sobre las variables globales? --> si hay una condición sobre var glob. </br>
	* <b> pos:</b> ¿Cuales fueron los cambios sobre las variables globales? --> si ocurrio un cambio cn var glob.
	* @param <nombre_par> <tipo>, condiciones sobre el parametro --> si tiene
	* @return <nombre_var> <tipo>, informacion sobre variable de retorno --> retorno
	*/

	public static void answerOption(int num){

		switch(num){
			case 1: 
			String[] ex1={"yei", "hoy", "madrugamos", ":'("};
			ejemploRecorridoTotal(ex1);
			break;
			
			case 2:
			int[] ex2= {2, 4, 5, 6, 7, 12};
			String answer= ejemploRecorridoParcial(ex2) + " otra cadena";
			System.out.println(answer);
			break;
			
			case 3:
			int[] ex3= {2, 4, 2, 6, 4, 12, 5, 6, 3, 12, 2};
			 
			System.out.println(ejemploDobleRecorrido(ex3));
			//ejemploDobleRecorrido(ex3);
			break;
			default: 
			System.out.println("bye uWu");
		}

	}

	public static void ejemploRecorridoTotal(String[] in){
		String accum= "";
		for(int pos=0; pos < in.length ; pos++){
			accum += in[pos] + " ";
		}
		System.out.println(accum);

	}

	public static String ejemploRecorridoParcial(int[] array){
		String out="";

		boolean found=false;
		for(int i=0; i < array.length && !found ; i++){
			if((array[i] % 2 ==0) && (array[i]%3 ==0)){
				found= true;
				out= "En la posición " + i +
				" del arreglo hay un divisor de 2 y de 3: " + 
				array[i] ;

			}
		}

		if(!found){  //found ==false
			out= "No hay números que dividan exactamente a 2 y 3";

		}

		return out;
	}
	public static String ejemploDobleRecorrido(int[] array){
		String out="";
		int[] contadores = new int[array.length];
		for(int i=0; i < array.length; i++){
			int temp=0;
			for(int j=0; j < array.length; j++){
				if(array[i]== array[j]){
					temp++;
				}
			}
			contadores[i]=temp;
		}

		for(int i=0; i< contadores.length; i++){
			out += "La cantidad de ocurrencias del número  "+
				array[i] + " es : " + contadores[i] + "\n";
		}
		return out;
	}
}