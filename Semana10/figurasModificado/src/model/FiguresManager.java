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
	private Circle [] circles;
	

	
	/**
	 * Constructor
	 * @param tit is a string with the figures manager title tit!= null, tit!= ""
	 */

	public FiguresManager(String tit){

		title = tit;

		//init
		circles= new Circle[MAX_CIRCLES]; 

	}




	/**This method creates three objects of teh class Point, creates 
	 * an object of the class Triangle and sets up the 
	 * */
	public void addTriangle(double xA, double yA, double xB, double yB, double xC, double yC) {
		
	}
	
	public void addRectangle(double xA, double yA, double xB, double yB, double xC, double yC, double xD, double yD) {
		
	}
	
	public void addCircle(double xCenter, double yCenter, double rad) {
		Point point= new Point(xCenter, yCenter);
		aCircle = new Circle (rad, point);
		
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

	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String tit) {
		title = tit;
	}
	+
}
