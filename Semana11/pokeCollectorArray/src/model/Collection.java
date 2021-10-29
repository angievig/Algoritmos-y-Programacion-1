package model;

public class Collection {
	

	private String owner;
	
	//Relationships
	
	private Date creationDate;
	private Album album1;
	private Album album2;
	private Album album3;
	
	public Collection(String owner, Date creationDate) {
		this.owner = owner;
		this.creationDate = creationDate;
		
	}
	public Collection(String owner, int day, int month, int year) {
		this.owner = owner;
		creationDate = new Date(day, month, year);
		
	}
	
	public void addAlbum1(String name, int num)  {
		
		
	}
	
	public void addAlbum2() {
		
		
	}
	
	public void addAlbum3() {
		
		
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

	public Album getAlbum1() {
		return album1;
	}

	public void setAlbum1(Album album1) {
		this.album1 = album1;
	}

	public Album getAlbum2() {
		return album2;
	}

	public void setAlbum2(Album album2) {
		this.album2 = album2;
	}

	public Album getAlbum3() {
		return album3;
	}

	public void setAlbum3(Album album3) {
		this.album3 = album3;
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
		// TODO Auto-generated method stub
		return false;
	}

	public String showAlbums() {
		
		return "";
		
	}

	public void addAlbum(String tit, int num) {
		// TODO Auto-generated method stub
		
	} 

}
