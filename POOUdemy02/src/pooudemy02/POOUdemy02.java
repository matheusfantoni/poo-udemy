
package pooudemy02;

import java.util.Scanner;

public class POOUdemy02 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int minutos = 0;
        double conta = 50.0;
        
        System.out.println("Digite a quantidade de minutos que você consumiu");
        minutos = scan.nextInt();
        
        if ( minutos > 100 ){
           conta += (minutos - 100) * 2.0;
        } 
        
        System.out.printf("Valor a pagar: R$ %.2f %n", conta);
    }
    
}
