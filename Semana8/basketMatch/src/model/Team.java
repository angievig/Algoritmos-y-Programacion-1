package model;

public class Team{
	private String name;

	//Asociaciones
	private Player player1; //cada asociación se representa con un onjeto de la clase Player
	private Player player2;
	private Player player3;
	private Player player4;
	private Player player5;

	//private Player [] players; 

	private Date creationDate;

	public Team(String name){

		this.name = name;

	}

	public void SetPlayer1(Player p){
		player1 =p;
	}
}