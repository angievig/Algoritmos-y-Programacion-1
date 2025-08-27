package model;
import java.util.ArrayList;
import java.util.Iterator;

public class NorthPoleController{

	private ArrayList<Child> naugthy;
	private ArrayList<Child> good;

	public NorthPoleController(){

		naugthy= new ArrayList<Child>();
		good= new ArrayList<Child>();
	}

	/**
	 * 
	 * @param name
	 * @param lName
	 * @param wish
	 * @param address
	 * @param country
	 * @param city
	 */
	public String addChild(String name, 
		String lName,
		String wish,
		String address,
		String country,
		String city, 
		int lista 
		){

		String msg="";
		
		Location loc= new Location(address, country, city);
		Child nuevo= new Child(name, lName, wish, loc);
		if (lista ==1) {
			boolean encontrado = false;
			for(int i = 0;  i < good.size() && !encontrado; i++) {
				if(good.get(i).equals(nuevo)) {
					encontrado= true;
					msg= "el niño + "+ nuevo + "ya está en la lista";
				}
			}
			if(!encontrado) {
				good.add(nuevo);
				msg= "se agreggó a + " + name 
						+ "a la lista de niños que se portan bien";
			}
			
		}else if(lista ==2) {
			
		}else {
			msg= "no existe esa lista";
		}
		
		
		return msg;

	}

}