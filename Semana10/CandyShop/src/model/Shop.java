package model;

public class Shop {
	private String owner;
	private double totalSales;
	
	private Product product1;
	private Product product2;
	private Product product3;
	
	
	public Shop(String owner) {
		this.owner = owner;
		this.totalSales = 0;
	}

	/** Metodo que verifica si un producto ya esta registrado
	*@param numProduct, int es el id del producto, e sun numero entre 1 y 3
	*@return out, boolean que es true si el producto está registrado, 
	*false en el caso contrario
	*/
	public boolean verifyProduct(int numProduct){
		boolean out= false;

		switch(numProduct){
			case 1:
			       out = product1!= null;
			case 2:
			if(product2!=null){
				out = true;
			}
			case 3:

		}
		return out;

	}

	/**
	* Metodo que agrega un producto en la tienda
	* pos: el producto correspondiente al numero (1,2, o 3) es distinto de null
	* @param product, inte es un numero entre 1 y 3 que indica el numero del producto
	* @param nameProduct, String es el nombre del producto
	* @param numItems, int es la cantidad de products a vender
	* @param price, double es el precio de venta del producto
	*/
	public void addProduct(int product, String nameProduct, int numItems, double price){

		switch(product){
			case 1:
			       product1 = new Product(nameProduct, numItems, price);
			       break;
			case 2:
			
			case 3:

		}


	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}
	public Product getProduct1() {
		return product1;
	}
	public void setProduct1(Product product1) {
		this.product1 = product1;
	}
	public Product getProduct2() {
		return product2;
	}
	public void setProduct2(Product product2) {
		this.product2 = product2;
	}
	public Product getProduct3() {
		return product3;
	}
	public void setProduct3(Product product3) {
		this.product3 = product3;
	}
	
	public String toString() {
		int vendidos=0;
		if (product1 != null){
			vendidos += product1.getNumProductsSold();
		}
		if (product2 != null){
			vendidos += product2.getNumProductsSold();
		}
		if (product3 != null){
			vendidos += product3.getNumProductsSold();
		}
		return "**** Datos de la tienda ****\n" + 
		"nombre del dueño: " + owner + "\n" +
		"cantidad de dinero en caja: " + totalSales + "\n" +
		"cantidad de productos vendidos " + vendidos + "\n" ;		
	}



}
