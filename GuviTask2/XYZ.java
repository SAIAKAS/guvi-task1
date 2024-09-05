package GuviTask2;

import java.util.Scanner;

public class XYZ {
    
  
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // user information
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int pid = scanner.nextInt();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find the product with the highest price
        Product highestPriceProduct = products[0];

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > highestPriceProduct.getPrice()) {
                highestPriceProduct = products[i];
            }
        }

        // Display the PID of the product with the highest price
        System.out.println("Product ID with the highest price: " + highestPriceProduct.getPid());

        // Calculate and display the total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }
}


