import java.util.Scanner; 
public class Ejemplo2{
	public static void main(String[] a){
		Scanner sc= new Scanner(System.in);
		



		/*Contrato
		Propósito: sumar todos los números entre 1 y
		un número
		Cantidad de iteraciones: numeroN
		Variables de control: índice, de tipo entero.
		Acumuladores: suma, entero inicia en cero. 
		Condición: el índice es menor o igual que numeroN
		Avance: sumar uno a la variable índice
		*/
		//Entrada
		int numeroN;
		numeroN= sc.nextInt();

		// inicio
		int suma =0;

		for(int indice=1; indice <= numeroN; indice++){
			suma += indice; 
			// suma = suma + indice;
		}
		System.out.println(suma);
	}
}