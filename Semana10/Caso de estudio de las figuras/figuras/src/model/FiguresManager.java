package model;
/**
 * Case study for the Algorithms and programming course
 * @author avillota
 * @since october 2020
 * @version 1.0
 */
public class FiguresManager {
	private String title;
	

	
	/**
	 * Constructor
	 * @param tit is a string with the figures manager title tit!= null, tit!= ""
	 */

	


	
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
	
	
	//getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String tit) {
		title = tit;
	}
	public Triangle getaTriangle() {
		return aTriangle;
	}
	public Circle getaCircle() {
		return aCircle;
	}
	public Rectangle getaRectangle() {
		return aRectangle;
	}
}
