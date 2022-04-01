package model;
/**
 * Circle
 * @author avillota
 * @since october 2020
 * @version 1.0
 */
public class Circle {
	
	private double radius;
	private Point center;
	private String id;
	
	
	
	/**
	 * Constructor
	 * @param radius is a double, radius > 0
	 * @param center is an object center!= null 
	 * @param id is an String identifying the circle id!= "" and id != null
	 */
	public Circle(double radius, Point center, String id) {
		this.radius = radius;
		this.center = center;
		this.id= id;
	}
	
	//getters and setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}

	public String getId(){
		return id;

	}
	/**
	 * Modifies the value of the center <br>
	 * pos: the value of center changes
	 * @param center is a point, center !=null
	 */
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	/**
	 * Method that produces a Strin with the information of a circle
	 */
	public String toString() {
		return "Circle with radious = "+ radius +"and center = "+ center.toString();
	}

}
