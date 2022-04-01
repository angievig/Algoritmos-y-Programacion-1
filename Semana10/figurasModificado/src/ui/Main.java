package ui;

import java.util.Scanner;

import model.FiguresManager;

public class Main {
	
	

	//atributos
	private FiguresManager figures;
	private Scanner sc;
	
	//Constructor
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
			createTriangle() ;
			break;
		case 2:
			createRectangle();
			break;
	
		case 3:
			addCircle();
			break;

		case 4:
			showFigures();
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	public void createRectangle() {

		System.out.println("Creando un rectángulo");
		double x1, y1;
		System.out.println("Creando el punto 1");
		System.out.println("Por favor digite x");
		x1= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y1= sc.nextDouble();
		
		double x2, y2;
		System.out.println("Creando el punto 2");
		System.out.println("Por favor digite x");
		x2= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y2= sc.nextDouble();
		
		double x3, y3;
		System.out.println("Creando el punto 3");
		System.out.println("Por favor digite x");
		x3= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y3= sc.nextDouble();
		
		double x4, y4;
		System.out.println("Creando el punto 4");
		System.out.println("Por favor digite x");
		x4= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y4= sc.nextDouble();
		
		figures.addRectangle(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	public void createTriangle() {
		System.out.println("Creando un triángulo");
		
		if (figures.hasTriangle()){
			System.out.println("El triangulo existe, desea sobreescribir?");
			System.out.println(
				"Seleccione una opción \n" +
				"(1) Para sobreescribir\n" +
				"Cualquier otro numero para terminar\n"+);

			int input = sc.nextInt();

			if(input ==1){
				createNewTriangle();
				System.out.println("El triangulo fue sobreescrito");
			}else{
				System.out.println("No hubo cambios y termina la acción");

			}

		} else{
			createNewTriangle();
			System.out.println("El triangulo fue creado");
		}

		
		
	}

	public void createNewTriangle(){

		double x1, y1;
		System.out.println("Creando el punto 1");
		System.out.println("Por favor digite x");
		x1= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y1= sc.nextDouble();
		
		double x2, y2;
		System.out.println("Creando el punto 2");
		System.out.println("Por favor digite x");
		x2= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y2= sc.nextDouble();
		
		double x3, y3;
		System.out.println("Creando el punto 3");
		System.out.println("Por favor digite x");
		x3= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y3= sc.nextDouble();
		
		figures.addTriangle(x1, y1, x2, y2, x3, y3);

	}

	public void addCircle(){

		if(figures.hasSpace()){

			//pedir entradas

			double x, y, r;
			String id;
		System.out.println("Por favor digite el radio");
		r= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Por favor digite x");
		x= sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Por favor digite y");
		y= sc.nextDouble();
		sc.nextLine();

		System.out.println("Por favor digite el id");
		id= sc.nextLine();
		

		//Agregar el círculo
		System.out.println( figures.addCircle(x, y, r,id));






			//se crea

		}else{

			System.out.println("No hay espacio para agregar más círculos");

		}
	}

	public void createCircle() {
		double x, y, r;
		System.out.println("Por favor digite el radio");
		r= sc.nextDouble();
		
		System.out.println("Por favor digite x");
		x= sc.nextDouble();
		
		System.out.println("Por favor digite y");
		y= sc.nextDouble();
		
		figures.addCircle(x, y, r);
	}
	
	public void showFigures() {
		
		System.out.println(figures.getFigures());
		
	}

}
