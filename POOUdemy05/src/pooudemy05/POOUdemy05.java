
package pooudemy05;

import java.util.Scanner;

public class POOUdemy05 {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        int codPeça1, codPeça2;
        int numPeça, numPeça2;
        double valorPeça, valorPeça2;
        double calculaValorPeça1, calculaValorPeça2;
        double valorTotal;
        
        System.out.print("Digite o código da primeira peça: ");
        codPeça1 = scan.nextInt();
        System.out.print("Digite o número de peças desejadas: ");
        numPeça = scan.nextInt();
        System.out.print("Digite o valor da peça: ");
        valorPeça = scan.nextDouble();
        calculaValorPeça1 = numPeça * valorPeça;
        
        
        System.out.print("Digite o código da segunda peça: ");
        codPeça2 = scan.nextInt();
        System.out.printf("Digite o número de peças desejadas: ");
        numPeça2 = scan.nextInt();
        System.out.printf("Digite o valor da segunda peça: ");
        valorPeça2 = scan.nextDouble();
        calculaValorPeça2 = numPeça2 * valorPeça2;
        
        valorTotal = calculaValorPeça1 + calculaValorPeça2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
        
    }
    
}
