package model;
public class Location{
	private String address;
	private String country;
	private String city;

	public Location(String address,
		String country,
		String city){
		this.address= address;
		this.country= country;
		this.city = city;
	}

	public String toString(){

		return address + " " + city + " " + country;
	}

	@Override
	public boolean equals(Object obj) {
		boolean answer= false;
		if(obj instanceof Location) {
			Location otro= (Location) obj;
			if(this.country.equals(otro.getCountry())
			 && this.city.equals(otro.getCity())
			 && this.address.equals(otro.getAddress())
			 ) {
				answer= true;
			}	
		}
		return answer;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
	
	
}