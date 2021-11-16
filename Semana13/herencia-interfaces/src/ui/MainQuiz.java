package ui;

import java.util.Scanner;

import model.Duck;
import model.Flyer;
import model.Human;
import model.Kryptoniano;

public class MainQuiz {
	
	private Scanner sc;
	
	public MainQuiz() {
		sc= new Scanner(System.in);
	}

	public static void main(String[] args) {
		
		MainQuiz main= new MainQuiz();
		
		main.createObjects();
		
		main.InterfacesExample();
		

	}

	private void InterfacesExample() {
		Duck don = new Duck(10, 50.4);
		Kryptoniano sm = new Kryptoniano(35, "Clark");
		
		System.out.println("---Simulación de volar---");
		System.out.println("---El pato--");
		simulacionVuelo(don);
		System.out.println("---El Kryptoniano---");
		simulacionVuelo(sm);
		
		
	}
	private void simulacionVuelo(Flyer volador) {
		System.out.println(volador.despegar());
		System.out.println(volador.volar());
		System.out.println(volador.aterrizar());
		
	}

	private void createObjects() {
		Human petro = new Human(30, "Gustavo");
		
		Duck don = new Duck(10, 50.4);
		
		
		System.out.println(petro.makeSound());
		System.out.println(don.makeSound());
		
		System.out.println("Funciona!!");
		
	}

}
