
package pooudemy14;

import java.util.Scanner;

public class POOUdemy14 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
             
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String nome = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        
        Product product = new Product(nome, price);
        
        product.setName("Computer");
        System.out.println("Update name: " + product.getNome());
        
        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());
        
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.printf("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Updated data: " + product);
    }
    
}
