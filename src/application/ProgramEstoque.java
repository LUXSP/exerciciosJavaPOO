package application;
import entities.Estoque;
import java.util.Scanner;

public class ProgramEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estoque x = new Estoque();
		
		System.out.println("Nome do produto: ");
		x.name = sc.nextLine();
		System.out.println("Preço do produto: ");
		x.price = sc.nextDouble();
		System.out.println("Quantidade em estoque do produto: ");
		x.quantity = sc.nextInt();
		
		System.out.println("Produto: " + x.name);
		System.out.println("Quantidade estoque: " + x.quantity);
		System.out.println("Preço: " + x.price);
		System.out.println("Valor total no estoque: " + x.TotalValueInStock());
		
		System.out.println("Digite um valor para entrada no estoque: ");
		int addQuantity = sc.nextInt();
		x.AddProducts(addQuantity);
		
		System.out.println("Total do estoque agora: " + x.quantity);
		
		
		System.out.println("Digite um valor para retirada do estoque: ");
		int withdrawQuantity = sc.nextInt();
		while (withdrawQuantity > x.quantity) {
			System.out.println("Quantidade indisponível para saque. Digite novamente: ");
			withdrawQuantity = sc.nextInt();
			}
		x.RemoveProducts(withdrawQuantity);
		
		System.out.println("Total do estoque agora: " + x.quantity);
		
		sc.close();
	}

}
