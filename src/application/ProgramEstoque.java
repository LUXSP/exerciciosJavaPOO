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
		
		System.out.println("Product data: "+ x.name + ", $ " + x.price + ", " + x.quantity + " units, Total: $" + x.TotalValueInStock() + "\n");
		
		System.out.print("Enter the number of products to be added in stock: ");
		int addQuantity = sc.nextInt();
		
		System.out.print("\n");
		
		x.AddProducts(addQuantity);
		
		System.out.println("Updated data: "+ x.name + ", $" + x.price + ", " + x.quantity + " units, Total: $" + x.TotalValueInStock() + "\n");
		
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int withdrawQuantity = sc.nextInt();
		
		System.out.print("\n");
		
		while (withdrawQuantity > x.quantity) {
			System.out.println("Quantity is greater than the available stock. Try again: ");
			withdrawQuantity = sc.nextInt();
			}
		x.RemoveProducts(withdrawQuantity);
		
		System.out.println("Updated data: "+ x.name + ", $" + x.price + ", " + x.quantity + " units, Total: $" + x.TotalValueInStock() + "\n");
		
		sc.close();
	}

}
