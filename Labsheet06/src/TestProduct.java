import java.util.*;
public class TestProduct {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product inputproduct = new Product();
 
		System.out.print("Enter product name: ");
		String name = scan.nextLine();
 
		System.out.print("Enter product price: ");
		double price = scan.nextDouble();
 
		System.out.print("Enter VAT rate (%): ");
		double vatRate = scan.nextDouble();
 
		inputproduct.setProductDetails(name, price, vatRate);
 
		System.out.println();
		inputproduct.displayProductDetails();
 
		scan.close();
	}
 
}