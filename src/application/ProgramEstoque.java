package application;
import entities.Estoque;
import java.util.Scanner;

public class ProgramEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estoque x = new Estoque();
		
		System.out.print("Enter product data:\nName: ");
		x.name = sc.nextLine();
		System.out.print("Price: ");
		x.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		x.quantity = sc.nextInt();
		
		System.out.println("Product data: " + x);
		
			
		System.out.print("\n");
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		System.out.print("\n");
		
		x.addProducts(quantity);
		
		System.out.println("Updated data: " + x);
		System.out.print("\n");
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		System.out.print("\n");
		
		while (quantity > x.quantity) {
			System.out.println("Quantity is greater than the available stock. Try again: ");
			System.out.print("\n");
			System.out.print("Enter the number of products to be removed from stock: ");
			quantity = sc.nextInt();
			System.out.println("\n");
			}
		x.removeProducts(quantity);
		
		System.out.print("\n");
		
		System.out.println("Updated data: "+ x.name + ", $" + x.price + ", " + x.quantity + " units, Total: $" + x.totalValueInStock() + "\n");
		
		sc.close();
	
	}

}
