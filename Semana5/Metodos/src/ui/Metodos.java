package ui; //nombre del paquete

import java.util.Scanner; 

public class Metodos{

	private static Scanner sc = new Scanner(System.in);


	public static void main (String[] a){

		/*
		System.out.println("Digite un número entero ");
		int input= sc.nextInt();

		

		System.out.println("El factorial de " + input + " es "+ factorial(input));
		*/

		double b, h, c, c2;
		


		System.out.println("Digite la base ");
		 b= sc.nextDouble();

		 System.out.println("Digite la altura ");
		 h= sc.nextDouble();

		 c= areaTriangulo(b, h);
		 c2 = areaTriangulo(b, h) *100;

		 System.out.println(areaTriangulo(b, h));

		 System.out.println(c);
		 System.out.println(c2);





	



	}

	public static int factorial(int num){
		int factorial =1;

		for (int var =1; var <= num; var++ ){
			factorial *= var;
		}
		return factorial;
	}

	public static double areaTriangulo(double base, double altura){
		double area=0;
		area= base * altura /2;

		return area;
	}
}