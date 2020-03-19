
package pooudemy019;

import java.util.Scanner;

public class POOUdemy019 {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        Conta conta;  
        String buffer;
        
        
        
        System.out.print("Entre com o número da conta: ");
        int numeroConta = scan.nextInt();
        System.out.print("Entre com o nome do titular: ");
        buffer = scan.nextLine();
        String titular = scan.nextLine();
        System.out.print("Existe um deposito inicial (S / N)? ");
        char resposta = scan.next().charAt(0);
        
        if ( resposta == 'S'){
            System.out.print("Entre com o valor inicial do deposito: ");
            double depositarDinheiro = scan.nextDouble();
            conta = new Conta(numeroConta, titular, depositarDinheiro);
        }
        
    }
    
}
