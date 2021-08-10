package ui;


import model.Coordinate;
import model.Date;
import model.Map;

public class PokeCollector {
	private Collection myCollection;
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokeCollector pc= new PokeCollector();
		pc.showScenario();
		
		
		
		

	}
	
	public void showScenario() {
		System.out.println(myCollection.toString());
		
		System.out.println("Album 1: ");
		System.out.println(myCollection.getAlbum1().toString());
		
		System.out.println("Album 2: ");
		System.out.println(myCollection.getAlbum2().toString());
		
		System.out.println("Album 3: ");
		System.out.println(myCollection.getAlbum3().toString());
		
	}
	
	public PokeCollector() {
		

		
		//objects for Album1
		Coordinate lat1 = new Coordinate(24,12,30);
		Coordinate long1 = new Coordinate(45,34,17);
		
		Date date1= new Date(8,4,2018);
		
		Map map1 = new Map("Kanto.jepg", date1, lat1, long1);
		
		Album album1= new Album("Kanto", 5, map1);
		
		//objects for Album2
		Coordinate lat2 = new Coordinate(32,25,14);
		Coordinate long2 = new Coordinate(3,21,4);
		
		Date date2= new Date(14,2,2010);
		
		Map map2 = new Map("JohtoMapV1.png", date2, lat2, long2);
		
		Album album2= new Album("Johto", 3, map2);
		

		//objects for Album3
		Coordinate lat3 = new Coordinate(15,6,7);
		Coordinate long3 = new Coordinate(34,59,40);
		
		Date date3= new Date(24,12,1999);
		
		Map map3 = new Map("MapHoennSunset.jepg", date3, lat3, long3);
		
		Album album3= new Album("Hoenn", 2, map3);
		
		// Objects for Collection
		Date dateC = new Date(29,2, 2020);
		myCollection= new Collection("Ash Ketchum",dateC, album1, album2, album3);
	}
	
	

}
