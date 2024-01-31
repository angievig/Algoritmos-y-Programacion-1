package model;

public interface IMove {

	public String jump();

	public default String run(){
        return "Default Run !";
    }
	
}
