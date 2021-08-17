import java.util.Scanner; 


public class NotaEstudiantes{
	

	public static void main (String[] a){
		
		System.out.println("Calcular la nota final de la materia de 3 estudiantes");
		notaEstudiante(1);
		notaEstudiante(2);
		notaEstudiante(3);

		
		
	}

	public static double notaFinal( double p1, double p2,
		double tareas){

		double nota= p1* 0.4 + p2* 0.4 + tareas *0.2;

		return nota;
			
	}

	public static void notaEstudiante(int num){
		Scanner sc = new Scanner(System.in);

		double parcial1, parcial2, tareas, resultado;
		System.out.println("Digite los datos del estudiante "+ num);
		
		System.out.println("Parcial 1:");
		parcial1= sc.nextDouble();

		System.out.println("Parcial 2:");
		parcial2= sc.nextDouble();

		System.out.println("Tareas:");
		tareas= sc.nextDouble();
		
		resultado =notaFinal(parcial1, parcial1, tareas);

		System.out.println("La nota final del estudiante " + num +  " es: " + resultado);

	}

}