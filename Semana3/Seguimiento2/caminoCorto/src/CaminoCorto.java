import java.util.Scanner;

public class CaminoCorto{

	public static void main(String[] x){

		//inicializo el objeto lector
		Scanner sc = new Scanner(System.in);

		//Definir las variables para las entradas
		double xMartin, yMartin, xRicardo, yRicardo;

		//Definir las variables para la salida
		double xMedio, yMedio, pendiente, intercepto;

		//Leyendo las coordenadas de Martín

		System.out.println("Digite la posición en x para Martín");
		xMartin= sc.nextInt();

		System.out.println("Digite la posición en y para Martín");
		yMartin= sc.nextInt();

		//Leyendo las coordenadas de Ricardo

		System.out.println("Digite la posición en x para Ricardo");
		xRicardo= sc.nextInt();

		System.out.println("Digite la posición en y para Ricardo");
		yRicardo= sc.nextInt();

		
		//Calculando el punto de encuentro

		
		puntoMedio(xMartin, yMartin, xRicardo, yRicardo);

		System.out.println("resultado :" +rectaString(xMartin, yMartin, xRicardo, yRicardo));


		/*

		//Calculando la recta

		//1. Calculamos la pendiente
		pendiente = (yRicardo - yMartin) /(xRicardo - xMartin);

		//2. Calculamos el intercepto
		intercepto = yMartin - (pendiente * xMartin);

		//Escribimos la formula de la recta

		String recta = "y = " + pendiente + "x + "+ intercepto;

		//Mostramos la salida al usuario

		System.out.println("La recta que representa el camino más corto entre la casa de Martín y Ricardo es: " + recta);
		*/
	}

	/**
	 * x1 , y1 son las coordenadas de una persona
	 * x2, y2 son las coordenadas de la otra
	 * **/
	public static void puntoMedio (double x1, double y1, double x2, double y2){

		double xMedio, yMedio;


		xMedio= (x1 + x2) /2;
		yMedio = (y1 + y2)/2;

		

		//Mostrando el punto de encuentro
		System.out.println("El punto de encuentro de Martín y Ricardo es: (" +xMedio + ", "+ yMedio + ")" );


	}

	public static String rectaString (double x1, double y1, double x2, double y2){
		String recta  = "";

		double pendiente, intercepto;

		//1. Calculamos la pendiente
		pendiente = (y2 - y1) /(x2 - x1);

		//2. Calculamos el intercepto
		intercepto = y1 - (pendiente * x1);

		//Escribimos la formula de la recta

		recta = "y = " + pendiente + "x + "+ intercepto;


		return recta;
	}




}