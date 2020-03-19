
package pooudemy018;

import java.util.Scanner;

public class POOUdemy018 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double dollar = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double reais = scan.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.valorComIOF(dollar, reais));
        
    }
    
}
