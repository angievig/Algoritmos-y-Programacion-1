package model;
/**
 * Case study for the Algorithms and programming course
 * @author avillota
 * @since october 2020
 * @version 2.0 updated on March 2022
 */
public class FiguresManager {
	
	public static final int MAX_CIRCLES = 10;

	private String title;

	private Triangle aTriangle;

	//asociación 1..*
	private Circle [] circles;
	

	
	/**
	 * Constructor
	 * @param tit is a string with the figures manager title tit!= null, tit!= ""
	 */

	public FiguresManager(String tit){

		title = tit;

		//init arreglo que representa la asociación de 1 ..*
		circles= new Circle[MAX_CIRCLES]; 

	}
	/** 
	 * @return true si se puede agregar otro circulo, false en el caso contrario
	 * */
	public boolean hasSpace(){

		boolean emptyPosition= false;
		for (int i=0; i<MAX_CIRCLES && !emptyPosition; i++){

			if(circles[i] ==null){
				emptyPosition= true;
			}

		}
		return emptyPosition;
	}

	/**
	 * @return un entero con la primera posición vacía en el arreglo
	 *  y -1 si el arreglo está lleno 
	 * */
	 public int getEmptyPosition(){

	 }

	 /**
	  * @param id is the id of the searched circle 
	  * @return boolean true if the circle is in the array, else false
	  * */
	 public boolean findCircle(String id){

	 	boolean flag= false;
	 	for(int i=0; i<MAX_CIRCLES && !flag; i++){

	 		if (circles[i]!= null && circles[i].getId().equals(id)){
	 			flag= true;
	 		}
	 	}

	 	return flag;
	 }




	/**This method creates three objects of teh class Point, creates 
	 * an object of the class Triangle and sets up the 
	 * */
	public void addTriangle(double xA, double yA, double xB, double yB, double xC, double yC) {
		
	}
	
	public void addRectangle(double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD) {
		
	}
	
	/** Metodo que agrega un círculo en la primer aposición vacía
	 * @return un mensaje informando el resultado...
	 * */
	public String addCircle(double xCenter, double yCenter, double rad, String id) {
		String out = "";
		


		int emptyPos= getEmptyPosition(); //busco la primera posición vacía

		// si el arreglo está lleno?

		if(emptyPos == -1){ // está lleno

			//no se puede agregar
			out = "El arreglo está lleno";


		}else{ //Si no está lleno

			Point point= new Point(xCenter, yCenter);
			circles[emptyPos] =  new Circle (rad, point, id);
			out = "Se agregó el círculo con id "+ id;

		}

		return out;

		
	}
	
	
	/**
	 * Method for returning the informations of the figures in the manager as Strings
	 * @return out a String containing the information of each figure
	 */
	public String getFigures() {
		String out="";
		
		return out;
	}
	

	/**
	 * @return true si hay triangulo, false en el caso contrario
	 * */
	 public boolean hasTriangle(){
	 	bool out=false;

	 	if(aTriangle!= null){
	 		out = true;
	 	}

	 	return out;
	 }

	 public 

	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String tit) {
		title = tit;
	}

}
