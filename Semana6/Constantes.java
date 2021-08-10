import java.util.Scanner;
public class Constantes{
	

	/*
	====================================================
	== Constantes
	====================================================
	*/
	public static final double IVA= 0.19;

	private static final double PI= 3.14159;

	private final static int STOP= "Parar".length();

	private  static char A = 'a';

	private final static int SIZE = 10;

	public static void main (String [] args){
		
	
		int [] array = {10,3,2,4,14}; //INICIALIZACION
		System.out.println("el tercer elemento del arreglo array es: " +array[2]);

		Scanner sc = new Scanner(System.in);
		
		String [] inputs = new String[SIZE];

		for (int pos= 0 ; pos < SIZE; pos++)
			inputs[pos] = sc.nextLine();
		
		System.out.println("el elemento 10 del arreglo inputs es: " +inputs[5]);

	}

}