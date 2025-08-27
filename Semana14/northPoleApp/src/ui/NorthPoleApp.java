package ui;

import java.util.Scanner;
import model.NorthPoleController;

/**
 * Main Class for the Santa's list problem
 * @author avillota
 * @version 1.0
 * @since 2024-05-06
 */
public class NorthPoleApp {
	
	/**
	 * Object for reading the input
	 */
	private Scanner sc;
	/**
	 * Object representing the association with the controller
	 */
	private NorthPoleController controller;
	
	/**
	 * Constructor Method, initializes the objects (scanner and controller)
	 */
	public NorthPoleApp() {
		sc= new Scanner(System.in);
		controller = new NorthPoleController();
	}
	

	/**
	 * Main method starts the application's execution 
	 * @param args
	 */
	public static void main(String[] args) {
		
		NorthPoleApp obj= new NorthPoleApp();
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			option= obj.showMenu();
			obj.executeOperation(option);
		}while (option!=0);

	}
	
	
	/**
	 * 
	 * @return
	 */
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Ingresar datos del niño \n" +
				"(2) cambiar niño de lista\n" +
				"(3) Mostrar lista\n" +
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	/**
	 * 
	 * @param operation
	 */
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1: rf1AddChild();
			break;
		case 2: rf2ChangeChild();
			break;
		case 3: rf3ShowList();
			break;
		default:
			System.out.println("Error, opción no válida");
		}
	}

	public void rf1AddChild() {
		System.out.println("Registar un paciente");
		
		System.out.println("Ingrese el nombre del niño");
		String name = sc.nextLine();
		
		System.out.println("Ingrese el apellido");
		String lname = sc.nextLine();
		
		/*
		 * String lName,
		String wish,
		String address,
		String country,
		String city
		 */
		System.out.println("Cuál es su deseo de navidad?");
		String wish= sc.nextLine();
		
		System.out.println("Dirección");
		String address= sc.nextLine();
		
		System.out.println("País");
		String country= sc.nextLine();
		
		System.out.println("Ciudad");
		String city= sc.nextLine();
		
		System.out.println("En qué lista quiere incluir al niño?"
				+ "1) Lista de los que se portan bien"
				+ "2) Lista de los que se portan mal");
		int list= sc.nextInt();
		sc.nextLine();
		
		System.out.println(controller.addChild(name, lname, wish, address, country, city, list));

	}
	
	public void rf2ChangeChild() {
		System.out.println("Mostrando los pacientes");
	}

	public void rf3ShowList() {
		System.out.println("Mostrando los pacientes");
	}








}
