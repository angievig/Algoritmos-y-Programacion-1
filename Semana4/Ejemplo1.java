import java.util.Scanner; 
public class Ejemplo1{
	public static void main(String[] a){
		Scanner sc= new Scanner(System.in);
		/*Contrato
		Propósito: leer varias cadena.
		Cantidad de iteraciones: no definidas, hasta 
		que se cumpla una condición.
		Variables de control: palabra
		Condición: palabra es distinto de "parar"
		Avance: nueva lectura en la variable palabra
		*/
		//Inicio
		String palabra;
		palabra= sc.nextLine();

		while(!palabra.equals("parar")){
			System.out.println("la palabra digitada es: "+
			 palabra);

			//avance
			palabra = sc.nextLine();
		}
	}
}