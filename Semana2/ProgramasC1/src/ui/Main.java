package ui; //nombre del paquete

import java.util.Scanner; 

public class Main{

	public static void main (String[] a){

		Scanner sc = new Scanner(System.in);

		int grade; //esta variable guarda la nota

		System.out.println("Digite una nota");
		grade = sc.nextInt();

		//Solucion 1, condicionales independientes

		System.out.println("Solucion 1, condicionales independientes");

		if (grade ==1)
			System.out.println("Hay que trabajar mas");
		
		if (grade ==2)
			System.out.println("Un poco de esfuerzo y lo logras");
		
		if (grade ==3)
			System.out.println("Bien pero se puede mejorar");
		
		if (grade ==4)
			System.out.println("Muy bien, ya vas por el 5");
		
		if (grade ==5)
			System.out.println("¡Crack!");

		if ( grade <1 || grade >5)
		



		// Solucion 2, condicionales anidados

		System.out.println("Solucion 2, condicionales anidados");


		if (grade ==1){
			System.out.println("Hay que trabajar mas");
		} 
		else{
			if (grade ==2){
			System.out.println("Un poco de esfuerzo y lo logras");
			}
			else{
				if (grade ==3){
					System.out.println("Bien pero se puede mejorar");
				} else {
					if (grade ==4){
						System.out.println("Muy bien, ya vas por el 5");
					}else{
						if (grade ==5){
							System.out.println("¡Crack!");
						}
					}
				}
			}
		}

		// Otra forma de escribir lso condicionales anidados
		if (grade ==1){
			System.out.println("Hay que trabajar mas");
		} else if (grade ==2){
			System.out.println("Un poco de esfuerzo y lo logras");
		} else if (grade ==3){
			System.out.println("Bien pero se puede mejorar");
		} else if (grade ==4){
			System.out.println("Muy bien, ya vas por el 5");
		} else if (grade ==5){
			System.out.println("¡Crack!");
		} else{
			System.out.println("nota invalida");
		}

		switch(grade){
			case 1:
			System.out.println("Hay que trabajar mas");
			break;

			case 2:
			System.out.println("Un poco de esfuerzo y lo logras");
			break;

			case 3: 
			System.out.println("Bien pero se puede mejorar");
			break;

			case 4: 
			System.out.println("Muy bien, ya vas por el 5");
			break;

			case 5: 
			System.out.println("¡Crack!");
			break;

			default:
			System.out.println("La nota no es valida");
		}

		switch(grade){
			case 1:
			case 3: 
			System.out.println("Bien pero se puede mejorar");
			break;

			case 2:
			System.out.println("Un poco de esfuerzo y lo logras");
			break;

			case 4: 
			System.out.println("Muy bien, ya vas por el 5");
			break;

			case 5: 
			System.out.println("¡Crack!");
			break;

			default:
			System.out.println("La nota no es valida");
		}




	
		
		





		


	}
}