package model;

public class Veterinary{

	private String name;

	public Veterinary(String pName){
		name= pName;
	}

	public String toString(){
		return "{:Veterinary name= " + name +"}";
	}


}