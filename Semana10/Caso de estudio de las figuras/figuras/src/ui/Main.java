package ui;

import java.util.Scanner;

import model.FiguresManager;

public class Main {
	
	private FiguresManager figures;
	private Scanner sc;
	
	
	public Main() {
		figures= new FiguresManager("Example");
		sc= new Scanner(System.in);
	}
	public static void main(String [] args) {
		
		System.out.println("Iniciando la aplicación");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Seleccione una opción para empezar\n" +
				"(1) Para crear el triangulo\n" +
				"(2) Para crear el rectángulo\n"+
				"(3) Para crear el círculo  \n"+
				"(4) Para mostrar las figuras\n" +  
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createCircle() ;
			break;
		case 2:
			createCircle();
			break;
	
		case 3:
			createCircle();
			break;

		case 4:
			showFigures();
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	private void createCircle() {
		double x, y, r;
		System.out.println("Por favor digite el radio");
		r= sc.nextDouble();
		
		System.out.println("Por favor digite x");
		x= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y= sc.nextDouble();
		
		figures.addCircle(x, y, r);
	}
	
	private void showFigures() {
		
		System.out.println(figures.getFigures());
		
	}

}
