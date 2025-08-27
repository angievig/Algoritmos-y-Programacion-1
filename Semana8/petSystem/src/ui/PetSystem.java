package ui; //paquete
import java.util.Scanner; //para leer entrada
import model.Veterinary; // paquete, clase
/*
 To compile: javac -cp src src/ui/Template.java -d bin
 To execute: java -cp bin ui.Template
 */
public class PetSystem{

	private Veterinary miVeterinaria;

	static Scanner reader = new Scanner(System.in); //reader as a global variable

	public static void main (String[] args ){

		System.out.println("The template compiles!!");

		Veterinary vet1, vet2, vet3;

		vet1 = new Veterinary("Super Mascotas");
		vet2 = new Veterinary("Perros & Gatos");
		vet3 = new  Veterinary("Hogar Animal");

		System.out.println(vet1.toString());
		System.out.println(vet2);
		System.out.println(vet3);



	}

}