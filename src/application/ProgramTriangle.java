package application;
import entities.Triangle;
import java.util.Scanner;

public class ProgramTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of the triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of the triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY)
		{
			System.out.println("Larger area X");
		}
		
		else if (areaX < areaY)
		{
			System.out.println("Larger area Y");
		}
		else 
		{
			System.out.println("The triangle areas are the same");
		}
		
		sc.close();
	}

}
