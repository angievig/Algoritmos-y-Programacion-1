package ui; //nombre del paquete

import java.util.Scanner; 

public class Patrones
{
	static Scanner reader = new Scanner(System.in);

	public static void main (String[] a){

		
		int input=0;
		
		do{
			input= showMenuGetOption();
			answerOption(input);
		 
		}while(input !=0);


	}
	private static void answerOption(int selection) {
		 switch(selection){
	    	case 1:
	    	{
	    		ejemplo1();
	    		break;
	    	}
	    	case 2:
	    	{
	    		ejemplo2();
	    		break;
	    	}
	    	default: 
	    	System.out.println("bye uwu");
	    }
		
	}

	static public int showMenuGetOption() {
		
		int option=0; 
		
			System.out.println("Seleccione una opcion:\n" +
			 "(1) para el ejemplo con recorrido total\n"+
			 "(2) para el ejemplo con recorrido total + condición\n"+
			 "(0) para no hacer nada y salir");

		    option= reader.nextInt();
		    reader.nextLine(); //limpiar la entrada
		return option;
		
	}
	
	public static void ejemplo1() {
		System.out.println("Cantidad de items");
   		int items = reader.nextInt();
    	double price = 0;
    	int count = 0;
    	while( count<items){
    		System.out.println("ingrese el precio del producto " + (count+1));
    		price+= reader.nextDouble();
    		count++;
    	}
    	System.out.println(" el total de la compra es " + price);
		
	}
	
	private static void ejemplo2() {
		System.out.println("Cantidad de items");
		int items = reader.nextInt();
		double price = 0;
		for (int count =0; count < items; count++ ){
			System.out.println("ingrese el precio del producto " + (count+1));
			price+= reader.nextDouble();
		}
		System.out.println(" el total de la compra es " + price);
		
	}
}