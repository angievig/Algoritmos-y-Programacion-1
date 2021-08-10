package ui; //nombre del paquete

import java.util.Scanner; 

public class Patrones
{

	public static void main (String[] a){

		Scanner reader = new Scanner(System.in);
		int option=0;
		do{
			System.out.println("Seleccione una opcion:\n" +
			 "(1) para el ejemplo con recorrido total\n"+
			 "(2) para el ejemplo con recorrido total + condición\n"+
			 "(0) para no hacer nada y salir");

		    option= reader.nextInt();
		    reader.nextLine(); //limpiar la entrada


		    switch(option){
		    	case 1:
		    	{
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
		    	break;
		    	}
		    	case 2:
		    	{
		    		System.out.println("Cantidad de items");
		    		int items = reader.nextInt();
		    		double price = 0;
		    		for (int count =0; count < items; count++ ){
		    			System.out.println("ingrese el precio del producto " + (count+1));
		    			price+= reader.nextDouble();
		    		}
		    		System.out.println(" el total de la compra es " + price);
		    		break;
		    	}
		    	default: 
		    	System.out.println("bye uwu");
		    }
		
		}while(option !=0);

		
	



		


		





		


	}
}