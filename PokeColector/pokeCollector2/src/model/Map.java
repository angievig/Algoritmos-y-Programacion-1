package model;

public class Map{

	private String picturePath;

	//relaciones

	private Date mapDate;

	private Coordinate centerLatitude;

	private Coordinate centerLongitude;

	public String getPicturePath(){
		return picturePath;
	}

	public void setCenterLatitude( Coordinate lat ){
		centerLatitude = lat;
	}


}