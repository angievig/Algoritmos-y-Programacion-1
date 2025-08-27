package model;
public class Child{

	private String name;
	private String lName;
	private String wish;
	private Location location;

	public Child(String pname, 
		String plName,
		String pwish,
		Location loc){

		name= pname;
		lName= plName;
		wish= pwish;
		location= loc;
	}

	public String toString(){
		return name + " " + lName;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
	
	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the wish
	 */
	public String getWish() {
		return wish;
	}

	/**
	 * @param wish the wish to set
	 */
	public void setWish(String wish) {
		this.wish = wish;
	}

	@Override
	public boolean equals(Object obj) {
		boolean answer= false;
		if (obj instanceof  Child) {
			Child otro = (Child) obj;
			if (this.name.equals(otro.getName())
				&& this.lName.equals(otro.getlName())
				&& this.location.equals(otro.getLocation())
				)
				answer = true;
		}
		
		
		return answer;
	}
	
	
	


}