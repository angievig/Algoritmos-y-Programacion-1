public class Plantillas{
	public static void main (String[] ar){
		
		//patrón de recorrido total
		for (int elemento = valor_inicial; 
			elemento <= valor_final;
			elemento++){

			//cuerpo del ciclo
		}

		// patrón de recorrido parcial
		boolean termino = false
		for (int elemento = valor_inicial; 
			elemento <= valor_final && !termino;
			elemento++){

			//cuerpo del ciclo

			if(<ya se cumplió el objetivo>){
				termino= true;
			}
		}

		// patrón de recorrido doble
		for (int elemento1 = valor_inicial1; 
			elemento1 <= valor_final1;
			elemento1++){

			for (int elemento2 = valor_inicial2; 
			elemento2 <= valor_final2;
			elemento2++){
				//cuerpo del ciclo
			}
		}



		for (int i=1; i<=10; i++){
			if (i%2 ==0){
				System.out.println("El cuadrado de "+ i+ " es: "+ i*i);
			}
		}

		int count = 0;
		for (int elemento = 1; elemento <= 20; elemento++){
			if (elemento%3==0){
				count++;
			}
		}
		System.out.println("La cantidad de números divisibles por 3 es: " + count);

		

		boolean div = false
		for (int elemento = 1; elemento <= 20 && !div; elemento++){
			if(elemento%6 == 0 && elemento%4==0){
				div= true;
			}
		}
		if (div){
			System.out.println("hay al menos un número divisible por 6 y por 4");
		}

			// patrón de recorrido doble
		for (int i = 1; i <= 10; i++){
			int sum = 0;
			for (int j = i; j <= 20; j++){
				sum += j;
			}
			System.out.println("la sumatoria desde " + i+ "hsta 20 es: "+ sum); 
		}

		double promedio =0;
		double cantidadNotas=0;
		double nota = 0;
		System.out.println("Ingrese una nota o -1 para terminar");
		nota = lector.nextDouble();
		while (nota != -1){
			promedio += nota;
			cantidadNotas++;
			System.out.println("Ingrese una nota o -1 para terminar");
			nota = lector.nextDouble();
		}

		if(cantidadNotas >0)
			System.out.println("El promedio es " + promedio/cantidadNotas);
		else
			System.out.println("No ha ingresado notas");
			
	
	}
		}
}