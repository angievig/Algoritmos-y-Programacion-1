package model;

public class Collection {
	

	private String owner;
	
	//Relationships
	
	private Date creationDate;
//	private Album album1;
//	private Album album2;
//	private Album album3;
	
	//Cambio 1
	private Album[] albums;
	
	private static final int MAX_ALBUMS= 10;
	
	public Collection(String owner, int day, int month, int year) {
		this.owner = owner;
		creationDate = new Date(day, month, year);
		
		//Cambio 2
		albums= new Album[MAX_ALBUMS];
		
		
	}
	
	
	
	
	/*
	 * ============================== Getters & Setters
	 */

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}












	
	public String toString() {
		String out="";
		out += "This collection belongs to " + owner;
		out += "\ncreated on " + creationDate.toString();
		return out;
	}

	/** Debe retornar true si hay algún objeto null, false en el caso contrarion
	*/
	public boolean hasAlbums() {
		
		boolean encontrado=false;
		for (int i = 0; i < albums.length&& !encontrado; i++) {
			
			if (albums[i]== null) {
				encontrado= true;
			}
		}
		return encontrado;
	}

	public String showAlbums() {
		String out="";
		
		for (int i = 0; i < albums.length; i++) {
			
			if (albums[i] != null) {
				out+= albums[i].toString();
			}
				
		}
		return out;
	}

	public void addAlbum(String tit, int num) {
		
		boolean encontrado=false;
		for (int i = 0; i < albums.length&& !encontrado; i++) {
			
			if (albums[i]== null) {
				encontrado= true;
				albums[i]= new Album(tit, num);
			}
		}
	} 

	public boolean isEmpty(){
		boolean isEmpty= true;
		
		for (int i = 0; i < albums.length && isEmpty; i++) {
			if(albums[i] !=null ) {
				isEmpty=false;
			}
		}
		return isEmpty;
	}
	/**
	 * PRE el album existe, el arreglo está inicializado
	 * POS: si  el album tiene espacio para agregar un nuevo pokemon  y no existe un pokemon con el mismo nombre, 
	 * se crea un nuevo objeto de la clase de pokemon y se agrega al album
	 * @param albumName
	 * @param namePoke
	 * @param species
	 * @param type
	 * @param live
	 * @param attack
	 * @param health
	 * @param defense
	 * @return msg con el mensaje de error o éxito de la operación
	 */
	public String addPokeInAlbum(String albumName, String namePoke, String species, int type, int power, int attack, int health, int defense) {
		String msg= "";
		Album album= searchAlbum(albumName); //album nunca será null
		//validar si el album tiene espacio
		if(album.hasSpace()) {//Tengo que hacer el método que me diga si el album tiene espacio
			// si tiene espacio, validar si el pokemon ya existe
			if(album.searchPokemon(namePoke)==null) { // si no existe
				Type tiP= null;

				switch(type) {
				case 1: 
					tiP= Type.WATER; 
					break;
				case 2:
					tiP= Type.FIRE; 
					break;
				case 3:
					tiP= Type.ELECTRIC; 
					break;
				case 4:
					tiP= Type.POISON; 
					break;
				case 5:
					tiP= Type.GOSTH; 
					break;
				}
				Pokemon poke= new Pokemon(namePoke, species, defense, attack, power, health,tiP);
				album.addPokemon(poke);
				msg="el pokemos fue agregado";
			}else {// mensaje de error
				msg= "ya existe un pokemon con ese mismo nombre";
			}
		}else {//si no hay espacio  el mensaje es el album no tiene espacio
			msg= "el album no tiene espacio";
		} 
		return msg;
	}
	
	public Album searchAlbum(String albumName) {
		boolean found= false;
		Album tmp= null;
		
		for (int i = 0; i < albums.length && !found; i++) {
			tmp= albums[i];
			if(tmp!= null && tmp.getRegionName().equals(albumName)) {
				found= true;
			}
			
		}
		
		return tmp;
	}


}
