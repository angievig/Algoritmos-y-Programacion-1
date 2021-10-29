package model;

public class Album {
	
	private String regionName;
	private int numPokemons;
	
	//Relations with multiple cardinality
	private Pokemon[] pokemons;
	
	
	
	
	public Album(String regionName, int numPokemons) {
		
		this.regionName = regionName;
		this.numPokemons = numPokemons;
		
		// initializing the array for Pokemon objects
		pokemons = new Pokemon[numPokemons];
		
	}
	/**
	 * 
	 * @param name
	 * @param Spec
	 * @param defense
	 * @param attack
	 * @param powe
	 * @param health
	 * @param type
	 */
	public void addPokemon(String name, String Spec, int defense, 
			int attack, int powe, int health, Type type) {
		
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public String deletePokemon(String name) {
		String answer="";
		
		return answer;
		
	}
	
	
	public String toString() {
		String album="";
		
		album += "Name of the region: " + regionName + "\n";
		album += "contains "+ numPokemons + " cards\n";

		
		return album;
	}

	
	/*
	 * ================================= Getters & Setters
	 */
	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getNumPokemons() {
		return numPokemons;
	}

	public void setNumPokemons(int numPokemons) {
		this.numPokemons = numPokemons;
	}

	




}
