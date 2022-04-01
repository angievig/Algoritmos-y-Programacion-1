package model;

/**
 * Triangle
 * @author avillota
 * @since october 2020
 * @version 1.0
 */
public class Triangle {
	
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//getters and setters
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	
	/**
	 * Method that produces a String with the information of a rectangle
	 */
	
	public String toString() {
		return "Triangle with points  A = "+ a +",B = "+ b  +", and C = "+ c ;
	}
	
	

}
