package model;

/**
 * Rectangle, class to be completed
 * @author avillota
 * @since october 2020
 * @version 1.0
 */
public class Rectangle {
	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
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
	
	public Point getD() {
		return d;
	}
	public void setD(Point d) {
		this.d = d;
	}
	
	/**
	 * Method that produces a String with the information of a rectangle
	 */
	
	public String toString() {
		return "Rectangle with points  A = "+ a +" B = "+ b  +" C = "+ c +" D = "+ d;
	}

}
