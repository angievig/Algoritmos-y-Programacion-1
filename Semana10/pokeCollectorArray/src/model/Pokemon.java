package model;

public class Pokemon {
	
	private String name;
	private String species;
	private int defensePoints;
	private int attackPoints;
	private int powerPoints;
	private int healthPoints;

	

	//relationship
	/**
	 * Type of the pokemon, WATER, FIRE, GOSTH, ELECTRIC, POISON
	 */
	private Type type;
	
	
	
	/**
	 * 
	 * @param name
	 * @param species
	 * @param defensePoints
	 * @param attackPoints
	 * @param powerPoints
	 * @param healthPoints
	 * @param type
	 */
	public Pokemon(String name, String species, int defensePoints, int attackPoints, int powerPoints, int healthPoints,
			Type type) {
		super();
		this.name = name;
		this.species = species;
		this.defensePoints = defensePoints;
		this.attackPoints = attackPoints;
		this.powerPoints = powerPoints;
		this.healthPoints = healthPoints;
		this.type = type;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return "Pokemon [name=" + name + ", species=" + species + ", defensePoints=" + defensePoints + ", attackPoints="
				+ attackPoints + ", powerPoints=" + powerPoints + ", healthPoints=" + healthPoints + ", type=" + type
				+ "]";
	}



	/*
	 * ====================================== Getters & setters
	 */
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getDefensePoints() {
		return defensePoints;
	}

	public void setDefensePoints(int defensePoints) {
		this.defensePoints = defensePoints;
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}

	public int getPowerPoints() {
		return powerPoints;
	}

	public void setPowerPoints(int powerPoints) {
		this.powerPoints = powerPoints;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

}
