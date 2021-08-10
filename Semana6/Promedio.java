public class Promedio{

	public static void main (String [] args){
		double [] grades = {2.5, 4.7, 5, 4.2, 4.8};
		int[] credits = {2, 3, 4, 2, 3};
		int totalCredits= 0; // acumulador para el numero de creditos
		double average=0;
		double acc= 0; //acumulador para la nota * creditos de una materia
		for (int i =0; i < grades.length; i++){
			acc += grades[i] * credits [i];
			totalCredits += credits[i];
		}
		average= acc/totalCredits;
		System.out.println("El promedio del semestre fue: "+ average);
	}
}