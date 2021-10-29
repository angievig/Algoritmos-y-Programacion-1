package ui;

import java.util.Scanner;
import model.Product;
import model.Shop;


/**
 * Clase principal del proyecto candyShop.
 * Desarrollada para el 
 * @author angievig
 * @version 1.0
 * @since October 2021
 */
public class MainShop {
	
	/**
	 * store es la conexiOn con la clase Shop en el paquete model
	 */
	private Shop store;
	/**
	 * sc es el objeto que permite leer informaciOn digitada por el usuario
	 */
	private Scanner sc;
	
	/**
	 * Constructor de la clase, no recibe prametros.  
	 * El mEtodo inicializa el objeto lector 
	 */
	public MainShop() {
		sc= new Scanner(System.in);
	}
	

	public static void main (String[] a){
		// creando un objeto de la clase principal
		MainShop obPpal = new MainShop();
		obPpal.initShop();
		
		// variable para leer la entrada
		int option= 0;
		
		//ciclo para ejecutar el menu mientras que el usuario no
		// elija la opciOn para salir (0)
		do {
		    option =obPpal.showMenuAndGetOption();
		    obPpal.answerOption(option);
		}while (option !=0);


	}


	/**
	 * Metodo que se encarga de llamar a los mEtodos que resuelven cada uno de los 
	 * requerimientos de la aplicaciOn 
	 * @param userOption, int es el nUmero ingresado por el usuario (no ha sido validado) 
	 */
	public void answerOption(int userOption) {
		switch(userOption) {
		case 0: 
			System.out.println("cerrando la aplicaciOn, bye");
			break;
		case 1:
			break;
		case 2:
			break;
		case 3: 
			break;
		case 4: 
			registrarProducto();
			break;
		case 5: 
		System.out.println("La informaciOn de la tienda es la siguiente:");
		System.out.println(store);
		}
		
		
	}

	public void registrarProducto(){

		String nameProduct;
	    int numItems, product;
		double price;
		
		do{
		//mensajes al usuario para pedir los datos y crear un producto 
		System.out.println("Elija un producto para registrar (un número entre 1 y 3)");
		product = sc.nextInt();
		sc.nextLine();
		}while (product <1 && product >3);

		if(shop.verifyProduct(product)){

			System.out.println("El producto ya está registrado, quiere sobre escribir");



		}else{
			System.out.println("Digite el nombre del producto " + product);
			nameProduct= sc.nextLine();
		
			System.out.println("Digite la cantidad de items disponibles");
			numItems= sc.nextInt();
			sc.nextLine();
		
			System.out.println("Digite el precio del producto " + product);
			price=sc.nextDouble(); 
			sc.nextLine();
		
		//llamada al metodo addProduct en Shop
		
		store.addProduct(product, nameProduct, numItems, price);

		}


		
		
	}


	/**
	 * Metodo que permite crear instancias de los objetos con informaciOn ingresada
	 * por el usuario
	 */
	public void initShop() {
		System.out.println("Bienvenido a la tienda de APO1, digite el nombre del  dueño");
		String name= sc.nextLine();
		store = new Shop(name);
		/*
		// variables para leer las entradas
		String nameProduct;
	    int numProducts;
		double price;
		
		// mensajes al usuario para pedir los datos y crear el producto 1
		System.out.println("a continuación registraremos los productos");
		System.out.println("Producto 1");
		
		System.out.println("Digite el nombre del producto 1");
		nameProduct= sc.nextLine();
		
		System.out.println("Digite la cantidad de items disponibles");
		numProducts= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el precio del producto 1");
		price=sc.nextDouble(); 
		sc.nextLine();
		
		//llamada al constructor de Producto 
		Product product= new Product(nameProduct, numProducts, price);
		store.setProduct1(product);
		
		
		// mensajes al usuario para pedir los datos y crear el producto 2
		
		System.out.println("Producto 2");
		
		System.out.println("Digite el nombre del producto 2");
		nameProduct= sc.nextLine();
		
		System.out.println("Digite la cantidad de items disponibles");
		numProducts= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el precio del producto 2");
		price=sc.nextDouble(); 
		sc.nextLine();
		
		//llamada al constructor de Producto 
		product= new Product(nameProduct, numProducts, price);
		store.setProduct2(product);
		
		// mensajes al usuario para pedir los datos y crear el producto 3
		
		System.out.println("Producto 3");
		
		System.out.println("Digite el nombre del producto 3");
		nameProduct= sc.nextLine();
		
		System.out.println("Digite la cantidad de items disponibles");
		numProducts= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el precio del producto 3");
		price=sc.nextDouble(); 
		sc.nextLine();
		
		//llamada al constructor de Producto 
		product= new Product(nameProduct, numProducts, price);
		store.setProduct3(product);
		
		
		System.out.println("La tienda ha sido configurada y su información inicial es la siguiente:");
		System.out.println(store);
		System.out.println(store.getProduct1());
		System.out.println(store.getProduct2());
		System.out.println(store.getProduct3());
		
		*/
		
	}
	/**
	 * Metodo que muestra el menu de la aplicaciOn, a este metod hace falta implementar la validaciOn
	 * del valor ingresado por el usuario
	 * @return input, int es la opciOn elegida por el usuario
	 */
	public int showMenuAndGetOption() {
		int input;
		System.out.println("\n\nMenu de la Tienda, digite una opciOn\n"+ 
		                    "(1) Vender Producto\n" +
		                    "(2) Mostrar la cantidad de dinero en caja\n" +
		                    "(3) Consultar la disponibilidad de un producto\n"+
		                    "(4) Registrar un producto\n"+
		                    "(5) Mostrar los datos de la tienda\n"+
		                    "(0) Para salir"
	
		);
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

}
