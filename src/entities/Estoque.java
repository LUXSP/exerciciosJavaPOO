package entities;

public class Estoque {

	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return (quantity * price);
	}
	
	public void AddProducts(int addQuantity) {
		quantity += addQuantity;
	}
	
	public void RemoveProducts(int withdrawQuantity) {
		quantity -= withdrawQuantity;
	}

	
}
