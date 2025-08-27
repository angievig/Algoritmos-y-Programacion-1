package ui;

import java.util.Scanner;


import model.Collection;
import model.Date;


public class PokeCollector {
	private Collection myCollection;
	private Scanner sc; 
	
	
	public PokeCollector() {
		sc= new Scanner(System.in);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokeCollector pc= new PokeCollector();
		
	
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			
			option= pc.showMenu();
			pc.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear una colección \n" +
				"(2) Para crear, editar o eliminar un álbum \n" +
				"(3) Para mostrar la información de los albums en la colección \n"+
				"(4) Para agregar un pokemon un álbum\n"+
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
			createCollection() ;
			break;
		case 2:
			showMenuAlbum() ;
			break;
		case 3:
			showAlbums();
			break;
	
		case 4:
			addPokeInAlbum();
			break;


		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	private void createCollection() { // 
		System.out.println("Ingrese los datos de una colección");
		String nom;
		int day, month, year;

		System.out.println("Nombre del dueño");
		nom= sc.nextLine();

		System.out.println("fecha");
		

		System.out.println("dia");
		day= sc.nextInt();
		sc.nextLine();

		System.out.println("mes");
		month= sc.nextInt();
		sc.nextLine();

		System.out.println("año");
		year= sc.nextInt();
		sc.nextLine();


		myCollection = new Collection(nom, day, month, year);

		System.out.println("La Colección  de "+ nom + " fue creada");





		
	}



	/**
	 * Método que implementa el requerimiento 4, RF-4: Agregar Pokemon a un album
	 * Si el album existe, el album tiene espacio para agregar un nuevo pokemon
	 * y no existe un pokemon con el mismo nombre, se agrega el pokemon en el album
	 */
	private void addPokeInAlbum() {
		
		//Paso 1 del diagrama
		System.out.println("Digite el nombre del album");
		String albumName= sc.nextLine();
		
		//PAso 2 del diagrama
		if (myCollection.searchAlbum(albumName)==null) { // Si la condición se cumple
			
			//Paso 3 del diagrama
			System.out.println("el album " + albumName + "no existe en la colección");
			
		}else {//Si la condición no se cumple
			
			//Paso 4 del diagrama
			//Pido datos del pokemon
			System.out.println("nombre poke");
			String namePoke= sc.nextLine();
			
			System.out.println("Especie del poke");
			String species= sc.nextLine();
			
			int type, live, attack, health, defense;
			// falta completar con los otros datos del poke
			
			live= 0; attack = 0; health=0; defense=0;
			
			//Paso 5 del diagrama
			System.out.println("ingrese el tipo\n 1. WATER\n"
					+ "2. FIRE\n"
					+ "3. ELECTRIC\n"
					+ "4. POISON\n"
					+ "5. GOSTH");
			
			type= sc.nextInt();
			
			//Paso 6 del diagrama
			String mensaje;
			
			mensaje = myCollection.addPokeInAlbum(albumName, namePoke, species, type,live, attack, health, defense );
		
			//Paso 7 del diagrama
			//Muestro respuesta
			System.out.println(mensaje);
			
		}
		
		
		
	}

	private void showMenuAlbum() {
		int option=0;
		System.out.println(
				"Menú Album\n" +
				"(1) Para crear un álbum\n" +
				"(2) Para editar un álbum\n"+
				"(3) Para eliminar un álbum\n"+
				"(0) Para volver"
				);
		option= sc.nextInt();
		sc.nextLine();
		
		switch(option) {
		case 1:
			createAlbum();
			break;
		case 2:
			editAlbum();
			break;
		case 3: 
			deleteAlbum();
			break;
		
		}
		
	}
	private void deleteAlbum() {
		
	}
	private void editAlbum() {
		
	}
	private void showAlbums() {
		if (myCollection.isEmpty()){
			System.out.println("No hay albums registrados ");
		}else{
			System.out.println(myCollection.showAlbums());
		}
		
	}
	private void createAlbum() {

		if(myCollection.hasAlbums()) {

			System.out.println("Digite los datos del album a crear ");


			System.out.println("Nombre de la región del album:");
			String nom= sc.nextLine();

		
			System.out.println("Cantidad de pokemones de la región");
			int num = sc.nextInt();
			sc.nextLine();
			

			myCollection.addAlbum(nom, num);

			System.out.println("El album \""+ nom +"\" ha sido creado con éxito\n");

			
		}else {
			System.out.println("No puede crearse el álbum porque se llegó al límite\n");
		}
		
	}

		

	}
	

	
	
	


