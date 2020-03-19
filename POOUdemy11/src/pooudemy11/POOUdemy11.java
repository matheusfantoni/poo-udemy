
package pooudemy11;

import java.util.Scanner;

public class POOUdemy11 {

    public static void main(String[] args) {
        
        int codProduto;
        int qtdProduto;
        double total = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o código e a quantidade do item desejado: ");
        codProduto = scan.nextInt();
        qtdProduto = scan.nextInt();
        
        if ( codProduto == 1 ){
            
            total = qtdProduto * 4;
            
        }
        else if ( codProduto == 2 ){
            
            total = qtdProduto * 4.50;
        }
        else if ( codProduto == 3 ){
            
            total = qtdProduto * 5.00;
        }
        else if ( codProduto == 4 ){
            
            total = qtdProduto * 2.00;
            
        }
        else if ( codProduto == 5 ){
            
            total = qtdProduto * 1.50;
        }
        
        System.out.printf("Total: R$ %.2f" ,total);
    }
    
}
